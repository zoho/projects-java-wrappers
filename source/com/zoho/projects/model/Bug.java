/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;

/**
 * This class is used to make an object for bug.
 * 
 * @author ramesh-2099
 *
 */

public class Bug 
{
	
	private long id;
	private String key;
	private long projectId;
	private String flag;
	private String title;
	private String description;
	private String reporterId;
	private String reportedPerson;
	private String createdTime;
	private String createdTimeFormat;
	private long createdTimeLong;
	private String assigneeId;
	private String assigneeName;
	private boolean closed;
	
	private String url;
	private String timesheetUrl;
	
	private long classificationId;
	private String classificationType;
	
	private long severityId;
	private String severityType;
	
	private long statusId;
	private String statusType;
	
	private long reproducibleId;
	private String reproducibleType;
	
	private long moduleId;
	private String moduleName;
	
	
	private long milestoneId;
	private String dueDate;
	private String dueDateFormat;
	private long dueDateLong;
	
	
	
	/**
	 * Set the bug id.
	 * 
	 * @param id ID of the bug.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the bug id.
	 * 
	 * @return Returns the bug id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the key for the bug.
	 * 
	 * @param key Key for the bug.
	 */
	
	public void setKey(String key)
	{
		this.key = key;
	}
	
	/**
	 * Get the key for the bug.
	 * 
	 * @return Returns the bug key.
	 */
	
