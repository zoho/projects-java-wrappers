/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Category;
import com.zoho.projects.model.Comment;
import com.zoho.projects.model.Forum;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class ForumParser
{
	
	
	/**
	 * Parse the JSON response and make it into List of Forum object.
	 *  
	 * @param response This JSON response contains the details fo forums.
	 * 
	 * @return Returns List of Forum object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Forum> getForums(String response)throws JSONException 
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray forums = jsonObject.getJSONArray("forums");	//No I18N
		
		List<Forum> forumList = new ArrayList<Forum>(forums.length());
		
		for(int i = 0; i < forums.length(); i++)
		{
			JSONObject forum = forums.getJSONObject(i);
			
			forumList.add(this.jsonToForum(forum));
		}
		
		return forumList;
		
	}
	
	
	/**
	 * Parse the JSON response and make it into Forum object.
	 * 
	 * @param response This JSON response contains the details of a forum.
	 * 
	 * @return Returns the Forum object.
	 * 
	 * @throws JSONException
	 */
	
	public Forum getForum(String response)throws JSONException 
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray forums = jsonObject.getJSONArray("forums");	//No I18N
		
		JSONObject forum = forums.getJSONObject(0);
			
		return this.jsonToForum(forum);
		
	}
	
	/**
	 * Parse the JSONObject into Forum object.
	 * 
	 * @param jsonObject JSONObject contains the details of a forum.
	 * 
	 * @return Returns the Forum object.
	 * 
	 * @throws JSONException
	 */
	
	public Forum jsonToForum(JSONObject jsonObject)throws JSONException
	{
		Forum forum = new Forum();
		
		if(jsonObject.has("id"))
		{	
			forum.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("name"))
		{
			forum.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("content"))
		{
			forum.setContent(jsonObject.getString("content"));
		}
		if(jsonObject.has("is_sticky_post"))
		{
			forum.setIsStickyPost(jsonObject.getBoolean("is_sticky_post"));	//No I18N
		}
		if(jsonObject.has("is_announcement_post"))
		{
			forum.setIsAnnouncementPost(jsonObject.getBoolean("is_announcement_post"));	//No I18N
		}
		if(jsonObject.has("posted_by"))
		{
			forum.setPostedBy(jsonObject.getString("posted_by"));
		}
		if(jsonObject.has("posted_person"))
		{
			forum.setPostedPerson(jsonObject.getString("posted_person"));
		}
		if(jsonObject.has("post_date"))
		{
			forum.setPostDate(jsonObject.getString("post_date"));
		}
		if(jsonObject.has("post_date_format"))
		{
			forum.setPostDateFormat(jsonObject.getString("post_date_format"));
		}
		if(jsonObject.has("post_date_long"))
		{
			forum.setPostDateLong(jsonObject.getLong("post_date_long"));	//No I18N
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				forum.setURL(link.getJSONObject("self").getString("url"));
			}
		}
		
		return forum;
	}
	
	/**
	 * Parse the JSON response and get the success message.
	 * 
	 * @param response This JSON response contains the success message.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws JSONException
	 */
	
	public String getResult(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		String result = jsonObject.getString("response");
		
		return result;
	}
	
	
	/**
	 * Parse the JSON response and make it into List of Category object.
	 * 
	 * @param response This JSON response contains the details of categories.
	 * 
	 * @return Returns List of Category object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Category> getCategories(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray categories = jsonObject.getJSONArray("categories");	//No I18N
		
		List<Category> categoryList = new ArrayList<Category>(categories.length());
		
		for(int i = 0; i < categories.length(); i++)
		{
			JSONObject category = categories.getJSONObject(i);
			
			categoryList.add(this.jsonToCategory(category));
		}
		
		return categoryList;
	}
	
	/**
	 * Parse the JSON response and make it into Category object.
	 * 
	 * @param response This JSON response contains the details of a category.
	 * 
	 * @return Returns the Category object.
	 * 
	 * @throws JSONException
	 */
	
	public Category getCategory(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray categories = jsonObject.getJSONArray("categories");	//No I18N
		
		JSONObject category = categories.getJSONObject(0);
			
		return this.jsonToCategory(category);
	}
	
	/**
	 * Parse the JSONObject into Category object.
	 * 
	 * @param jsonObject JSONObject contains the details of a category.
	 * 
	 * @return Returns the Category object.
	 * 
	 * @throws JSONException
	 */
	
	public Category jsonToCategory(JSONObject jsonObject)throws JSONException
	{
		Category category = new Category();
		
		if(jsonObject.has("id"))
		{
			category.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("name"))
		{
			category.setName(jsonObject.getString("name"));
		}
		
		return category;
	}
	
	
	/**
	 * Parse the JSON response and make it into List of Comment object.
	 *  
	 * @param response This JSON response contains the details of comments.
	 * 
	 * @return Returns List of Comment object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Comment> getComments(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray comments = jsonObject.getJSONArray("comments");	//No I18N
			
		List<Comment> commentList = new ArrayList<Comment>();
		
		for(int i = 0; i < comments.length(); i++)
		{
			JSONObject comment = comments.getJSONObject(i);
			
			commentList.add(this.jsonToComment(comment));
		}
		
		return commentList;
	}
	
	
	/**
	 * Parse the JSON response and make it into Comment object.
	 * 
	 * @param response This JSON response contains the details of a comment.
	 * 
	 * @return Returns the Comment object.
	 * 
	 * @throws JSONException
	 */
	
	public Comment getComment(String response)throws JSONException
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray comments = jsonObject.getJSONArray("comments");	//No I18N
		
		JSONObject comment = comments.getJSONObject(0);
			
		return this.jsonToComment(comment);
	}
	
	/**
	 * Parse the JSONObject into Comment object.
	 * 
	 * @param jsonObject JSONObject contains the details of a comment.
	 * 
	 * @return Returns the Comment object.
	 * 
	 * @throws JSONException
	 */
	
	public Comment jsonToComment(JSONObject jsonObject)throws JSONException
	{
		Comment comment = new Comment();
		
		if(jsonObject.has("id"))
		{
			comment.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("content"))
		{
			comment.setContent(jsonObject.getString("content"));
		}
		if(jsonObject.has("posted_by"))
		{
			comment.setPostedBy(jsonObject.getString("posted_by"));
		}
		if(jsonObject.has("posted_person"))
		{
			comment.setPostedPerson(jsonObject.getString("posted_person"));
		}
		if(jsonObject.has("post_date"))
		{
			comment.setPostDate(jsonObject.getString("post_date"));
		}
		if(jsonObject.has("post_date_format"))
		{
			comment.setPostDateFormat(jsonObject.getString("post_date_format"));
		}
		if(jsonObject.has("post_date_long"))
		{
			comment.setPostDateLong(jsonObject.getLong("post_date_long"));	//No I18N
		}
		
		return comment;
	}
	
}
