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
public class EnvelopeTest {

	/**
	 * Test method for {@link com.pedigrees.model.domain.Envelope#validate()}.
	 */
	@Test
	public void testValidate() {
		Envelope e1 = new Envelope("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","Sue", "Z", "Que", "456 Any Street", "Any City","Any State",
				"12345","New Drug Shipment");
		//e1.validate should assert to True since all variables 
		// being passed to create a new Envelope are all valid.
		assertTrue ("e1 validates",e1.validate());
	       System.out.println("testValidate PASSED");
	}

	/**
	 * Tests with an invalid envelope passed in
	 */
	public void testNotValidate() {
		Envelope e1 = new Envelope ();
		// e1.validate should not pass here since we are not
		// sending in valid parameters - in the case of Envelope
		// class, its valid only if all class variables are passed
		assertFalse ("e1 does not validate", e1.validate());
	       System.out.println("testNotValidate PASSED");		
	}
	
	/**
	 * Test method for {@link com.pedigrees.model.domain.Envelope#equals(com.pedigrees.model.domain.Envelope)}.
	 */
	@Test
	public void testEqualsEnvelope() {
		Envelope e1 = new Envelope("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","Sue", "Z", "Que", "456 Any Street", "Any City","Any State",
				"12345","New Drug Shipment");
		Envelope e2 = new Envelope("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","Sue", "Z", "Que", "456 Any Street", "Any City","Any State",
				"12345","New Drug Shipment");
		// this should assert to true since the contents of 
		// e1 and e2 class variables are identical.
		assertTrue ("e1 equals e2", e1.equals(e2));
	       System.out.println("testEqualsEnvelope PASSED");
	}

	
	/**
	 * Test if two envelopes are not equal
	 */
	public void testNotEqualsEnvelope() {
		Envelope e1 = new Envelope("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","Sue", "Z", "Que", "456 Any Street", "Any City","Any State",
				"12345","New Drug Shipment");
		Envelope e2 = new Envelope("John", "U", "Doe", "123 Some Street", "Some City", "Some State", "98765","Sue", "Z", "Que", "456 Any Street", "Any City","Any State",
				"12345","Old Drug Shipment");
		// this should assert to false since the contents of 
		// e1 and e2 class variables are NOT identical.
		assertFalse ("e1 does NOT equal e2", e1.equals(e2));
	       System.out.println("testNotEqualsEnvelope PASSED");
	}
	
}
