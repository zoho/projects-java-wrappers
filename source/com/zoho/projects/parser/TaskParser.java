/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Comment;
import com.zoho.projects.model.Owner;
import com.zoho.projects.model.Task;
import com.zoho.projects.model.Tasklist;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class TaskParser
{
	
	
	/**
	 * Parse the JSON response and make it into List of Task object.
	 * 
	 * @param response This JSON response contains the details of tasks.
	 * 
	 * @return Returns List of Task object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Task> getTasks(String response)throws JSONException
	{
		
		List<Task> taskList = new ArrayList<Task>();
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray tasks = jsonObject.getJSONArray("tasks");	//No I18N
		
		for(int i = 0; i < tasks.length(); i++)
		{
			JSONObject task = tasks.getJSONObject(i);
			
			taskList.add(this.jsonToTask(task));
		}
		
		return taskList;
	}
	
	/**
	 * Parse the JSON response and make it into Task object.
	 * 
	 * @param response This JSON response contains the details of a task.
	 * 
	 * @return Returns the Task object.
	 * 
	 * @throws JSONException
	 */
	
	public Task getTask(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray tasks = jsonObject.getJSONArray("tasks");	//No I18N
		
		JSONObject task = tasks.getJSONObject(0);
			
		return this.jsonToTask(task);
	}
	
	/**
	 * Parse the JSONObject into Task object.
	 * 
	 * @param jsonObject JSONObject contains the details of a task.
	 * 
	 * @return Returns the Task object.
	 * 
	 * @throws JSONException
	 */
	
	public Task jsonToTask(JSONObject jsonObject)throws JSONException
	{
		
		Task task = new Task();
		
		if(jsonObject.has("id"))
		{
			task.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("name"))
		{
			task.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("completed"))
		{
			task.setCompleted(jsonObject.getBoolean("completed"));	//No I18N
		}
		if(jsonObject.has("created_by"))
		{
			task.setCreatedBy(jsonObject.getString("created_by"));
		}
		if(jsonObject.has("created_person"))
		{
			task.setCreatedPerson(jsonObject.getString("created_person"));
		}
		if(jsonObject.has("priority"))
		{
			task.setPriority(jsonObject.getString("priority"));
		}
		if(jsonObject.has("percent_complete"))
		{
			task.setPercentComplete(jsonObject.getInt("percent_complete"));	//No I18N
		}
		if(jsonObject.has("start_date"))
		{
			task.setStartDate(jsonObject.getString("start_date"));
		}
		if(jsonObject.has("start_date_format"))
		{
			task.setStartDateFormat(jsonObject.getString("start_date_format"));
		}
		if(jsonObject.has("start_date_long"))
		{
			task.setStartDateLong(jsonObject.getLong("start_date_long"));	//No I18N
		}
		if(jsonObject.has("end_date"))
		{
			task.setEndDate(jsonObject.getString("end_date"));
		}
		if(jsonObject.has("end_date_format"))
		{
			task.setEndDateFormat(jsonObject.getString("end_date_format"));
		}
		if(jsonObject.has("end_date_long"))
		{
			task.setEndDateLong(jsonObject.getLong("end_date_long"));	//No I18N
		}
		if(jsonObject.has("duration"))
		{
			task.setDuration(jsonObject.getString("duration"));
		}
		
		if(jsonObject.has("details"))
		{
			JSONObject details = jsonObject.getJSONObject("details");	//No I18N
			
			if(details.has("owners"))
			{
				JSONArray owners = details.getJSONArray("owners");	//No I18N
				
				List<Owner> ownerList = new ArrayList<Owner>(owners.length());
				
				for(int i = 0; i < owners.length(); i++)
				{
					JSONObject owner = owners.getJSONObject(i);
					
					ownerList.add(this.jsonToOwner(owner));
				}
				
				task.setOwners(ownerList);
			}
			
			if(details.has("documents"))
			{
				JSONArray documents = details.getJSONArray("documents");	//No I18N
				
				String[] documentIds = new String[documents.length()];
				
				for(int l = 0; l < documents.length(); l++)
				{
					
					documentIds[l] = documents.getJSONObject(l).getString("id");
					
				}
				
				task.setAssociateDocumentIds(documentIds);
			}
			
			if(details.has("forums"))
			{
				JSONArray forums = details.getJSONArray("forums");	//No I18N
				
				String[] forumIds = new String[forums.length()];
				
				for(int m = 0; m < forums.length(); m++)
				{
					forumIds[m] = forums.getJSONObject(m).getString("id");
				}
				
				task.setAssociateForumIds(forumIds);
			}
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
				
			if(link.has("self"))
			{
				task.setURL(link.getJSONObject("self").getString("url"));
			}
			if(link.has("subtask"))
			{
				task.setSubtaskURL(link.getJSONObject("subtask").getString("url"));	//No I18N
			}
			if(link.has("timesheet"))
			{
				task.setTimesheetURL(link.getJSONObject("timesheet").getString("url"));
			}
		}
		
		if(jsonObject.has("subtasks"))
		{
			/*JSONArray subtasks = jsonObject.getJSONArray("subtasks");	//No I18N
			
			List<Task> tasks = new ArrayList<Task>(subtasks.length());
			
			for(int k = 0; k < subtasks.length(); k++)
			{
				JSONObject taskObj = subtasks.getJSONObject(k);
				
				tasks.add(this.jsonToTask(taskObj));
			}*/
			
			task.setSubtasks(jsonObject.getBoolean("subtasks"));	//No I18N
			
		}
		
		if(jsonObject.has("tasklist"))
		{
			JSONObject tasklist = jsonObject.getJSONObject("tasklist");	//No I18N
			
			task.setTasklist(this.jsonToTasklist(tasklist));
		}
		
		return task;
		
		
	}
	
	/**
	 * Parse the JSONObject into Owner object.
	 * 
	 * @param jsonObject JSONObject contains the details of a owner.
	 * 
	 * @return Returns the Owner object.
	 * 
	 * @throws JSONException
	 */
	
	public Owner jsonToOwner(JSONObject jsonObject)throws JSONException
	{
		
		Owner owner = new Owner();
		
		if(jsonObject.has("id"))
		{
			owner.setId(jsonObject.getString("id"));
		}
		if(jsonObject.has("name"))
		{
			owner.setName(jsonObject.getString("name"));
		}
		
		return owner;
		
	}
	
	/**
	 * Parse the JSON response and make it into List of Comment object.
	 * 
	 * @param response JSON response contains the details of list of comments.
	 * 
	 * @return Returns List of Comment object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Comment> getComments(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		List<Comment> commentList = new ArrayList<Comment>();
		
		if(jsonObject.has("comments"))
		{
			JSONArray comments = jsonObject.getJSONArray("comments");	//No I18N
			
			for(int j = 0; j < comments.length(); j++)
			{
				JSONObject comment = comments.getJSONObject(j);
				
				commentList.add(this.jsonToComment(comment));
			}
			
		}
		
		return commentList;
		
	}
	
	/**
	 * Parse the JSON response and make it into the Comment object.
	 * 
	 * @param response JSON response contains the details of comment.
	 * 
	 * @return Returns the Comment object.
	 * 
	 * @throws JSONException
	 */
	
	public Comment getComment(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray comments = jsonObject.getJSONArray("comments");	//No I18N
		
		JSONObject comment = comments.getJSONObject(0);
		
		return this.jsonToComment(comment);
		
	}
	
	
	/**
	 * Parse the JSONObject into Comment object.
	 * 
	 * @param jsonObject JSONObject contains the details of a comment.
	 * 
	 * @return Returns the Comment object.
	 * 
	 * @throws JSONException
	 */
	
	public Comment jsonToComment(JSONObject jsonObject)throws JSONException
	{
		
		Comment comment = new Comment();
		
		if(jsonObject.has("id"))
		{
			comment.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("content"))
		{
			comment.setContent(jsonObject.getString("content"));
		}
		if(jsonObject.has("created_time"))
		{
			comment.setCreatedTime(jsonObject.getString("created_time"));
		}
		if(jsonObject.has("created_time_format"))
		{
			comment.setCreatedTimeFormat(jsonObject.getString("created_time_format"));
		}
		if(jsonObject.has("created_time_long"))
		{
			comment.setCreatedTimeLong(jsonObject.getLong("created_time_long"));	//No I18N
		}
		if(jsonObject.has("added_by"))
		{
			comment.setAddedBy(jsonObject.getString("added_by"));
		}
		if(jsonObject.has("added_person"))
		{
			comment.setAddedPerson(jsonObject.getString("added_person"));
		}
		if(jsonObject.has("updated_by"))
		{
			comment.setUpdatedBy(jsonObject.getString("updated_by"));
		}
		
		return comment;
		
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
		if(jsonObject.has("name"))
		{
			tasklist.setName(jsonObject.getString("name"));
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
