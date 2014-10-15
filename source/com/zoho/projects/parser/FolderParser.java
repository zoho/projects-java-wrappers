/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Folder;

/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class FolderParser 
{
	
	/**
	 * Parse the JSON response and make it into List of Folder object.
	 * 
	 * @param response This JSON response contains the details of folders.
	 * 
	 * @return Returns List of Folder object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Folder> getFolders(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray folders = jsonObject.getJSONArray("folders");	//No I18N
		
		List<Folder> folderList = new ArrayList<Folder>(folders.length());
		
		for(int i = 0; i < folders.length(); i++)
		{
			JSONObject folder = folders.getJSONObject(i);
			
			folderList.add(this.jsonToFolder(folder));
		}
		
		return folderList;
	}
	
	/**
	 * Parse the JSON response and make it into Folder object.
	 * 
	 * @param response This JSON response contains the details of a folder.
	 * 
	 * @return Returns the Folder object.
	 * 
	 * @throws JSONException
	 */
	
	public Folder getFolder(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray folders = jsonObject.getJSONArray("folders");	//No I18N
		
		JSONObject folder = folders.getJSONObject(0);
			
		return this.jsonToFolder(folder);
	}
	
	
	/**
	 * Parse the JSONObject into Folder object.
	 * 
	 * @param jsonObject JSONObject contains the details of a folder.
	 * 
	 * @return Returns the Folder object.
	 * 
	 * @throws JSONException
	 */
	
	public Folder jsonToFolder(JSONObject jsonObject)throws JSONException
	{
		Folder folder = new Folder();
		
		if(jsonObject.has("id"))
		{
			folder.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("name"))
		{
			folder.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("is_discussion"))
		{
			folder.setIsDicussion(jsonObject.getBoolean("is_discussion"));	//No I18N
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				folder.setURL(link.getJSONObject("self").getString("url")); //No I18N
			}
		}
		
		return folder;
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
	
	public String getResult(String response)throws Exception
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		String result = jsonObject.getString("response");
		
		return result;
		
	}

}
