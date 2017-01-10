/**
 * 
 */
package com.pedigrees.model.domain;

import java.io.Serializable;

/**
 * @author Ish
 *
 */
public class Manufacturer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3220896249025377727L;
	
	/**
	 * 
	 */
	
	
	/** Manufacturer's name */	
	private String manufacturersName;

	/** Manufacturer's alias */
	private String manufacturersAlias;

	/** Manufacturer's street address */
	private String manufacturersStreetAddress;

	/** Manufacturer's city */
	private String manufacturersCity;

	/** Manufacturer's state */
	private String manufacturersState;

	/** Manufacturer's zip code */
	private String manufacturersZipCode;

	/** Manufacturer's phone number */
	private String manufacturersPhoneNumber;

	/** Manufacturer's email address */
	private String manufacturersEmailAddress;

	/** Manufacturer's identification */
	private String manufacturersIdentification;

	
	
	public Manufacturer() {
		// TODO Auto-generated constructor stub
	}

	/**
	* @param manufacturersName
	* @param manufacturersAlias
	* @param manufacturersStreetAddress
	* @param manufacturersCity
	* @param manufacturersState
	* @param manufacturersZipCode
	* @param manufacturersPhoneNumber
	* @param manufacturersEmailAddress
	* @param manufacturersIdentification
	*/
	
	public Manufacturer(String manufacturersName,String manufacturersAlias,String manufacturersStreetAddress,String manufacturersCity,String manufacturersState,
			String manufacturersZipCode,String manufacturersPhoneNumber,String manufacturersEmailAddress,String manufacturersIdentification)
			{

			super();
			this.manufacturersName = manufacturersName;
			this.manufacturersAlias = manufacturersAlias;
			this.manufacturersStreetAddress = manufacturersStreetAddress;
			this.manufacturersCity = manufacturersCity;
			this.manufacturersState = manufacturersState;
			this.manufacturersZipCode = manufacturersZipCode;
			this.manufacturersPhoneNumber = manufacturersPhoneNumber;
			this.manufacturersEmailAddress = manufacturersEmailAddress;
			this.manufacturersIdentification = manufacturersIdentification;
			
			}
	//Getter and setters
	
	/**
	 * @return Returns the manufacturer's name.
	 */
	public String getManufacturersName() {
		return manufacturersName;
	}

	/**
	 * @set Sets the manufacturer's name.
	 */
	public void setManufacturersName(String manufacturersName) {
		this.manufacturersName = manufacturersName;
	}

	/**
	 * @return Returns the manufacturer's alias.
	 */
	public String getManufacturersAlias() {
		return manufacturersAlias;
	}

	/**
	 * @set Sets the manufacturer's alias.
	 */
	public void setManufacturersAlias(String manufacturersAlias) {
		this.manufacturersAlias = manufacturersAlias;
	}

	/**
	 * @return Returns the manufacturer's street address.
	 */
	public String getManufacturersStreetAddress() {
		return manufacturersStreetAddress;
	}

	/**
	 * @set Sets the manufacturer's street address.
	 */
	public void setManufacturersStreetAddress(String manufacturersStreetAddress) {
		this.manufacturersStreetAddress = manufacturersStreetAddress;
	}

	/**
	 * @return Returns the manufacturer's city.
	 */
	public String getManufacturersCity() {
		return manufacturersCity;
	}

	/**
	 * @set Sets the manufacturer's city.
	 */
	public void setManufacturersCity(String manufacturersCity) {
		this.manufacturersCity = manufacturersCity;
	}

	/**
	 * @return Returns the manufacturer's state.
	 */
	public String getManufacturersState() {
		return manufacturersState;
	}

	/**
	 * @set Sets the manufacturer's state.
	 */
	public void setManufacturersState(String manufacturersState) {
		this.manufacturersState = manufacturersState; 
	}

	/**
	 * @return Returns the manufacturer's zip code.
	 */
	public String getManufacturersZipCode() {
		return manufacturersZipCode;
	}

	/**
	 * @set Sets the manufacturer's zip code.
	 */
	public void setManufacturersZipCode(String manufacturersZipCode) {
		this.manufacturersZipCode = manufacturersZipCode;
	}

	/**
	 * @return Returns the manufacturer's phone number.
	 */
	public String getManufacturersPhoneNumber() {
		return manufacturersPhoneNumber;
	}

	/**
	 * @set Sets the manufacturer's phone number.
	 */
	public void setManufacturersPhoneNumber(String manufacturersPhoneNumber) {
		this.manufacturersPhoneNumber = manufacturersPhoneNumber;
	}
	
	/**
	 * @return Returns the manufacturer's email address.
	 */
	public String getManufacturersEmailAddress() {
		return manufacturersEmailAddress;
	}
	
	/**
	 * @set Sets the manufacturer's email address.
	 */
	public void setManufacturersEmailAddress(String manufacturersEmailAddress) {
		this.manufacturersEmailAddress = manufacturersEmailAddress;
	}

	/**
	 * @return Returns the manufacturer's identification.
	 */
	public String getManufacturersIdentification() {
		return manufacturersIdentification;
	}

	/**
	 * @set Sets the manufacturer's identification.
	 */
	public void setManufacturersIdentification(String manufacturersIdentification) {
		this.manufacturersIdentification = manufacturersIdentification;
	}

	
	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false
	 */
	
	public boolean validate () 
	{
		
		if (manufacturersName == null) return false;
		if (manufacturersAlias == null) return false;
		if (manufacturersStreetAddress == null) return false;
		if (manufacturersCity == null) return false;
		if (manufacturersState == null) return false;
		if (manufacturersZipCode == null) return false;
		if (manufacturersPhoneNumber == null) return false;
		if (manufacturersEmailAddress == null) return false;
		if (manufacturersIdentification == null) return false;
	
		return true;
	}
	
	/**
	* @param manufacturerName
	* @param manufacturerAlias
	* @param manufacturerStreetAddress
	* @param manufacturerCity
	* @param manufacturerState
	* @param manufacturerZipCode
	* @param manufacturerPhoneNumber
	* @param manufacturerEmailAddress
	* @param manufacturerIdentification
	
	*/
	
	public boolean equals(Manufacturer manufacturer)
	{

	if (!manufacturersName.equals(manufacturer.manufacturersName)) return false;
	if (!manufacturersAlias.equals(manufacturer.manufacturersAlias)) return false;
	if (!manufacturersStreetAddress.equals(manufacturer.manufacturersStreetAddress)) return false;
	if (!manufacturersCity.equals(manufacturer.manufacturersCity)) return false;
	if (!manufacturersState.equals(manufacturer.manufacturersState)) return false;
	if (!manufacturersZipCode.equals(manufacturer.manufacturersZipCode)) return false;
	if (!manufacturersPhoneNumber.equals(manufacturer.manufacturersPhoneNumber)) return false;
	if (!manufacturersEmailAddress.equals(manufacturer.manufacturersEmailAddress)) return false;
	if (!manufacturersIdentification.equals(manufacturer.manufacturersIdentification)) return false;
	
		
	return true;
	}

}
