package com.pedigrees.model.business.managers;



import org.junit.Before;
import org.junit.Test;

import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.domain.Envelope;
import com.pedigrees.model.services.exceptions.EnvelopeServiceException;

public class EnvelopeManagerTest {

	ServiceFactory serviceFactory;
	Envelope envelope;
	
	@Before
	public void setUp() throws Exception {
	
	serviceFactory = new ServiceFactory();
	envelope = new Envelope();
	
	}
	/**
	* 
	* @author Ish
	*
	* Testing the EnvelopeManager's ability to add a new envelope
	* per use case directive by calling the 
	* service factory to serve up the IEnvelopeService and
	* so it (EnvelopeManger) can execute the EnvelopSvcImpl.
	*
	*
	* If so, then:
	*
	* the testAddNewEnvelope should create a new envelope object called 
	* envelope1.obj
	* 
	* If not, then:
	* 
	* the testAddNewEnvelope should fail to create a new envelope object.
	*/

	@Test 
	
	public void testAddNewEnvelope() {
		
		EnvelopeManager envelopeManager = new EnvelopeManager();
		try {
			envelopeManager.addNewEnvelope(envelope);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EnvelopeServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
