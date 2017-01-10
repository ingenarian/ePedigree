package com.pedigrees.model.business.managers;
import com.pedigrees.model.business.factory.ServiceFactory;
import com.pedigrees.model.business.exceptions.ServiceLoadException;
import com.pedigrees.model.domain.Pedigree;
import com.pedigrees.model.services.pedigreeservice.IPedigreeService;
import com.pedigrees.model.services.exceptions.PedigreeServiceException;

	/**
	 * @author Ish
	 *
	 * This Manager class uses the properties file provided by the SuperManagerType,
	 * calls the ServiceFactory, and executes services requested by the presentation layer. 
	 *
	 *  It called to create a new pedigree object.
	 *
	 *
	 */
	 public class PedigreeManager extends ManagerSuperType {
		
		
		 public PedigreeManager() {
		  // construct object . . .
		 }

		 
		//Use Case Driven - Adding new pedigree
		 public boolean addNewPedigree(Pedigree pedigree)throws ServiceLoadException, PedigreeServiceException
		    {
		    	boolean isNewPedigreeAdded = false;
			 	ServiceFactory serviceFactory = new ServiceFactory();
		    	IPedigreeService pedigreeSvc = (IPedigreeService)serviceFactory.getService("IPedigreeService");
		    	pedigreeSvc.storePedigreeData(pedigree);
		    	
		    	return isNewPedigreeAdded;
		    }//end addNewPedigree
	}

