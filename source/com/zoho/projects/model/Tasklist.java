/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;

/**
 * This class is used to make an object for tasklist.
 * 
 * @author ramesh-2099
 *
 */

public class Tasklist
{
	
	private long id;
	private String idString;
	private String name;
	private boolean completed;
	private String createdTime;
	private String createdTimeFormat;
	private long createdTimeLong;
	private boolean rolled;
	private int sequence;
	
	private String url;
	private String taskUrl;
	
	private String flag;
	private String status;
	
	private Milestone milestone;
	
	
	
	
	/**
	 * Set the task list id.
	 * 
	 * @param id ID of the task list.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the task list id.
	 * 
	 * @return Returns the task list id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the task list id as string.
	 * 
	 * @param idString Task list id as string.
	 */
	
	public void setIdString(String idString) 
	{
		this.idString = idString;
	}
	
	/**
	 * Get the task list id as string.
	 * 
	 * @return Returns the task list id string.
	 */
	
	public String getIdString() 
	{
		return idString;
	}

	/**
	 * Set the task list name.
	 * 
	 * @param name Name of the task list.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the task list name.
	 * 
	 * @return Returns the task list name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the task list is completed or not.
	 * 
	 * @param completed The task list is completed or not.
	 */
	
	public void setCompleted(boolean completed)
	{
		this.completed = completed;
	}
	
	/**
	 * Get the task list is completed or not.
	 * 
	 * @return Returns true of the task list is completed else returns false.
	 */
	
	public boolean isCompleted()
	{
		return completed;
	}
	
	/**
	 * Set the task list created time.
	 * 
	 * @param createdTime Task list created time.
	 */
	
	public void setCreatedTime(String createdTime)
	{
		this.createdTime = createdTime;
	}
	
	/**
	 * Get the task list created time.
	 * 
	 * @return Returns the task list created time.
	 */
	
	public String getCreatedTime()
	{
		return createdTime;
	}
	
	/**
	 * Set the task list created time format.
	 * 
	 * @param createdTime Task list created time format.
	 */
	
	public void setCreatedTimeFormat(String createdTimeFormat)
	{
		this.createdTimeFormat = createdTimeFormat;
	}
	
	/**
	 * Get the task list created time format.
	 * 
	 * @return Returns the task list created time format.
	 */
	
	public String getCreatedTimeFormat()
	{
		return createdTimeFormat;
	}
	
	/**
	 * Set the task list created time long.
	 * 
	 * @param createdTimeLong Task list created time long.
	 */
	
	public void setCreatedTimeLong(long createdTimeLong)
	{
		this.createdTimeLong = createdTimeLong;
	}
	
	/**
	 * Get the task list created time long.
	 * 
	 * @return Returns the task list created time long.
	 */
	
	public long getCreatedTimeLong()
	{
		return createdTimeLong;
	}
	
	/**
	 * Set the task list is rolled or not.
	 * 
	 * @param rolled The task list is rolled or not.
	 */
	
	public void setRolled(boolean rolled)
	{
		this.rolled = rolled;
	}
	
	/**
	 * Get the task list rolled or not.
	 * 
	 * @return Returns true if the task list is rolled else returns false.
	 */
	
	public boolean isRolled()
	{
		return rolled;
	}
	
	/**
	 * Set the sequence of the task list.
	 * 
	 * @param sequence Sequence of the task list.
	 */
	
	public void setSequence(int sequence) 
	{
		this.sequence = sequence;
	}
	
	/**
	 * Get the sequence of the task list.
	 * 
	 * @return Returns the sequence of the task list.
	 */
	
	public int getSequence()
	{
		return sequence;
	}
	

	
	
	/**
	 * Set the task list URL.
	 * 
	 * @param url URL for the task list.
	 */
	
	public void setURL(String url)
	{
		this.url = url;
	}
	
	/**
	 * Get the task list URL.
	 * 
	 * @return Returns the task list URL.
	 */
	
	public String getURL()
	{
		return url;
	}
	
	/**
	 * Set the task URL.
	 * 
	 * @param taskUrl URL for the task.
	 */
	
	public void setTaskURL(String taskUrl)
	{
		this.taskUrl = taskUrl;
	}
	
	/**
	 * Get the task URL.
	 * 
	 * @return Returns the task URL.
	 */
	
	public String getTaskURL()
	{
		return taskUrl;
	}
	
	
	
	/**
	 * Set the flag for the task list.
	 * 
	 * @param flag Flag for the task list.
	 */
	
	public void setFlag(String flag)
	{
		this.flag = flag;
	}
	
	/**
	 * Get the flag for the task list.
	 * 
	 * @return Returns the task list flag.
	 */
	
	public String getFlag()
	{
		return flag;
	}
	
	/**
	 * Set the status of the task list.
	 * 
	 * @param status Status of the task list.
	 */
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	/**
	 * Get the status of the task list.
	 * 
	 * @return Returns the status of the task list. 
	 */
	
	public String getStatus()
	{
		return status;
	}
	
	
	/**
	 * Set the milestone for the task list.
	 * 
	 * @param milestone Milestone object.
	 */
	
	public void setMilestone(Milestone milestone)
	{
		this.milestone = milestone;
	}
	
	/**
	 * Get the milestone for the task list.
	 * 
	 * @return Returns the Milestone object.
	 */
	
	public Milestone getMilestone()
	{
		return milestone;
	}
	
	
	
	
	/**
	 * Convert the Tasklist object into HashMap object.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		if(milestone != null)
		{
			requestBody.put("milestone_id", milestone.getId());
		}
		if(name != null)
		{
			requestBody.put("name", name);
		}
		if(flag != null)
		{
			requestBody.put("flag", flag);
		}
		if(status != null)
		{
			requestBody.put("status", status);
		}
		
		return requestBody;
	}
	
}