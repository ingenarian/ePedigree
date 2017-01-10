/**
 * 
 */
package com.pedigrees.model.business.managers;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.domain.Envelope;
import com.pedigrees.model.services.envelopeservice.IEnvelopeService;
import com.pedigrees.model.services.exceptions.EnvelopeServiceException;

/**
 * @author Ish
 *
 * This Manager class uses the properties file provided by the SuperManagerType,
 * calls the ServiceFactory, and executes services requested by the presentation layer. 
 *
 *  It called to create a new envelope object with sender/receiver sub-form data.
 *
 *
 */
 public class EnvelopeManager extends ManagerSuperType {
	
	
	 public EnvelopeManager() {
	  // construct object . . .
	 }

	 
	//Use Case Driven - Adding new envelope
	 public boolean addNewEnvelope(Envelope envelope)throws ServiceLoadException, EnvelopeServiceException
	    {
	    	
		 	boolean isNewEnvelopeAdded = false;
		 	ServiceFactory serviceFactory = new ServiceFactory();
	    	IEnvelopeService envelopeSvc = (IEnvelopeService)serviceFactory.getService("IEnvelopeService");
	    	envelopeSvc.createEnvelopeData(envelope);
	    	
	    	return isNewEnvelopeAdded;

	    }//end addNewEnvelope
}
