package com.pedigrees.model.services.pedigreeservice;
import java.io.*;

import com.pedigrees.model.services.exceptions.PedigreeServiceException;
import com.pedigrees.model.domain.Pedigree;
/**
 * Pedigree Service Implementation
 * Creates a new pedigree object at the request of PedigreeManager.
 *  
 * 
 * 
 * @author Ish
 *
 */

public class PedigreeSvcImpl implements IPedigreeService {
	
	
	public boolean storePedigreeData(Pedigree pedigree) throws PedigreeServiceException {
		
		boolean isGood = false;
		
		Pedigree pED1 = new Pedigree();
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("pedigree1.obj"));
			os.writeObject(pED1);
			os.close();
		} catch (IOException ex) {
		  ex.printStackTrace();
		} 
	
		return isGood;
	} // end Pedigree Service
		
	}


