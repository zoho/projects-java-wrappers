/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Activity;
import com.zoho.projects.model.Project;
import com.zoho.projects.model.Status;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class ProjectParser
{
	
	
	/**
	 * Parse the JSON response and make it into List of Project object.
	 * 
	 * @param response This JSON response contains the details of Projects.
	 * 
	 * @return Returns List of Project object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Project> getProjects(String response)throws JSONException
	{
		
		List<Project> projectList = new ArrayList<Project>();
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray projects = jsonObject.getJSONArray("projects");	//No I18N
		
		for(int i = 0; i < projects.length(); i++)
		{
			JSONObject project = projects.getJSONObject(i);
			
			projectList.add(this.jsonToProject(project));
		}
		
		return projectList;
	}
	
	/**
	 * Parse the JSON response and make it into Project object.
	 * 
	 * @param response This JSON response contains the details of a Project.
	 * 
	 * @return Returns the Project object.
	 * 
	 * @throws JSONException
	 */
	
	public Project getProject(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray projects = jsonObject.getJSONArray("projects");	//No I18N
		
		JSONObject project = projects.getJSONObject(0);
		
		return this.jsonToProject(project);
	}
	
	/**
	 * Parse the JSONObject into Project object.
	 * 
	 * @param jsonObject JSONObject contains the details of a project.
	 * 
	 * @return Returns the Project object.
	 * 
	 * @throws JSONException
	 */
	
	public Project jsonToProject(JSONObject jsonObject) throws JSONException
	{
		
		Project project = new Project();
		
		if(jsonObject.has("id"))
		{
			project.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("id_string"))
		{
			project.setIdString(jsonObject.getString("id_string"));
		}
		if(jsonObject.has("name"))
		{
			project.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("status"))
		{
			project.setStatus(jsonObject.getString("status"));
		}
		if(jsonObject.has("created_date"))
		{
			project.setCreatedDate(jsonObject.getString("created_date"));
		}
		if(jsonObject.has("created_date_format"))
		{
			project.setCreatedDateFormat(jsonObject.getString("created_date_format"));
		}
		if(jsonObject.has("created_date_long"))
		{
			project.setCreatedDateLong(jsonObject.getLong("created_date_long"));	//No I18N
		}
		if(jsonObject.has("description"))
		{
			project.setDescription(jsonObject.getString("description"));
		}
		if(jsonObject.has("owner_name"))
		{
			project.setOwnerName(jsonObject.getString("owner_name"));
		}
		if(jsonObject.has("owner_id"))
		{
			project.setOwnerId(jsonObject.getString("owner_id"));
		}
		
		if(jsonObject.has("task_count"))
		{
			JSONObject taskCount = jsonObject.getJSONObject("task_count");	//No I18N
			
			if(taskCount.has("open"))
			{
				project.setOpenTaskCount(taskCount.getInt("open"));	//No I18N
			}
			if(taskCount.has("closed"))
			{
				project.setClosedTaskCount(taskCount.getInt("closed"));	//No I18N
			}
		}
		
		if(jsonObject.has("milestone_count"))
		{
			JSONObject milestoneCount = jsonObject.getJSONObject("milestone_count");	//No I18N
			
			if(milestoneCount.has("open"))
			{
				project.setOpenMilestoneCount(milestoneCount.getInt("open"));	//No I18N
			}
			if(milestoneCount.has("closed"))
			{
				project.setClosedMilestoneCount(milestoneCount.getInt("closed"));	//No I18N
			}
		}
		
		if(jsonObject.has("bug_count"))
		{
			JSONObject bugCount = jsonObject.getJSONObject("bug_count");	//No I18N
			
			if(bugCount.has("open"))
			{
				project.setOpenBugCount(bugCount.getInt("open"));	//No I18N
			}
			if(bugCount.has("closed"))
			{
				project.setClosedBugCount(bugCount.getInt("closed"));	//No I18N
			}
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				project.setURL(link.getJSONObject("self").getString("url"));
			}
			if(link.has("activity"))
			{
				project.setActivityURL(link.getJSONObject("activity").getString("url"));
			}
			if(link.has("milestone"))
			{
				project.setMilestoneURL(link.getJSONObject("milestone").getString("url"));
			}
			if(link.has("tasklist"))
			{
				project.setTasklistURL(link.getJSONObject("tasklist").getString("url"));
			}
			if(link.has("task"))
			{
				project.setTaskURL(link.getJSONObject("task").getString("url"));
			}
			if(link.has("bug"))
			{
				project.setBugURL(link.getJSONObject("bug").getString("url"));
			}
			if(link.has("timesheet"))
			{
				project.setTimesheetURL(link.getJSONObject("timesheet").getString("url"));
			}
			if(link.has("status"))
			{
				project.setStatusURL(link.getJSONObject("status").getString("url"));
			}
			if(link.has("event"))
			{
				project.setEventURL(link.getJSONObject("event").getString("url"));
			}
			if(link.has("document"))
			{
				project.setDocumentURL(link.getJSONObject("document").getString("url"));
			}
			if(link.has("folder"))
			{
				project.setFolderURL(link.getJSONObject("folder").getString("url"));
			}
			if(link.has("forum"))
			{
				project.setForumURL(link.getJSONObject("forum").getString("url"));
			}
			if(link.has("user"))
			{
				project.setUserURL(link.getJSONObject("user").getString("url"));
			}
		}
		
		return project;
		
	}
	
	/**
	 * Parse the JSON response and get the success message.
	 * 
	 * @param response This JSON response contains the success message.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws JSONException
	 */
	
	public String getResult(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		String result = jsonObject.getString("response");
		
		return result;
	}
	
	
	
	/**
	 * Parse the JSON response and make it into List of Activity object.
	 * 
	 * @param response This JSON response contains the details of a activities.
	 * 
	 * @return Returns the List of Activity object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Activity> getActivities(String response)throws JSONException
	{
		
		List<Activity> activityList = new ArrayList<Activity>();
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray activities = jsonObject.getJSONArray("activities");	//No I18N
		
		for(int i = 0; i < activities.length(); i++)
		{
			JSONObject activity = activities.getJSONObject(i);
			
			activityList.add(this.jsonToActivity(activity));
		}
		
		return activityList;
		
	}
	
	
	/**
	 * Parse the JSONObject into Activity object.
	 * 
	 * @param jsonObject JSONObject contains the details of a activity.
	 * 
	 * @return Returns the Activity object.
	 * 
	 * @throws JSONException
	 */
	
	public Activity jsonToActivity(JSONObject jsonObject)throws JSONException
	{
		Activity activity = new Activity();
		
		if(jsonObject.has("id"))
		{
			activity.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("name"))
		{
			activity.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("state"))
		{
			activity.setState(jsonObject.getString("state"));
		}
		if(jsonObject.has("activity_by"))
		{
			activity.setActivityBy(jsonObject.getString("activity_by"));
		}
		if(jsonObject.has("time_long"))
		{
			activity.setTimeLong(jsonObject.getLong("time_long"));	//No I18N
		}
		if(jsonObject.has("display_time"))
		{
			activity.setDisplayTime(jsonObject.getString("display_time"));
		}
		if(jsonObject.has("time"))
		{
			activity.setTime(jsonObject.getString("time"));
		}
		if(jsonObject.has("activity_for"))
		{
			activity.setActivityFor(jsonObject.getString("activity_for"));
		}
			
		return activity;
		
		
	}
	
	/**
	 * Parse the JSON response and make it into List of Status object.
	 * 
	 * @param response This JSON response contains the details of a statuses.
	 * 
	 * @return Returns List of Status object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Status> getStatuses(String response)throws JSONException
	{
		
		List<Status> statusList = new ArrayList<Status>();
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray statuses = jsonObject.getJSONArray("statuses");	//No I18N
		
		for(int i = 0; i < statuses.length(); i++)
		{
			JSONObject status = statuses.getJSONObject(i);
			
			statusList.add(this.jsonToStatus(status));
		}
		
		return statusList;
		
	}
	
	/**
	 * Parse the JSON response and make it into Status object.
	 * 
	 * @param response This JSON response contains the details of a status.
	 * 
	 * @return Returns the Status object.
	 * 
	 * @throws JSONException
	 */
	
	public Status getStatus(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray statuses = jsonObject.getJSONArray("statuses");	//No I18N
		
		JSONObject status = statuses.getJSONObject(0);
			
		return this.jsonToStatus(status);
		
	}
	
	/**
	 * Parse the JSONObject into Status object.
	 * 
 	 * @param jsonObject JSONObject contains the details of a status.
 	 * 
	 * @return Returns the Status object.
	 * 
	 * @throws JSONException
	 */
	
	public Status jsonToStatus(JSONObject jsonObject)throws JSONException
	{
		
		Status status = new Status();
		
		if(jsonObject.has("id"))
		{
			status.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("content"))
		{
			status.setContent(jsonObject.getString("content"));
		}
		if(jsonObject.has("posted_by"))
		{
			status.setPostedBy(jsonObject.getString("posted_by"));
		}
		if(jsonObject.has("posted_person"))
		{
			status.setPostedPerson(jsonObject.getString("posted_person"));
		}
		if(jsonObject.has("posted_time"))
		{
			status.setPostedTime(jsonObject.getString("posted_time"));
		}
		if(jsonObject.has("posted_time_long"))
		{
			status.setPostedTimeLong(jsonObject.getLong("posted_time_long"));	//No I18N
		}
		if(jsonObject.has("posted_time_format"))
		{
			status.setPostedTimeFormat(jsonObject.getString("posted_time_format"));
		}
		
		return status;
		
	}
	
}