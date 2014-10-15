/* $Id$ */

package com.zoho.projects.model;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * This class is used to make an object for document.
 * 
 * @author ramesh-2099
 *
 */

public class Document
{
	
	private long id;
	private String filename;
	private String contenttype;
	
	private String url;
	
	private List<Version> versions;
	
	private ArrayList<File> uploaddoc;
	private long folderId;
	private String description;
	private String tags;
	private long notify;
	
	
	private Folder folder;
	
	
	
	
	/**
	 * Set the document id.
	 * 
	 * @param id ID of the document.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the document id.
	 * 
	 * @return Returns the document id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the file name.
	 * 
	 * @param filename Name of the file.
	 */
	
	public void setFilename(String filename)
	{
		this.filename = filename;
	}
	
	/**
	 * Get the file name.
	 * 
	 * @return Returns the file name.
	 */
	
	public String getFilename()
	{
		return filename;
	}
	
	/**
	 * Set the content type.
	 * 
	 * @param contenttype Content type of the file.
	 */
	
	public void setContenttype(String contenttype)
	{
		this.contenttype = contenttype;
	}
	
	/**
	 * Get the content type.
	 * 
	 * @return Returns the content type.
	 */
	
	public String getContenttype()
	{
		return contenttype;
	}
	
	
	
	/**
	 * Set the document URL.
	 * 
	 * @param url URL for the document.
	 */
	
	public void setURL(String url)
	{
		this.url = url;
	}
	
	/**
	 * Get the document URL.
	 * 
	 * @return Returns the document URL.
	 */
	
	public String getURL()
	{
		return url;
	}
	
	
	
	/**
	 * Set the document version.
	 * 
	 * @param versions Version for the document.
	 */
	
	public void setVersions(List<Version> versions)
	{
		this.versions = versions;
	}
	
	/**
	 * Get the document version.
	 * 
	 * @return Returns the document version.
	 */
	
	public List<Version> getVersions()
	{
		return versions;
	}
	
	
	
	/**
	 * Set the upload document file.
	 * 
	 * @param uploaddoc ArrayList of upload document file.
	 */
	
	public void setUploaddoc(ArrayList<File> uploaddoc)
	{
		this.uploaddoc = uploaddoc;
	}
	
	/**
	 * Get the upload document file.
	 * 
	 * @return Returns the ArrayList of upload document file.
	 */
	
	public ArrayList<File> getUploaddoc()
	{
		return uploaddoc;
	}
	
	/**
	 * Set the folder id.
	 * 
	 * @param folderId ID of the folder.
	 */
	
	public void setFolderId(long folderId)
	{
		this.folderId = folderId;
	}
	
	/**
	 * Get the folder id.
	 * 
	 * @return Returns the folder id.
	 */
	
	public long getFolderId()
	{
		return folderId;
	}
	
	/**
	 * Set the description of the document.
	 * 
	 * @param description Description of the document.
	 */
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
	 * Get the description of the document.
	 * 
	 * @return Returns the document description.
	 */
	
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * Set the tags for the document.
	 * 
	 * @param tags Tags for the document.
	 */
	
	public void setTags(String tags)
	{
		this.tags = tags;
	}
	
	/**
	 * Get the tags for the document.
	 * 
	 * @return Returns the tags for the document.
	 */
	
	public String getTags()
	{
		return tags;
	}
	
	/**
	 * Set the notify for the document.
	 * 
	 * @param notify Notify for the document. 
	 */
	
	public void setNotify(long notify)
	{
		this.notify = notify;
	}
	
	/**
	 * Get the notify for the document.
	 * 
	 * @return Returns the notify for the document.
	 */
	
	public long getNotify()
	{
		return notify;
	}
	
	
	
	/**
	 * Set the folder.
	 * 
	 * @param folder Folder object.
	 */
	
	public void setFolder(Folder folder)
	{
		this.folder = folder;
	}
	
	/**
	 * Get the folder object.
	 * 
	 * @return Returns the folder object.
	 */
	
	public Folder getFolder()
	{
		return folder;
	}
	
	
	
	/**
	 * Convert the Document object into HashMap object.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		if((Long)folderId != null && folderId > 0)
		{
			requestBody.put("folder_id", folderId);
		}
		if(description != null)
		{
			requestBody.put("description", description);
		}
		if(tags != null)
		{
			requestBody.put("tags", tags);
		}
		if((Long)notify != null && notify > 0)
		{
			requestBody.put("notify", notify);
		}
		
		return requestBody;
	}
	
}