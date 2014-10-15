/* $Id$ */

package com.zoho.projects.api;

import java.util.HashMap;
import java.util.List;

import com.zoho.projects.model.Milestone;

import com.zoho.projects.parser.MilestoneParser;

import com.zoho.projects.util.ZohoHTTPClient;


/**
 * MilestonesAPI is used to:
 * 
 * 	Get list of milestones.
 * 
 * 	Get the details of a milestone.
 * 
 * 	Create a new milestone.
 * 
 * 	Update the details of a milestone.
 * 
 * 	Update the status of a milestone.
 * 
 * 	Delete an existing milestone.
 * 
 * @author ramesh-2099
 *
 */

public class MilestonesAPI extends API
{
	
	/**
	 * Construct a new MilestonesAPI using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's portalId.
	 */
	
	public MilestonesAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	
	//MilestoneParser is used to parse the JSON response into respective objects.
	
	MilestoneParser milestoneParser = new MilestoneParser();
	
	
	/**
	 * Get list of milestones for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Milestone object.
	 * 
	 * @throws Exception
	 */
	
	public List<Milestone> getMilestones(String projectId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/milestones/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return milestoneParser.getMilestones(response);
	}
	
	/**
	 * Get the details of a milestone.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param milestoneId ID of the milestone.
	 * 
	 * @return Returns the Milestone object.
	 * 
	 * @throws Exception
	 */
	
	public Milestone get(String projectId, String milestoneId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/milestones/"+milestoneId+"/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap());
		
		return milestoneParser.getMilestone(response);
	}
	
	/**
	 * Create a milestone for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param milestone Milestone object.
	 * 
	 * @return Returns the Milestone object.
	 * 
	 * @throws Exception
	 */
	
	public Milestone create(String projectId, Milestone milestone)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/milestones/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(milestone.toParamMAP()));
		
		return milestoneParser.getMilestone(response);
	}
	
	/**
	 * Update the details of a milestone.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param milestone Milestone object.
	 * 
	 * @return Returns the Milestone object.
	 * 
	 * @throws Exception
	 */
	
	public Milestone update(String projectId, Milestone milestone)throws Exception 
	{
		String url = getBaseURL()+"/projects/"+projectId+"/milestones/"+String.valueOf(milestone.getId())+"/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(milestone.toParamMAP()));
		
		return milestoneParser.getMilestone(response);
	}
	
	/**
	 * Update the status of a milestone.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param milestoneId ID of the milestone.
	 * 
	 * @param status Status of the milestone.
	 * 
	 * @return Returns the Milestone object.
	 * 
	 * @throws Exception
	 */
	
	public Milestone updateStatus(String projectId, String milestoneId, int status)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/milestones/"+milestoneId+"/status/";	//No I18N
		
		HashMap<String, Object> requestBody = getQueryMap();
		
		requestBody.put("status", status);
		
		String response = ZohoHTTPClient.post(url, requestBody);
		
		return milestoneParser.getMilestone(response);
	}
	
	/**
	 * Delete an existing milestone for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param milestoneId ID of the milestone.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String delete(String projectId, String milestoneId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/milestones/"+milestoneId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return milestoneParser.getResult(response);
	}

}
