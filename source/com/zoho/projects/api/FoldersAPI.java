/* $Id$ */

package com.zoho.projects.api;

import java.util.List;

import com.zoho.projects.model.Folder;

import com.zoho.projects.parser.FolderParser;

import com.zoho.projects.util.ZohoHTTPClient;

/**
 * FoldersAPI is used to:
 * 
 * 	Get list of folder.
 * 
 * 	Add a folder.
 * 
 * 	Update the details of a folder.
 * 
 * 	Delete an existing folder.
 * 
 * @author ramesh-2099
 *
 */

public class FoldersAPI extends API
{
	
	public FoldersAPI(String authToken, String portalId)
	{
		super(authToken, portalId);
	}
	
	//FolderParser is used to parse the JSON response into respective objects.
	
	FolderParser folderParserr = new FolderParser();
	
	
	
	/**
	 * Get list of folders for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @return Returns list of Folder object.
	 * 
	 * @throws Exception
	 */
	
	public List<Folder> getFolders(String projectId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/folders/";	//No I18N
		
		String response = ZohoHTTPClient.get(url, getQueryMap());
		
		return folderParserr.getFolders(response);
	}
	
	/**
	 * Add a folder for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param folder Folder object.
	 * 
	 * @return Returns the Folder object.
	 * 
	 * @throws Exception
	 */
	
	public Folder addFolder(String projectId, Folder folder)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/folders/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(folder.toParamMAP()));
		
		return folderParserr.getFolder(response);
	}
	
	/**
	 * Update the details of a folder.
	 * 
	 * @param projectId ID of the project.
	 * 
	 * @param folder Folder object.
	 * 
	 * @return Returns the Folder object.
	 * 
	 * @throws Exception
	 */
	
	public Folder updateFolder(String projectId, Folder folder)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/folders/"+folder.getId()+"/";	//No I18N
		
		String response = ZohoHTTPClient.post(url, getQueryMap(folder.toParamMAP()));
		
		return folderParserr.getFolder(response);
	}
	
	/**
	 * Delete an existing folder for the project.
	 * 
	 * @param projectId ID of the project.
	 * 
 	 * @param folderId ID of the folder.
 	 * 
	 * @return Returns the String object.
	 * 
	 * @throws Exception
	 */
	
	public String deleteFolder(String projectId, String folderId)throws Exception
	{
		String url = getBaseURL()+"/projects/"+projectId+"/folders/"+folderId+"/";	//No I18N
		
		String response = ZohoHTTPClient.delete(url, getQueryMap());
		
		return folderParserr.getResult(response);
	}

}
