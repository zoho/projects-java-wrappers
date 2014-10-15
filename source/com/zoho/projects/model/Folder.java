/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;

/**
 * This class is used to make an object for folder.
 * 
 * @author ramesh-2099
 *
 */

public class Folder 
{
	
	private long id;
	private String name;
	private boolean isDiscussion;
	
	private String url;
	
	
	
	/**
	 * Set the folder id.
	 * 
	 * @param id ID of the folder.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the folder id.
	 * 
	 * @return Returns the folder id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the folder name.
	 * 
	 * @param name Name of the folder.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the folder name.
	 * 
	 * @return Returns the folder name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the folder is in discussion or not.
	 *  
	 * @param isDiscussion The folder is in discussion or not.
	 */
	
	public void setIsDicussion(boolean isDiscussion)
	{
		this.isDiscussion = isDiscussion;
	}
	
	/**
	 * Get the folder is in discussion or not.
	 * 
	 * @return Returns true of the folder is in discussion else returns false.
	 */
	
	public boolean isDiscussion()
	{
		return isDiscussion;
	}
	
	
	/**
	 * Set the folder URL.
	 * 
	 * @param url URL for the folder.
	 */
	
	public void setURL(String url)
	{
		this.url = url;
	}
	
	/**
	 * Get the folder URL.
	 * 
	 * @return Retruns the folder URL.
	 */
	
	public String getURL()
	{
		return url;
	}
	
	
	
	
	/**
	 * Convert the Folder object into HashMap object.
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
