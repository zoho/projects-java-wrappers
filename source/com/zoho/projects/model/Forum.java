/* $Id$ */

package com.zoho.projects.model;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class is used to make an object for forum.
 * 
 * @author ramesh-2099
 *
 */

public class Forum
{
	
	private long id;
	private String name;
	private String content;
	private boolean isStickyPost;
	private boolean isAnnouncementPost;
	private String postedBy;
	private String postedPerson;
	private String postDate;
	private String postDateFormat;
	private long postDateLong;
	
	private String url;
	
	private long categoryId;
	private String notify;
	
	private ArrayList<File> uploadfile;
	
	
	
	/**
	 * Set the forum id.
	 * 
	 * @param id ID of the forum.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the forum id.
	 * 
	 * @return Returns the forum id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the forum name.
	 * 
	 * @param name Name of the forum.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the forum name.
	 * 
	 * @return Returns the forum name.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the content of the forum.
	 * 
	 * @param content Content of the forum.
	 */
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	/**
	 * Get the content of the forum.
	 * 
	 * @return Returns the content of the forum.
	 */
	
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Set the forum is a sticky post or not.
	 * 
	 * @param isStickyPost The forum is a sticky post or not.
	 */
	
	public void setIsStickyPost(boolean isStickyPost)
	{
		this.isStickyPost = isStickyPost;
	}
	
	/**
	 * Get the forum is a sticky post or not.
	 * 
	 * @return Returns true if the forum is sticky post else returns false.
	 */
	
	public boolean isStickyPost()
	{
		return isStickyPost;
	}
	
	/**
	 * Set is announcement post or not.
	 * 
	 * @param isAnnouncementPost The post is announcement or not.
	 */
	
	public void setIsAnnouncementPost(boolean isAnnouncementPost)
	{
		this.isAnnouncementPost = isAnnouncementPost;
	}
	
	/**
	 * Get is the post is announcement or not.
	 * 
	 * @return Returns true if the post is announcement else returns false.
	 */
	
	public boolean isAnnouncementPost()
	{
		return isAnnouncementPost;
	}
	
	/**
	 * Set the id of the posted person.
	 * 
	 * @param postedBy Posted person id.
	 */
	
	public void setPostedBy(String postedBy)
	{
		this.postedBy = postedBy;
	}
	
	/**
	 * Get the id of the posted person.
	 * 
	 * @return Returns the posted person id.
	 */
	
	public String getPostedBy()
	{
		return postedBy;
	}
	
	/**
	 * Set the posted person name.
	 * 
	 * @param postedPerson Posted person name.
	 */
	
	public void setPostedPerson(String postedPerson)
	{
		this.postedPerson = postedPerson;
	}
	
	/**
	 * Get the posted person name.
	 * 
	 * @return Returns the posted person name.
	 */
	
	public String getPostedPerson()
	{
		return postedPerson;
	}
	
	/**
	 * Set the post date of the forum.
	 * 
	 * @param postDate Post date of the forum.
	 */
	
	public void setPostDate(String postDate)
	{
		this.postDate = postDate;
	}
	
	/**
	 * Get the post date of the forum.
	 * 
	 * @return Returns the post date of the forum.
	 */
	
	public String getPostDate()
	{
		return postDate;
	}
	
	/**
	 * Set the post date format of the forum.
	 * 
	 * @param postDate Post date format of the forum.
	 */
	
	public void setPostDateFormat(String postDateFormat)
	{
		this.postDateFormat = postDateFormat;
	}
	
	/**
	 * Get the post date format of the forum.
	 * 
	 * @return Returns the post date format of the forum.
	 */
	
	public String getPostDateFormat()
	{
		return postDateFormat;
	}
	
	/**
	 * Set the post date long for the forum.
	 * 
	 * @param postDateLong Post date long for the forum.
	 */
	
	public void setPostDateLong(long postDateLong)
	{
		this.postDateLong = postDateLong;
	}
	
	/**
	 * Get the post date long for the forum.
	 * 
	 * @return Returns the post date long for the forum.
	 */
	
	public long getPostDateLong()
	{
		return postDateLong;
	}
	
	
	
	/**
	 * Set the forum URL.
	 * 
	 * @param url URL for the forum.
	 */
	
	public void setURL(String url)
	{
		this.url = url;
	}
	
	/**
	 * Get the forum URL.
	 * 
	 * @return Returns the forum URL.
	 */
	
	public String getURL()
	{
		return url;
	}
	
	
	
	/**
	 * Set the category id of the project.
	 * 
	 * @param categoryId ID of the project category.
	 */
	
	public void setCategoryId(long categoryId)
	{
		this.categoryId = categoryId;
	}
	
	/**
	 * Get the category id of the project.
	 * 
	 * @return Returns the project category id. 
	 */
	
	public long getCategoryId()
	{
		return categoryId;
	}
	
	/**
	 * Set the notify for the forum.
	 * 
	 * @param notify Notify for the forum.
	 */
	
	public void setNotify(String notify)
	{
		this.notify = notify;
	}
	
	/**
	 * Get the notify for the forum.
	 * 
	 * @return Returns the notify for the forum.
	 */
	
	public String getNotify()
	{
		return notify;
	}
	
	
	/**
	 * Set the upload file.
	 * 
	 * @param uploadfile ArrayList of Upload file for the forum.
	 */
	
	public void setUploadfile(ArrayList<File> uploadfile)
	{
		this.uploadfile = uploadfile;
	}
	
	/**
	 * Get the upload file.
	 * 
	 * @return Returns the ArrayList of upload file for the forum.
	 */
	
	public ArrayList<File> getUploadfile()
	{
		return uploadfile;
	}
	
	
	
	
	/**
	 * Convert the Forum object into HashMap object.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		if(name != null)
		{
			requestBody.put("name", name);
		}
		if(content != null)
		{
			requestBody.put("content", content);
		}
		if((Long)categoryId != null && categoryId > 0)
		{
			requestBody.put("category_id", categoryId);
		}
		if(notify != null)
		{
			requestBody.put("notify", notify);
		}
		
		
		return requestBody;
	}
	
	
}