/**
 * 
 */
package com.pedigrees.model.domain;

import java.io.Serializable;

/**
 * @author Ish
 *
 */
public class Pedigree implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8866749525718901835L;

	/** Pedigree's document information */
	private String pedigreeDocumentInfo;
	
	/** Pedigree's serial number */
	private String pedigreeSerialNumber;
	
	/** Pedigree's version */
	private String pedigreeVersion;
	
	/** Pedigree's product information */
	private String pedigreeProductInfo;
	
	/** Pedigree's item information */
	private String pedigreeItemInfo;
	
	/** Pedigree's transaction information */
	private String pedigreeTransactionInfo;
	
	/** Pedigree's transaction identification */
	private String pedigreeTransactionIdentification;
	
	/** Pedidgree's sender information  */
	private String pedigreeSenderInfo;
	
	/** Pedigree's recipient information */
	private String pedigreeRecipientInfo;
	
	/** Pedigree's signature information */
	private String pedigreeSignatureInfo;

	/**
	 * 
	 */
	public Pedigree() {
		// TODO Auto-generated constructor stub
	}

	/**
 	* @param pedigreeDocumentInfo
	* @param pedigreeSerialNumber
	* @param pedigreeVersion
	* @param pedigreeProductInfo
	* @param pedigreeItemInfo
	* @param pedigreeTransactionInfo
	* @param pedigreeTransactionIdentification
	* @param pedigreeSenderInfo
	* @param pedigreeRecipientInfo
	* @param pedigreeSignatureInfo
    */
	
	public Pedigree(String pedigreeDocumentInfo, String pedigreeSerialNumber,String pedigreeVersion,String pedigreeProductInfo,String pedigreeItemInfo,String pedigreeTransactionInfo,String pedigreeTransactionIdentification,
			String pedigreeSenderInfo,String pedigreeRecipientInfo,String pedigreeSignatureInfo)
	{
		super();
		this.pedigreeDocumentInfo = pedigreeDocumentInfo;
		this.pedigreeSerialNumber = pedigreeSerialNumber;
		this.pedigreeVersion = pedigreeVersion;
		this.pedigreeProductInfo = pedigreeProductInfo;
		this.pedigreeItemInfo = pedigreeItemInfo;
		this.pedigreeTransactionInfo = pedigreeTransactionInfo;
		this.pedigreeTransactionIdentification = pedigreeTransactionIdentification;
		this.pedigreeSenderInfo = pedigreeSenderInfo;
		this.pedigreeRecipientInfo = pedigreeRecipientInfo;
		this.pedigreeSignatureInfo = pedigreeSignatureInfo;
	}
	
	// Getters and Setters
	
	
	
	/**
	 * @return Returns the pedigree's document information.
	 */
	public String getPedigreeDocumentInfo() {
		return pedigreeDocumentInfo;
	}
	
	/**
	 * @set Sets the pedigree's document information.
	 */
	public void setPedigreeDocumentInfo(String pedigreeDocumentInfo) {
		this.pedigreeDocumentInfo = pedigreeDocumentInfo;
	}
	
	/**
	 * @return Returns the pedigree's serial number.
	 */
	public String getPedigreeSerialNumber() {
		return pedigreeSerialNumber;
	}
	
	/**
	 * @set Sets the pedigree's serial number.
	 */
	public void setPedigreeSerialNumber(String pedigreeSerialNumber) {
		this.pedigreeSerialNumber = pedigreeSerialNumber;
	}
	
	/**
	 * @return Returns the pedigree's version.
	 */
	public String getPedigreeVersion() {
		return pedigreeVersion;
	}
	
	/**
	 * @set Sets the pedigree's version.
	 */
	public void setPedigreeVersion(String pedigreeVersion) {
		this.pedigreeVersion = pedigreeVersion;
	}
	
	/**
	 * @return Returns the pedigree's product information.
	 */
	public String getPedigreeProductInfo() {
		return pedigreeProductInfo;
	}
	
	/**
	 * @set Sets the pedigree's product information.
	 */
	public void setPedigreeProductInfo(String pedigreeProductInfo) {
		this.pedigreeProductInfo = pedigreeProductInfo;
	}
	
	/**
	 * @return Returns the pedigree's item information.
	 */
	public String getPedigreeItemInfo() {
		return pedigreeItemInfo;
	}
	
	/**
	 * @set Sets the pedigree's item information.
	 */
	public void setPedigreeItemInfo(String pedigreeItemInfo) {
		this.pedigreeItemInfo = pedigreeItemInfo;
	}
	
	/**
	 * @return Returns the pedigree's transaction information.
	 */
	public String getPedigreeTransactionInfo() {
		return pedigreeTransactionInfo;
	}
	
	/**
	 * @set Sets the pedigree's transaction information.
	 */
	public void setPedigreeTransactionInfo(String pedigreeTransactionInfo) {
		this.pedigreeTransactionInfo = pedigreeTransactionInfo;
	}
	
	/**
	 * @return Returns the pedigree's transaction identification.
	 */
	public String getPedigreeTransactionIdentification() {
		return pedigreeTransactionIdentification;
	}
	
	/**
	 * @set Sets the pedigree's transaction identification.
	 */
	public void setPedigreeTransactionIdentification(String pedigreeTransactionIdentification) {
		this.pedigreeTransactionIdentification = pedigreeTransactionIdentification;
	}
	
	/**
	 * @return Returns the pedigree's sender information.
	 */
	public String getPedigreeSenderInfo() {
		return pedigreeSenderInfo;
	}
	
	/**
	 * @set Sets the pedigree's sender information.
	 */
	public void setPedigreeSenderInfo(String pedigreeSenderInfo) {
		this.pedigreeSenderInfo = pedigreeSenderInfo;
	}
	
	/**
	 * @return Returns the pedigree's recipient information.
	 */
	public String getPedigreeRecipientInfo() {
		return pedigreeRecipientInfo;
	}
	
	/**
	 * @set Sets the pedigree's recipient information.
	 */
	public void setPedigreeRecipientInfo(String pedigreeRecipientInfo) {
		this.pedigreeRecipientInfo = pedigreeRecipientInfo;
	}
	
	/**
	 * @return Returns the pedigree's signature.
	 */
	public String getPedigreeSignatureInfo() {
		return pedigreeSignatureInfo;
	}
	
	/**
	 * @set Sets the pedigree's signature.
	 */
	public void setPedigreeSignatureInfo(String pedigreeSignatureInfo) {
		this.pedigreeSignatureInfo = pedigreeSignatureInfo; 
	}
	
	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false
	 */
	
