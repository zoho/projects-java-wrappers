/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;

/**
 * This class is used to make an object for project.
 * 
 * @author ramesh-2099
 *
 */

public class Project
{
	
	private long id;
	private String idString;
	private String name;
	private long templateId;
	private String status;
	private String createdDate;
	private String createdDateFormat;
	private long createdDateLong;
	private String description;
	private String ownerName;
	private String ownerId;
	
	private int openTaskCount;
	private int closedTaskCount;
	
	private int openMilestoneCount;
	private int closedMilestoneCount;
	
	private int openBugCount;
	private int closedBugCount;
	
	private String url;
	private String activityUrl;
	private String milestoneUrl;
	private String tasklistUrl;
	private String taskUrl;
	private String bugUrl;
	private String timesheetUrl;
	private String statusUrl;
	private String eventUrl;
	private String documentUrl;
	private String folderUrl;
	private String forumUrl;
	private String userUrl;
	
	
	
	/**
	 * Set the project id.
	 * 
	 * @param id ID of the project.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the project id.
	 * 
	 * @return Returns the project id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the project id as string.
	 * 
	 * @param idString Project id as string.
	 */
	
	public void setIdString(String idString) 
	{
		this.idString = idString;
	}
	
	/**
	 * Get the project id as string.
	 * 
	 * @return Returns the project id as string.
	 */
	
	public String getIdString() 
	{
		return idString;
	}

	
	/**
	 * Set the project name.
	 * 
	 * @param name Name of the project.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the project name.
	 * 
	 * @return Returns the project name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the template id of the project.
	 * 
	 * @param templateId ID of the template.
	 */
	
	public void setTemplateId(long templateId)
	{
		this.templateId = templateId;
	}
	
	/**
	 * Get the template id of the project.
	 * 
	 * @return Returns the template id.
	 */
	
	public long getTemplateId()
	{
		return templateId;
	}
	
	/**
	 * Set the status of the project.
	 * 
	 * @param status Status of the project.
	 */
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	/**
	 * Get the project status.
	 * 
	 * @return Returns the project status.
	 */
	
	public String getStatus()
	{
		return status;
	}
	
	/**
	 * Set the created date for the project.
	 * 
	 * @param createdDate Created date for the project.
	 */
	
	public void setCreatedDate(String createdDate)
	{
		this.createdDate = createdDate;
	}
	
	/**
	 * Get the created date for the project.
	 * 
	 * @return Returns the project created date.
	 */
	
	public String getCreatedDate()
	{
		return createdDate;
	}
	
	/**
	 * Set the created date format for the project.
	 * 
	 * @param createdDate Created date format for the project.
	 */
	
	public void setCreatedDateFormat(String createdDateFormat)
	{
		this.createdDateFormat = createdDateFormat;
	}
	
	/**
	 * Get the created date format for the project.
	 * 
	 * @return Returns the project created date format.
	 */
	
	public String getCreatedDateFormat()
	{
		return createdDateFormat;
	}
	
	/**
	 * Set the project created date long.
	 * 
	 * @param createdDateLong Project created date long.
	 */
	
	public void setCreatedDateLong(long createdDateLong)
	{
		this.createdDateLong = createdDateLong;
	}
	
	/**
	 * Get the project created date long.
	 * 
	 * @return Returns the project created date long.
	 */
	
	public long getCreatedDateLong()
	{
		return createdDateLong;
	}
	
	/**
	 * Set the project description.
	 * 
	 * @param description Description of the project.
	 */
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
	 * Get the project description.
	 * 
	 * @return Returns the project description.
	 */
	
