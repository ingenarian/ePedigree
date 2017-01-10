package com.pedigrees.model.services.pedigreeservice;
import com.pedigrees.model.services.exceptions.PedigreeServiceException;
import com.pedigrees.model.domain.Pedigree;
import com.pedigrees.model.services.IService;
/**
 * @author Ish
 *
 */

/** 
 * Create an pedigree object 
 * @param Pedigree
 * 							captures information  from the manufacturer to create a pedigree object. 
 * @throws PedigreeServiceException
 *  
 * 							If the Pedigree object is null or is not found 
 * 
 * */
public interface IPedigreeService extends IService{
	
	public final String NAME = "IPedigreeService";

	public boolean storePedigreeData(Pedigree pedigree)throws PedigreeServiceException;
}