public boolean validate()
	{
	
		if (pedigreeDocumentInfo == null) return false;
		if (pedigreeSerialNumber == null) return false;
		if (pedigreeVersion == null) return false;
		if (pedigreeProductInfo == null) return false;
		if (pedigreeItemInfo == null) return false;
		if (pedigreeTransactionInfo == null) return false;
		if (pedigreeTransactionIdentification == null) return false;
		if (pedigreeSenderInfo == null) return false;
		if (pedigreeRecipientInfo == null) return false;
		if (pedigreeSignatureInfo == null) return false;
		
		return true;
	}
	
	/**
 	* @param pedigreeDocumentInfo
	* @param pedigreeSerialNumber
	* @param pedigreeVersion
	* @param pedigreeProductInfo
	* @param pedigreeItemInfo
	* @param pedigreeTransactionInfo
	* @param pedigreeTransactionIdentification
	* @param pedigreeSenderInfo
	* @param pedigreeRecipientInfo
	* @param pedigreeSignatureInfo
    */
	
	public boolean equals(Pedigree pedigree)
	{

	if (!pedigreeDocumentInfo.equals(pedigree.pedigreeDocumentInfo)) return false;
	if (!pedigreeSerialNumber.equals(pedigree.pedigreeSerialNumber)) return false;
	if (!pedigreeVersion.equals(pedigree.pedigreeVersion)) return false;
	if (!pedigreeProductInfo.equals(pedigree.pedigreeProductInfo)) return false;
	if (!pedigreeItemInfo.equals(pedigree.pedigreeItemInfo)) return false;
	if (!pedigreeTransactionInfo.equals(pedigree.pedigreeTransactionInfo)) return false;
	if (!pedigreeTransactionIdentification.equals(pedigree.pedigreeTransactionIdentification)) return false;
	if (!pedigreeSenderInfo.equals(pedigree.pedigreeSenderInfo)) return false;
	if (!pedigreeRecipientInfo.equals(pedigree.pedigreeRecipientInfo)) return false;
	if (!pedigreeSignatureInfo.equals(pedigree.pedigreeSignatureInfo)) return false;

		return true;
	}
}
