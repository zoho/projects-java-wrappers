/* $Id$ */

package com.zoho.projects.model;

/**
 * This class is used to make an object for portal.
 * 
 * @author ramesh-2099
 *
 */

public class Portal
{
	
	private long id;
	private String name;
	private boolean isDefault;
	private String gmtTimeZone;
	private String role;
	
	private String companyName;
	private String websiteUrl;
	private String timeZone;
	private String dateFormat;
	
	private String code;
	private String language;
	private String country;
	
	private String projectUrl;
	
	
	
	/**
	 * Set the portal id.
	 * 
	 * @param id ID of the portal.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the portal id.
	 * 
	 * @return Returns the portal id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the portal name.
	 * 
	 * @param name Name of the portal.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the portal name.
	 * 
	 * @return Returns the portal name.
	 */
	
	public String getName() 
	{
		return name;
	}
	
	/**
	 * Set the portal is default or not.
	 * 
	 * @param isDefault The portal is default or not.
	 */
	
	public void setDefault(boolean isDefault)
	{
		this.isDefault = isDefault;
	}
	
	/**
	 * Get the portal is default or not.
	 * 
	 * @return Returns true of the portal is default else returns false.
	 */
	
	public boolean isDefault() 
	{
		return isDefault;
	}
	
	/**
	 * Set the gmt time zone.
	 * 
	 * @param gmtTimeZone Gmt time zone for the portal.
	 */
	
	public void setGmtTimeZone(String gmtTimeZone)
	{
		this.gmtTimeZone = gmtTimeZone;
	}
	
	/**
	 * Get the gmt time zone.
	 * 
	 * @return Returns the gmt time zone.
	 */
	
	public String  getGmtTimeZone()
	{
		return gmtTimeZone;
	}
	
	/**
	 * Set the role.
	 * 
	 * @param role Role of the person.
	 */
	
	public void setRole(String role) 
	{
		this.role = role;
	}
	
	/**
	 * Get the role.
	 * 
	 * @return Returns the role of the person.
	 */
	
	public String getRole()
	{
		return role;
	}
	
	
	
	/**
	 * Set the company name.
	 * 
	 * @param companyName Name of the company.
	 */
	
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	
	/**
	 * Get the company name.
	 * 
	 * @return Returns the company name.
	 */
	
	public String getCompanyName()
	{
		return companyName;
	}
	
	/**
	 * Set the WEBsite URL.
	 * 
	 * @param websiteUrl URL for the WEBsite.
	 */
	
	public void setWebsiteURL(String websiteUrl)
	{
		this.websiteUrl = websiteUrl;
	}
	
	/**
	 * Get the WEBsite URL.
	 * 
	 * @return Returns the WEBsite URL.
	 */
	
	public String getWebsiteURL()
	{
		return websiteUrl;
	}
	
	/**
	 * Set the time zone.
	 * 
	 * @param timeZone Time zone for the portal.
	 */
	
	public void setTimeZone(String timeZone)
	{
		this.timeZone = timeZone;
	}
	
	/**
	 * Get the time zone.
	 * 
	 * @return Returns the time zone for the portal.
	 */
	
	public String getTimeZone()
	{
		return timeZone;
	}
	
	/**
	 * Set the date format.
	 * 
	 * @param dateFormat Date format for the portal.
	 */
	
	public void setDateFormat(String dateFormat)
	{
		this.dateFormat = dateFormat;
	}
	
	/**
	 * Get the date format.
	 * 
	 * @return Returns the date format for the portal.
	 */
	
	public String getDateFormat()
	{
		return dateFormat;
	}
	
	
	
	/**
	 * Set the code for the language.
	 * 
	 * @param code Code for the language.
	 */
	
	public void setCode(String code)
	{
		this.code =code;
	}
	
	/**
	 * Get the language code.
	 * 
	 * @return Returns the language code.
	 */
	
	public String getCode()
	{
		return code;
	}
	
	/**
	 * Set the language.
	 * 
	 * @param language Language for the portal.
	 */
	
	public void setLanguage(String language)
	{
		this.language = language;
	}
	
	/**
	 * Get the language.
	 * 
	 * @return Returns the language for the portal.
	 */
	
	public String getLanguage()
	{
		return language;
	}
	
	/**
	 * Set the country.
	 * 
	 * @param country Country for portal.
	 */
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	/**
	 * Get the country.
	 * 
	 * @return Returns the country name.
	 */
	
	public String getCountry()
	{
		return country;
	}
	
	
	/**
	 * Set the project URL.
	 * 
	 * @param projectUrl URL for the project.
	 */
	
	public void setProjectURL(String projectUrl)
	{
		this.projectUrl = projectUrl;
	}
	
	/**
	 * Get the project URL.
	 * 
	 * @return Returns the project URL.
	 */
	
	public String getProjectURL()
	{
		return projectUrl;
	}
	
}