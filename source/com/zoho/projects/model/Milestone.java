/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;

/**
 * This class is used to make an object for milestone.
 * 
 * @author ramesh-2099
 *
 */

public class Milestone
{
	
	private long id;
	private String name;
	private String startDate;
	private String startDateFormat;
	private long startDateLong;
	private String endDate;
	private String endDateFormat;
	private long endDateLong;
	private String status;
	
	private long ownerId;
	private String ownerName;
	private String flag;
	
	private String url;
	private String statusUrl;
	
	
	
	/**
	 * Set the milestone id.
	 * 
	 * @param id ID of the milestone.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the milestone id.
	 * 
	 * @return Returns the milestone id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the milestone name.
	 * 
	 * @param name Name of the milestone.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the milestone name.
	 * 
	 * @return Returns the milestone name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the start date of the milestone.
	 * 
	 * @param startDate Start date of the milestone.
	 */
	
	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}
	
	/**
	 * Get the start date of the milestone.
	 * 
	 * @return Returns the start date of the milestone.
	 */
	
	public String getStartDate()
	{
		return startDate;
	}
	
	/**
	 * Set the start date format of the milestone.
	 * 
	 * @param startDateLong Start date format of the milestone.
	 */
	
	public void setStartDateFormat(String startDateFormat)
	{
		this.startDateFormat = startDateFormat;
	}
	
	/**
	 * Get the start date format.
	 * 
	 * @return Returns the start date format.
	 */
	
	public String getStartDateFormat()
	{
		return startDateFormat;
	}
	
	/**
	 * Set the start date long of the milestone.
	 * 
	 * @param startDateLong Start date long of the milestone.
	 */
	
	public void setStartDateLong(long startDateLong)
	{
		this.startDateLong = startDateLong;
	}
	
	/**
	 * Get the start date long.
	 * 
	 * @return Returns the start date long.
	 */
	
	public long getStartDateLong()
	{
		return startDateLong;
	}
	
	/**
	 * Set the end date of the milestone.
	 * 
	 * @param endDate End date of the milestone.
	 */
	
	public void setEndDate(String endDate)
	{
		this.endDate = endDate;
	}
	
	/**
	 * Get the end date of the milestone.
	 * 
	 * @return Returns the end date of the milestone.
	 */
	
	public String getEndDate()
	{
		return endDate;
	}
	
	/**
	 * Set the end date format.
	 * 
	 * @param endDateLong End date format of the milestone.
	 */
	
	public void setEndDateFormat(String endDateFormat)
	{
		this.endDateFormat = endDateFormat;
	}
	
	/**
	 * Get the end date format.
	 * 
	 * @return Returns the end date format.
	 */
	
	public String getEndDateFormat()
	{
		return endDateFormat;
	}
	
	/**
	 * Set the end date long.
	 * 
	 * @param endDateLong End date long of the milestone.
	 */
	
	public void setEndDateLong(long endDateLong)
	{
		this.endDateLong = endDateLong;
	}
	
	/**
	 * Get the end date long.
	 * 
	 * @return Returns the end date long.
	 */
	
	public long getEndDateLong()
	{
		return endDateLong;
	}
	
	/**
	 * Set the status of the milestone.
	 * 
	 * @param status Status of the milestone.
	 */
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	/**
	 * Get the status of the milestone.
	 * 
	 * @return Returns the milestone status.
	 */
	
	public String getStatus()
	{
		return status;
	}
	
	
	/**
	 * Set the owner id.
	 * 
	 * @param ownerId ID of the owner.
	 */
	
	public void setOwnerId(long ownerId)
	{
		this.ownerId = ownerId;
	}
	
	/**
	 * Get the owner id.
	 * 
	 * @return Returns the owner id.
	 */
	
	public long getOwnerId()
	{
		return ownerId;
	}
	
	/**
	 * Set the owner name.
	 * 
	 * @param ownerName Name of the owner.
	 */
	
	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}
	
	/**
	 * Get the owner name.
	 * 
	 * @return Returns the owner name.
	 */
	
	public String getOwnerName()
	{
		return ownerName;
	}
	
	/**
	 * Set the flag for the milestone.
	 * 
	 * @param flag Flag for the milestone.
	 */
	
	public void setFlag(String flag)
	{
		this.flag = flag;
	}
	
	/**
	 * Get the flag for the milestone.
	 * 
	 * @return Returns the flag for the milestone.
	 */
	
	public String getFlag()
	{
		return flag;
	}
	
	
	
	/**
	 * Set the milestone URL.
	 * 
	 * @param url URL for the milestone.
	 */
	
	public void setURL(String url)
	{
		this.url = url;
	}
	
	/**
	 * Get the milestone URL.
	 * 
	 * @return Returns the milestone URL.
	 */
	
	public String getURL()
	{
		return url;
	}
	
	/**
	 * Set the status URL.
	 * 
	 * @param statusUrl Status URL for the milestone.
	 */
	
	public void setStatusURL(String statusUrl)
	{
		this.statusUrl = statusUrl;
	}
	
	/**
	 * Get the status URL.
	 * 
	 * @return Returns the status URL for the milestone.
	 */
	
	public String getStatusURL()
	{
		return statusUrl;
	}
	
	
	
	/**
	 * Convert the Milestone object into HashMap object.
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
		if(startDate != null)
		{
			requestBody.put("start_date", startDate);
		}
		if(endDate != null)
		{
			requestBody.put("end_date", endDate);
		}
		if((Long)ownerId != null)
		{
			requestBody.put("owner", ownerId);
		}
		if(flag != null)
		{
			requestBody.put("flag", flag);
		}
		
		return requestBody;
	}
	
}