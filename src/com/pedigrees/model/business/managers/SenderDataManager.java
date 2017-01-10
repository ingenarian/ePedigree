package com.pedigrees.model.business.managers;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.services.exceptions.SenderDataServiceException;
import com.pedigrees.model.services.senderdataservice.ISendersDataService;
import com.pedigrees.model.domain.SendersEnvelopeDataForm;

/**
 * @author Ish
 *
 * This Manager class uses the properties file provided by the SuperManagerType,
 * calls the ServiceFactory, and executes services requested by the presentation layer. 
 *
 *  It called to open, save, and close sender's data in envelope object. 
 *
 *
 */

public class SenderDataManager extends ManagerSuperType{
	
	public SenderDataManager() {
		  // construct object . . .
		 }

		 
		//Use Case Driven - support the construction of an envelope 
		 public boolean helpSenderEnvelopeData(SendersEnvelopeDataForm sendersEnvelopeDataForm)throws ServiceLoadException, SenderDataServiceException
		    {
		    	boolean isHelped = false;
			 	ServiceFactory serviceFactory = new ServiceFactory();
		    	ISendersDataService sendersDataSvc = (ISendersDataService)serviceFactory.getService("ISendersDataService");
		    	sendersDataSvc.storeSenderData(sendersEnvelopeDataForm);
		    	
		    	return isHelped;
		    	

		    }//end helpSenderEnvelopeData

}