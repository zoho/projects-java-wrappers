/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;
import java.util.List;


/**
 * This class is used to make an object for event.
 * 
 * @author ramesh-2099
 *
 */

public class Event
{
	
	private long id;
	private String title;
	private String location;
	private String scheduledOn;
	private long scheduledOnLong;
	private String reminder;
	private String repeat;
	private int occurrences;
	private int occurred;
	private String durationHour;
	private String durationMinutes;
	
	private boolean isOpen;
	
	
	private List<Participant> participants;
	
	
	private String hour;
	private String minutes;
	private String ampm;
	
	
	
	/**
	 * Set the event id.
	 * 
	 * @param id ID of the event.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the event id.
	 * 
	 * @return Returns the event id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the event title.
	 * 
	 * @param title Title of the event.
	 */
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * Get the event title.
	 * 
	 * @return Returns the event title.
	 */
	
	public String getTilte()
	{
		return title;
	}
	
	/**
	 * Set the event location.
	 * 
	 * @param location Location of the event.
	 */
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	/**
	 * Get the event location.
	 * 
	 * @return Returns the event location.
	 */
	
	public String getLocation()
	{
		return location;
	}
	
	/**
	 * Set the event scheduled on.
	 * 
	 * @param scheduledOn Event scheduled on.
	 */
	
	public void setScheduledOn(String scheduledOn)
	{
		this.scheduledOn = scheduledOn;
	}
	
	/**
	 * Get the event scheduled on.
	 * 
	 * @return Returns the event scheduled on.
	 */
	
	public String getScheduledOn()
	{
		return scheduledOn;
	}
	
	/**
	 * Set the event scheduled on long.
	 * 
	 * @param scheduledOnLong Event scheduled on long.
	 */
	
	public void setScheduledOnLong(long scheduledOnLong)
	{
		this.scheduledOnLong = scheduledOnLong;
	}
	
	/**
	 * Get the event scheduled on long.
	 * 
	 * @return Returns the event scheduled on long.
	 */
	
	public long getScheduledOnLong()
	{
		return scheduledOnLong;
	}
	
	/**
	 * Set the reminder for the event.
	 * 
	 * @param reminder Reminder for the event.
	 */
	
	public void setReminder(String reminder)
	{
		this.reminder = reminder;
	}
	
	/**
	 * Get the reminder for the event.
	 * 
	 * @return Returns the event reminder.
	 */
	
	public String getReminder()
	{
		return reminder;
	}
	
	/**
	 * Set the reminder repeat for the event.
	 * 
	 * @param repeat Reminder repeat for the event.
	 */
	
	public void setRepeat(String repeat)
	{
		this.repeat = repeat;
	}
	
	/**
	 * Get the reminder repeat for the event.
	 * 
	 * @return Returns the event reminder repeat.
	 */
	
	public String getRepeat()
	{
		return repeat;
	}
	
	/**
	 * Set the occurrences for the reminder. 
	 * 
	 * @param occurrences Occurrences for the reminder.
	 */
	
	public void setOccurrences(int occurrences)
	{
		this.occurrences = occurrences;
	}
	
	/**
	 * Get the occurrences for the reminder.
	 * 
	 * @return Returns the occurences for the reminder.
	 */
	
	public int getOccurrences()
	{
		return occurrences;
	}
	
	/**
	 * Set no of times occurred for the reminder.
	 * 
	 * @param occurred No fo times occurred for the reminder.
	 */
	
	public void setOccurred(int occurred)
	{
		this.occurred = occurred;
	}
	
	/**
	 * Get no of times occurred for the reminder.
	 * 
	 * @return Returns no of times occurred for the reminder.
	 */
	
	public int getOccurred()
	{
		return occurred;
	}
	
	/**
	 * Set the duration hour.
	 * 
	 * @param durationHour Duration hour for the event.
	 */
	
	public void setDurationHours(String durationHour)
	{
		this.durationHour = durationHour;
	}
	
