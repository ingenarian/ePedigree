/**
 * 
 */
package com.pedigrees.model.services.envelopeservice;
import java.io.*;
import javax.swing.JOptionPane;

import com.pedigrees.model.services.exceptions.EnvelopeServiceException;
import com.pedigrees.model.domain.Envelope;
import com.pedigrees.model.domain.ReceiversEnvelopeDataForm;
import com.pedigrees.model.domain.SendersEnvelopeDataForm;
/**
 * Envelope Service Implementation
 * Creates a new envelope object at the request of EnvelopeManager.
 * At the request of the "merge" button on the Envelope Tab,
 * it combines data entered from sender/receiver sub-forms to make
 * a complete and new envelope object. 
 * 
 * 
 * @author Ish
 *
 */
  					    

public class EnvelopeSvcImpl implements IEnvelopeService {

	public boolean createEnvelopeData(Envelope envelope)throws EnvelopeServiceException{
		
		boolean isGood = false;
		
		
		// Final Envelope object to be serialized
		Envelope e1 = new Envelope();
		
				
		//De-serialize sender object containing sender's information in sender place holder sEDF
		
			ObjectInputStream sender1 = null;
			try {
				sender1 = new ObjectInputStream(new FileInputStream("senders1.obj"));
			} catch (FileNotFoundException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			SendersEnvelopeDataForm sEDF = null;
			try {
				sEDF = (SendersEnvelopeDataForm)sender1.readObject();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			//Get data from sender's form 
			String sFN1 = sEDF.getEnvelopeSendersFirstName(); 
			String sML1 = sEDF.getEnvelopeSendersMiddleInitial();
			String sLN1 = sEDF.getEnvelopeSendersLastName();
			String sSA1 = sEDF.getEnvelopeSendersStreetAddress();
			String sCT1 = sEDF.getEnvelopeSendersCity();
			String sST1 = sEDF.getEnvelopeSendersState();
			String sZC1 = sEDF.getEnvelopeSendersZipCode();
			String sMg1 = sEDF.getEnvelopeMessageBody();
			
			//Transfer data into target envelope
			e1.setEnvelopeSendersFirstName(sFN1);
			e1.setEnvelopeSendersMiddleInitial(sML1);
			e1.setEnvelopeSendersLastName(sLN1);
			e1.setEnvelopeSendersStreetAddress(sSA1);
			e1.setEnvelopeSendersCity(sCT1);
			e1.setEnvelopeSendersState(sST1);
			e1.setEnvelopeSendersZipCode(sZC1);
			e1.setEnvelopeMessageBody(sMg1);
		
		//De-serialize sender object containing sender's information in sender place holder sEDF
		
			ObjectInputStream receiver1 = null;
			try {
				receiver1 = new ObjectInputStream(new FileInputStream("receiver1.obj"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ReceiversEnvelopeDataForm rEDF = null;
			try {
				rEDF = (ReceiversEnvelopeDataForm)receiver1.readObject();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			//Get data from receiver's form 
			String sFN2 = rEDF.getEnvelopeReceiversFirstName(); 
			String sML2 = rEDF.getEnvelopeReceiversMiddleInitial();
			String sLN2 = rEDF.getEnvelopeReceiversLastName();
			String sSA2 = rEDF.getEnvelopeReceiversStreetAddress();
			String sCT2 = rEDF.getEnvelopeReceiversCity();
			String sST2 = rEDF.getEnvelopeReceiversState();
			String sZC2 = rEDF.getEnvelopeReceiversZipCode();
			
			//Transfer data into target envelope
			e1.setEnvelopeReceiversFirstName(sFN2);
			e1.setEnvelopeReceiversMiddleInitial(sML2);
			e1.setEnvelopeReceiversLastName(sLN2);
			e1.setEnvelopeReceiversStreetAddress(sSA2);
			e1.setEnvelopeReceiversCity(sCT2);
			e1.setEnvelopeReceiversState(sST2);
			e1.setEnvelopeReceiversZipCode(sZC2);
		
	  //Serialize sender/receiver data into new Envelope1.obj		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("envelope1.obj"));
			os.writeObject(e1);
			os.close();
		} catch (IOException ex) {
		  ex.printStackTrace();
		} 
	
		if(e1 != null){
			
			//Send user a create message if successful
			String name0 = null;
			String message0 = 
				String.format("Envelope1.obj created!", name0);
			
			JOptionPane.showMessageDialog(null, message0);
		
		} else {
			
			//Send user a fail message if not successful
			String name1 = null;
			String message1 = 
				String.format("Envelope1.obj not created, call support!", name1);
			
			JOptionPane.showMessageDialog(null, message1);
		
		}
		return isGood;
 } // end Envelope Service

		
	}


