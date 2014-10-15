/* $Id$ */

package com.zoho.projects.model;

/**
 * This class is used to make an object for owner.
 * 
 * @author ramesh-2099
 *
 */

public class Owner 
{
	
	private String name;
	private String id;
	
	
	
	/**
	 * Set the owner name.
	 * 
	 * @param name Name of the owner.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the owner name.
	 * 
	 * @return Returns the owner name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the owner id.
	 * 
	 * @param id ID of the owner.
	 */
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	/**
	 * Get the owner id.
	 * 
	 * @return Returns the owner id.
	 */
	
	public String getId()
	{
		return id;
	}
	
}
