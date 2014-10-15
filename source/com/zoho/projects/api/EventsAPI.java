/* $Id$ */

package com.zoho.projects.api;

import java.util.HashMap;
import java.util.List;

import com.zoho.projects.model.Event;

import com.zoho.projects.parser.EventParser;

import com.zoho.projects.util.ZohoHTTPClient;


/**
 * EventsAPI is used to:
 * 
 * 	Get list of events.
 * 
 * 	Add an event.
 * 
 * 	Update the details of an event.
 * 
 * 	Delete an existing event.
 * 
 * @author ramesh-2099
 *
 */

public class EventsAPI extends API
{
	
	
	/**
	 * Construct a new EventsAPI using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's portalId.
	 */
	
	public EventsAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	
	//EventParser is used to parse the JSON response into respective objects.
	
	EventParser eventParser = new EventParser();
	
	
	/**
	 * Get list of events for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Event object.
	 * 
	 * @throws Exception
	 */
	
	public List<Event> getEvents(String projectId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/events/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return eventParser.getEvents(response);
	}
	
	/**
	 * Add an event for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param event Event object.
	 * 
	 * @return Returns the Event object.
	 * 
	 * @throws Exception
	 */
	
	public Event add(String projectId, Event event)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/events/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(event.toParamMAP()));
		
		return eventParser.getEvent(response);
		
	}
	
	/**
	 * Update the details of an event.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param event Event object.
	 * 
	 * @return Returns the Event object.
	 * 
	 * @throws Exception
	 */
	
	public Event update(String projectId, Event event)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/events/"+event.getId()+"/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(event.toParamMAP()));
		
		return eventParser.getEvent(response);
	}
	
	/**
	 * Delete an existing event for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param eventId ID of the event.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String delete(String projectId, String eventId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/events/"+eventId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return eventParser.getResult(response);
	}
	
}