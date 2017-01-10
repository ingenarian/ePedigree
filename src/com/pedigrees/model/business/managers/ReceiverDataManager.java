package com.pedigrees.model.business.managers;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.services.exceptions.ReceiverDataServiceException;
import com.pedigrees.model.services.receiverdataservice.IReceiversDataService;
import com.pedigrees.model.domain.ReceiversEnvelopeDataForm;

/**
 * @author Ish
 *
 * This Manager class uses the properties file provided by the SuperManagerType,
 * calls the ServiceFactory, and executes services requested by the presentation layer. 
 *
 *  It called to open, save, and close receiver data in an envelope. 
 *
 *
 */

public class ReceiverDataManager extends ManagerSuperType{
	
	public ReceiverDataManager() {
		  // construct object . . .
		 }

		 
		//Use Case Driven - support the construction of an envelope 
		 public boolean helpReceiverEnvelopeData(ReceiversEnvelopeDataForm receiversEnvelopeDataForm)throws ServiceLoadException, ReceiverDataServiceException
		    {
		    	boolean isHelped = false;
			 	ServiceFactory serviceFactory = new ServiceFactory();
		    	IReceiversDataService receiversDataSvc = (IReceiversDataService)serviceFactory.getService("IReceiversDataService");
		    	receiversDataSvc.storeReceiverEnvelopeDataForm(receiversEnvelopeDataForm);
		    	
		    	return isHelped;

		    }//end helpReceiverEnvelopeData

}