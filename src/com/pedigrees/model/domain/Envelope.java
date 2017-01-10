/**
 * 
 */
package com.pedigrees.model.domain;

import java.io.Serializable;

/**
 * @author Ishmael Thomas
 * Domain Envelope class 
 *
 */
public class Envelope implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4349382150030819493L;

	/** Sender's first name on the envelope */
	private String envelopeSendersFirstName;
	
	/** Sender's middle initial on the envelope */
	private String envelopeSendersMiddleInitial;
	
	/** Sender's last name on the envelope */
	private String envelopeSendersLastName;	
	
	/** Sender's street address on the envelope */
	private String envelopeSendersStreetAddress;
	
	/** Sender's city on the envelope */
	private String envelopeSendersCity;
	
	/** Sender's state on the envelope */
	private String envelopeSendersState;
	
	/** Sender's zipcode on the envelope */
	private String envelopeSendersZipCode;
	
	/** Receiver's first name on the envelope */
	private String envelopeReceiversFirstName;
	
	/** Receiver's middle initial on the envelope */
	private String envelopeReceiversMiddleInitial;
	
	/** Receiver's last name on the envelope */
	private String envelopeReceiversLastName;
	
	/** Receiver's street address on the envelope */
	private String envelopeReceiversStreetAddress;
	
	/** Receiver's city on the envelope */
	private String envelopeReceiversCity;
	
	/** Receiver's state on the envelope */
	private String envelopeReceiversState;
	
	/** Receiver's zipcode on the envelope */
	private String envelopeReceiversZipCode;
	
	/** Envelope message */
	private String envelopeMessageBody;
	
	public Envelope() {
		
	}
	/**
	 * @param envelopeSendersFirstName
	 * @param envelopeSendersMiddleInitial
	 * @param envelopeSendersLastName
	 * @param envelopeSendersStreetAddress
	 * @param envelopeSendersCity
	 * @param envelopeSendersState
	 * @param envelopeSendersZipCode
	 * @param envelopeReceiversFirstName
	 * @param envelopeReceiversMiddleInitial
	 * @param envelopeReceiversLastName
	 * @param envelopeReceiversStreetAddress
	 * @param envelopeReceiversCity
	 * @param envelopeReceiversState
	 * @param envelopeReceiversZipCode
	 * @param envelopeMessageBody
	 */
	public Envelope(String envelopeSendersFirstName,String envelopeSendersMiddleInitial,String envelopeSendersLastName,String envelopeSendersStreetAddress,String envelopeSendersCity,String envelopeSendersState,String envelopeSendersZipCode,
			String envelopeReceiversFirstName,String envelopeReceiversMiddleInitial,String envelopeReceiversLastName,String envelopeReceiversStreetAddress,String envelopeReceiversCity,String envelopeReceiversState,String envelopeReceiversZipCode,
			String envelopeMessageBody)
			{
			super();
			this.envelopeSendersFirstName = envelopeSendersFirstName;
			this.envelopeSendersMiddleInitial = envelopeSendersMiddleInitial;
			this.envelopeSendersLastName = envelopeSendersLastName;	
			this.envelopeSendersStreetAddress = envelopeSendersStreetAddress;
			this.envelopeSendersCity = envelopeSendersCity;
			this.envelopeSendersState = envelopeSendersState;
			this.envelopeSendersZipCode = envelopeSendersZipCode;
			this.envelopeReceiversFirstName = envelopeReceiversFirstName;
			this.envelopeReceiversMiddleInitial = envelopeReceiversMiddleInitial;
			this.envelopeReceiversLastName = envelopeReceiversLastName;
			this.envelopeReceiversStreetAddress = envelopeReceiversStreetAddress;
			this.envelopeReceiversCity = envelopeReceiversCity;
			this.envelopeReceiversState = envelopeReceiversState;
			this.envelopeReceiversZipCode = envelopeReceiversZipCode;
			this.envelopeMessageBody = envelopeMessageBody;
			}
	
	// getters and setters
	
	/**
	 * @return Returns the sender's envelope first name.
	 */
	
	public String getEnvelopeSendersFirstName() {
		return envelopeSendersFirstName;
	}
	
	/**
	 * @set Sets the sender's envelope first name.
	 */
	
	public void setEnvelopeSendersFirstName(String envelopeSendersFirstName) {
		this.envelopeSendersFirstName = envelopeSendersFirstName; 
	}

	/**
	 * @return Returns the sender's envelope middle initial.
	 */
	
	public String getEnvelopeSendersMiddleInitial() {
		return envelopeSendersMiddleInitial;
	}
	
	/**
	 * @set Sets the sender's envelope middle initial.
	 */

	public void setEnvelopeSendersMiddleInitial(String envelopeSendersMiddleInitial) {
		this.envelopeSendersMiddleInitial = envelopeSendersMiddleInitial;
	}
	
	/**
	 * @return Returns the sender's envelope last name.
	 */
	
	public String getEnvelopeSendersLastName() {
		return envelopeSendersLastName;
	}
	
	/**
	 * @set Sets the sender's envelope last name.
	 */

	public void setEnvelopeSendersLastName(String envelopeSendersLastName) {
		this.envelopeSendersLastName = envelopeSendersLastName; 
	}
	
	/**
	 * @return Returns the sender's envelope street address.
	 */
	
	public String getEnvelopeSendersStreetAddress() {
		return envelopeSendersStreetAddress;
	}
	
	/**
	 * @set Sets the sender's envelope street address.
	 */
	
	public void setEnvelopeSendersStreetAddress(String envelopeSendersStreetAddress){
		this.envelopeSendersStreetAddress = envelopeSendersStreetAddress;
	}
	
	/**
	 * @return Returns the sender's envelope city location.
	 */
	
	public String getEnvelopeSendersCity() {
		return envelopeSendersCity;
	}
	
	/**
	 * @set Sets the sender's envelope city location.
	 */
	
	public void setEnvelopeSendersCity(String envelopeSendersCity) {
		this.envelopeSendersCity = envelopeSendersCity;
	}
	
	/**
	 * @return Returns the sender's envelope state location.
	 */
	
	public String getEnvelopeSendersState() {
		return envelopeSendersState;
	}
	
	/**
	 * @set Sets the sender's envelope state location.
	 */
	
	public void setEnvelopeSendersState(String envelopeSendersState) {
		this.envelopeSendersState = envelopeSendersState;
	}
	
	/**
	 * @return Returns the sender's envelope zip code.
	 */
	
	public String getEnvelopeSendersZipCode() {
		return envelopeSendersZipCode;
	}
	
	/**
	 * @set Sets the sender's envelope zip code.
	 */
	
	public void setEnvelopeSendersZipCode(String envelopeSendersZipCode) {
		this.envelopeSendersZipCode = envelopeSendersZipCode;
	}
	
	/**
	 * @return Returns the receiver's envelope first name.
	 */
	
	public String getEnvelopeReceiversFirstName() {
		return envelopeReceiversFirstName;
	}

	/**
	 * @set Sets the receiver's envelope first name.
	 */
	
	public void setEnvelopeReceiversFirstName(String envelopeReceiversFirstName) {
		this.envelopeReceiversFirstName = envelopeReceiversFirstName;
	}
	
	/**
	 * @return Returns the receiver's envelope middle initial.
	 */
	
	public String getEnvelopeReceiversMiddleInitial() {
		return envelopeReceiversMiddleInitial;
	}

	/**
	 * @set Sets the receiver's envelope middle initial.
	 */
	
	public void setEnvelopeReceiversMiddleInitial(String envelopeReceiversMiddleInitial) {
		this.envelopeReceiversMiddleInitial = envelopeReceiversMiddleInitial;
	}
	
	/**
	 * @return Returns the receiver's envelope last name.
	 */
	
	public String getEnvelopeReceiversLastName() {
		return envelopeReceiversLastName;
	}
	
	/**
	 * @set Sets the receiver's envelope last name.
	 */
	
	public void setEnvelopeReceiversLastName(String envelopeReceiversLastName) {
		this.envelopeReceiversLastName = envelopeReceiversLastName;
	}
	
	/**
	 * @return Returns the receiver's envelope street address.
	 */
	
	public String getEnvelopeReceiversStreetAddress() {
		return envelopeReceiversStreetAddress;
	}
	
	/**
	 * @set Sets the receiver's envelope street address.
	 */
	
	public void setEnvelopeReceiversStreetAddress(String envelopeReceiversStreetAddress) {
		this.envelopeReceiversStreetAddress = envelopeReceiversStreetAddress;
	}
	
	/**
	 * @return Returns the receiver's envelope city location.
	 */
	
	public String getEnvelopeReceiversCity() {
		return envelopeReceiversCity;
	}
	
	/**
	 * @set Sets the receiver's envelope city location.
	 */
	
	public void setEnvelopeReceiversCity(String envelopeReceiversCity) {
		this.envelopeReceiversCity = envelopeReceiversCity;
	}
	
	/**
	 * @return Returns the receiver's envelope state location.
	 */
	
	public String getEnvelopeReceiversState() {
		return envelopeReceiversState;
	}
	
	/**
	 * @set Sets the receiver's envelope state location.
	 */
	
	public void setEnvelopeReceiversState(String envelopeReceiversState) {
		this.envelopeReceiversState = envelopeReceiversState;
	}
	
	/**
	 * @return Returns the receiver's envelope zipcode.
	 */
	
	public String getEnvelopeReceiversZipCode() {
		return envelopeReceiversZipCode;
	}
	
	/**
	 * @set Set the receiver's envelope zipcode.
	 */
	
	public void setEnvelopeReceiversZipCode(String envelopeReceiversZipCode) {
		this.envelopeReceiversZipCode = envelopeReceiversZipCode;
	}
	
	/**
	 * @return Returns the receiver's envelope message.
	 */
	public String getEnvelopeMessageBody() {
		return envelopeMessageBody;
	}
	
	/**
	 * @set Sets the receiver's envelope message.
	 */
	public void setEnvelopeMessageBody(String envelopeMessageBody) {
		this.envelopeMessageBody = envelopeMessageBody;
	}
	
	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false
	 */
	public boolean validate () 
	{
		
		if (envelopeSendersFirstName == null) return false;
		if (envelopeSendersMiddleInitial == null) return false;
		if (envelopeSendersLastName == null) return false;
		if (envelopeSendersStreetAddress == null) return false;
		if (envelopeSendersCity == null) return false;
		if (envelopeSendersState == null) return false;
		if (envelopeSendersZipCode == null) return false;
		if (envelopeReceiversFirstName == null) return false;
		if (envelopeReceiversMiddleInitial == null) return false;
		if (envelopeReceiversLastName == null) return false;
		if (envelopeReceiversStreetAddress == null) return false;
		if (envelopeReceiversCity == null) return false;
		if (envelopeReceiversState == null) return false;
		if (envelopeReceiversZipCode == null) return false;
		if (envelopeMessageBody == null) return false;
		  
		return true;
	}
	
	/**
	* @param envelopeSendersFirstName;
	* @param envelopeSendersMiddleInitial;
	* @param envelopeSendersLastName;	
	* @param envelopeSendersStreetAddress;
	* @param envelopeSendersCity;
	* @param envelopeSendersState;
	* @param envelopeSendersZipCode;
	* @param envelopeReceiversFirstName;
	* @param envelopeReceiversMiddleInitial;
	* @param envelopeReceiversLastName;
	* @param envelopeReceiversStreetAddress;
	* @param envelopeReceiversCity;
	* @param envelopeReceiversState;
	* @param envelopeReceiversZipCode;
    * @param envelopeMessageBody;
    */
	
	public boolean equals(Envelope envelope) 
	{
		if (!envelopeSendersFirstName.equals(envelope.envelopeSendersFirstName)) return false;
		if (!envelopeSendersMiddleInitial.equals(envelope.envelopeSendersMiddleInitial)) return false;
		if (!envelopeSendersLastName.equals(envelope.envelopeSendersLastName)) return false;
		if (!envelopeSendersStreetAddress.equals(envelope.envelopeSendersStreetAddress)) return false;
		if (!envelopeSendersCity.equals(envelope.envelopeSendersCity)) return false;
		if (!envelopeSendersState.equals(envelope.envelopeSendersState)) return false;
		if (!envelopeSendersZipCode.equals(envelope.envelopeSendersZipCode)) return false;
		if (!envelopeReceiversFirstName.equals(envelope.envelopeReceiversFirstName)) return false;
		if (!envelopeReceiversMiddleInitial.equals(envelope.envelopeReceiversMiddleInitial)) return false;
		if (!envelopeReceiversLastName.equals(envelope.envelopeReceiversLastName)) return false;
		if (!envelopeReceiversStreetAddress.equals(envelope.envelopeReceiversStreetAddress)) return false;
		if (!envelopeReceiversCity.equals(envelope.envelopeReceiversCity)) return false;
		if (!envelopeReceiversState.equals(envelope.envelopeReceiversState)) return false;
		if (!envelopeReceiversZipCode.equals(envelope.envelopeReceiversZipCode)) return false;
		if (!envelopeMessageBody.equals(envelope.envelopeMessageBody)) return false;

	return true;
	}
	
	
	/**
	 * toString() method useful for logging
	 *  
	 */
	
	public String toString()
	{
	  StringBuffer strBfr = new StringBuffer();
	  strBfr.append("envelopeSendersFirstName:");
	  strBfr.append(envelopeSendersFirstName);
	  strBfr.append("\nenvelopeSendersMiddleInitial:");
	  strBfr.append(envelopeSendersMiddleInitial);
	  strBfr.append("\nenvelopeSendersLastName:");
	  strBfr.append(envelopeSendersLastName);
	  strBfr.append("\nenvelopeSendersStreetAddress :");
	  strBfr.append(envelopeSendersStreetAddress);
	  strBfr.append("\nenvelopeSendersCity:");	
      strBfr.append(envelopeSendersCity);
	  strBfr.append("\nenvelopeSendersState:");	
      strBfr.append(envelopeSendersState);
	  strBfr.append("\nenvelopeSendersZipCode:");	
      strBfr.append(envelopeSendersZipCode);
      strBfr.append("\nenvelopeReceiversFirstName:");	
      strBfr.append(envelopeReceiversFirstName);
      strBfr.append("\nenvelopeReceiversMiddleInitial:");	
      strBfr.append(envelopeReceiversMiddleInitial);
	  strBfr.append("\nenvelopeReceiversLastName:");
      strBfr.append(envelopeReceiversLastName);
      strBfr.append("\nenvelopeReceiversStreetAddress:");
      strBfr.append(envelopeReceiversStreetAddress);
      strBfr.append("\nenvelopeReceiversCity:");
      strBfr.append(envelopeReceiversCity);
      strBfr.append("\nenvelopeReceiversState:");
      strBfr.append(envelopeReceiversState);
      strBfr.append("\nenvelopeReceiversZipCode:");
      strBfr.append(envelopeReceiversZipCode);
	  strBfr.append("\nenvelopeMessageBody:");
      strBfr.append(envelopeMessageBody);


      return strBfr.toString();
	
	
	}
}
