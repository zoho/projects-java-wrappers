/* $Id$ */

package com.zoho.projects.api;

import java.util.HashMap;
import java.util.List;

import com.zoho.projects.model.Bug;
import com.zoho.projects.model.Customfield;
import com.zoho.projects.model.Defaultfield;
import com.zoho.projects.parser.BugParser;
import com.zoho.projects.util.ZohoHTTPClient;


/**
 * BugsAPI is used to:
 * 
 * 	Get list of bugs.
 * 
 * 	Get the details of a bug.
 * 
 * 	Creates a bug.
 * 
 * 	Update the details of a bug.
 * 
 * 	Delete an existing bug.
 *  
 * @author ramesh-2099
 *
 */

public class BugsAPI extends API 
{
	
	
	/**
	 * Construct a BugsAPI using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's portalId.
	 */
	
	public BugsAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	
	//BugsParser is used to parse the JSON response into respective objects.
	
	BugParser bugParser = new BugParser();
	
	
	/**
	 * Get list of bugs for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Bug object.
	 * 
	 * @throws Exception
	 */
	
	public List<Bug> getBugs(String projectId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/bugs/"; //No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return bugParser.getBugs(response);
	}
	
	/**
	 * Get the details of a bug.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param bugId ID of the bug.
	 * 
	 * @return Returns the Bug object.
	 * 
	 * @throws Exception
	 */
	
	public Bug get(String projectId, String bugId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/bugs/"+bugId+"/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap());
		
		return bugParser.getBug(response);
		
	}
	
	/**
	 * Create a Bug for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param bug Bug object.
	 * 
	 * @return Returns the Bug object.
	 * 
	 * @throws Exception
	 */
	
	public Bug create(String projectId, Bug bug)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/bugs/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(bug.toParamMAP()));
		
		return bugParser.getBug(response);
	}
	
	/**
	 * Update the details of a bug.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param bug Bug object.
	 * 
	 * @return Returns the Bug object.
	 * 
	 * @throws Exception
	 */
	
	public Bug update(String projectId, Bug bug)throws Exception 
	{
		String url = getBaseURL()+"/projects/"+projectId+"/bugs/"+bug.getId()+"/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(bug.toParamMAP()));
		
		return bugParser.getBug(response);
	}
	
	/**
	 * Delete an existing bug for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param bugId ID of the bug.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String delete(String projectId, String bugId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/bugs/"+bugId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return bugParser.getResult(response);
	}
	
	/**
	 * Get all the default fields in the given project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @return Returns the Defaultfield Object.
	 * 
	 * @throws Exception
	 */
	
	public Defaultfield getDefaultFields(String projectId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/defaultfields/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap());
		
		return bugParser.getDefaultfields(response);
	}
	
	/**
	 * Get all the custom fields in the given project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @return Returns List of CustomField Object.
	 * 
	 * @throws Exception
	 */
	
	public List<Customfield> getCustomFields(String projectId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/customfields/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap());
		
		return bugParser.getCustomfields(response);
	}
	
}
