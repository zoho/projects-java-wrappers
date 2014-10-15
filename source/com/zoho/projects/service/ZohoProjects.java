/* $Id$ */

package com.zoho.projects.service;

import com.zoho.projects.api.BugsAPI;
import com.zoho.projects.api.DocumentsAPI;
import com.zoho.projects.api.EventsAPI;
import com.zoho.projects.api.FoldersAPI;
import com.zoho.projects.api.ForumsAPI;
import com.zoho.projects.api.MilestonesAPI;
import com.zoho.projects.api.PortalsAPI;
import com.zoho.projects.api.ProjectsAPI;
import com.zoho.projects.api.TasklistsAPI;
import com.zoho.projects.api.TasksAPI;
import com.zoho.projects.api.TimesheetsAPI;
import com.zoho.projects.api.UsersAPI;


/**
 * ZohoProjects is used to provide all API instances for the Zoho Project services.
 * 
 * @author ramesh-2099
 *
 */

public class ZohoProjects
{
	
	private String authToken;
	private String portalId;
	
	
	/**
	 * Initialize ZhoProjects using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's portalId.
	 */
	
	public void initialize(String authToken, String portalId)
	{
		
		this.authToken = authToken;
		
		this.portalId = portalId;
	}
	
	
	/**
	 * Get an instance of portals API.
	 * 
	 * @return Returns the PortalsAPI object.
	 */
	
	public PortalsAPI getPortalsAPI()
	{
		PortalsAPI portalsAPI = new PortalsAPI(authToken);
		
		return portalsAPI;
	}
	
	/**
	 * Get an instance of projects API.
	 * 
	 * @return Returns the ProjectsAPI object.
	 */
	
	public ProjectsAPI getProjectsAPI()
	{
		ProjectsAPI projectsAPI = new ProjectsAPI(authToken, portalId);
		
		return projectsAPI;
	}
	
	
	/**
	 * Get an instance of milestones API.
	 * 
	 * @return Returns the MilestonesAPI object.
	 */
	
	public MilestonesAPI getMilestonesAPI()
	{
		MilestonesAPI milestonesAPI = new MilestonesAPI(authToken, portalId);
		
		return milestonesAPI;
	}
	
	/**
	 * Get an instance of task lists API.
	 * 
	 * @return Returns the TasklistsAPI object.
	 */
	
	public TasklistsAPI getTasklistsAPI()
	{
		TasklistsAPI tasklistsAPI = new TasklistsAPI(authToken, portalId);
		
		return tasklistsAPI;
	}
	
	/**
	 * Get an instance of tasks API.
	 * 
	 * @return Returns the TasksAPI object.
	 */
	
	public TasksAPI getTasksAPI()
	{
		TasksAPI tasksAPI = new TasksAPI(authToken, portalId);
		
		return tasksAPI;
	}
	
	/**
	 * Get an instance of events API.
	 * 
	 * @return Returns the EventsAPI object.
	 */
	
	public EventsAPI getEventsAPI()
	{
		EventsAPI eventsAPI = new EventsAPI(authToken, portalId);
		
		return eventsAPI;
	}
	
	/**
	 * Get an instance of folder API.
	 * 
	 * @return Returns the FoldersAPI object.
	 */
	
	public FoldersAPI getFoldersAPI()
	{
		FoldersAPI foldersAPI = new FoldersAPI(authToken, portalId);
		
		return foldersAPI;
	}
	
	/**
	 * Get an instance of documents API.
	 * 
	 * @return Returns the DocumentsAPI object.
	 */
	
	public DocumentsAPI getDocumentsAPI()
	{
		DocumentsAPI documentsAPI = new DocumentsAPI(authToken, portalId);
		
		return documentsAPI;
	}
	
	/**
	 * Get an instance of forums API.
	 * 
	 * @return Returns the ForumsAPI object.
	 */
	
	public ForumsAPI getForumsAPI()
	{
		ForumsAPI forumsAPI = new ForumsAPI(authToken, portalId);
		
		return forumsAPI;
	}
	
	/**
	 * Get an instance of users API.
	 * 
	 * @return Returns the UsersAPI object.
	 */
	
	public UsersAPI getUsersAPI()
	{
		UsersAPI usersAPI = new UsersAPI(authToken, portalId);
		
		return usersAPI;
	}
	
	/**
	 * Get an instance of bugs API.
	 * 
	 * @return Returns the BugsAPI object.
	 */
	
	public BugsAPI getBugsAPI()
	{
		BugsAPI bugsAPI = new BugsAPI(authToken, portalId);
		
		return bugsAPI;
	}
	
	/**
	 * Get an instance of time sheets API.
	 * 
	 * @return Returns the TimesheetsAPI object.
	 */
	
	public TimesheetsAPI getTimesheetsAPI()
	{
		TimesheetsAPI timesheetsAPI = new TimesheetsAPI(authToken, portalId);
		
		return timesheetsAPI;
	}
	
	
}