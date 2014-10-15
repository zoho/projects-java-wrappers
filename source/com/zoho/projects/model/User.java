/* $Id$ */

package com.zoho.projects.model;

/**
 * This class is used to make an object for user.
 * 
 * @author ramesh-2099
 *
 */

public class User 
{
	
	private String id;
	private String name;
	private String email;
	private String role;
	
	
	
	
	/**
	 * Set the user id.
	 * 
	 * @param id ID of the user.
	 */
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	/**
	 * Get the user id.
	 * 
	 * @return Returns the user id.
	 */
	
	public String getId()
	{
		return id;
	}
	
	/**
	 * Set the user name.
	 * 
	 * @param name Name of the user.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the user name.
	 * 
	 * @return Returns the user name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the user email.
	 * 
	 * @param email Email for the user.
	 */
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	/**
	 * Get the user email.
	 * 
	 * @return Returns the user email.
	 */
	
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * Set the user role.
	 * 
	 * @param role Role for the user.
	 */
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	/**
	 * Get the user role.
	 * 
	 * @return Returns the user role.
	 */
	
	public String getRole()
	{
		return role;
	}
	
	
	
}
