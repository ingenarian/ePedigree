package com.pedigrees.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.business.managers.PedigreeManager;
import com.pedigrees.model.domain.Pedigree;
import com.pedigrees.model.services.exceptions.PedigreeServiceException;
import com.pedigrees.view.EnvelopeUtilityJFrame;
/**
 * 
 * Pedigree JFrame
 * 
 * This JFrame is the pedigree form.
 * 
 * Use-Driven Realization #2 - Adding a Pedigree
 * 
 * The save button on the pedigree form
 * completes the pedigree form and creates a new pedigree object.
 * 
 * @author Ish
 *
 */
public class PedigreeJFrame extends JFrame {

	private static final long serialVersionUID = -2726991604854726953L;

	PedigreeJFrame(){
		super("Pedigree Form");
		
		//Make a panel to hold the form and add it to the top
		//of the frame's content pane
		JPanel form = new JPanel();
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(form, BorderLayout.NORTH);
		
		//Set the form panel's layout to GridLayout
		//and create a SendersJFrame to add things to it.
		form.setLayout(new GridBagLayout());
		EnvelopeUtilityJFrame envelopeUtilityJFrame = new EnvelopeUtilityJFrame();
		
		//Add some fields
		envelopeUtilityJFrame.addLabel("Document Information: ", form);
		envelopeUtilityJFrame.addLastField(new JTextField(), form);
		
		envelopeUtilityJFrame.addLabel("Serial Number: ", form);
		envelopeUtilityJFrame.addLastField(new JTextField(), form);
		
		envelopeUtilityJFrame.addLabel("Version: ", form);
		envelopeUtilityJFrame.addLastField(new JTextField(), form);
		
		envelopeUtilityJFrame.addLabel("Item: ", form);
		envelopeUtilityJFrame.addLastField(new JTextField(), form);
		
		envelopeUtilityJFrame.addLabel("Transaction Information: ", form);
		envelopeUtilityJFrame.addLastField(new JTextField(), form);
		
		envelopeUtilityJFrame.addLabel("Transaction ID: ", form);
		envelopeUtilityJFrame.addLastField(new JTextField(), form);
		
		envelopeUtilityJFrame.addLabel("Signature: ", form);
		envelopeUtilityJFrame.addLastField(new JTextField(), form);
			
		
		//Add save button
		//sendersUtilityJFrame.addLabel("", form);
		JButton saveBtn = new JButton("Save");
		saveBtn.addActionListener(new SaveBtnListener());
		Dimension saveBtnSize = saveBtn.getPreferredSize();
		saveBtnSize.width = 70;
		saveBtn.setPreferredSize(saveBtnSize);
		JPanel saveBtnPanel = new JPanel();
		saveBtnPanel.setLayout(new BorderLayout());
		saveBtnPanel.add(saveBtn, BorderLayout.WEST);
		envelopeUtilityJFrame.addButton(saveBtnPanel, form);
		
		//Add cancel button
		//sendersUtilityJFrame.addLabel("", form);
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new CancelBtnListener());
		Dimension cancelBtnSize = cancelBtn.getPreferredSize();
		cancelBtnSize.width = 85;
		cancelBtn.setPreferredSize(cancelBtnSize);
		JPanel cancelBtnPanel = new JPanel();
		cancelBtnPanel.setLayout(new BorderLayout());
		cancelBtnPanel.add(cancelBtn, BorderLayout.WEST);
		envelopeUtilityJFrame.addButton(cancelBtnPanel, form);
		
		//Add help button
		//sendersUtilityJFrame.addLabel("", form);
		JButton helpBtn = new JButton("Help");
		helpBtn.addActionListener(new HelpBtnListener());
		Dimension helpBtnSize = helpBtn.getPreferredSize();
		helpBtnSize.width = 70;
		helpBtn.setPreferredSize(helpBtnSize);
		JPanel helpBtnPanel = new JPanel();
		helpBtnPanel.setLayout(new BorderLayout());
		helpBtnPanel.add(helpBtn, BorderLayout.WEST);
		envelopeUtilityJFrame.addButton(helpBtnPanel, form);
		
		// Add padding to the form
		form.setBorder(new EmptyBorder(2,2,2,2));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Note: Not using the pack method; it may affect the last column
		
		setSize(400, 275);
		setVisible(true);
		
	} // end of Pedigree constructor
	
	
	//Listener for save button to create new pedigree form through the PedigreeManager service
	class SaveBtnListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
		
			//Send user a save message
			String name2 = null;
			String message2 = 
				String.format("Saving the information you entered on the pedigree form!", name2);
			
			JOptionPane.showMessageDialog(null, message2);
			Pedigree pedigreeForm = new Pedigree();
			
			/*
			* Note:
			*  
			* Call PedigreeManager to
			* capture and save data from pedigree form and to create a pedigree object.
			* Enables pedigree object to merge information into an envelope object.
			* 
			*/
			
			//Use-Case realization for adding a Pedigree
			PedigreeManager pedMgr = new PedigreeManager();
			try {
				pedMgr.addNewPedigree(pedigreeForm);
			} catch (ServiceLoadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PedigreeServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	// Listener for cancel button to cancel a sender's form and provide a cancel message
	class CancelBtnListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a cancel message
			String name3 = null;
			String message3 = 
				String.format("Your work has been cancelled!", name3);
			
			JOptionPane.showMessageDialog(null, message3);
			
			
			}
			
		} 	// end of cancel button listener
	
	
    //Listener for help button to create a help message 
   class HelpBtnListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		
		//Send user a help message
		String name4 = null;
		String message4 = 
			String.format("Check the user's guide!", name4);
		
		JOptionPane.showMessageDialog(null, message4);
		
		}
	} // end of help button listener
	
		
} // end of PedigreeJFrame class