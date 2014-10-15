/* $Id$ */

package com.zoho.projects.model;


/**
 * This class is used to make an object for Activity.
 * 
 * @author ramesh-2099
 *
 */

public class Activity
{
	
	private long id;
	private String name;
	private String state;
	private String activityBy;
	private long timeLong;
	private String displayTime;
	private String time;
	private String activityFor;
	
	
	
	
	/**
	 * Set the id of the activity.
	 * 
	 * @param id ID of the activity.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the activity id.
	 * 
	 * @return Returns the activity id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the name of the activity.
	 * 
	 * @param name Name of the activity.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the activity name.
	 * 
	 * @return Returns the activity name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the state of the activity.
	 * 
	 * @param state State of the activity.
	 */
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	/**
	 * Get the activity state.
	 * 
	 * @return Returns the activity state.
	 */
	
	public String getState()
	{
		return state;
	}
	
	/**
	 * Set who posted the activity.
	 * 
	 * @param activityBy Activity posted by whom. 
	 */
	
	public void setActivityBy(String activityBy)
	{
		this.activityBy = activityBy;
	}
	
	/**
	 * Get who posted the activity.
	 * 
	 * @return Returns who posted the activity.
	 */
	
	public String getActivityBy()
	{
		return activityBy;
	}
	
	/**
	 * Set the time long.
	 * 
	 * @param timeLong Time long for the activity.
	 */
	
	public void setTimeLong(long timeLong)
	{
		this.timeLong = timeLong;
	}
	
	/**
	 * Get the time long.
	 * 
	 * @return Returns the time long for the activity.
	 */
	
	public long getTimeLong()
	{
		return timeLong;
	}
	
	/**
	 * Set the display time for the activity.
	 * 
	 * @param displayTime Display time for the activity.
	 */
	
	public void setDisplayTime(String displayTime)
	{
		this.displayTime = displayTime;
	}
	
	/**
	 * Get the display time for the activity.
	 * 
	 * @return Returns the display time for the activity.
	 */
	
	public String getDisplayTime()
	{
		return displayTime;
	}
	
	/**
	 * Set the time for the activity done.
	 * 
	 * @param time Time for the activity done.
	 */
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	/**
	 * Get the time for the activity done.
	 * 
	 * @return Returns the time for the activity done.
	 */
	
	public String getTime()
	{
		return time;
	}
	
	/**
	 * Set the activity for which topic.
	 *  
	 * @param activityFor Activity for which topic.
	 */
	
	public void setActivityFor(String activityFor)
	{
		this.activityFor = activityFor;
	}
	
	/**
	 * Get the activity for which topic.
	 * 
	 * @return Returns the activity for which topic.
	 */
	
	public String getActivityFor()
	{
		return activityFor;
	}
	
}