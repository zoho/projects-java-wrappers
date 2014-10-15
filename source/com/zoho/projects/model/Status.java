/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;

/**
 * This class is used to make an object for status.
 * 
 * @author ramesh-2099
 *
 */

public class Status 
{
	
	private long id;
	private String content;
	private String postedBy;
	private String postedPerson;
	private String PostedTime;
	private long postedTimeLong;
	private String postedTimeFormat;
	
	
	
	/**
	 * Set the status id.
	 * 
	 * @param id ID of the status.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the status id.
	 * 
	 * @return Returns the status id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the status content.
	 * 
	 * @param content Content for the status.
	 */
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	/**
	 * Get the status content.
	 * 
	 * @return Returns the status content.
	 */
	
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Set the status posted person id.
	 * 
	 * @param postedBy ID of the status posted person.
	 */
	
	public void setPostedBy(String postedBy)
	{
		this.postedBy = postedBy;
	}
	
	/**
	 * Get the status posted person id.
	 * 
	 * @return Returns the status posted person id.
	 */
	
	public String getPostedBy()
	{
		return postedBy;
	}
	
	/**
	 * Set the status posted person name.
	 * 
	 * @param postedPerson Name of the status posted person.
	 */
	
	public void setPostedPerson(String postedPerson)
	{
		this.postedPerson = postedPerson;
	}
	
	/**
	 * Get the status posted person name.
	 * 
	 * @return Returns the status posted person name.
	 */
	
	public String getPostedPerson()
	{
		return postedPerson;
	}
	
	/**
	 * Set the status posted time.
	 * 
	 * @param postedTime Status posted time.
	 */
	
	public void setPostedTime(String postedTime)
	{
		this.PostedTime = postedTime;
	}
	
	/**
	 * Get the status posted time.
	 * 
	 * @return Returns the status poted time.
	 */
	
	public String getPostedTime()
	{
		return PostedTime;
	}
	
	/**
	 * Set the status posted time long.
	 * 
	 * @param postedTimeLong Status posted time long.
	 */
	
	public void setPostedTimeLong(long postedTimeLong)
	{
		this.postedTimeLong = postedTimeLong;
	}
	
	/**
	 * Get the status posted time long.
	 * 
	 * @return Returns the status posted time long.
	 */
	
	public long getPostedTimeLong()
	{
		return postedTimeLong;
	}
	
	/**
	 * Set the status posted time format.
	 * 
	 * @param postedTimeLong Status posted time format.
	 */
	
	public void setPostedTimeFormat(String postedTimeFormat)
	{
		this.postedTimeFormat = postedTimeFormat;
	}
	
	/**
	 * Get the status posted time format.
	 * 
	 * @return Returns the status posted time format.
	 */
	
	public String getPostedTimeFormat()
	{
		return postedTimeFormat;
	}
	
	
	
	/**
	 * Convert the Status object into HashMap object.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		if(content != null)
		{
			requestBody.put("content", content);
		}
		
		return requestBody;
	}
	
}
