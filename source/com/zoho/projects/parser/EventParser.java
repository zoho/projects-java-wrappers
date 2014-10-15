/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Event;
import com.zoho.projects.model.Participant;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class EventParser
{
	
	
	/**
	 * Parse the JSON response and make it into List of Event object.
	 * 
	 * @param response This JSON response contains the details of events.
	 * 
	 * @return Returns List of Event object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Event> getEvents(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray events = jsonObject.getJSONArray("events");	//No I18N
		
		List<Event> eventList = new ArrayList<Event>(events.length());
		
		for(int i = 0; i < events.length(); i++)
		{
			JSONObject event = events.getJSONObject(i);
			
			eventList.add(this.jsonToEvent(event));
		}
		
		return eventList;
		
	}
	
	/**
	 * Parse the JSON response and make it into Event object.
	 * 
	 * @param response This JSON response contains the details of an event.
	 * 
	 * @return Returns the Event object.
	 * 
	 * @throws JSONException
	 */
	
	public Event getEvent(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray events = jsonObject.getJSONArray("events");	//No I18N
		
		JSONObject event = events.getJSONObject(0);
			
		return this.jsonToEvent(event);
		
	}
	
	/**
	 * Parse the JSONObject into Event object.
	 * 
	 * @param jsonObject JSONObject contains the details of an event.
	 * 
	 * @return Returns the Event object.
	 * 
	 * @throws JSONException
	 */
	
	public Event jsonToEvent(JSONObject jsonObject)throws JSONException
	{
		
		Event event = new Event();
		
		if(jsonObject.has("id"))
		{
			event.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("title"))
		{
			event.setTitle(jsonObject.getString("title"));
		}
		if(jsonObject.has("location"))
		{
			event.setLocation(jsonObject.getString("location"));
		}
		if(jsonObject.has("scheduled_on"))
		{
			event.setScheduledOn(jsonObject.getString("scheduled_on"));
		}
		if(jsonObject.has("scheduled_on_long"))
		{
			event.setScheduledOnLong(jsonObject.getLong("scheduled_on_long"));	//No I18N
		}
		if(jsonObject.has("reminder"))
		{
			event.setReminder(jsonObject.getString("reminder"));
		}
		if(jsonObject.has("repeat"))
		{
			event.setRepeat(jsonObject.getString("repeat"));
		}
		if(jsonObject.has("occurrence(s)"))
		{
			event.setOccurrences(jsonObject.getInt("occurrence(s)"));	//No I18N
		}
		if(jsonObject.has("occurred"))
		{
			event.setOccurred(jsonObject.getInt("occurred"));	//No I18N
		}
		if(jsonObject.has("duration_hour"))
		{
			event.setDurationHours(jsonObject.getString("duration_hour"));
		}
		if(jsonObject.has("duration_minutes"))
		{
			event.setDurationMinutes(jsonObject.getString("duration_minutes"));
		}
		
		if(jsonObject.has("participants"))
		{
			JSONArray participants = jsonObject.getJSONArray("participants");	//No I18N
			
			List<Participant> participantList = new ArrayList<Participant>(participants.length());
			
			for(int j = 0; j < participants.length(); j++)
			{
				JSONObject participant = participants.getJSONObject(j);
				
				participantList.add(this.jsonToParticipant(participant));
			}
			
			event.setParticipants(participantList);
		}
		
		return event;
		
	}
	
	
	/**
	 * Parse the JSONObject into Participant object.
	 * 
	 * @param jsonObject JSONObject contains the details of a participant.
	 * 
	 * @return Returns the Participant object.
	 * 
	 * @throws JSONException
	 */
	
	public Participant jsonToParticipant(JSONObject jsonObject)throws JSONException
	{
		
		Participant participant = new Participant();
		
		if(jsonObject.has("participant_id"))
		{
			participant.setParticipantId(jsonObject.getString("participant_id"));	
		}
		if(jsonObject.has("participant_person"))
		{
			participant.setParticipantPerson(jsonObject.getString("participant_person"));
		}
		
		return participant;
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