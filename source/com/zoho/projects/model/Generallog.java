/* $Id$ */

package com.zoho.projects.model;

/**
 * This class is used to make a Generallog object.
 * 
 * @author ramesh-2099
 *
 */

public class Generallog extends Log
{
	
	
	private String name;
	
	
	/**
	 * Set the general log name.
	 * 
	 * @param name Name of the general log.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the general log name.
	 * 
	 * @return Returns the general log name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	
	
}