	public String getKey()
	{
		return key;
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
	 * get the project id.
	 * 
	 * @return Returns the project id.
	 */
	
	public long getProjectId()
	{
		return projectId;
	}
	
	/**
	 * Set the flag for the bug.
	 * 
	 * @param flag Flag for the bug.
	 */
	
	public void setFlag(String flag)
	{
		this.flag = flag;
	}
	
	/**
	 * Get the flag for the bug.
	 * 
	 * @return Returns the flag for the bug.
	 */
	
	public String getFlag()
	{
		return flag;
	}
	
	/**
	 * Set the bug title.
	 * 
	 * @param title Title for the bug.
	 */
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * Get the bug title.
	 * 
	 * @return Returns the bug title.
	 */
	
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * Set the bug description.
	 * 
	 * @param description Description for the bug.
	 */
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
	 * Get the bug description.
	 * 
	 * @return Returns the bug description.
	 */
	
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * Set the reporter id.
	 * 
	 * @param reporterId ID of the reporter.
	 */
	
	public void setReporterId(String reporterId)
	{
		this.reporterId = reporterId;
	}
	
	/**
	 * Get the reporter id.
	 * 
	 * @return Returns the reporter id.
	 */
	
	public String getReporterId()
	{
		return reporterId;
	}
	
	/**
	 * Set the reported person.
	 * 
	 * @param reportedPerson Reported person for the bug.
	 */
	
	public void setReportedPerson(String reportedPerson)
	{
		this.reportedPerson = reportedPerson;
	}
	
	/**
	 * Get the reported person.
	 * 
	 * @return Returns the reported person for the bug.
	 */
	
	public String getReportedPerson()
	{
		return reportedPerson;
	}
	
	/**
	 * Set the created time.
	 * 
	 * @param createdTime Created time for the bug.
	 */
	
	public void setCreatedTime(String createdTime)
	{
		this.createdTime = createdTime;
	}
	
	/**
	 * Get the created time.
	 * 
	 * @return Returns the created time for the bug.
	 */
	
	public String getCreatedTime()
	{
		return createdTime;
	}
	
	/**
	 * Set the created time format.
	 * 
	 * @param createdTime Created time format for the bug.
	 */
	
	public void setCreatedTimeFormat(String createdTimeFormat)
	{
		this.createdTimeFormat = createdTimeFormat;
	}
	
	/**
	 * Get the created time format.
	 * 
	 * @return Returns the created time format for the bug.
	 */
	
	public String getCreatedTimeFormat()
	{
		return createdTimeFormat;
	}
	
	/**
	 * Set the created time long.
	 * 
	 * @param createdTimeLong Created time long for the bug.
	 */
	
	public void setCreatedTimeLong(long createdTimeLong)
	{
		this.createdTimeLong = createdTimeLong;
	}
	
	/**
	 * Get the created time long.
	 * 
	 * @return Returns the created time long for the bug.
	 */
	
	public long getCreatedTimeLong()
	{
		return createdTimeLong;
	}
	
	/**
	 * Set the assignee id for the bug.
	 * 
	 * @param assigneeId ID of the assignee.
	 */
	
	public void setAssigneeId(String assigneeId)
	{
		this.assigneeId = assigneeId;
	}
	
	/**
	 * Get the assignee id.
	 * 
	 * @return Returns the assignee id.
	 */
	
	public String getAssigneeId()
	{
		return assigneeId;
	}
	
	/**
	 * Set the assignee name.
	 * 
	 * @param assigneeName Name of the assignee.
	 */
	
	public void setAssigneeName(String assigneeName)
	{
		this.assigneeName = assigneeName;
	}
	
	/**
	 * Get the assignee name.
	 * 
	 * @return Returns the assignee name.
	 */
	
	public String getAssigneeName()
	{
		return assigneeName;
	}
	
	/**
	 * Set the bug is closed or not.
	 * 
	 * @param closed Boolean for the bug is closed or not.
	 */
	
	public void setClosed(boolean closed)
	{
		this.closed = closed;
	}
	
	/**
	 * Get the bug is closed or not.
	 * 
	 * @return Returns true if the big is closed else returns false.
	 */
	
	public boolean isClosed()
	{
		return closed;
	}
	
	
	
	/**
	 * Set the bug URL.
	 * 
	 * @param url URL for the bug.
	 */
	
	public void setURL(String url)
	{
		this.url = url;
	}
	
	/**
	 * Get the bug URL.
	 * 
	 * @return Returns the bug URL.
	 */
	
	public String getURL()
	{
		return url;
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
	 * Set the classification id.
	 * 
	 * @param classificationId ID of the classification.
	 */
	
	public void setClassificationId(long classificationId)
	{
		this.classificationId = classificationId;
	}
	
	/**
	 * Get the classification id.
	 * 
	 * @return Returns the classification id.
	 */
	
	public long getClassificationId()
	{
		return classificationId;
	}
	
	/**
	 * Set the classification type.
	 * 
	 * @param classificationType Type of the classification.
	 */
	
	public void setClassificationType(String classificationType)
	{
		this.classificationType = classificationType;
	}
	
	/**
	 * Get the classification type.
	 * 
	 * @return Returns the classification type.
	 */
	
	public String getClassificationType()
	{
		return classificationType;
	}
	
	
	
	/**
	 * Set the severity id.
	 * 
	 * @param severityId ID of the severity.
	 */
	
	public void setSeverityId(long severityId)
	{
		this.severityId = severityId;
	}
	
	/**
	 * Get the severity id.
	 * 
	 * @return Returns the severity id.
	 */
	
	public long getSeverityId()
	{
		return severityId;
	}
	
	/**
	 * Set the severity type.
	 * 
	 * @param severityType Type of the severity.
	 */
	
	public void setSeverityType(String severityType)
	{
		this.severityType = severityType;
	}
	
	/**
	 * Get the severity type.
	 * 
	 * @return Returns the severity type.
	 */
	
	public String getSeverityType()
	{
		return severityType;
	}
	
	
	
	/**
	 * Set the status id.
	 * 
	 * @param statusId ID of the status.
	 */
	
	public void setStatusId(long statusId)
	{
		this.statusId = statusId;
	}
	
	/**
	 * Get the status id.
	 * 
	 * @return Returns the status id.
	 */
	
	public long getStatusId()
	{
		return statusId;
	}
	
	/**
	 * Set the status type.
	 * 
	 * @param statusType Type of the status.
	 */
	
	public void setStatusType(String statusType)
	{
		this.statusType = statusType;
	}
	
	/**
	 * Get the status type.
	 * 
	 * @return Returns the status type.
	 */
	
	public String getStatusType()
	{
		return statusType;
	}
	
	
	/**
	 * Set the reproducible id.
	 * 
	 * @param reproducibleId Reproducible id of the bug.
	 */
	
	public void setReproducibleId(long reproducibleId)
	{
		this.reproducibleId = reproducibleId;
	}
	
	/**
	 * Get the reproducible id.
	 * 
	 * @return Returns the reproducible id.
	 */
	
	public long getReproducibleId()
	{
		return reproducibleId;
	}
	
	/**
	 * Set the reproducible type.
	 * 
	 * @param reproducibleType Reproducible type of the bug.
	 */
	
	public void setReproducibleType(String reproducibleType)
	{
		this.reproducibleType = reproducibleType;
	}
	
	/**
	 * Get the reproducible type.
	 * 
	 * @return Returns the reproducible type.
	 */
	
	public String getReproducibleType()
	{
		return reproducibleType;
	}
	
	
	
	/**
	 * Set the module id.
	 * 
	 * @param moduleId ID of the module.
	 */
	
	public void setModuleId(long moduleId)
	{
		this.moduleId = moduleId;
	}
	
	/**
	 * Get the module id.
	 * 
	 * @return Returns the module id.
	 */
	
	public long getModuleId()
	{
		return moduleId;
	}
	
	/**
	 * Set the module name.
	 * 
	 * @param moduleName Name of the module.
	 */
	
	public void setModuleName(String moduleName)
	{
		this.moduleName = moduleName;
	}
	
	/**
	 * Get the module name.
	 * 
	 * @return Returns the module name.
	 */
	
	public String getModuleName()
	{
		return moduleName;
	}
	
	
	
	/**
	 * Set the milestone id.
	 * 
	 * @param milestoneId ID of the milestone.
	 */
	
	public void setMilestoneId(long milestoneId)
	{
		this.milestoneId = milestoneId;
	}
	
	/**
	 * Get the milestone id.
	 * 
	 * @return Returns the milestone id.
	 */
	
	public long getMilestoneId()
	{
		return milestoneId;
	}
	
	/**
	 * Set the due date.
	 * 
	 * @param dueDate Due date for the bug.
	 */
	
	public void setDueDate(String dueDate)
	{
		this.dueDate = dueDate;
	}
	
	/**
	 * Get the due date.
	 * 
	 * @return Returns the due date.
	 */
	
	public String getDueDate()
	{
		return dueDate;
	}
	
	/**
	 * Set the due date format.
	 * 
	 * @param dueDate Due date format for the bug.
	 */
	
	public void setDueDateFormat(String dueDateFormat)
	{
		this.dueDateFormat = dueDateFormat;
	}
	
	/**
	 * Get the due date format.
	 * 
	 * @return Returns the due date format.
	 */
	
	public String getDueDateFormat()
	{
		return dueDateFormat;
	}
	
	/**
	 * Set the due date long.
	 * 
	 * @param dueDateLong Due date long for the bug.
	 */
	
	public void setDueDateLong(long dueDateLong)
	{
		this.dueDateLong = dueDateLong;
	}
	
	/**
	 * Get the due date long.
	 * 
	 * @return Returns the due date long.
	 */
	
	public long getDueDateLong()
	{
		return dueDateLong;
	}
	
	
	
	/**
	 * Convert the Bug object into HashMap.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		
		if(title != null)
		{
			requestBody.put("title", title);
		}
		if(description != null)
		{
			requestBody.put("description", description);
		}
		if(assigneeId != null)
		{
			requestBody.put("assignee", assigneeId);
		}
		if(flag != null)
		{
			requestBody.put("flag", flag);
		}
		if((Long)classificationId != null && classificationId > 0)
		{
			requestBody.put("classification_id", classificationId);
		}
		if((Long)milestoneId != null && milestoneId > 0)
		{
			requestBody.put("milestone_id", milestoneId);
		}
		if(dueDate != null)
		{
			requestBody.put("due_date", dueDate);
		}
		if((Long)moduleId != null && moduleId > 0)
		{
			requestBody.put("module_id", moduleId);
		}
		if((Long)severityId != null && severityId > 0)
		{
			requestBody.put("severity_id", severityId);
		}
		if((Long)reproducibleId != null && reproducibleId > 0)
		{
			requestBody.put("reproducible_id", reproducibleId);
		}
		
		return requestBody;
	}
	

}
