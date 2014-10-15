/* $Id$ */

package com.zoho.projects.api;

import java.util.List;

import com.zoho.projects.model.User;
import com.zoho.projects.parser.UserParser;
import com.zoho.projects.util.ZohoHTTPClient;


/**
 * UsersAPI is used to get list of users for the project.
 * 
 * @author ramesh-2099
 *
 */

public class UsersAPI extends API
{
	
	
	/**
	 * Construct a new UsersAPI using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's portalId.
	 */
	
	public UsersAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	
	//UserParser is used to parse the JSON response into respective objects.
	
	UserParser userParser = new UserParser();
	
	
	
	/**
	 * Get list of users for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @return Returns list of User object.
	 * 
	 * @throws Exception
	 */
	
	public List<User> getUsers(String projectId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/users/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap());
		
		return userParser.getUsers(response);
	}
	

}
