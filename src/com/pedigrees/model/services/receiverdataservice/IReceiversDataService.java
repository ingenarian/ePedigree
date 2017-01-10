package com.pedigrees.model.services.receiverdataservice;
import com.pedigrees.model.services.exceptions.ReceiverDataServiceException;
import com.pedigrees.model.domain.ReceiversEnvelopeDataForm;
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
public interface IReceiversDataService extends IService{
	
	public final String NAME = "IReceiversDataService";

	public boolean storeReceiverEnvelopeDataForm(ReceiversEnvelopeDataForm receiversEnvelopeDataForm)throws ReceiverDataServiceException;
	
	
}
