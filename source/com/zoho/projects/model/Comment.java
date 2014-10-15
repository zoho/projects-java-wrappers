/* $Id$ */

package com.zoho.projects.model;

import java.util.HashMap;

/**
 * This class is used to make an object for comment.
 * 
 * @author ramesh-2099
 *
 */

public class Comment 
{
	
	private long id;
	private String content;
	private String createdTime;
	private String createdTimeFormat;
	private long createdTimeLong;
	private String addedBy;
	private String addedPerson;
	private String updatedBy;
	
	private String postedBy;
	private String postedPerson;
	private String postDate;
	private String postDateFormat;
	private long postDateLong;
	
	
	
	/**
	 * Set the comment id.
	 * 
	 * @param id ID of the comment.
	 */
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
	 * Get the comment id.
	 * 
	 * @return Returns the comment id.
	 */
	
	public long getId()
	{
		return id;
	}
	
	/**
	 * Set the comment content.
	 * 
	 * @param content Content for the comment.
	 */
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	/**
	 * Get the comment content.
	 * 
	 * @return Returns the content.
	 */
	
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Set the created time.
	 * 
	 * @param createdTime Created time for the comment.
	 */
	
	public void setCreatedTime(String createdTime)
	{
		this.createdTime = createdTime;
	}
	
	/**
	 * Get the created time.
	 * 
	 * @return Returns the created time.
	 */
	
	public String getCreatedTime()
	{
		return createdTime;
	}
	
	/**
	 * Set the created time format.
	 * 
	 * @param createdTime Created time format for the comment.
	 */
	
	public void setCreatedTimeFormat(String createdTimeFormat)
	{
		this.createdTimeFormat = createdTimeFormat;
	}
	
	/**
	 * Get the created time format.
	 * 
	 * @return Returns the created time format.
	 */
	
	public String getCreatedTimeFormat()
	{
		return createdTimeFormat;
	}
	
	/**
	 * Set the created time long.
	 * 
	 * @param createdTimeLong Created time long for the comment.
	 */
	
	public void setCreatedTimeLong(long createdTimeLong)
	{
		this.createdTimeLong = createdTimeLong;
	}
	
	/**
	 * Get the created time long.
	 * 
	 * @return Returns the created time long.
	 */
	
	public long getCreatedTimeLong()
	{
		return createdTimeLong;
	}
	
	/**
	 * Set the id for the comment added person.
	 * 
	 * @param addedBy ID of the comment added person.
	 */
	
	public void setAddedBy(String addedBy)
	{
		this.addedBy = addedBy;
	}
	
	/**
	 * Get the comment added person id.
	 * 
	 * @return Returns the comment added person id.
	 */
	
	public String getAddedBy()
	{
		return addedBy;
	}
	
	/**
	 * Set the comment added person.
	 * 
	 * @param addedPerson Comment added person.
	 */
	
	public void setAddedPerson(String addedPerson)
	{
		this.addedPerson = addedPerson;
	}
	
	/**
	 * Get the comment added person.
	 * 
	 * @return Returns the comment added person.
	 */
	
	public String getAddedPerson()
	{
		return addedPerson;
	}
	
	/**
	 * Set the comment updated person id.
	 * 
	 * @param updatedBy ID of the comment updated person.
	 */
	
	public void setUpdatedBy(String updatedBy)
	{
		this.updatedBy = updatedBy;
	}
	
	/**
	 * Get the comment updated person id.
	 * 
	 * @return Returns the comment updated person id.
	 */
	
	public String getUpdatedBy()
	{
		return updatedBy;
	}
	
	
	
	/**
	 * Set the comment posted person id.
	 * 
	 * @param postedBy Comment posted person id.
	 */
	
	public void setPostedBy(String postedBy)
	{
		this.postedBy = postedBy;
	}
	
	/**
	 * Get the comment posted person id.
	 * 
	 * @return Returns the comment posted person id.
	 */
	
	public String getPostedBy()
	{
		return postedBy;
	}
	
	/**
	 * Set the comment posted person id.
	 * 
	 * @param postedPerson Comment posted person id.
	 */
	
	public void setPostedPerson(String postedPerson)
	{
		this.postedPerson = postedPerson;
	}
	
	/**
	 * Get the comment posted person.
	 * 
	 * @return Returns the comment posted person. 
	 */
	
	public String getPostedPerson()
	{
		return postedPerson;
	}
	
	/**
	 * Set the comment posted date.
	 * 
	 * @param postDate Comment posted date.
	 */
	
	public void setPostDate(String postDate)
	{
		this.postDate = postDate;
	}
	
	/**
	 * Get the comment posted date.
	 * 
	 * @return Returns the comment posted date.
	 */
	
	public String getPostDate()
	{
		return postDate;
	}
	
	
	/**
	 * Set the comment posted date format.
	 * 
	 * @param postDate Comment posted date format.
	 */
	
	public void setPostDateFormat(String postDateFormat)
	{
		this.postDateFormat = postDateFormat;
	}
	
	/**
	 * Get the comment posted date format.
	 * 
	 * @return Returns the comment posted date format.
	 */
	
	public String getPostDateFormat()
	{
		return postDateFormat;
	}
	
	/**
	 * Set the comment posted date long.
	 * 
	 * @param postDateLong Comment posted date long.
	 */
	
	public void setPostDateLong(long postDateLong)
	{
		this.postDateLong = postDateLong;
	}
	
	/**
	 * Get the comment posted date long.
	 * 
	 * @return Returns the comment posted date long.
	 */
	
	public long getPostDateLong()
	{
		return postDateLong;
	}
	
	
	
	
	/**
	 * Convert the Comment object into HashMap object.
	 * 
	 * @return Returns the HashMap object.
	 */
	
	public HashMap<String, Object> toParamMAP()
	{
		HashMap<String, Object> requestBody = new HashMap<String, Object>();
		
		if(content != null)
		{
			requestBody.put("content", content);
		}
		
		return requestBody;
	}
}
