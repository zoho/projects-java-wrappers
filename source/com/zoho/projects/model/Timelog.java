/* $Id$ */

package com.zoho.projects.model;

import java.util.List;

/**
 * This class is used to make a Timelog object.
 * 
 * @author ramesh-2099
 *
 */

public class Timelog 
{
	
	private long dateLong;
	private String displayFormat;
	private String totalHours;
	
	
	private List<Buglog> buglogs;
	
	private List<Tasklog> tasklogs;
	
	private List<Generallog> generallogs;
	
	
	
	/**
	 * Set the date long for the time log.
	 * 
	 * @param dateLong Date long for the time log.
	 */
	
	public void setDateLong(long dateLong)
	{
		this.dateLong = dateLong;
	}
	
	/**
	 * Get the date long for the time log.
	 * 
	 * @return Returns the date long for the time log.
	 */
	
	public long getDateLong()
	{
		return dateLong;
	}
	
	/**
	 * Set the display format of the date.
	 * 
	 * @param displayFormat Display format of the date.
	 */
	
	public void setDisplayFormat(String displayFormat)
	{
		this.displayFormat = displayFormat;
	}
	
	/**
	 * Get the display format of the date.
	 * 
	 * @return Returns the display format of the date.
	 */
	
	public String getDisplayFormat()
	{
		return displayFormat;
	}
	
	/**
	 * Set the total hours of the time log.
	 * 
	 * @param totalHours Total hours of the time log.
	 */
	
	public void setTotalHours(String totalHours)
	{
		this.totalHours = totalHours;
	}
	
	/**
	 * Get the total hours of the time log.
	 * 
	 * @return Returns the total hours of the time log.
	 */
	
	public String getTotalHours()
	{
		return totalHours;
	}
	
	
	
	/**
	 * Set the bug logs.
	 * 
	 * @param buglogs List of Buglog object.
	 */
	
	public void setBuglogs(List<Buglog> buglogs)
	{
		this.buglogs = buglogs;
	}
	
	/**
	 * Get the bug logs.
	 * 
	 * @return Returns list of Buglog object.
	 */
	
	public List<Buglog> getBuglogs()
	{
		return buglogs;
	}
	
	
	/**
	 * Set the task logs.
	 * 
	 * @param tasklogs List of Tasklog object.
	 */
	
	public void setTasklogs(List<Tasklog> tasklogs)
	{
		this.tasklogs = tasklogs;
	}
	
	/**
	 * Get the task logs.
	 * 
	 * @return Returns list of Tasklog object.
	 */
	
	public List<Tasklog> getTasklogs()
	{
		return tasklogs;
	}
	
	
	/**
	 * Set the general logs.
	 * 
	 * @param generallogs List of Generallog object.
	 */
	
	public void setGenerallogs(List<Generallog> generallogs)
	{
		this.generallogs = generallogs;
	}
	
	/**
	 * get the general logs.
	 * 
	 * @return Returns list of Generallog object.
	 */
	
	public List<Generallog> getGenerallogs()
	{
		return generallogs;
	}

}
