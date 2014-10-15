/* $Id$ */

package com.zoho.projects.exception;


/**
 * ProjectsException is used to throw a new projects exception with code and message.
 * 
 * @author ramesh-2099
 *
 */

public class ProjectsException extends Exception
{
	
	
	private static final long serialVersionUID = 1L;

	

	private int code;
	
	private String message;


	/**
	
	* Construct a new ProjectsException by passing an error code and error message.
	
	* @param code Error code.
	
	* @param message Error message.
	
	*/	
		
	public ProjectsException(int code, String message)
	{
		
		super(message);
		
		this.code = code;
		
		this.message = message;
		
	}
	
	
	/**
	
	* get the error code.
	
	* @return Returns the error code.
	
	*/
	
	public int getCode()
	{
		return code;
	}
	
	/**
	
	* get the error message.
	
	* @return Returns the error message.
	
	*/
	
	public String getMessage()
	{
		return message;
	}
	
}