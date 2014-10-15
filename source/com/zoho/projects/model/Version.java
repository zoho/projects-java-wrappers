/* $Id$ */

package com.zoho.projects.model;

/**
 * This class is used to make an object for version.
 * 
 * @author ramesh-2099
 *
 */

public class Version 
{
	
	private long id;
	private String uploadedBy;
	private String description;
	private String version;
	private String uploadedOn;
	
	private String fileSize;
	private String uploadedDate;
	private String uploadedDateFormat;
	private long uploadedDateLong;
	
	
	
	/**
	 * Set the version id.
	 * 
	 * @param id ID of the version.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the version id.
	 * 
	 * @return Returns the version id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the uploaded person id.
	 * 
	 * @param uploadedBy ID of the uploaded person.
	 */
	
	public void setUploadedBy(String uploadedBy)
	{
		this.uploadedBy = uploadedBy;
	}
	
	/**
	 * Get the uploaded person id.
	 * 
	 * @return Returns the uploaded person id.
	 */
	
	public String getUploadedBy()
	{
		return uploadedBy;
	}
	
	/**
	 * Set the version description.
	 * 
	 * @param description Description for the version.
	 */
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
	 * Get the version description.
	 * 
	 * @return Returns the version description.
	 */
	
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * Set the version.
	 * 
	 * @param version Version of the document.
	 */
	
	public void setVersion(String version)
	{
		this.version = version;
	}
	
	/**
	 * Get the version.
	 * 
	 * @return Returns the document version.
	 */
	
	public String getVersion()
	{
		return version;
	}
	
	/**
	 * Set the document uploaded on.
	 * 
	 * @param uploadedOn Document uploaded on.
	 */
	
	public void setUploadedOn(String uploadedOn)
	{
		this.uploadedOn = uploadedOn;
	}
	
	/**
	 * Get the document uploaded on.
	 * 
	 * @return Returns the document uploaded on.
	 */
	
	public String getUploadedOn()
	{
		return uploadedOn;
	}
	
	
	
	/**
	 * Set the file size.
	 * 
	 * @param fileSize Size of the file.
	 */
	
	public void setFileSize(String fileSize)
	{
		this.fileSize = fileSize;
	}
	
	/**
	 * Get the file size.
	 * 
	 * @return Returns the file size.
	 */
	
	public String getFileSize()
	{
		return fileSize;
	}
	
	/**
	 * Set the uploaded date.
	 * 
	 * @param uploadedDate document uploaded date.
	 */
	
	public void setUploadedDate(String uploadedDate)
	{
		this.uploadedDate = uploadedDate;
	}
	
	/**
	 * Get the uploaded date.
	 * 
	 * @return Returns the uploaded date.
	 */
	
	public String getUploadedDate()
	{
		return uploadedDate;
	}
	
	/**
	 * Set the uploaded date format.
	 * 
	 * @param uploadedDate document uploaded date format.
	 */
	
	public void setUploadedDateFormat(String uploadedDateFormat)
	{
		this.uploadedDateFormat = uploadedDateFormat;
	}
	
	/**
	 * Get the uploaded date format.
	 * 
	 * @return Returns the uploaded date format.
	 */
	
	public String getUploadedDateFormat()
	{
		return uploadedDateFormat;
	}
	
	/**
	 * Set the uploaded date long.
	 * 
	 * @param uploadedDateLong Document uploaded date long.
	 */
	
	public void setUploadedDateLong(long uploadedDateLong)
	{
		this.uploadedDateLong = uploadedDateLong;
	}
	
	/**
	 * Get the document uploaded date long.
	 * 
	 * @return Returns the document uploaded date long.
	 */
	
	public long getUploadedDateLong()
	{
		return uploadedDateLong;
	}
	
}
