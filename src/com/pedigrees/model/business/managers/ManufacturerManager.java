package com.pedigrees.model.business.managers;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.services.exceptions.ManufacturerServiceException;
import com.pedigrees.model.services.manufacturerservice.IManufacturerService;
import com.pedigrees.model.domain.Manufacturer;

/**
 * @author Ish
 *
 * This Manager class uses the properties file provided by the SuperManagerType,
 * calls the ServiceFactory, and executes services requested by the presentation layer. 
 *
 *  It called to create a manufacturer's working directory and manufacturer profile object. 
 *
 *
 */

public class ManufacturerManager extends ManagerSuperType{
	
	public ManufacturerManager() {
		  // construct object . . .
		 }

		 
		//Use Case Driven - Adding new manufacturer 
		 public boolean addNewManufacturer(Manufacturer manufacturer)throws ServiceLoadException, ManufacturerServiceException
		    {
		    	boolean isNewManufacturerAdded = false;
		    	
			 	ServiceFactory serviceFactory = new ServiceFactory();
		    	IManufacturerService manufacturerSvc = (IManufacturerService)serviceFactory.getService("IManufacturerService");
		    	manufacturerSvc.createMfgrProfile(manufacturer);
		    	
		    	return isNewManufacturerAdded;
		    }//end addNewManufacturer

}
