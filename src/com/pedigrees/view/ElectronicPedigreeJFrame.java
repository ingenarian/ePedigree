package com.pedigrees.view;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.domain.Envelope;
import com.pedigrees.model.business.managers.EnvelopeManager;
import com.pedigrees.model.services.exceptions.EnvelopeServiceException;
import com.pedigrees.view.SendersJFrame;
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Electronic Pedigree Frame is the main GUI to create pedigrees and envelopes
 * @author Ish
 * 
 */
public class ElectronicPedigreeJFrame extends JFrame
{
	
	private static final long serialVersionUID = -2415035725583645224L;
	
	// Setup main GUI
	public ElectronicPedigreeJFrame()
	{
		super("E-Pedigree Application");
		
		//create Box containers with BoxLayout
		Box horizontal1 = Box.createHorizontalBox();
		Box horizontal2 = Box.createHorizontalBox();
		Box horizontal3 = Box.createHorizontalBox();
		Box horizontal4 = Box.createHorizontalBox();
		
		// add buttons to Box horizontal1 (Pedigree Buttons)
		JButton label1Button = new JButton("Create");
		JButton label1bButton = new JButton("Cancel");
	 	JButton label1cButton = new JButton("Help");
		label1Button.addActionListener(new Label1ButtonListener());
		label1bButton.addActionListener(new Label1bButtonListener());
		label1cButton.addActionListener(new Label1cButtonListener());
		horizontal1.add(label1Button);
	 	horizontal1.add(label1bButton);
		horizontal1.add(label1cButton);
			
		// add buttons to Box horizontal2 (Envelope Buttons)
		JButton label2Button = new JButton("Sender");
		JButton label2aButton = new JButton("Receiver");
		JButton label2bButton = new JButton("Cancel");
	 	JButton label2cButton = new JButton("Help");
	 	JButton label2dButton = new JButton("Merge");
	 	label2Button.addActionListener(new Label2ButtonListener());
	    label2aButton.addActionListener(new Label2aButtonListener());
	    label2bButton.addActionListener(new Label2bButtonListener());
		label2cButton.addActionListener(new Label2cButtonListener());
		label2dButton.addActionListener(new Label2dButtonListener());
		horizontal2.add(label2Button);
	    horizontal2.add(label2aButton);
	    horizontal2.add(label2dButton);
	    horizontal2.add(label2bButton);
	    horizontal2.add(label2cButton);
		
		
		// add buttons to Box horizontal3 (Manufacturer)
		
		JButton label3Button = new JButton("Create");
		JButton label3bButton = new JButton("Cancel");
	 	JButton label3cButton = new JButton("Help");
		label3Button.addActionListener(new Label3ButtonListener());
		label3bButton.addActionListener(new Label3bButtonListener());
		label3cButton.addActionListener(new Label3cButtonListener());
	    horizontal3.add(label3Button);
		horizontal3.add(label3bButton);
		horizontal3.add(label3cButton);
			
		// add buttons to Box horizontal4 (Product)
		
		JButton label4Button = new JButton("Create");
		JButton label4bButton = new JButton("Cancel");
	 	JButton label4cButton = new JButton("Help");
	    label4Button.addActionListener(new Label4ButtonListener());
	    label4bButton.addActionListener(new Label4bButtonListener());
	    label4cButton.addActionListener(new Label4cButtonListener());
	    horizontal4.add(label4Button);
		horizontal4.add(label4bButton);
		horizontal4.add(label4cButton);
		
	   // create a JTabbedPane
	   JTabbedPane tabs = new JTabbedPane(
			   JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
	   
	   //place each container on tabbed pane
	   tabs.addTab("Pedigree", horizontal1);
	   tabs.addTab("Envelope", horizontal2);
	   tabs.addTab("Product", horizontal3);
	   tabs.addTab("Manufacturer", horizontal4);
	   add(tabs); // place tabbed pane on frame
	} // end BoxLayoutFrame constructor for main GUI

	// create handler for the Pedigree button on the Envelope Tab
	class Label1ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a retrieval message
			String name01 = null;
			String message01 = 
				String.format("Retrieving the a new pedigree form!", name01);
			
			JOptionPane.showMessageDialog(null, message01);
			
			
			PedigreeJFrame pedigreeJFrame = new PedigreeJFrame();
			pedigreeJFrame.setSize(400, 270);
			pedigreeJFrame.setVisible(true);
	
		}
	}// end of handler 
	
	// create cancel message
	class Label1bButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a retrieval message
			String name01 = null;
			String message01 = 
				String.format("Your work has been cancelled!", name01);
			
			JOptionPane.showMessageDialog(null, message01);
		
		}
	}// end of handler
	
	// create a help message
	class Label1cButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a retrieval message
			String name01 = null;
			String message01 = 
				String.format("Check the user's guide!", name01);
			
			JOptionPane.showMessageDialog(null, message01);
			
		}
	}// end of handler
	
	// create handler for the Senders button on the Envelope Tab
	class Label2ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			
			//Send user a retrival message for the sender' form
			String name02 = null;
			String message02 = 
				String.format("Retrieving a new sender's form!", name02);
			
			JOptionPane.showMessageDialog(null, message02);
						
			SendersJFrame sendersJFrame = new SendersJFrame();
			sendersJFrame.setSize(400, 250);
			sendersJFrame.setVisible(true);
	
		}
	}// end of handler 
	
	// create handler for the Receivers button on the Envelope Tab
		class Label2aButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a retrival message for the receiver's form
			String name03 = null;
			String message03 = 
				String.format("Retrieving a new receiver's form!", name03);
			
			JOptionPane.showMessageDialog(null, message03);
						
			ReceiversJFrame receiversJFrame = new ReceiversJFrame();
			receiversJFrame.setSize(400, 250);
			receiversJFrame.setVisible(true);
	
		}
	}// end of handler for Receivers button on the Envelope Tab
	
		// create a cancel message
		class Label2bButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a retrival message for the receiver's form
			String name03 = null;
			String message03 = 
				String.format("Your work has been cancelled!", name03);
			
			JOptionPane.showMessageDialog(null, message03);
				
		}
	}// end of handler for Receivers button on the Envelope Tab
		
		
		// create a help message
		class Label2cButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a retrival message for the receiver's form
			String name03 = null;
			String message03 = 
				String.format("Check your user's guide!", name03);
			
			JOptionPane.showMessageDialog(null, message03);

		}
	}// end of handler for Receivers button on the Envelope Tab
		

		// Envelope Merge button
		class Label2dButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a envelope merge message 
			String name03 = null;
			String message03 = 
				String.format("Merging sender/receiver forms!", name03);
			
			JOptionPane.showMessageDialog(null, message03);
			
			
			Envelope eNV = new Envelope();
			/*
			* Note:
			*  
			* Call EnvelopeManager to
			* merge data from Sender/Receiver forms to create an envelope object.
			* 
			* 
			*/
			
			//Use-Case realization for adding an Envelope
			EnvelopeManager enVMgr = new EnvelopeManager();
			try {
				enVMgr.addNewEnvelope(eNV);
			} catch (ServiceLoadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EnvelopeServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}// end of handler for Receivers button on the Envelope Tab
		
		
		
		
		
		// create handler for the Product button on the Envelope Tab
		class Label3ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a product message
			String name04 = null;
			String message04 = 
				String.format("Retrieving a new product form!", name04);
			
			JOptionPane.showMessageDialog(null, message04);
			
			
			
			ProductJFrame productJFrame = new ProductJFrame();
			productJFrame.setSize(400, 250);
			productJFrame.setVisible(true);
	
		}
	}// end of handler for Manufacturers button on the Envelope Tab
		
		
		// create a cancel message
		class Label3bButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a product message
			String name04 = null;
			String message04 = 
				String.format("Your work has been cancelled!", name04);
			
			JOptionPane.showMessageDialog(null, message04);
				
		}
	}// end of handler for Manufacturers button on the Envelope Tab
		
		// create a melp message 
		class Label3cButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a product message
			String name04 = null;
			String message04 = 
				String.format("Check your user's guide!", name04);
			
			JOptionPane.showMessageDialog(null, message04);
				
		}
	}// end of handler for Manufacturers button on the Envelope Tab
		
		
		// create handler for the Manufacturers button on the Envelope Tab
		class Label4ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a save message
			String name05 = null;
			String message05 = 
				String.format("Retrieving a new manufacturer form!", name05);
			
			JOptionPane.showMessageDialog(null, message05);
			
			
			
			ManufacturersJFrame manufacturersJFrame = new ManufacturersJFrame();
			manufacturersJFrame.setSize(400, 270);
			manufacturersJFrame.setVisible(true);
	
		}
		
		
	}// end of handler for Manufacturers button on the Envelope Tab
	
		// create a cancel message
		class Label4bButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a save message
			String name05 = null;
			String message05 = 
				String.format("Your work has been cancelled!", name05);
			
			JOptionPane.showMessageDialog(null, message05);
	
		}
		
		
	}// end of handler for Manufacturers button on the Envelope Tab
		
		// create a help message
		class Label4cButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			//Send user a save message
			String name05 = null;
			String message05 = 
				String.format("Check your user's guide!", name05);
			
			JOptionPane.showMessageDialog(null, message05);
				
		}
		
	}// end of handler for Manufacturers button on the Envelope Tab	
	
	
	
} // end of ElectronicPedigreeJFrame class