	public String getDescription()
	{
		return description;
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
	 * @return Retruns the owner name.
	 */
	
	public String getOwnerName()
	{
		return ownerName;
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
	 * Set the open task count.
	 * 
	 * @param openTaskCount Open task count for the project.
	 */
	
	public void setOpenTaskCount(int openTaskCount)
	{
		this.openTaskCount = openTaskCount;
	}
	
	/**
	 * Get the open task count.
	 * 
	 * @return Returns the open task count for the project.
	 */
	
	public int getOpenTaskCount()
	{
		return openTaskCount;
	}
	
	/**
	 * Set the closed task count.
	 * 
	 * @param closedTaskCount Closed task count for the project.
	 */
	
	public void setClosedTaskCount(int closedTaskCount)
	{
		this.closedTaskCount = closedTaskCount;
	}
	
	/**
	 * Get the closed task count.
	 * 
	 * @return Returns the closed task count for the project.
	 */
	
	public int getClosedTaskCount()
	{
		return closedTaskCount;
	}
	
	
	/**
	 * Set the open milestone count.
	 * 
	 * @param openMilestoneCount Open milestone count for the project.
	 */
	
	public void setOpenMilestoneCount(int openMilestoneCount)
	{
		this.openMilestoneCount = openMilestoneCount;
	}
	
	/**
	 * Get the open milestone count.
	 * 
	 * @return Returns the open milestone count for the project.
	 */
	
	public int getOpenMilestoneCount()
	{
		return openMilestoneCount;
	}
	
	/**
	 * Set the closed milestone count.
	 * 
	 * @param closedMilestoneCount Closed milestone count for the project.
	 */
	
	public void setClosedMilestoneCount(int closedMilestoneCount)
	{
		this.closedMilestoneCount = closedMilestoneCount;
	}
	
	/**
	 * Get the closed milestone count.
	 * 
	 * @return Returns the closed milestone count for the project.
	 */
	
	public int getClosedMilestoneCount()
	{
		return closedMilestoneCount;
	}
	
	
	/**
	 * Set the open bug count.
	 * 
	 * @param openBugCount Open bug count for the project.
	 */
	
	public void setOpenBugCount(int openBugCount)
	{
		this.openBugCount = openBugCount;
	}
	
	/**
	 * Get the open bug count.
	 * 
	 * @return Returns the open bug count for the project.
	 */
	
	public int getOpenBugCount()
	{
		return openBugCount;
	}
	
	/**
	 * Set the closed bug count.
	 * 
	 * @param closedBugCount Closed bug count for the project.
	 */
	
	public void setClosedBugCount(int closedBugCount)
	{
		this.closedBugCount = closedBugCount;
	}
	
	/**
	 * Get the closed bug count.
	 * 
	 * @return Returns the closed bug count for the project.
	 */
	
	public int getClosedBugCount()
	{
		return closedBugCount;
	}
	
	
	
	/**
	 * Set the project URL.
	 * 
	 * @param url URL for the project.
	 */
	
	public void setURL(String url)
	{
		this.url = url;
	}
	
	/**
	 * Get the project URL.
	 * 
	 * @return Returns the project URL.
	 */
	
	public String getURL()
	{
		return url;
	}
	
	/**
	 * Set the activity URL.
	 * 
	 * @param activityUrl URL for the activity.
	 */
	
	public void setActivityURL(String activityUrl)
	{
		this.activityUrl = activityUrl;
	}
	
	/**
	 * Get the activity URL.
	 * 
	 * @return Returns the activity URL.
	 */
	
	public String getActivityURL()
	{
		return activityUrl;
	}
	
	/**
	 * Set the milestone URL.
	 * 
	 * @param milestoneUrl URL for the milestone.
	 */
	
	public void setMilestoneURL(String milestoneUrl)
	{
		this.milestoneUrl = milestoneUrl;
	}
	
	/**
	 * Get the milestone URL.
	 * 
	 * @return Returns the milestone URL.
	 */
	
	public String getMilestoneURL()
	{
		return milestoneUrl;
	}
	
	/**
	 * Set the task list URL.
	 * 
	 * @param tasklistUrl URL for the task list.
	 */
	
	public void setTasklistURL(String tasklistUrl)
	{
		this.tasklistUrl = tasklistUrl;
	}
	
	/**
	 * Get the task list URL.
	 * 
	 * @return Returns the task list URL.
	 */
	
	public String getTasklistURL()
	{
		return tasklistUrl;
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
	 * Set the bug URL.
	 * 
	 * @param bugUrl URL for the bug.
	 */
	
	public void setBugURL(String bugUrl)
	{
		this.bugUrl = bugUrl;
	}
	
	/**
	 * Get the bug URL.
	 * 
	 * @return Returns the bug URL.
	 */
	
	public String getBugURL()
	{
		return bugUrl;
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
	 * Set the status URL.
	 * 
	 * @param statusUrl URL for the status.
	 */
	
	public void setStatusURL(String statusUrl)
	{
		this.statusUrl = statusUrl;
	}
	
	/**
	 * Get the status URL.
	 * 
	 * @return Returns the status URL.
	 */
	
	public String getStatusURL()
	{
		return statusUrl;
	}
	
	/**
	 * Set the event URL.
	 * 
	 * @param eventUrl URL for the event.
	 */
	
	public void setEventURL(String eventUrl)
	{
		this.eventUrl = eventUrl;
	}
	
	/**
	 * Get the event URL.
	 * 
	 * @return Returns the event URL.
	 */
	
	public String getEventURL()
	{
		return eventUrl;
	}
	
	/**
	 * Set the document URL.
	 * 
	 * @param documentUrl URL for the document.
	 */
	
	public void setDocumentURL(String documentUrl)
	{
		this.documentUrl = documentUrl;
	}
	
	/**
	 * Get the document URL.
	 * 
	 * @return Returns the document URL.
	 */
	
	public String getDocumentURL()
	{
		return documentUrl;
	}
	
	/**
	 * Set the folder URL.
	 * 
	 * @param folderUrl URL for the folder.
	 */
	
	public void setFolderURL(String folderUrl)
	{
		this.folderUrl = folderUrl;
	}
	
	/**
	 * Get the folder URL.
	 * 
	 * @return Returns the folder URL.
	 */
	
	public String getFolderURL()
	{
		return folderUrl;
	}
	
	/**
	 * Set the forum URL.
	 * 
	 * @param forumUrl URL for the forum.
	 */
	
	public void setForumURL(String forumUrl)
	{
		this.forumUrl = forumUrl;
	}
	
	/**
	 * Get the forum URL.
	 * 
	 * @return Returns the forum URL.
	 */
	
	public String getForumURL() 
	{
		return forumUrl;
	}
	
	/**
	 * Set the user URL.
	 * 
	 * @param userUrl URL for the user.
	 */
	
	public void setUserURL(String userUrl)
	{
		this.userUrl = userUrl;
	}
	
	/**
	 * Get the user URL.
	 * 
	 * @return Returns the user URL.
	 */
	
	public String getUserURL()
	{
		return userUrl;
	}
	
	
	
	
	/**
	 * Convert the Project object into HashMap object.
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
		if(description != null)
		{
			requestBody.put("description", description);
		}
		if(status != null && !status.equals(""))
		{
			requestBody.put("status", status);
		}
		if((Long)templateId != null && templateId > 0)
		{
			requestBody.put("template_id", templateId);
		}
		
		return requestBody;
		
	}
	
}