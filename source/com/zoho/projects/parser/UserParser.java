/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.User;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class UserParser 
{
	
	
	/**
	 * Parse the JSON response and make it into List of User object.
	 * 
	 * @param response This JSON response contains the details of users.
	 * 
	 * @return Returns List of User object.
	 * 
	 * @throws JSONException
	 */
	
	public List<User> getUsers(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray users = jsonObject.getJSONArray("users");	//No I18N
		
		List<User> userList = new ArrayList<User>(users.length());
		
		for(int i = 0; i < users.length(); i++)
		{
			JSONObject user = users.getJSONObject(i);
			
			userList.add(this.jsonToUser(user));
		}
		
		return userList;
	}
	
	/**
	 * Parse the JSONObject into User object.
	 * 
	 * @param response JSONObject contains the details of a user.
	 * 
	 * @return Returns the User object.
	 * 
	 * @throws JSONException
	 */
	
	public User jsonToUser(JSONObject jsonObject)throws JSONException
	{
		User user = new User();
		
		if(jsonObject.has("id"))
		{
			user.setId(jsonObject.getString("id"));	
		}
		if(jsonObject.has("name"))
		{
			user.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("email"))
		{
			user.setEmail(jsonObject.getString("email"));
		}
		if(jsonObject.has("role"))
		{
			user.setRole(jsonObject.getString("role"));
		}
		
		return user;
	}
	
}
