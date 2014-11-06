/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Portal;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class PortalParser
{
	
	
	/**
	 * Parse the JSON response and make it into List of Portal object.
	 * 
	 * @param response This JSON response contains the details of portals.
	 * 
	 * @return Returns List of Portal object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Portal> getPortals(String response)throws JSONException
	{
		
		List<Portal> portalList = new ArrayList<Portal>();
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray portals = jsonObject.getJSONArray("portals");	//No I18N
		
		for(int i = 0; i < portals.length(); i++)
		{
			JSONObject portal = portals.getJSONObject(i);
			
			portalList.add(this.getPortal(portal));
		}
		
		return portalList;
	}
	
	/**
	 * Parse the JSONObject into Portal object.
	 * 
	 * @param jsonObject JSONObject contains the details of a Portal.
	 * 
	 * @return Returns the Portal object.
	 * 
	 * @throws JSONException
	 */
	
	public Portal getPortal(JSONObject jsonObject)throws JSONException 
	{
		
		Portal portal = new Portal();
		
		if(jsonObject.has("id"))
		{
			portal.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("id_string"))
		{
			portal.setIdString(jsonObject.getString("id_string"));
		}
		if(jsonObject.has("name"))
		{
			portal.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("default"))
		{
			portal.setDefault(jsonObject.getBoolean("default"));	//No I18N
		}
		if(jsonObject.has("gmt_time_zone"))
		{
			portal.setGmtTimeZone(jsonObject.getString("gmt_time_zone"));
		}
		if(jsonObject.has("role"))
		{
			portal.setRole(jsonObject.getString("role"));
		}
		
		if(jsonObject.has("settings"))
		{
			JSONObject settings = jsonObject.getJSONObject("settings");	//No I18N
			
			if(settings.has("company_name"))
			{
				portal.setCompanyName(settings.getString("company_name"));
			}
			if(settings.has("website_url"))
			{
				portal.setWebsiteURL(settings.getString("website_url"));
			}
			if(settings.has("time_zone"))
			{
				portal.setTimeZone(settings.getString("time_zone"));
			}
			if(settings.has("date_format"))
			{
				portal.setDateFormat(settings.getString("date_format"));
			}
		}
		
		
		if(jsonObject.has("locale"))
		{
			JSONObject locale = jsonObject.getJSONObject("locale");	//No I18N
			
			if(locale.has("code"))
			{
				portal.setCode(locale.getString("code"));
			}
			if(locale.has("language"))
			{
				portal.setLanguage(locale.getString("language"));
			}
			if(locale.has("country"))
			{
				portal.setCountry(locale.getString("country"));
			}
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("projects"))
			{
				JSONObject project = link.getJSONObject("project");	//No I18N
				
				if(project.has("url"))
				{
					portal.setProjectURL(project.getString("url"));
				}
			}
		}
		
		return portal;
	}
	
}