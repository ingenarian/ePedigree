package com.pedigrees.model.business.managers;



import org.junit.Before;
import org.junit.Test;

import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.domain.Manufacturer;
import com.pedigrees.model.services.exceptions.ManufacturerServiceException;

public class ManufacturerManagerTest {

	ServiceFactory serviceFactory;
	Manufacturer manufacturer;
	
	@Before
	public void setUp() throws Exception {
	
	serviceFactory = new ServiceFactory();
	manufacturer = new Manufacturer();
	
	}
	/**
	* 
	* @author Ish
	*
	* Testing the ManufacturerManager's ability to add a new manufacturer
	* per use case directive by calling the 
	* service factory to serve up the IManufacturerService and
	* so it (ManufacturerManger) can execute the ManufacturerSvcImpl.
	*
	*
	* If so, then:
	*
	* the testAddNewManufacturer should create a new manufacturer object called 
	* manufacturer1.obj
	* 
	* If not, then:
	* 
	* the testAddNewManufacturer should fail to create a new manufacturer object.
	*/

	@Test 
	
	public void testAddNewManufacturer() {
		
		ManufacturerManager manufacturerManager = new ManufacturerManager();
		try {
			manufacturerManager.addNewManufacturer(manufacturer);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ManufacturerServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

