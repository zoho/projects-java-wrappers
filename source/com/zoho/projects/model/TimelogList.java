/* $Id$ */

package com.zoho.projects.model;

import java.util.ArrayList;

/**
 * This class is used to make an object for list of time logs.
 *  
 * @author ramesh-2099
 *
 */

public class TimelogList extends ArrayList<Timelog>
{
	
	private String grandtotal;
	private String role;
	
	
	/**
	 * Set the grand total of the time log.
	 * 
	 * @param grandtotal Grand total of the time log.
	 */
	
	public void setGrandtotal(String grandtotal)
	{
		this.grandtotal = grandtotal;
	}
	
	/**
	 * Get the grand total of the time log.
	 * 
	 * @return Retruns the grand total of the timelog.
	 */
	
	public String getGrandtotal()
	{
		return grandtotal;
	}
	
	/**
	 * Set the time log role.
	 * 
	 * @param role Role for the time log.
	 */
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	/**
	 * Get the time log role.
	 * 
	 * @return Retruns the time log role.
	 */
	
	public String getRole()
	{
		return role;
	}

}
