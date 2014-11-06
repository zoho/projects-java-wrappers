/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Tasklist;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class TasklistParser
{
	
	
	
	/**
	 * Parse the JSON response and make it into List of Tasklist object.
	 * 
	 * @param response This JSON response contains the details of task lists.
	 * 
	 * @return Returns List of TaskList object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Tasklist> getTasklists(String response)throws JSONException
	{
		List<Tasklist> tasklists = new ArrayList<Tasklist>();
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray jsonArray = jsonObject.getJSONArray("tasklists");	//No I18N
		
		for(int i = 0; i < jsonArray.length(); i++)
		{
		
			JSONObject tasklist = jsonArray.getJSONObject(i);
			
			tasklists.add(this.jsonToTasklist(tasklist));
		}
		
		return tasklists;
	}
	
	/**
	 * Parse the JSON response and make it into Tasklist object.
	 * 
	 * @param response This JSON response contains the details of a task list.
	 * 
	 * @return Returns the Tasklist object.
	 * 
	 * @throws JSONException
	 */
	
	public Tasklist getTasklist(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray tasklists = jsonObject.getJSONArray("tasklists");	//No I18N
		
		JSONObject tasklist = tasklists.getJSONObject(0);
		
		return this.jsonToTasklist(tasklist);
		
	}
	
	/**
	 * Parse the JSONObject into Tasklist object.
	 * 
	 * @param jsonObject JSONObject contains the details of a task list.
	 * 
	 * @return Returns the Tasklist object.
	 * 
	 * @throws JSONException
	 */
	
	public Tasklist jsonToTasklist(JSONObject jsonObject)throws JSONException
	{
		
		Tasklist tasklist = new Tasklist();
		
		if(jsonObject.has("id"))
		{
			tasklist.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("id_string"))
		{
			tasklist.setIdString(jsonObject.getString("id_string"));
		}
		if(jsonObject.has("name"))
		{
			tasklist.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("completed"))
		{
			tasklist.setCompleted(jsonObject.getBoolean("completed"));	//No I18N
		}
		if(jsonObject.has("created_time"))
		{
			tasklist.setCreatedTime(jsonObject.getString("created_time"));
		}
		if(jsonObject.has("created_time_format"))
		{
			tasklist.setCreatedTimeFormat(jsonObject.getString("created_time_format"));
		}
		if(jsonObject.has("created_time_long"))
		{
			tasklist.setCreatedTimeLong(jsonObject.getLong("created_time_long"));	//No I18N
		}
		if(jsonObject.has("rolled"))
		{
			tasklist.setRolled(jsonObject.getBoolean("rolled"));	//No I18N
		}
		if(jsonObject.has("sequence"))
		{
			tasklist.setSequence(jsonObject.getInt("sequence"));	//No I18N
		}
		if(jsonObject.has("flag"))
		{
			tasklist.setFlag(jsonObject.getString("flag"));
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				tasklist.setURL(link.getJSONObject("self").getString("url"));
			}
			if(link.has("task"))
			{
				tasklist.setTaskURL(link.getJSONObject("task").getString("url"));
			}
		}
		
		MilestoneParser milestoneParser = new MilestoneParser();
		
		if(jsonObject.has("milestone"))
		{
			JSONObject milestone = jsonObject.getJSONObject("milestone");	//No I18N
			
			tasklist.setMilestone(milestoneParser.jsonToMilestone(milestone));
		}
		
		return tasklist;
		
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
	
}