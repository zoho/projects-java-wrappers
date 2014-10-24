/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;
import java.util.List;


/**
 * This class is used to make an object for task.
 * 
 * @author ramesh-2099
 *
 */

public class Task
{
	
	private long id;
	private String name;
	private boolean completed;
	private String createdBy;
	private String createdPerson;
	private String priority;
	private int percentComplete;
	private String startDate;
	private String startDateFormat;
	private long startDateLong;
	private String endDate;
	private String endDateFormat;
	private long endDateLong;
	private String duration;
	
	private String url;
	private String subtaskUrl;
	private String timesheetUrl;
	
	private List<Owner> owners;
	
	private List<Comment> comments;
	
	private String[] associateDocumentIds;
	
	private String[] associateForumIds;
	
	private boolean subtasks;
	
	private Tasklist tasklist;
	
	
	
	/**
	 * Set the task id.
	 * 
	 * @param id ID of the task.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the task id.
	 * 
	 * @return Returns the task id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the task name.
	 * 
	 * @param name Name of the task.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the task name.
	 * 
	 * @return Returns the task name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the task is completed or not.
	 * 
	 * @param completed The task is completed or not.
	 */
	
	public void setCompleted(boolean completed)
	{
		this.completed = completed;
	}
	
	/**
	 * Get the task is completed or not.
	 * 
	 * @return Returns true if the task is completed else returns false.
	 */
	
	public boolean isCompleted()
	{
		return completed;
	}
	
