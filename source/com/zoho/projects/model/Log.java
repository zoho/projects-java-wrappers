/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;

/**
 * This class is used to make a Log object.
 * 
 * @author ramesh-2099
 *
 */

public class Log 
{
	
	private long id;
	private String notes;
	private int hours;
	private int minutes;
	private String hoursDisplay;
	private int totalMinutes;
	private String ownerId;
	private String ownerName;
	private String billStatus;
	
	private long projectId;
	private String projectName;
	
	private String url;
	
	private String logDate;
	private String logDateFormat;
	private long logDateLong;
	
	
	/**
	 * Set the log id.
	 * 
	 * @param id ID of the log.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the log id.
	 * 
	 * @return Returns the log id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the notes for the log.
	 * 
	 * @param notes Notes for the log.
	 */
	
	public void setNotes(String notes)
	{
		this.notes = notes;
	}
	
	/**
	 * Get the log notes.
	 * 
	 * @return Returns the log notes.
	 */
	
	public String getNotes()
	{
		return notes;
	}
	
	/**
	 * Set the hours for the log.
	 * 
	 * @param hours Hours for the log.
	 */
	
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	
	/**
	 * Get the hours for the log.
	 * 
	 * @return Returns the log hours.
	 */
	
	public int getHours()
	{
		return hours;
	}
	
	/**
	 * Set the minutes for the log.
	 * 
	 * @param minutes Minutes for the log.
	 */
	
	public void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}
	
	/**
	 * Get the minutes for the log.
	 * 
	 * @return Returns the log minutes.
	 */
	
	public int getMinutes()
	{
		return minutes;
	}
	
	/**
	 * Set the hour display format.
	 * 
	 * @param hourDisplay Hour display format.
	 */
	
	public void setHoursDisplay(String hoursDisplay)
	{
		this.hoursDisplay = hoursDisplay;
	}
	
	/**
	 * Get the hour display format.
	 * 
	 * @return Returns the hour display format.
	 */
	
	public String getHoursDisplay()
	{
		return hoursDisplay;
	}
	
	/**
	 * Set the total minutes for the log.
	 * 
	 * @param totalMinutes Total minutes for the log.
	 */
	
	public void setTotalMinutes(int totalMinutes)
	{
		this.totalMinutes = totalMinutes;
	}
	
	/**
	 * Get the total minutes for the log.
	 * 
	 * @return Returns the total minutes for the log.
	 */
	
	public int getTotalMinutes()
	{
		return totalMinutes;
	}
	
	/**
	 * Set the owner id.
	 * 
	 * @param ownerId ID of the owner.
	 */
	
	public void setOwnerId(String ownerId)
	{
		this.ownerId = ownerId;
	}
	
	/**
	 * Get the owner id.
	 * 
	 * @return Returns the owner id.
	 */
	
	public String getOwnerId()
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
	 * Set the bill status for the log.
	 * 
	 * @param billStatus Bill status for the log.
	 */
	
	public void setBillStatus(String billStatus)
	{
		this.billStatus = billStatus;
	}
	
	/**
	 * Get the bill status for the log.
	 * 
	 * @return Returns the bill status.
	 */
	
	public String getBillStatus()
	{
		return billStatus;
	}
	
	
	
	/**
	 * Set the project id.
	 * 
	 * @param projectId ID of the project.
	 */
	
	public void setProjectId(long projectId)
	{
		this.projectId = projectId;
	}
	
	/**
	 * Get the project id.
	 * 
	 * @return Returns the project id.
	 */
	
	public long getProjectId()
	{
		return projectId;
	}
	
	/**
	 * Set the project name.
	 * 
	 * @param projectName Name of the project.
	 */
	
	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}
	
	/**
	 * Get the project name.
	 * 
	 * @return Returns the project name.
	 */
	
	public String getProjectName()
	{
		return projectName;
	}
	
	
	
	/**
	 * Set the URL for the log.
	 * 
	 * @param url URL for the log.
	 */
	
	public void setURL(String url)
	{
		this.url = url;
	}
	
	/**
	 * Get the URL.
	 * 
	 * @return Returns the log URL.
	 */
	
	public String getURL()
	{
		return url;
	}
	
	
	
	/**
	 * Set the log date.
	 * 
	 * @param logDate Date of the log.
	 */
	
	public void setLogDate(String logDate)
	{
		this.logDate = logDate;
	}
	
	/**
	 * Get the log date.
	 * 
	 * @return Returns the log date.
	 */
	
	public String getLogDate()
	{
		return logDate;
	}
	
	/**
	 * Set the log date format.
	 * 
	 * @param logDate Date format of the log.
	 */
	
	public void setLogDateFormat(String logDateFormat)
	{
		this.logDateFormat = logDateFormat;
	}
	
	/**
	 * Get the log date format.
	 * 
	 * @return Returns the log date format.
	 */
	
	public String getLogDateFormat()
	{
		return logDateFormat;
	}
	
	/**
	 * Set the log date long.
	 * 
	 * @param logDateLong Date long for the log.
	 */
	
	public void setLogDateLong(long logDateLong)
	{
		this.logDateLong = logDateLong;
	}
	
	/**
	 * Get the log date long.
	 * 
	 * @return Returns the log date long.
	 */
	
	public long getLogDateLong()
	{
		return logDateLong;
	}
	
	
	/**
	 * Set the log date.
	 * 
	 * @param date Date for the log.
	 */
	
	public void setDate(String date)
	{
		this.logDate = date;
	}
	
	/**
	 * Get the log date.
	 * 
	 * @return Returns the log date.
	 */
	
	public String getDate()
	{
		return logDate;
	}
	
	
	
	/**
	 * Convert the Log object into HashMap object.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		if(logDate != null)
		{
			requestBody.put("date", logDate);
		}
		if(billStatus != null)
		{
			requestBody.put("bill_status", billStatus);
		}
		if((Integer)hours != null && hours > 0)
		{
			requestBody.put("hours", hours);
		}
		if(notes != null)
		{
			requestBody.put("notes", notes);
		}
		
		
		return requestBody;
		
	}
	
}
