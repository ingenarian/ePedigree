/**
 * 
 */
package com.pedigrees.model.domain;

import java.io.Serializable;

/**
 * @author Ish
 *
 */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8876574536130718679L;
	
	/** product stock keeping unit */
	private String productSKU; 
	
	/** product description */
	private String productDescription; 
	
	/** product quantity */
	private String productQuantity; 
	
	/** product case identification */
	private String productCaseIdentification;
	
	/** product serial number */
	private String productSerialNumber;
	
	/** product potency information */
	private String productPotencyInfo;
	
	/** product manufacturer information */
	private String productManfacturerInfo;

	/**
	 * 
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}
	/**
	* @param productSKU 
	* @param productDescription 
	* @param productQuantity
	* @param productCaseIdentification
	* @param productSerialNumber
	* @param productPotencyInfo
	* @param productManfacturerInfo
	*/
	
	public Product(String productSKU,String productDescription,String productQuantity,String productCaseIdentification,String productSerialNumber,
			String productPotencyInfo,String productManfacturerInfo)
	{
		super();
		this.productSKU = productSKU;  
		this.productDescription = productDescription; 
		this.productQuantity = productQuantity;
		this.productCaseIdentification = productCaseIdentification;
		this.productSerialNumber = productSerialNumber;
		this.productPotencyInfo = productPotencyInfo;
		this.productManfacturerInfo = productManfacturerInfo;
	}
	
	//Getters and setters
	
	/**
	 * @return Returns the product stock keeping unit.
	 */
	public String getProductSKU() {
		return productSKU;
	}

	/**
	 * @set Sets the product's stock keeping unit.
	 */
	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}

	/**
	 * @return Returns the product's description.
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @set Sets the product's description.
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	/**
	 * @return Returns the product's quantity.
	 */
	public String getProductQuantity() {
		return productQuantity;
	}
	
	/**
	 * @set Sets the product's quantity.
	 */
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity; 
	}

	/**
	 * @return Returns the product's case identification.
	 */
	public String getProductCaseIdentification() {
		return productCaseIdentification;
	}
	
	/**
	 * @set Sets the product's case identification.
	 */
	public void setProductCaseIdentification(String productCaseIdentification) {
		this.productCaseIdentification = productCaseIdentification;
	}

	/**
	 * @return Returns the product's serial number.
	 */
	public String getProductSerialNumber() {
		return productSerialNumber;
	}
	
	/**
	 * @set Sets the product's serial number.
	 */
	public void setProductSerialNumber(String productSerialNumber) {
		this.productSerialNumber = productSerialNumber;
	}
	
	/**
	 * @return Returns the product's potency information.
	 */
	public String getProductPotencyInfo() {
		return productPotencyInfo;
	}
	
	/**
	 * @set Sets the product's potency information.
	 */
	public void setProductPotencyInfo(String productPotencyInfo) {
		this.productPotencyInfo = productPotencyInfo;
	}

	/**
	 * @return Returns the product's manufacturer information.
	 */
	public String getProductManfacturerInfo() {
		return productManfacturerInfo;
	}

	/**
	 * @set Sets the product's manufacturer information.
	 */
	public void setProductManfacturerInfo(String productManfacturerInfo) {
		this.productManfacturerInfo = productManfacturerInfo;
	}

	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false
	 */
public boolean validate()
{
if (productSKU == null) return false;
if (productDescription == null) return false;
if (productQuantity == null) return false;
if (productCaseIdentification == null) return false;
if (productSerialNumber == null) return false;
if (productPotencyInfo == null) return false;
if (productManfacturerInfo == null) return false;
	
	return true;
}

/**
* @param productSKU 
* @param productDescription 
* @param productQuantity
* @param productCaseIdentification
* @param productSerialNumber
* @param productPotencyInfo
* @param productManfacturerInfo
*/

public boolean equals(Product product)
{

if (!productSKU.equals(product.productSKU)) return false;
if (!productDescription.equals(product.productDescription)) return false;
if (!productQuantity.equals(product.productQuantity)) return false;
if (!productCaseIdentification.equals(product.productCaseIdentification)) return false;
if (!productSerialNumber.equals(product.productSerialNumber)) return false;
if (!productPotencyInfo.equals(product.productPotencyInfo)) return false;
if (!productManfacturerInfo.equals(product.productManfacturerInfo)) return false;

	return true;
}

}