	/**
	 * Set the task created person id.
	 * 
	 * @param createdBy Task created person id.
	 */
	
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}
	
	/**
	 * Get the task created person id.
	 * 
	 * @return Returns the task created person id.
	 */
	
	public String getCreatedBy()
	{
		return createdBy;
	}
	
	/**
	 * Set the task created person name.
	 * 
	 * @param createdPerson Task created person name.
	 */
	
	public void setCreatedPerson(String createdPerson)
	{
		this.createdPerson = createdPerson;
	}
	
	/**
	 * Get the task created person name.
	 * 
	 * @return Returns the task created person name.
	 */
	
	public String getCreatedPerson()
	{
		return createdPerson;
	}
	
	/**
	 * Set the priority of the task.
	 * 
	 * @param priority Priority of the task.
	 */
	
	public void setPriority(String priority)
	{
		this.priority = priority;
	}
	
	/**
	 * Get the priority of the task.
	 * 
	 * @return Returns the priority of the task.
	 */
	
	public String getPriority()
	{
		return priority;
	}
	
	/**
	 * Set the task completed percent.
	 * 
	 * @param percentComplete Task completed percent.
	 */
	
	public void setPercentComplete(int percentComplete) 
	{
		this.percentComplete = percentComplete;
	}
	
	/**
	 * Get the task completed percent.
	 * 
	 * @return Returns the task complete percent.
	 */
	
	public int getPercentComplete()
	{
		return percentComplete;
	}
	
	/**
	 * Set the task start date.
	 * 
	 * @param startDate Start date of the task.
	 */
	
	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}
	
	/**
	 * Get the task start date.
	 * 
	 * @return Returns the task start date.
	 */
	
	public String getStartDate()
	{
		return startDate;
	}
	
	/**
	 * Set the task start date format. 
	 * 
	 * @param startDate Start date format of the task.
	 */
	
	public void setStartDateFormat(String startDateFormat)
	{
		this.startDateFormat = startDateFormat;
	}
	
	/**
	 * Get the task start date format.
	 * 
	 * @return Returns the task start date format.
	 */
	
	public String getStartDateFormat()
	{
		return startDateFormat;
	}
	
	/**
	 * Set the start date long.
	 * 
	 * @param startDateLong Start date long for the task.
	 */
	
	public void setStartDateLong(long startDateLong)
	{
		this.startDateLong = startDateLong;
	}
	
	/**
	 * Get the start date long.
	 * 
	 * @return Returns the task start date long.
	 */
	
	public long getStartDateLong()
	{
		return startDateLong;
	}
	
	/**
	 * Set the task end date.
	 * 
	 * @param endDate End date of the task.
	 */
	
	public void setEndDate(String endDate)
	{
		this.endDate = endDate;
	}
	
	/**
	 * Get the task end date.
	 * 
	 * @return Returns the task end date.
	 */
	
	public String getEndDate()
	{
		return endDate;
	}
	
	/**
	 * Set the task end date format.
	 * 
	 * @param endDate End date format of the task.
	 */
	
	public void setEndDateFormat(String endDateFormat)
	{
		this.endDateFormat = endDateFormat;
	}
	
	/**
	 * Get the task end date format.
	 * 
	 * @return Returns the task end date format.
	 */
	
	public String getEndDateFormat()
	{
		return endDateFormat;
	}
	
	/**
	 * Set the end date long.
	 * 
	 * @param endDateLong End date long for the task.
	 */
	
	public void setEndDateLong(long endDateLong)
	{
		this.endDateLong = endDateLong;
	}
	
	/**
	 * Get the end date long.
	 * 
	 * @return Returns the task end date long.
	 */
	
	public long getEndDateLong()
	{
		return endDateLong;
	}
	
	/**
	 * Set the task duration.
	 * 
	 * @param duration Duration of the task.
	 */
	
	public void setDuration(String duration)
	{
		this.duration = duration;
	}
	
	/**
	 * Get the task duration.
	 * 
	 * @return Returns the task duration.
	 */
	
	public String getDuration()
	{
		return duration;
	}
	
	
	
	/**
	 * Set the task URL.
	 * 
	 * @param url URL for the task.
	 */
	
	public void setURL(String url)
	{
		this.url = url;
	}
	
	/**
	 * Get the task URL.
	 * 
	 * @return Returns the task URL.
	 */
	
	public String getURL()
	{
		return url;
	}
	
	/**
	 * Set the subtask URL.
	 * 
	 * @param subtaskUrl URL for the subtask.
	 */
	
	public void setSubtaskURL(String subtaskUrl)
	{
		this.subtaskUrl = subtaskUrl;
	}
	
	/**
	 * Get the subtask URL.
	 * 
	 * @return Returns the subtask url.
	 */
	
	public String getSubtaskURL()
	{
		return subtaskUrl;
	}
	
	/**
	 * Set the time sheet URL.
	 * 
	 * @param timesheetUrl URL for the time sheet.
	 */
	
	public void setTimesheetURL(String timesheetUrl)
	{
		this.timesheetUrl = timesheetUrl;
	}
	
	/**
	 * Get the time sheet URL.
	 * 
	 * @return Returns the time sheet URL.
	 */
	
	public String getTimesheetURL()
	{
		return timesheetUrl;
	}
	
	
	
	/**
	 * Set the owners of the task.
	 * 
	 * @param owners List of Owner object.
	 */
	
	public void setOwners(List<Owner> owners)
	{
		this.owners = owners;
	}
	
	/**
	 * Get the owner of the task.
	 * 
	 * @return Returns list of Owner object.
	 */
	
	public List<Owner> getOwners()
	{
		return owners;
	}
	
	
	
	/**
	 * Set the comments of the task.
	 * 
	 * @param comments List of Comment object.
	 */
	
	public void setComments(List<Comment> comments)
	{
		this.comments = comments;
	}
	
	/**
	 * Get the comments of the task.
	 * 
	 * @return Returns list of Comment object.
	 */
	
	public List<Comment> getComments()
	{
		return comments;
	}
	
	
	/**
	 * Set the associated document IDs of the task.
	 * 
	 * @param associateDocumentIds Document IDs of the task.
	 */
	
	public void setAssociateDocumentIds(String[] associateDocumentIds)
	{
		this.associateDocumentIds = associateDocumentIds;
	}
	
	/**
	 * Get the associated document IDs of the task.
	 * 
	 * @return Returns array of document IDs.
	 */
	
	public String[] getAssociateDocumentIds()
	{
		return associateDocumentIds;
	}
	
	
	/**
	 * Set the associated forum IDs.
	 * 
	 * @param associateForumIds Forum IDs of the task.
	 */
	
	public void setAssociateForumIds(String[] associateForumIds)
	{
		this.associateForumIds = associateForumIds;
	}
	
	/**
	 * Get the associated forum IDs of the task.
	 * 
	 * @return Returns array of forum IDs.
	 */
	
	public String[] getAssociateForumIds()
	{
		return associateForumIds;
	}
	
	
	
	/**
	 * Set the subtasks of the task.
	 * 
	 * @param tasks Whether the task has subtasks or not.
	 */
	
	public void setSubtasks(boolean subtasks)
	{
		this.subtasks = subtasks;
	}
	
	/**
	 * Get the subtasks of the task.
	 * 
	 * @return Returns true if the task has subtasks else return false.
	 */
	
	public boolean getSubtasks()
	{
		return subtasks;
	}
	
	
	/**
	 * Set the tasklist of the task.
	 * 
	 * @param tasklist Tasklist object.
	 */
	
	public void setTasklist(Tasklist tasklist)
	{
		this.tasklist = tasklist;
	}
	
	/**
	 * Get the tasklist of the task.
	 * 
	 * @return Returns the Tasklist object.
	 */
	
	public Tasklist getTasklist()
	{
		return tasklist;
	}
	
	
	
	/**
	 * Convert the Task object into HashMap object.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		if(owners != null)
		{
			
			String personResponsible = "";
			
			for (Owner owner : owners)
			{
				personResponsible += owner.getId()+",";
			}
			requestBody.put("person_responsible", personResponsible);
		}
		if(name != null)
		{
			requestBody.put("name", name);
		}
		if(tasklist != null)
		{
			requestBody.put("tasklist_id", tasklist.getId());
		}
		if(startDate != null)
		{
			requestBody.put("start_date", startDate);
		}
		if(endDate != null)
		{
			requestBody.put("end_date", endDate);
		}
		if(duration != null)
		{
			requestBody.put("duration", duration);
		}
		if(priority != null)
		{
			requestBody.put("priority", priority);
		}
		
		return requestBody;
	}
	
	
}