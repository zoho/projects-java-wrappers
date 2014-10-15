/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;

/**
 * This class is used to make an object for category.
 * 
 * @author ramesh-2099
 *
 */

public class Category 
{
	
	private long id;
	private String name;
	
	
	
	/**
	 * Set the category id.
	 * 
	 * @param id ID of the category.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the category id.
	 * 
	 * @return Returns the category id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the category name.
	 * 
	 * @param name Name of the category.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the category name.
	 * 
	 * @return Returns the category name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	
	
	/**
	 * Convert the Category object into HashMap object.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		if(name != null)
		{
			requestBody.put("name", name);
		}
		
		return requestBody;
	}
	
	
}
