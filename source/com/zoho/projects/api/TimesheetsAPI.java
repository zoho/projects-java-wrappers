/* $Id$ */

package com.zoho.projects.api;

import java.util.HashMap;

import com.zoho.projects.model.Buglog;
import com.zoho.projects.model.Generallog;
import com.zoho.projects.model.Tasklog;
import com.zoho.projects.model.TimelogList;
import com.zoho.projects.parser.TimesheetParser;
import com.zoho.projects.util.ZohoHTTPClient;


/**
 * TimesheetAPI is used to:
 * 
 * 	Get list of time logs.
 * 
 * 	Add new task log.
 * 
 * 	update the details of a task log.
 * 
 * 	Delete an existing task log.
 * 
 * 	Add new bug log.
 * 
 * 	Update the details of a bug log.
 * 
 * 	Delete an existing bug log.
 * 
 * 	Add new general log.
 * 
 * 	Update the details of a general log.
 * 
 * 	Delete an existing general log.
 * 
 * @author ramesh-2099
 *
 */

public class TimesheetsAPI extends API
{
	
	
	/**
	 * Construct a new TimesheetsAPI using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's portalId.
	 */
	
	public TimesheetsAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	
	//TimesheetParser is used to parse the JSON response into respective objects.
	
	TimesheetParser timesheetParser = new TimesheetParser();
	
	
	
	/**
	 * Get list of time logs for the project.
	 * 
	 * @param projectId ID 0f the project.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns the TimelogList object.
	 * 
	 * @throws Exception
	 */
	
	public TimelogList getTimeLogs(String projectId, HashMap<String, Object> queryMap)throws Exception
	{
		
		String url = getBaseURL()+"/projects/"+projectId+"/logs/"; //No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return timesheetParser.getTimeLogs(response);
		
	}
	
	/**
	 * Add a new task log for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param tasklog Tasklog object.
	 * 
	 * @return Returns the Tasklog object.
	 * 
	 * @throws Exception
	 */
	
	public Tasklog addTasklog(String projectId, Tasklog tasklog)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+tasklog.getTaskId()+"/logs/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(tasklog.toParamMAP()));
		
		return timesheetParser.getTasklog(response);
	}
	
	/**
	 * Update the details of a task log.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param tasklog Tasklog object.
	 * 
	 * @return Returns the Tasklog object.
	 * 
	 * @throws Exception
	 */
	
	public Tasklog updateTasklog(String projectId, Tasklog tasklog)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+tasklog.getTaskId()+"/logs/"+tasklog.getId()+"/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(tasklog.toParamMAP()));
		
		return timesheetParser.getTasklog(response);
	}
	
	/**
	 * Delete an existing task log for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param taskId ID of the task.
	 * 
	 * @param logId ID of the log.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String deleteTasklog(String projectId, String taskId, String logId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/tasks/"+taskId+"/logs/"+logId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return timesheetParser.getResult(response);
	}
	
	/**
	 * Add a new bug log for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param buglog Buglog object.
	 * 
 	 * @return Returns the Buglog object.
 	 * 
	 * @throws Exception
	 */
	
	public Buglog addBuglog(String projectId, Buglog buglog)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/bugs/"+buglog.getBugId()+"/logs/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(buglog.toParamMAP()));
		
		return timesheetParser.getBuglog(response);
	}
	
	/**
	 * Update the details of a bug log.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param buglog Buglog object.
	 * 
	 * @return Returns the Buglog object.
	 * 
	 * @throws Exception
	 */
	
	public Buglog updateBuglog(String projectId, Buglog buglog)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/bugs/"+buglog.getBugId()+"/logs/"+buglog.getId()+"/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(buglog.toParamMAP()));
		
		return timesheetParser.getBuglog(response);
	}
	
	/**
	 * Delete an existing bug log for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param bugId ID of the bug.
	 * 
	 * @param logId ID of the log.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String deleteBuglog(String projectId, String bugId, String logId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/bugs/"+bugId+"/logs/"+logId+"/";	//No I18N
				
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return timesheetParser.getResult(response);
	}
	
	/**
	 * Add a new general log for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param generallog Generallog object.
	 * 
	 * @return Returns the Generallog object.
	 * 
	 * @throws Exception
	 */
	
	public Generallog addGenerallog(String projectId, Generallog generallog)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/logs/";	//No I18N
		
		HashMap<String, Object> requestBody = getQueryMap(generallog.toParamMAP());
		
		requestBody.put("name", generallog.getName());
		
		String response = ZohoHTTPClient.post(url, requestBody);
		
		return timesheetParser.getGenerallog(response);
	}
	
	/**
	 * Update the details of a general log.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param generallog Generallog object.
	 * 
	 * @return Returns the Generallog object.
	 * 
	 * @throws Exception
	 */
	
	public Generallog updateGenerallog(String projectId, Generallog generallog)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/logs/"+generallog.getId()+"/";	//No I18N
		
		HashMap<String, Object> requestBody = getQueryMap(generallog.toParamMAP());
		
		requestBody.put("name", generallog.getName());
		
		String response = ZohoHTTPClient.post(url, requestBody);
		
		return timesheetParser.getGenerallog(response);
	}
	
	/**
	 * Delete an existing general log for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param logId ID of the log.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String deleteGenerallog(String projectId, String logId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/logs/"+logId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return timesheetParser.getResult(response);
	}
	
}
