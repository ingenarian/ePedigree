package com.pedigrees.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import com.pedigrees.view.EnvelopeUtilityJFrame;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.business.managers.ReceiverDataManager;
import com.pedigrees.model.services.exceptions.ReceiverDataServiceException;
import com.pedigrees.model.domain.ReceiversEnvelopeDataForm;

/**
 * Receiver's JFrame
 * 
 * Use-Case #1 Realization: Use of a receiver form to create an envelope
 * 
 * This JFrame is the receiver's form.
 * It is a sub-view of a new envelope.
 * The save button on the receiver's form
 * completes the receiver's form and creates a new receiver object.
 * @author Ish
 *
 */
public class ReceiversJFrame extends JFrame{

	
	private static final long serialVersionUID = -4270183797120281935L;
	
	
	
	public ReceiversJFrame(){
		super("Receiver's Form");
		
		//Make a panel to hold the form and add it to the top
		//of the frame's content pane
		JPanel form = new JPanel();
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(form, BorderLayout.NORTH);
		
		//Set the form panel's layout to GridLayout
		//and create a SendersJFrame to add things to it.
		form.setLayout(new GridBagLayout());
		EnvelopeUtilityJFrame receiversUtilityJFrame = new EnvelopeUtilityJFrame();
		
		//Add some fields
		receiversUtilityJFrame.addLabel("First Name: ", form);
		receiversUtilityJFrame.addLastField(new JTextField(), form);
		
		receiversUtilityJFrame.addLabel("Middle initial: ", form);
		receiversUtilityJFrame.addLastField(new JTextField(), form);
		
		receiversUtilityJFrame.addLabel("Last Name: ", form);
		receiversUtilityJFrame.addLastField(new JTextField(), form);
		
		receiversUtilityJFrame.addLabel("Street Address: ", form);
		receiversUtilityJFrame.addLastField(new JTextField(), form);
		
		// Using a blank label to indent a field that doesn't have a label.
		// Without the blank label, the field would
		// take the entire width of the form
		receiversUtilityJFrame.addLabel("City: ", form);
		receiversUtilityJFrame.addMiddleField(new JTextField(), form);
		
		// Put the state and zip labels and fields
		// in their own panel, each added as a "label"
		// in a SendersUtilityJFrame-managed GridBagLayout.
		// This has the effect of giving each piece only as
		// much as is needed. When placed in the "last"
		// field position in the main form, these will
		// have a fixed width and the city field can stretch
		
		JPanel stateZip = new JPanel();
		stateZip.setLayout(new GridBagLayout());
		receiversUtilityJFrame.addLabel(" State: ", stateZip);
		JTextField state = new JTextField();
		Dimension stateSize = state.getPreferredSize();
		stateSize.width = 30;
		state.setPreferredSize(stateSize);
		receiversUtilityJFrame.addLabel(state, stateZip);
		receiversUtilityJFrame.addLabel(" Zip: ", stateZip);
		JTextField zip = new JTextField();
		Dimension zipSize = zip.getPreferredSize();
		zipSize.width = 80;
		zip.setPreferredSize(zipSize);
		receiversUtilityJFrame.addLabel(zip, stateZip);
		
		// The panel containing the state and the zip
		// are the added as another (fixed width) label field.
		// This is less than ideal, but will suffice for
		// this example. A blank "last field" component
		// gets us to a new line.
		receiversUtilityJFrame.addLabel(stateZip, form);
		receiversUtilityJFrame.addLastField(new JPanel(), form);
						
		//Add create button
		//sendersUtilityJFrame.addLabel("", form);
		JButton saveBtn = new JButton("Save");
		saveBtn.addActionListener(new SaveBtnListener());
		Dimension saveBtnSize = saveBtn.getPreferredSize();
		saveBtnSize.width = 85;
		saveBtn.setPreferredSize(saveBtnSize);
		JPanel saveBtnPanel = new JPanel();
		saveBtnPanel.setLayout(new BorderLayout());
		saveBtnPanel.add(saveBtn, BorderLayout.WEST);
		receiversUtilityJFrame.addButton(saveBtnPanel, form);
		
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
		receiversUtilityJFrame.addButton(cancelBtnPanel, form);
		
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
		receiversUtilityJFrame.addButton(helpBtnPanel, form);
		
		// Add padding to the form
		form.setBorder(new EmptyBorder(2,2,2,2));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Note: Not using the pack method; it may affect the last column
		
		setSize(400, 250);
		setVisible(true);
		
	} // end of ReceiversJFrame constructor
	
	
	//Listener for save button to create new receiver's form through the ReceiverDataManager service
	class SaveBtnListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
	
			//Send user a save message
			String name2 = null;
			String message2 = 
				String.format("Saving the information you entered on the receiver's form!", name2);
			
			JOptionPane.showMessageDialog(null, message2);
			
			ReceiversEnvelopeDataForm rvcrForm = new ReceiversEnvelopeDataForm();
			/*
			* Note:
			*  
			* Call ReceiverDataManager to
			* capture and save data from Receiver form and to create a receiver object.
			* Enables receiver object to merge information into an envelope object.
			* 
			*/
			
			//Use-Case realization for adding an Envelope
			ReceiverDataManager rvcrDataMgr = new ReceiverDataManager();
			try {
				rvcrDataMgr.helpReceiverEnvelopeData(rvcrForm);
			} catch (ServiceLoadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ReceiverDataServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} 
	} // end of save listener button

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
	
	
	
} // end of ReceiversJFrame class
