/* $Id$ */

package com.zoho.projects.parser;


import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Buglog;
import com.zoho.projects.model.Generallog;
import com.zoho.projects.model.Tasklog;
import com.zoho.projects.model.Timelog;
import com.zoho.projects.model.TimelogList;

/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class TimesheetParser
{
	
	
	/**
	 * Parse the JSON response and make it into TimelogList object.
	 * 
	 * @param response This JSON response contains the details of time logs.
	 * 
	 * @return Returns the TimelogList object.
	 * 
	 * @throws JSONException
	 */
	
	public TimelogList getTimeLogs(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONObject timelogs = jsonObject.getJSONObject("timelogs"); //No I18N
		
		return this.jsonToTimelogList(timelogs);
		
	}
	
	
	/**
	 * Parse the JSON response and make it into Tasklog object.
	 * 
	 * @param response This JSON response contains the details of a task log.
	 * 
	 * @return Returns the Tasklog object.
	 * 
	 * @throws JSONException
	 */
	
	public Tasklog getTasklog(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONObject timelogs = jsonObject.getJSONObject("timelogs");	//No I18N
		
		JSONArray tasklogs = timelogs.getJSONArray("tasklogs");	//No I18N
		
		JSONObject tasklog = tasklogs.getJSONObject(0);
		
		return this.jsonToTasklog(tasklog);
	}
	
	/**
	 * Parse the JSON response and make it into the Buglog object.
	 * 
	 * @param response This JSON response contains the details of bug log.
	 * 
	 * @return Returns the Buglog object.
	 * 
	 * @throws JSONException
	 */
	
	public Buglog getBuglog(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONObject timelogs = jsonObject.getJSONObject("timelogs");	//No I18N
		
		JSONArray buglogs = timelogs.getJSONArray("buglogs");	//No I18N
		
		JSONObject buglog = buglogs.getJSONObject(0);
		
		return this.jsonToBuglog(buglog);
	}
	
	/**
	 * Parse the JSON response and make it into the Generallog object.
	 * 
	 * @param response This JSON response contains the details of a general log.
	 * 
	 * @return Returns the Generallog object.
	 * 
	 * @throws JSONException
	 */
	
	public Generallog getGenerallog(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONObject timelogs = jsonObject.getJSONObject("timelogs");	//No I18N
		
		JSONArray generallogs = timelogs.getJSONArray("generallogs");	//No I18N
		
		JSONObject generallog = generallogs.getJSONObject(0);
		
		return this.jsonToGenerallog(generallog);
	}
	
	
	/**
	 * Parse the JSONObject into timlogList object.
	 * 
	 * @param jsonObject JSONObject contains the details of a time logs.
	 * 
	 * @return Returns the TimelogList object.
	 * 
	 * @throws JSONException
	 */
	
	public TimelogList jsonToTimelogList(JSONObject jsonObject)throws JSONException
	{
		
		TimelogList timelogList = new TimelogList();
		
		if(jsonObject.has("grandtotal"))
		{
			timelogList.setGrandtotal(jsonObject.getString("grandtotal"));
		}
		if(jsonObject.has("role"))
		{
			timelogList.setRole(jsonObject.getString("role"));
		}
		
		if(jsonObject.has("date"))
		{
			JSONArray date = jsonObject.getJSONArray("date");	//No I18N
			
			Timelog timelogObj = new Timelog();
			
			for(int i = 0; i < date.length(); i++)
			{
				JSONObject dateObj = date.getJSONObject(i);
				
				if(dateObj.has("date_long"))
				{
					timelogObj.setDateLong(dateObj.getLong("date_long"));	//No I18N
				}
				if(dateObj.has("display_format"))
				{
					timelogObj.setDisplayFormat(dateObj.getString("display_format"));
				}
				if(dateObj.has("total_hours"))
				{
					timelogObj.setTotalHours(dateObj.getString("total_hours"));
				}
				
				if(dateObj.has("buglogs"))
				{
					JSONArray buglogs = dateObj.getJSONArray("buglogs");	//No I18N
					
					List<Buglog> buglogList = new ArrayList<Buglog>();
					
					for(int j = 0; j < buglogs.length(); j++)
					{
						JSONObject buglog = buglogs.getJSONObject(j);
						
						buglogList.add(this.jsonToBuglog(buglog));
					}
					
					timelogObj.setBuglogs(buglogList);
				}
				
				if(dateObj.has("tasklogs"))
				{
					JSONArray tasklogs = dateObj.getJSONArray("tasklogs");	//No I18N
					
					List<Tasklog> tasklogList = new ArrayList<Tasklog>();
					
					for(int k = 0; k < tasklogs.length(); k++)
					{
						JSONObject tasklog = tasklogs.getJSONObject(k);
						
						tasklogList.add(this.jsonToTasklog(tasklog));
					}
					
					timelogObj.setTasklogs(tasklogList);
						
				}
				
				if(dateObj.has("generallogs"))
				{
					JSONArray generallogs = dateObj.getJSONArray("generallogs");	//No I18N
					
					List<Generallog> generallogList = new ArrayList<Generallog>();
					
					for(int l = 0; l < generallogs.length(); l++)
					{
						JSONObject generallog = generallogs.getJSONObject(l);
						
						generallogList.add(this.jsonToGenerallog(generallog));
					}
					
					timelogObj.setGenerallogs(generallogList);
						
				}
				
				timelogList.add(timelogObj);
			}
			
		}
			
		return timelogList;
		
		
	}
	
	
	/**
	 * Parse the JSONObject into Buglog object.
	 * 
	 * @param jsonObject JSONObject contains the details of a bug log.
	 * 
	 * @return Returns the Buglog object.
	 * 
	 * @throws JSONException
	 */
	
	public Buglog jsonToBuglog(JSONObject jsonObject)throws JSONException
	{
		Buglog buglog = new Buglog();
		
		if(jsonObject.has("id"))
		{
			buglog.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("notes"))
		{
			buglog.setNotes(jsonObject.getString("notes"));
		}
		if(jsonObject.has("log_date"))
		{
			buglog.setLogDate(jsonObject.getString("log_date"));
		}
		if(jsonObject.has("log_date_long"))
		{
			buglog.setLogDateLong(jsonObject.getLong("log_date_long"));	//No I18N
		}
		if(jsonObject.has("hours"))
		{
			buglog.setHours(jsonObject.getInt("hours"));	//No I18N
		}
		if(jsonObject.has("minutes"))
		{
			buglog.setMinutes(jsonObject.getInt("minutes"));	//No I18N
		}
		if(jsonObject.has("hours_display"))
		{
			buglog.setHoursDisplay(jsonObject.getString("hours_display"));
		}
		if(jsonObject.has("total_minutes"))
		{
			buglog.setTotalMinutes(jsonObject.getInt("total_minutes"));	//No I18N
		}
		if(jsonObject.has("owner_id"))
		{
			buglog.setOwnerId(jsonObject.getString("owner_id"));
		}
		if(jsonObject.has("owner_name"))
		{
			buglog.setOwnerName(jsonObject.getString("owner_name"));
		}
		if(jsonObject.has("bill_status"))
		{
			buglog.setBillStatus(jsonObject.getString("bill_status"));
		}
		
		if(jsonObject.has("bug"))
		{
			JSONObject bug = jsonObject.getJSONObject("bug");	//No I18N
			
			if(bug.has("id"))
			{
				buglog.setBugId(bug.getLong("id"));	//No I18N
			}
			if(bug.has("title"))
			{
				buglog.setTitle(bug.getString("title"));
			}
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				buglog.setURL(link.getJSONObject("self").getString("url"));		//No I18N
			}
		}
		
		return buglog;
	}
	
	/**
	 * Parse the JSONObject into Tasklog object.
	 * 
	 * @param jsonObject JSONObject contains the details of a task log.
	 * 
	 * @return Returns the Tasklog object.
	 * 
	 * @throws JSONException
	 */
	
	public Tasklog jsonToTasklog(JSONObject jsonObject)throws JSONException
	{
		Tasklog tasklog = new Tasklog();
		
		if(jsonObject.has("id"))
		{	
			tasklog.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("notes"))
		{
			tasklog.setNotes(jsonObject.getString("notes"));
		}
		if(jsonObject.has("log_date"))
		{
			tasklog.setLogDate(jsonObject.getString("log_date"));
		}
		if(jsonObject.has("log_date_format"))
		{
			tasklog.setLogDateFormat(jsonObject.getString("log_date_format"));
		}
		if(jsonObject.has("log_date_long"))
		{
			tasklog.setLogDateLong(jsonObject.getLong("log_date_long"));	//No I18N
		}
		if(jsonObject.has("hours"))
		{
			tasklog.setHours(jsonObject.getInt("hours"));	//No I18N
		}
		if(jsonObject.has("minutes"))
		{
			tasklog.setMinutes(jsonObject.getInt("minutes"));	//No I18N
		}
		if(jsonObject.has("hours_display"))
		{
			tasklog.setHoursDisplay(jsonObject.getString("hours_display"));
		}
		if(jsonObject.has("total_minutes"))
		{
			tasklog.setTotalMinutes(jsonObject.getInt("total_minutes"));	//No I18N
		}
		if(jsonObject.has("owner_id"))
		{
			tasklog.setOwnerId(jsonObject.getString("owner_id"));
		}
		if(jsonObject.has("owner_name"))
		{
			tasklog.setOwnerName(jsonObject.getString("owner_name"));
		}
		if(jsonObject.has("bill_status"))
		{
			tasklog.setBillStatus(jsonObject.getString("bill_status"));
		}
		
		if(jsonObject.has("task"))
		{
			JSONObject task = jsonObject.getJSONObject("task");	//No I18N
			
			if(task.has("id"))
			{
				tasklog.setTaskId(task.getLong("id"));	//No I18N
			}
			if(task.has("name"))
			{
				tasklog.setTaskName(task.getString("name"));
			}
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				tasklog.setURL(link.getJSONObject("self").getString("url"));	//No I18N
			}
		}
		
		return tasklog;
	}
	
	
	/**
	 * Parse the JSONObject into Generallog object.
	 * 
	 * @param jsonObject JSONObject contains the details of a general log.
	 * 
	 * @return Returns the Generallog object.
	 * 
	 * @throws JSONException
	 */
	
	public Generallog jsonToGenerallog(JSONObject jsonObject)throws JSONException
	{
		Generallog generallog = new Generallog();
		
		if(jsonObject.has("id"))
		{
			generallog.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("name"))
		{
			generallog.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("notes"))
		{
			generallog.setNotes(jsonObject.getString("notes"));
		}
		if(jsonObject.has("log_date"))
		{
			generallog.setLogDate(jsonObject.getString("log_date"));
		}
		if(jsonObject.has("log_date_format"))
		{
			generallog.setLogDateFormat(jsonObject.getString("log_date_format"));
		}
		if(jsonObject.has("log_date_long"))
		{
			generallog.setLogDateLong(jsonObject.getLong("log_date_long"));	//No I18N
		}
		if(jsonObject.has("hours"))
		{
			generallog.setHours(jsonObject.getInt("hours"));	//No I18N
		}
		if(jsonObject.has("minutes"))
		{
			generallog.setMinutes(jsonObject.getInt("minutes"));	//No I18N
		}
		if(jsonObject.has("hours_display"))
		{
			generallog.setHoursDisplay(jsonObject.getString("hours_display"));
		}
		if(jsonObject.has("total_minutes"))
		{
			generallog.setTotalMinutes(jsonObject.getInt("total_minutes"));	//No I18N
		}
		if(jsonObject.has("owner_id"))
		{
			generallog.setOwnerId(jsonObject.getString("owner_id"));
		}
		if(jsonObject.has("owner_name"))
		{
			generallog.setOwnerName(jsonObject.getString("owner_name"));
		}
		if(jsonObject.has("bill_status"))
		{
			generallog.setBillStatus(jsonObject.getString("bill_status"));
		}
		
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				generallog.setURL(link.getJSONObject("self").getString("url"));	//No I18N
			}
		}
		
		return generallog;
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