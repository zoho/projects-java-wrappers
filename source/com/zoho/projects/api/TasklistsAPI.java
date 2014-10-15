/* $Id$ */

package com.zoho.projects.api;

import java.util.HashMap;
import java.util.List;

import com.zoho.projects.model.Tasklist;

import com.zoho.projects.parser.TasklistParser;

import com.zoho.projects.util.ZohoHTTPClient;


/**
 * TasklistsAPI is used to:
 * 
 * 	Get list of tasklists.
 * 
 * 	Create a new tasklist.
 * 
 * 	Update the details of a tasklist.
 * 
 * 	Delete an existing tasklist.
 * 
 * @author ramesh-2099
 *
 */

public class TasklistsAPI extends API
{
	
	
	/**
	 * Construct a new TasklistsAPI using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's portalId.
	 */
	
	public TasklistsAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	
	// TasklistParser is used to parse the JSON response into respective objects.
	
	TasklistParser tasklistParser = new TasklistParser();
	
	
	/**
	 * Get list of tasklists for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Tasklist object.
	 * 
	 * @throws Exception
	 */
	
	public List<Tasklist> getTasklists(String projectId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasklists/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return tasklistParser.getTasklists(response);
	}
	
	/**
	 * Create a new tasklist for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param tasklist tasklist object.
	 * 
	 * @return Returns the Tasklist object.
	 * 
	 * @throws Exception
	 */
	
	public Tasklist create(String projectId, Tasklist tasklist)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasklists/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(tasklist.toParamMAP()));
		
		return tasklistParser.getTasklist(response);
	}
	
	/**
	 * Update the details of a tasklist.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param tasklist Tasklist object.
	 * 
	 * @return Returns the Tasklist object.
	 * 
	 * @throws Exception
	 */
	
	public Tasklist update(String projectId, Tasklist tasklist)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasklists/"+tasklist.getId()+"/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(tasklist.toParamMAP()));
		
		return tasklistParser.getTasklist(response);
	}
	
	/**
	 * Delete an existing tasklist for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param tasklistId ID of the tasklist.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String delete(String projectId, String tasklistId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasklists/"+tasklistId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return tasklistParser.getResult(response);
	}
	
	
}
