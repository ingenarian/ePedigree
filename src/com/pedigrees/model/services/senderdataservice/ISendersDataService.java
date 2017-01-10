package com.pedigrees.model.services.senderdataservice;

import com.pedigrees.model.services.exceptions.SenderDataServiceException;
import com.pedigrees.model.domain.SendersEnvelopeDataForm;
import com.pedigrees.model.services.IService;

/**
 * @author Ish
 *
 */

/** 
 * Create a receiver's envelope object 
 * @param ReceiversForm
 * 							holds user data captured from the reciever's envelope section to construct an envelope object. 
 * @throws ReceiverDataServiceException
 *  
 * 							If the ReceiversForm object is null or is not found 
 * 
 * */
public interface ISendersDataService extends IService{
	
	public final String NAME = "ISendersDataService";

	public boolean storeSenderData(SendersEnvelopeDataForm sendersEnvelopeData)throws SenderDataServiceException;
	
	
}
