/* $Id$ */

package com.zoho.projects.model;

/**
 * This class is used to make an object for bug log.
 * 
 * @author ramesh-2099
 *
 */

public class Buglog extends Log
{
	
	private long bugId;
	private String title;
	
	
	/**
	 * Set the bug id.
	 * 
	 * @param bugId ID of the bug.
	 */
	
	public void setBugId(long bugId)
	{
		this.bugId = bugId;
	}
	
	/**
	 * Get the bug id.
	 * 
	 * @return Returns the bug id.
	 */
	
	public long getBugId()
	{
		return bugId;
	}
	
	/**
	 * Set the title of the bug.
	 * 
	 * @param title Title of the bug.
	 */
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * Get the title of the bug.
	 * 
	 * @return Returns the title of the bug.
	 */
	
	public String getTitle()
	{
		return title;
	}
	
	
	
}
