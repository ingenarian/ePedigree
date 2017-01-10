package com.pedigrees.model.services.receiverdataservice;
import java.io.*;

import com.pedigrees.model.services.exceptions.ReceiverDataServiceException;
import com.pedigrees.model.domain.ReceiversEnvelopeDataForm;

/**
 * Receiver's Data Service Implementation
 * Creates a new receiver envelope data form at the request of the ReceiverDataManager.
 *  
 * 
 * 
 * @author Ish
 *
 */
  					    

public class ReceiverDataSvcImpl implements IReceiversDataService {

	public boolean storeReceiverEnvelopeDataForm(ReceiversEnvelopeDataForm receiversEnvelopeDataForm)throws ReceiverDataServiceException{
	
		boolean isGood = false;
		
		ReceiversEnvelopeDataForm rED1 = new ReceiversEnvelopeDataForm();
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("receiver1.obj"));
			os.writeObject(rED1);
			os.close();
		} catch (IOException ex) {
		  ex.printStackTrace();
		} 
	
		return isGood;
	} // end Receiver's Data Service
}
	
		

	