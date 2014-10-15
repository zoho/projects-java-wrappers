/* $Id$ */

package com.zoho.projects.model;

/**
 * This class is used to make a Customfield Object.
 * 
 * @author ramesh-2099
 *
 */

public class Customfield 
{
	
	private String labelName;
	private String columnName;
	private String defaultValue;
	private String[] picklistValues;
	
	
	/**
	 * Get label name of the custom field.
	 * 
	 * @return Returns the label name.
	 */
	
	public String getLabelName() 
	{
		return labelName;
	}
	
	/**
	 * Set the label name of the custom field.
	 * 
	 * @param labelName Label name of the custom field.
	 */
	
	public void setLabelName(String labelName) 
	{
		this.labelName = labelName;
	}
	
	/**
	 * Get the colum name of the custom field.
	 * 
	 * @return Returns the column name of the custom field. 
	 */
	
	public String getColumnName() 
	{
		return columnName;
	}
	
	/**
	 * Set the column name of the custom field.
	 * 
	 * @param columnName Column name of the custom field.
	 */
	
	public void setColumnName(String columnName) 
	{
		this.columnName = columnName;
	}
	
	/**
	 * Get the default value of the custom field.
	 * 
	 * @return Returns the default value.
	 */
	
	public String getDefaultValue() 
	{
		return defaultValue;
	}
	
	/**
	 * Set the default value of the custom field.
	 * 
	 * @param defaultValue Default value of the custom field.
	 */
	
	public void setDefaultValue(String defaultValue) 
	{
		this.defaultValue = defaultValue;
	}
	
	/**
	 * Get the pick list values of the custom field.
	 *   
	 * @return Returns array of picklist values.
	 */
	
	public String[] getPicklistValues() 
	{
		return picklistValues;
	}
	
	/**
	 * Set the picklist values of the custom field.
	 * 
	 * @param picklistValues Array of picklist values.
	 */
	
	public void setPicklistValues(String[] picklistValues) 
	{
		this.picklistValues = picklistValues;
	}
	
	

}
