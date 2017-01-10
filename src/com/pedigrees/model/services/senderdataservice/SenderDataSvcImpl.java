package com.pedigrees.model.services.senderdataservice;
import java.io.*;

import com.pedigrees.model.services.exceptions.SenderDataServiceException;
import com.pedigrees.model.domain.SendersEnvelopeDataForm;

/**
 * Sender's Data Service Implementation
 * Creates a new sender envelope data form at the request of the SenderDataManager.
 *  
 * 
 * 
 * @author Ish
 *
 */



public class SenderDataSvcImpl implements ISendersDataService {

	public boolean storeSenderData(SendersEnvelopeDataForm sendersEnvelopeData)throws SenderDataServiceException {
		
		boolean isGood = false;
		SendersEnvelopeDataForm sED1 = new SendersEnvelopeDataForm();
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("senders1.obj"));
			os.writeObject(sED1);
			os.close();
		} catch (IOException ex) {
		  ex.printStackTrace();
		} 
		
		return isGood;
	} // end Senders Data Service
	
}
	
		

