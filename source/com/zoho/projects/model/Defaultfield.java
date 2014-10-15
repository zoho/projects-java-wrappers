/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;
import java.util.List;

/**
 * This class is used to make a Defaultfield Object.
 * 
 * @author ramesh-2099
 *
 */

public class Defaultfield 
{
	
	private List<HashMap<String, Object>> severityDetails;
	private List<HashMap<String, Object>> statusDeatils;
	private List<HashMap<String, Object>> moduleDetails;
	private List<HashMap<String, Object>> priorityDetails;
	private List<HashMap<String, Object>> classificationDetails;
	
	
	/**
	 * Get the list of severity details.
	 * 
	 * @return Returns List of severity details.
	 */
	
	public List<HashMap<String, Object>> getSeverityDetails() 
	{
		return severityDetails;
	}
	
	/**
	 * Set the list of severity details.
	 * 
	 * @param severityDetails List of severity details.
	 */
	
	public void setSeverityDetails(List<HashMap<String, Object>> severityDetails) 
	{
		this.severityDetails = severityDetails;
	}
	
	/**
	 * Get the list of status details.
	 * 
	 * @return Returns List of status details.
	 */
	
	public List<HashMap<String, Object>> getStatusDeatils() 
	{
		return statusDeatils;
	}
	
	/**
	 * Set list of status details.
	 * 
	 * @param statusDeatils List of status details.
	 */
	
	public void setStatusDeatils(List<HashMap<String, Object>> statusDeatils) 
	{
		this.statusDeatils = statusDeatils;
	}
	
	/**
	 * Get the list of module details.
	 * 
	 * @return Returns List of module details.
	 */
	
	public List<HashMap<String, Object>> getModuleDetails() 
	{
		return moduleDetails;
	}
	
	/**
	 * Set list of module details.
	 * 
	 * @param moduleDetails List of module details.
	 */
	
	public void setModuleDetails(List<HashMap<String, Object>> moduleDetails) 
	{
		this.moduleDetails = moduleDetails;
	}
	
	/**
	 * Get the list of priority details.
	 * 
	 * @return Returns List of priority details.
	 */
	
	public List<HashMap<String, Object>> getPriorityDetails() 
	{
		return priorityDetails;
	}
	
	/**
	 * Set list of priority details.
	 * 
	 * @param priorityDetails List of priority details.
	 */
	
	public void setPriorityDetails(List<HashMap<String, Object>> priorityDetails) 
	{
		this.priorityDetails = priorityDetails;
	}
	
	/**
	 * Get the list of classification details.
	 * 
	 * @return Returns List of classification details.
	 */
	
	public List<HashMap<String, Object>> getClassificationDetails() 
	{
		return classificationDetails;
	}
	
	/**
	 * Set list of classification details.
	 * 
	 * @param classificationDetails List of classification details.
	 */
	
	public void setClassificationDetails(List<HashMap<String, Object>> classificationDetails) 
	{
		this.classificationDetails = classificationDetails;
	}
	
	

}
