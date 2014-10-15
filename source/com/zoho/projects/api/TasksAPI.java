/* $Id$ */

package com.zoho.projects.api;

import java.awt.geom.QuadCurve2D;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.xml.namespace.QName;

import com.zoho.projects.model.Comment;
import com.zoho.projects.model.Task;

import com.zoho.projects.parser.TaskParser;

import com.zoho.projects.util.ZohoHTTPClient;


/**
 * TasksAPI is used to:
 * 
 * 	Get list of tasks.
 * 
 * 	Get list of task for the tasklist.
 * 
 * 	Get the details of a task.
 * 
 * 	Create a new task.
 * 
 * 	Update the details of a task.
 * 
 * 	Delete an existing task.
 * 
 * @author ramesh-2099
 *
 */

public class TasksAPI extends API
{
	
	
	/**
	 * Construct a new TasksAPI using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's portalId.
	 */
	
	public TasksAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	
	// TaskParser is used to parse the JSON response into respective objects.
	
	TaskParser taskParser = new TaskParser();
	
	
	
	/**
	 * Get list of tasks for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Task object.
	 * 
	 * @throws Exception
	 */
	
	public List<Task> getTasks(String projectId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return taskParser.getTasks(response);
	}
	
	/**
	 * Get list of tasks for the task list.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param tasklistId ID of the tasklist.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list Task object.
	 * 
	 * @throws Exception
	 */
	
	public List<Task> getTasklistTasks(String projectId, String tasklistId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasklists/"+tasklistId+"/tasks/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return taskParser.getTasks(response);
	}
	
	/**
	 * Get the details of a task.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param taskId ID of the task.
	 * 
	 * @return Returns the Task object.
	 * 
	 * @throws Exception
	 */
	
	public Task get(String projectId, String taskId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+taskId+"/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap());
		
		return taskParser.getTask(response);
	}
	
	/**
	 * Create a new task for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param task Task object.
	 * 
	 * @return Returns the Task object.
	 * 
	 * @throws Exception
	 */
	
	public Task create(String projectId, Task task)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(task.toParamMAP()));
		
		return taskParser.getTask(response);
	}
	
	/**
	 * Update the details of a task.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param task Task object.
	 * 
	 * @return Returns the Task object.
	 * 
	 * @throws Exception
	 */
	
	public Task update(String projectId, Task task)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+task.getId()+"/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(task.toParamMAP()));
		
		return taskParser.getTask(response);
	}
	
	/**
	 * Delete an existing task.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param taskId ID of the task.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String delete(String projectId, String taskId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+taskId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return taskParser.getResult(response);
	}
	
	
	/**
	 * Get all the subtasks of the given task.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param taskId ID of the task.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns List of Task object.
	 * 
	 * @throws Exception
	 */
	
	public List<Task> getSubtasks(String projectId, String taskId, HashMap<String, Object> queryMap)throws Exception
	{
		
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+taskId+"/subtasks/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return taskParser.getTasks(response);
	}
	
	/**
	 * Get all the task comment.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param taskId ID of the task.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns List of Comment object.
	 * 
	 * @throws Exception
	 */
	
	public List<Comment> getComments(String projectId, String taskId, HashMap<String, Object> queryMap)throws Exception
	{
		
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+taskId+"/comments/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return taskParser.getComments(response);
		
	}
	
	/**
	 * Add the task comment.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param taskId ID of the task.
	 * 
	 * @param content  Comment for the task.
	 * 
	 * @return Returns the Comment object.
	 *  
	 * @throws Exception
	 */
	
	public Comment addComment(String projectId, String taskId, String content)throws Exception
	{
		
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+taskId+"/comments/";	//No I18N
		
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		requestBody.put("content", content);
		
		String response = ZohoHTTPClient.post(url, getQueryMap(requestBody));
		
		return taskParser.getComment(response);
		
	}
	
	/**
	 * Delete an existing task comment.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param taskId ID of the task.
	 * 
	 * @param commentId ID of the comment.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String deleteComment(String projectId, String taskId, String commentId)throws Exception
	{
		
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+taskId+"/comments/"+commentId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return taskParser.getResult(response);
		
	}
	
	
}