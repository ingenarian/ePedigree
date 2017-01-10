/**
 * 
 */
package com.pedigrees.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Ish
 *
 */
public class ProductTest {

	/**
	 * Test method for {@link com.pedigrees.model.domain.Product#validate()}.
	 */
	@Test
	public void testValidate() {
		Product pro1 = new Product("zzz111","Antibiotics","200","a1b1b2","19abareec","medium","Genetech");
		//pro1.validate should assert to True since all variables 
		// being passed to create a new Product are all valid.
		assertTrue ("pro1 validates",pro1.validate());
	    System.out.println("testValidate PASSED");
	}

	/**
	 * Tests with an invalid product passed in
	 */
	public void testNotValidate() {
		Product pro1 = new Product();
		// pro1.validate should not pass here since we are not
		// sending in valid parameters - in the case of Product
		// class, its valid only if all class variables are passed
		assertFalse ("pro1 does not validate", pro1.validate());
	       System.out.println("testNotValidate PASSED");		
	}
	
	
	/**
	 * Test method for {@link com.pedigrees.model.domain.Product#equals(com.pedigrees.model.domain.Product)}.
	 */
	@Test
	public void testEqualsProduct() {
		Product pro1 = new Product("zzz111","Antibiotics","200","a1b1b2","19abareec","medium","Genetech");
		Product pro2 = new Product("zzz111","Antibiotics","200","a1b1b2","19abareec","medium","Genetech");
		// this should assert to true since the contents of 
		// pro1 and pro2 class variables are identical.
		assertTrue ("pro1 equals pro2", pro1.equals(pro2));
	       System.out.println("testEqualsProduct PASSED");
	}
	/**
	 * Test if two products are not equal
	 */
	public void testNotEqualsProduct() {
		Product pro1 = new Product("zzz111","Antibiotics","200","a1b1b2","19abareec","medium","Genetech");
		Product pro2 = new Product("zzz111","Antibiotics","200","a1b1b2","19abareec","medium","GlaxoKline");
		// this should assert to false since the contents of 
		// pro1 and pro2 class variables are NOT identical.
		assertFalse ("pro1 does NOT equal pro2", pro1.equals(pro2));
	       System.out.println("testNotEqualsProduct PASSED");
	}
	
	
}
