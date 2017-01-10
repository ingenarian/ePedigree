package com.pedigrees.model.services.manufacturerservice;
import com.pedigrees.model.services.exceptions.ManufacturerServiceException;
import com.pedigrees.model.domain.Manufacturer;
import com.pedigrees.model.services.IService;

/**
 * @author Ish
 *
 */

/** 
 * Create an manufacturer profile object 
 * @param Manufacturer
 * 							register user data about the manufacturer creating product, pedigree, and envelope objects. 
 * @throws ManufacturerServiceException
 *  
 * 							If the Manufacturer object is null or is not found 
 * 
 * */
public interface IManufacturerService extends IService {

	public final String NAME = "IManufacturerService";

	public boolean createMfgrProfile(Manufacturer manufacturer)throws ManufacturerServiceException;
	
}
