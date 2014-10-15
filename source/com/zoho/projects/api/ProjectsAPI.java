/* $Id$ */

package com.zoho.projects.api;

import java.util.HashMap;
import java.util.List;

import com.zoho.projects.model.Activity;
import com.zoho.projects.model.Project;
import com.zoho.projects.model.Status;

import com.zoho.projects.parser.ProjectParser;

import com.zoho.projects.util.ZohoHTTPClient;


/**
 * ProjectsAPI is used to:
 * 
 * 	Get list of projects.
 * 
 * 	Get the details of a project.
 * 
 * 	Create a new project.
 * 
 * 	Update the details of a project.
 * 
 * 	Delete an existing project.
 * 
 * @author ramesh-2099
 *
 */

public class ProjectsAPI extends API
{
	
	
	/**
	 * Construct a new ProjectsAPI using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's portalId.
	 */
	
	public ProjectsAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	//Parse the JSON response into respective objects.
	
	ProjectParser projectParser = new ProjectParser();
	
	
	
	
	/**
	 * Get list of projects.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Project object.
	 * 
	 * @throws Exception
	 */
	
	public List<Project> getProjects(HashMap<String, Object> queryMap)throws Exception
	{
		
		String url = getBaseURL()+"/projects/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return projectParser.getProjects(response);
	}
	
	/**
	 * Get the details of a project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @return Returns the Project object.
	 * 
	 * @throws Exception
	 */
	
	public Project get(String projectId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap());
		
		return projectParser.getProject(response);
	}
	
	/**
	 * Create a new project.
	 * 
	 * @param project Project object.
	 * 
	 * @return Returns the Project object.
	 * 
	 * @throws Exception
	 */
	
	public Project create(Project project)throws Exception
	{
		String url = getBaseURL()+"/projects/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(project.toParamMAP()));
		
		return projectParser.getProject(response);
		
	}
	
	/**
	 * Update the details of a project.
	 * 
	 * @param project Project object.
	 * 
	 * @return Returns the Project object.
	 * 
	 * @throws Exception
	 */
	
	public Project update(Project project)throws Exception
	{
		String url = getBaseURL()+"/projects/"+project.getId()+"/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(project.toParamMAP()));
		
		return projectParser.getProject(response);
	}
	
	/**
	 * Delete an existing project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String delete(String projectId) throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return projectParser.getResult(response);
	}
	
	
	/**
	 * Get list of project activities.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Activity object.
	 * 
	 * @throws Exception
	 */
	
	public List<Activity> getProjectActivities(String projectId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/activities/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return projectParser.getActivities(response);
	}
	
	/**
	 * Get list of project statuses.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Status object.
	 * 
	 * @throws Exception
	 */
	
	public List<Status> getProjectStatuses(String projectId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/statuses/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return projectParser.getStatuses(response);
	}
	
	/**
	 * Add the status for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param status Status object.
	 * 
	 * @return Returns the Status object.
	 * 
	 * @throws Exception
	 */
	
	public Status addProjectStatus(String projectId, Status status)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/statuses/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(status.toParamMAP()));
		
		return projectParser.getStatus(response);
	}
	
	
}