	/**
	 * Get the duration hour for the event.
	 * 
	 * @return Returns the duration hour for the event.
	 */
	
	public String getDurationHours()
	{
		return durationHour;
	}
	
	/**
	 * Set the duration minutes for the event.
	 * 
	 * @param durationMinutes Duration minutes for the event.
	 */
	
	public void setDurationMinutes(String durationMinutes) 
	{
		this.durationMinutes = durationMinutes;
	}
	
	/**
	 * Get the duration minutes for the event.
	 * 
	 * @return Returns the duration minutes for the event.
	 */
	
	public String getDurationMinutes()
	{
		return durationMinutes;
	}
	
	
	/**
	 * Set the event is open or not.
	 * 
	 * @param isOpen The event is open or not.
	 */
	
	public void setIsOpen(boolean isOpen)
	{
		this.isOpen = isOpen;
	}
	
	/**
	 * Get the event is open or not.
	 * 
	 * @return Returns true if the event is open else returns false.
	 */
	
	public boolean isOpen()
	{
		return isOpen;
	}
	
	
	
	/**
	 * Set the participants.
	 * 
	 * @param participants List of Participant object.
	 */
	
	public void setParticipants(List<Participant> participants)
	{
		this.participants = participants;
	}
	
	/**
	 * Get the participants.
	 * 
	 * @return Returns list of Participant object.
	 */
	
	public List<Participant> getParticipants()
	{
		return participants;
	}
	
	
	/**
	 * Set the hour for the event.
	 * 
	 * @param hour Hour for the event.
	 */
	
	public void setHour(String hour)
	{
		this.hour = hour;
	}
	
	/**
	 * Get the hour for the event.
	 * 
	 * @return Returns the event hour.
	 */
	
	public String getHour()
	{
		return hour;
	}
	
	/**
	 * Set the minutes for the event.
	 * 
	 * @param minutes Minutes for the event.
	 */
	
	public void setMinutes(String minutes)
	{
		this.minutes = minutes;
	}
	
	/**
	 * Get the minutes for the event.
	 * 
	 * @return Returns the minutes for the event.
	 */
	
	public String getMinutes()
	{
		return minutes;
	}
	
	/**
	 * Set AM or PM for the event.
	 * 
	 * @param ampm Event scheduled on AM or PM.
	 */
	
	public void setAMPM(String ampm)
	{
		this.ampm = ampm;
	}
	
	/**
	 * Get AM or PM for the event.
	 * 
	 * @return Returns AM or PM for the event.
	 */
	
	public String getAMPM()
	{
		return ampm;
	}
	
	
	
	/**
	 * Convert the Event object into HashMap object.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		if(title != null)
		{
			requestBody.put("title", title);
		}
		if(scheduledOn != null)
		{
			requestBody.put("date", scheduledOn);
		}
		if(hour != null)
		{
			requestBody.put("hour", hour);
		}
		if(minutes != null)
		{
			requestBody.put("minutes", minutes);
		}
		if(ampm != null)
		{
			requestBody.put("ampm", ampm);
		}
		if(durationHour != null)
		{
			requestBody.put("duration_hour", durationHour);
		}
		if(durationMinutes != null)
		{
			requestBody.put("duration_mins", durationMinutes);
		}
		if(participants != null)
		{
			String participantIds = "";
			
			for(Participant participant : participants)
			{
				participantIds += participant.getParticipantId()+",";
			}
			
			requestBody.put("participants", participantIds);
		}
		if(reminder != null)
		{
			requestBody.put("remind_before", reminder);
		}
		if(repeat != null)
		{
			requestBody.put("repeat", repeat);
		}
		if((Integer)occurrences != null && occurrences > 1)
		{
			requestBody.put("nooftimes_repeat", occurrences);
		}
		if(location != null)
		{
			requestBody.put("location", location);
		}
		
		
		return requestBody;
	}
	
}