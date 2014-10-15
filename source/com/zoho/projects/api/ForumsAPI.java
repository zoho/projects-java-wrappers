/* $Id$ */

package com.zoho.projects.api;

import java.util.HashMap;
import java.util.List;

import com.zoho.projects.model.Category;
import com.zoho.projects.model.Comment;
import com.zoho.projects.model.Forum;
import com.zoho.projects.parser.ForumParser;
import com.zoho.projects.util.ZohoHTTPClient;


/**
 * ForumsAPI is used to:
 * 
 * 	Get list of forums.
 * 
 * 	Add a forum.
 * 
 * 	Update the details of a forum.
 * 
 * 	Delete an existing forum.
 * 
 * 	Get list of categories.
 * 
 * 	Add a category.
 * 
 * 	Get list of comments.
 * 
 * 	Add a comment.
 * 
 * @author ramesh-2099
 *
 */

public class ForumsAPI extends API
{
	
	
	/**
	 * Construct a new FoumsAPI using user's authToken and portalId.
	 * 
	 * @param authToken user's authToken.
	 * 
	 * @param portalId user's prtalId.
	 */
	
	public ForumsAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	
	//ForumParser is used to parse the JSON response into respective objects.
	
	ForumParser forumParser = new ForumParser();
	
	
	/**
	 * Get list of forum for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Forum object.
	 * 
	 * @throws Exception
	 */
	
	public List<Forum> getForums(String projectId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/forums/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return forumParser.getForums(response);
	}
	
	/**
	 * Add a forum for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param forum Forum object.
	 * 
	 * @return Returns the Forum object.
	 * 
	 * @throws Exception
	 */
	
	public Forum add(String projectId, Forum forum)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/forums/";	//No I18N
		
		HashMap<String, Object> fileBody = new HashMap<String, Object>();
		
		fileBody.put("uploadfile", forum.getUploadfile());
		
		String response = ZohoHTTPClient.post(url, getQueryMap(), forum.toParamMAP(), fileBody);
		
		return forumParser.getForum(response);
		
	}
	
	/**
	 * update the details of a forum.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param forum Forum object.
	 * 
	 * @return Returns the Forum object.
	 * 
	 * @throws Exception
	 */
	
	public Forum update(String projectId, Forum forum)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/forums/"+forum.getId()+"/";	//No I18N
		
		HashMap<String, Object> fileBody = new HashMap<String, Object>();
		
		fileBody.put("uploadfile", forum.getUploadfile());
		
		String response = ZohoHTTPClient.post(url, getQueryMap(), forum.toParamMAP(), fileBody);
		
		return forumParser.getForum(response);
		
	}
	
	/**
	 * Delete an existing forum for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param forumId ID of the forum.
	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String delete(String projectId, String forumId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/forums/"+forumId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return forumParser.getResult(response);
	}
	
	
	/**
	 * Get list of categories for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @return Returns list of Category object.
	 * 
	 * @throws Exception
	 */
	
	public List<Category> getCategories(String projectId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/categories/";	//No I18N
			
		String response = ZohoHTTPClient.get(url, getQueryMap());
		
		return forumParser.getCategories(response);
	}
	
	/**
	 * Add a category for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param category Category object.
	 * 
	 * @return Returns the Category object.
	 * 
	 * @throws Exception
	 */
	
	public Category addCategory(String projectId, Category category)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/categories/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(category.toParamMAP()));
		
		return forumParser.getCategory(response);
	}
	
	/**
	 * Get list of Comment for the forum.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param forumId ID of the forum.
	 * 
	 * @param queryMap This queryMap contains the filters in the form of key-value pair.
	 * 
	 * @return Returns list of Comment object.
	 * 
	 * @throws Exception
	 */
	
	public List<Comment> getComments(String projectId, String forumId, HashMap<String, Object> queryMap)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/forums/"+forumId+"/comments/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap(queryMap));
		
		return forumParser.getComments(response);
	}
	
	/**
	 * Add comment for the forum.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param forumId ID of the forum.
	 * 
	 * @param comment Comment object.
	 * 
	 * @return Returns the Comment object.
	 * 
	 * @throws Exception
	 */
	
	public Comment addComment(String projectId, String forumId, Comment comment)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/forums/"+forumId+"/comments/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(comment.toParamMAP()));
		
		return forumParser.getComment(response);
	}
	
}