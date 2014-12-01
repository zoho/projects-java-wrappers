/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Bug;
import com.zoho.projects.model.Customfield;
import com.zoho.projects.model.Defaultfield;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class BugParser 
{
	
	
	/**
	 * Parse the JSON response and make it into List of Bug object.
	 * 
	 * @param response This JSON response contains the details of bugs.
	 * 
	 * @return Returns List of Bug object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Bug> getBugs(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray bugs = jsonObject.getJSONArray("bugs"); 	//No I18N
		
		List<Bug> bugList = new ArrayList<Bug>(bugs.length());
		
		for(int i = 0; i < bugs.length(); i++)
		{
			JSONObject bug = bugs.getJSONObject(i);
			
			bugList.add(this.jsonToBug(bug));
		}
		
		return bugList;
		
	}
	
	/**
	 * Parse the JSON response and make it into Bug object.
	 * 
	 * @param response This JSON response contains the details of a bug.
	 * 
	 * @return Returns the Bug object.
	 * 
	 * @throws JSONException
	 */
	
	public Bug getBug(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray bugs = jsonObject.getJSONArray("bugs");	//No I18N
		
		JSONObject bug = bugs.getJSONObject(0);
			
		return this.jsonToBug(bug);
		
	}
	
	
	/**
	 * Parse the JSONObject into Bug object.
	 * 
	 * @param jsonObject JSONObject contains the details of a bug.
	 * 
	 * @return Returns the Bug object.
	 * 
	 * @throws JSONException
	 */
	
	public Bug jsonToBug(JSONObject jsonObject)throws JSONException
	{
		
		Bug bug = new Bug();
		
		if(jsonObject.has("id"))
		{
			bug.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("key"))
		{
			bug.setKey(jsonObject.getString("key"));
		}
		
		if(jsonObject.has("project"))
		{
			bug.setProjectId(jsonObject.getJSONObject("project").getLong("id"));	//No I18N
		}
		
		if(jsonObject.has("flag"))
		{
			bug.setFlag(jsonObject.getString("flag"));
		}
		if(jsonObject.has("title"))
		{
			bug.setTitle(jsonObject.getString("title"));
		}
		if(jsonObject.has("description"))
		{
			bug.setDescription(jsonObject.getString("description"));
		}
		if(jsonObject.has("reporter_id"))
		{
			bug.setReporterId(jsonObject.getString("reporter_id"));
		}
		if(jsonObject.has("reported_person"))
		{
			bug.setReportedPerson(jsonObject.getString("reported_person"));
		}
		if(jsonObject.has("created_time"))
		{
			bug.setCreatedTime(jsonObject.getString("created_time"));
		}
		if(jsonObject.has("created_time_format"))
		{
			bug.setCreatedTimeFormat(jsonObject.getString("created_time_format"));
		}
		if(jsonObject.has("created_time_long"))
		{
			bug.setCreatedTimeLong(jsonObject.getLong("created_time_long"));	//No I18N
		}
		if(jsonObject.has("assignee_id"))
		{
			bug.setAssigneeId(jsonObject.getString("assignee_id"));
		}
		if(jsonObject.has("assignee_name"))
		{
			bug.setAssigneeName(jsonObject.getString("assignee_name"));
		}
		if(jsonObject.has("closed"))
		{	
			bug.setClosed(jsonObject.getBoolean("closed"));	//No I18N
		}
		if(jsonObject.has("due_date"))
		{
			bug.setDueDate(jsonObject.getString("due_date"));
		}
		if(jsonObject.has("due_date_format"))
		{
			bug.setDueDateFormat(jsonObject.getString("due_date_format"));
		}
		if(jsonObject.has("due_date_long"))
		{
			bug.setDueDateLong(jsonObject.getLong("due_date_long"));	//No I18N
		}
		
		
		if(jsonObject.has("classification"))
		{
			JSONObject classification = jsonObject.getJSONObject("classification");	//No I18N
			
			if(classification.has("id"))
			{
				bug.setClassificationId(classification.getLong("id"));	//No I18N
			}
			if(classification.has("type"))
			{
				bug.setClassificationType(classification.getString("type"));
			}
		}
		
		if(jsonObject.has("severity"))
		{
			JSONObject severity = jsonObject.getJSONObject("severity");	//No I18N
			
			if(severity.has("id"))
			{
				bug.setSeverityId(severity.getLong("id"));	//No I18N
			}
			if(severity.has("type"))
			{
				bug.setSeverityType(severity.getString("type"));
			}
			
		}
		
		if(jsonObject.has("status"))
		{
			JSONObject status = jsonObject.getJSONObject("status");	//No I18N
			
			if(status.has("id"))
			{
				bug.setStatusId(status.getLong("id"));	//No I18N
			}
			if(status.has("type"))
			{
				bug.setStatusType(status.getString("type"));
			}
			
		}
		
		if(jsonObject.has("reproducible"))
		{
			JSONObject reproducible = jsonObject.getJSONObject("reproducible");	//No I18N
			
			if(reproducible.has("id"))
			{
				bug.setReproducibleId(reproducible.getLong("id"));	//No I18N
			}
			if(reproducible.has("type"))
			{
				bug.setReproducibleType(reproducible.getString("type"));
			}
		}
		
		if(jsonObject.has("module"))
		{
			JSONObject module = jsonObject.getJSONObject("module");	//No I18N
			
			if(module.has("id"))
			{
				bug.setModuleId(module.getLong("id"));	//No I18N
			}
			if(module.has("name"))
			{
				bug.setModuleName(module.getString("name"));
			}
			
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				bug.setURL(link.getJSONObject("self").getString("url"));
			}
			
			if(link.has("timesheet"))
			{
				bug.setTimesheetURL(link.getJSONObject("timesheet").getString("url"));
			}
		}
		
		return bug;
		
		
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
	
	/**
	 * Parse the JSON response and make into List of Customfield Object.
	 * 
	 * @param response This JSON response contains the details of Custom fields.
	 * 
	 * @return Returns the List of Customfield Object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Customfield> getCustomfields(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		List<Customfield> customfieldList = new ArrayList<Customfield>();
		
		JSONArray customfields = jsonObject.getJSONArray("customfields");	//No I18N
		
		for(int i = 0; i < customfields.length(); i++)
		{
			customfieldList.add(this.jsonToCustomfield(customfields.getJSONObject(i)));
		}
		
		return customfieldList;
	}
	
	/**
	 * Parse the JSONObject into Customfield Object.
	 * 
	 * @param jsonObject JSONObject contains the details of a custom field.
	 * 
	 * @return Returns the Customfield Object.
	 * 
	 * @throws JSONException
	 */
	
	public Customfield jsonToCustomfield(JSONObject jsonObject)throws JSONException
	{
		
		Customfield customfield = new Customfield();
		
		if(jsonObject.has("label_name"))
		{
			customfield.setLabelName(jsonObject.getString("label_name"));
		}
		if(jsonObject.has("column_name"))
		{
			customfield.setColumnName(jsonObject.getString("column_name"));
		}
		if(jsonObject.has("default_Value"))
		{
			customfield.setDefaultValue(jsonObject.getString("default_Value"));
		}
		if(jsonObject.has("picklist_values"))
		{
			JSONArray picklist = jsonObject.getJSONArray("picklist_values");	//No I18N
			
			String[] picklistValues = new String[picklist.length()];
			
			for (int i = 0; i < picklist.length(); i++)
			{
				picklistValues[i] = picklist.getString(i);
			}
			
			customfield.setPicklistValues(picklistValues);
		}
		
		return customfield;
		
	}
	
	/**
	 * Parse the JSON response and make it into Defaultfield Object.
	 * 
	 * @param response This JSON response cotains the details of default fields.
	 * 
	 * @return Returns the Defaultfield Object.
	 * 
	 * @throws JSONException
	 */
	
	public Defaultfield getDefaultfields(String response)throws JSONException
	{
		
		Defaultfield defaultfield = new Defaultfield();
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONObject defaultFields = jsonObject.getJSONObject("defaultfields"); 	//No I18N
		
		if(defaultFields.has("severity_details"))
		{
			JSONArray severityDetails = defaultFields.getJSONArray("severity_details");	//No I18N
			
			List<HashMap<String, Object>> severitydetails = new ArrayList<HashMap<String,Object>>();
			
			for(int i = 0; i < severityDetails.length(); i++)
			{
				JSONObject severitydetail = severityDetails.getJSONObject(i);
				
				severitydetails.add(this.jsonToHashMap(severitydetail));
			}
			
			defaultfield.setSeverityDetails(severitydetails);
		}
		
		if(defaultFields.has("status_details"))
		{
			JSONArray statusDeatils = defaultFields.getJSONArray("status_details");	//No I18N
			
			List<HashMap<String, Object>> statusdeatils = new ArrayList<HashMap<String,Object>>();
			
			for(int i = 0; i < statusDeatils.length(); i++)
			{
				JSONObject statusdeatil = statusDeatils.getJSONObject(i);
				
				statusdeatils.add(this.jsonToHashMap(statusdeatil));
			}
			
			defaultfield.setStatusDeatils(statusdeatils);
		}
		
		if(defaultFields.has("module_details"))
		{
			JSONArray moduleDetails = defaultFields.getJSONArray("module_details");	//No I18N
			
			List<HashMap<String, Object>> moduledetails = new ArrayList<HashMap<String,Object>>();
			
			for(int i = 0; i < moduleDetails.length(); i++)
			{
				JSONObject moduledetail = moduleDetails.getJSONObject(i);
				
				moduledetails.add(this.jsonToHashMap(moduledetail));
			}
			
			defaultfield.setModuleDetails(moduledetails);
		}
		
		if(defaultFields.has("priority_details"))
		{
			JSONArray priorityDetails = defaultFields.getJSONArray("priority_details");	//No I18N
			
			List<HashMap<String, Object>> prioritydetails = new ArrayList<HashMap<String,Object>>();
			
			for (int i = 0; i < priorityDetails.length(); i++)
			{
				JSONObject prioritydetail = priorityDetails.getJSONObject(i);
				
				prioritydetails.add(this.jsonToHashMap(prioritydetail));
				
			}
			
			defaultfield.setPriorityDetails(prioritydetails);
		}
		
		if(defaultFields.has("classification_details"))
		{
			JSONArray classificationDetails = defaultFields.getJSONArray("classification_details");	//No I18N
			
			List<HashMap<String, Object>> classificationdetails = new ArrayList<HashMap<String,Object>>();
			
			for (int i = 0; i < classificationDetails.length(); i++)
			{
				JSONObject classificationdetail = classificationDetails.getJSONObject(i);
				
				classificationdetails.add(this.jsonToHashMap(classificationdetail));
			}
			
			defaultfield.setClassificationDetails(classificationdetails);
		}
		
		
		return defaultfield;
	}
	
	/**
	 * Parse the JSONObject into HashMap Object.
	 * 
	 * @param jsonObject JSONObject contains the details of default fields.
	 * 
	 * @return Returns the HashMap Object.
	 * 
	 * @throws JSONException
	 */
	
	public HashMap<String, Object> jsonToHashMap(JSONObject jsonObject)throws JSONException
	{
		
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		
		Iterator<?> keyIterator = jsonObject.keys();
		
		while (keyIterator.hasNext()) 
		{
			String key = (String) keyIterator.next();
			
			hashMap.put(key, jsonObject.get(key));
		}
		
		return hashMap;
		
	}
	
}
