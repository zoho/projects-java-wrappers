/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Milestone;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class MilestoneParser
{
	
	
	/**
	 * Parse the JSON response and make it into List of Milestone object.
	 * 
	 * @param response This JSON response contains the details of milestones.
	 * 
	 * @return Returns List of Milestone object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Milestone> getMilestones(String response)throws JSONException
	{
		
		List<Milestone> milestoneList = new ArrayList<Milestone>();
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray milestones = jsonObject.getJSONArray("milestones");	//No I18N
		
		for(int i = 0; i < milestones.length(); i++)
		{
			JSONObject milestone = milestones.getJSONObject(i);
			
			milestoneList.add(this.jsonToMilestone(milestone));
		}
		
		return milestoneList;
	}
	
	/**
	 * Parse the JSON response and make it into Milestone object.
	 * 
	 * @param response This JSON response contains the details of a milestone.
	 * 
	 * @return Returns the Milestone object.
	 * 
	 * @throws JSONException
	 */
	
	public Milestone getMilestone(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray milestones = jsonObject.getJSONArray("milestones");	//No I18N
		
		JSONObject milestone = milestones.getJSONObject(0);
			
		return this.jsonToMilestone(milestone);
	}
	
	/**
	 * Parse the JSONObject into Milestone object.
	 * 
	 * @param jsonObject JSONObject contains the details of a milestone.
	 * 
	 * @return Returns the Milestone object.
	 * 
	 * @throws JSONException
	 */
	
	public Milestone jsonToMilestone(JSONObject jsonObject)throws JSONException
	{
		
		Milestone milestone = new Milestone();
		
		if(jsonObject.has("id"))
		{
			milestone.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("name"))
		{
			milestone.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("start_date"))
		{
			milestone.setStartDate(jsonObject.getString("start_date"));
		}
		if(jsonObject.has("start_date_format"))
		{
			milestone.setStartDateFormat(jsonObject.getString("start_date_format"));
		}
		if(jsonObject.has("start_date_long"))
		{
			milestone.setStartDateLong(jsonObject.getLong("start_date_long"));	//No I18N
		}
		if(jsonObject.has("end_date"))
		{
			milestone.setEndDate(jsonObject.getString("end_date"));
		}
		if(jsonObject.has("end_date_format"))
		{
			milestone.setEndDateFormat(jsonObject.getString("end_date_format"));
		}
		if(jsonObject.has("end_date_long"))
		{
			milestone.setEndDateLong(jsonObject.getLong("end_date_long"));	//No I18N
		}
		if(jsonObject.has("status"))
		{
			milestone.setStatus(jsonObject.getString("status"));
		}
		if(jsonObject.has("flag"))
		{
			milestone.setFlag(jsonObject.getString("flag"));
		}
		if(jsonObject.has("owner_id"))
		{
			milestone.setOwnerId(jsonObject.getLong("owner_id"));	//No I18N
		}
		if(jsonObject.has("owner_name"))
		{
			milestone.setOwnerName(jsonObject.getString("owner_name"));
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				milestone.setURL(link.getJSONObject("self").getString("url"));
			}
			if(link.has("status"))
			{
				milestone.setStatusURL(link.getJSONObject("status").getString("url"));
			}
		}
		
		return milestone;
		
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