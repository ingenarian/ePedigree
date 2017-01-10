package com.pedigrees.model.business.managers;



import org.junit.Before;
import org.junit.Test;

import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.domain.ReceiversEnvelopeDataForm;
import com.pedigrees.model.services.exceptions.ReceiverDataServiceException;

public class ReceiverDataManagerTest {

	ServiceFactory serviceFactory;
	ReceiversEnvelopeDataForm receiversEnvelopeDataForm;
	
	@Before
	public void setUp() throws Exception {
	
	serviceFactory = new ServiceFactory();
	receiversEnvelopeDataForm = new ReceiversEnvelopeDataForm();
	
	}
	/**
	* 
	* @author Ish
	*
	* Testing the ReceiverDataManager's ability to add a new receiver form
	* per use case directive by calling the 
	* service factory to serve up the IReceiversDataService and
	* so it (ReceiverDataManger) can execute the ReceiverDataSvcImpl.
	*
	*
	* If so, then:
	*
	* the testHelpReceiverEnvelopeData should create a new product object called 
	* receiver1.obj
	* 
	* If not, then:
	* 
	* the testHelpReceiverEnvelopeData should fail to create a new receiver object.
	*/

	@Test 
	
	public void testHelpReceiverEnvelopeData() {
		
		ReceiverDataManager rDManager = new ReceiverDataManager();
		try {
			rDManager.helpReceiverEnvelopeData(receiversEnvelopeDataForm);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ReceiverDataServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
