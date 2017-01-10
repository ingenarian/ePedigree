package com.pedigrees.model.business.managers;



import org.junit.Before;
import org.junit.Test;

import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.domain.SendersEnvelopeDataForm;
import com.pedigrees.model.services.exceptions.SenderDataServiceException;

public class SenderDataManagerTest {

	ServiceFactory serviceFactory;
	SendersEnvelopeDataForm sendersEnvelopeDataForm;
	
	@Before
	public void setUp() throws Exception {
	
	serviceFactory = new ServiceFactory();
	sendersEnvelopeDataForm = new SendersEnvelopeDataForm();
	
	}
	/**
	* 
	* @author Ish
	*
	* Testing the SenderDataManager's ability to add a new sender form
	* per use case directive by calling the 
	* service factory to serve up the ISendersDataService and
	* so it (SenderDataManger) can execute the SenderDataSvcImpl.
	*
	*
	* If so, then:
	*
	* the testHelpSenderEnvelopeData should create a new sender object called 
	* sender1.obj
	* 
	* If not, then:
	* 
	* the testHelpSenderEnvelopeData should fail to create a new sender object.
	*/

	@Test 
	
	public void testHelpSenderEnvelopeData() {
		
		SenderDataManager sDManager = new SenderDataManager();
		try {
			sDManager.helpSenderEnvelopeData(sendersEnvelopeDataForm);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SenderDataServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

