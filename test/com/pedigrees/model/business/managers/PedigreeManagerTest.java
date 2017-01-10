package com.pedigrees.model.business.managers;



import org.junit.Before;
import org.junit.Test;

import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.domain.Pedigree;
import com.pedigrees.model.services.exceptions.PedigreeServiceException;

public class PedigreeManagerTest {

	ServiceFactory serviceFactory;
	Pedigree pedigree;
	
	@Before
	public void setUp() throws Exception {
	
	serviceFactory = new ServiceFactory();
	pedigree = new Pedigree();
	
	}
	/**
	* 
	* @author Ish
	*
	* Testing the PedigreeManager's ability to add a new pedigree
	* per use case directive by calling the 
	* service factory to serve up the IPedigreeService and
	* so it (PedigreeManger) can execute the PedigreeSvcImpl.
	*
	*
	* If so, then:
	*
	* the testAddNewPedigree should create a new pedigree object called 
	* pedigree1.obj
	* 
	* If not, then:
	* 
	* the testAddNewPedigree should fail to create a new pedigree object.
	*/

	@Test 
	
	public void testAddNewPedigree() {
		
		PedigreeManager pedigreeManager = new PedigreeManager();
		try {
			pedigreeManager.addNewPedigree(pedigree);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PedigreeServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
