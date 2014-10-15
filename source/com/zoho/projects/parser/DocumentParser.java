/* $Id$ */

package com.zoho.projects.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.projects.model.Document;
import com.zoho.projects.model.Folder;
import com.zoho.projects.model.Version;


/**
 * Parse the JSON response into respective objects.
 * 
 * @author ramesh-2099
 *
 */

public class DocumentParser
{
	
	
	/**
	 * Parse the JSON response and make it into List of Document object.
	 * 
	 * @param response This JSON response contains the details of a documents.
	 * 
	 * @return Returns List of Document object.
	 * 
	 * @throws JSONException
	 */
	
	public List<Document> getDocuments(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray documents = jsonObject.getJSONArray("documents");	//No I18N
		
		List<Document> documentList = new ArrayList<Document>(documents.length());
		
		for(int i = 0; i < documents.length(); i++)
		{
			JSONObject document = documents.getJSONObject(i);
			
			documentList.add(this.jsonToDocument(document));
		}
		
		return documentList;
	}
	
	/**
	 * Parse the JSON response and make it into Document object.
	 * 
	 * @param response This JSON response contains the details of a document.
	 * 
	 * @return Returns the Document object.
	 * 
	 * @throws JSONException
	 */
	
	public Document getDocument(String response)throws JSONException
	{
		
		JSONObject jsonObject = new JSONObject(response.trim());
		
		JSONArray documents = jsonObject.getJSONArray("documents");	//No I18N
		
		JSONObject document = documents.getJSONObject(0);
			
		
		return this.jsonToDocument(document);
	}
	
	/**
	 * Parse the JSONObject into Document object.
	 * 
	 * @param jsonObject JSONObject contains the details of the document.
	 * 
	 * @return Returns the Document object.
	 * 
	 * @throws JSONException
	 */
	
	public Document jsonToDocument(JSONObject jsonObject)throws JSONException
	{
		Document document = new Document();
		
		if(jsonObject.has("id"))
		{
			document.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("file_name"))
		{
			document.setFilename(jsonObject.getString("file_name"));
		}
		if(jsonObject.has("content_type"))
		{
			document.setContenttype(jsonObject.getString("content_type"));
		}
		
		if(jsonObject.has("versions"))
		{
			JSONArray versions = jsonObject.getJSONArray("versions");	//No I18N
			
			List<Version> versionList = new ArrayList<Version>(versions.length());
 			
			for(int i = 0; i < versions.length(); i++)
			{
				JSONObject version = versions.getJSONObject(i);
				
				versionList.add(this.jsonToVersion(version));
			}
			
			document.setVersions(versionList);
		}
		
		
		if(jsonObject.has("folder"))
		{
			JSONObject folder = jsonObject.getJSONObject("folder");	//No I18N
			
			document.setFolder(this.jsonToFolder(folder));
		}
		
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				document.setURL(link.getJSONObject("self").getString("url"));
			}
		}
		
		return document;
	}
	
	/**
	 * Parse the JSONObject into Version object.
	 * 
	 * @param jsonObject JSONObject contains the details of a version.
	 * 
	 * @return Returns the Version object.
	 * 
	 * @throws JSONException
	 */
	
	public Version jsonToVersion(JSONObject jsonObject)throws JSONException
	{
		Version version = new Version();
		
		if(jsonObject.has("id"))
		{
			version.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("uploaded_by"))
		{
			version.setUploadedBy(jsonObject.getString("uploaded_by"));
		}
		if(jsonObject.has("description"))
		{
			version.setDescription(jsonObject.getString("description"));
		}
		if(jsonObject.has("version"))
		{
			version.setVersion(jsonObject.getString("version"));
		}
		if(jsonObject.has("uploaded_on"))
		{
			version.setUploadedOn(jsonObject.getString("uploaded_on"));
		}
		if(jsonObject.has("file_size"))
		{
			version.setFileSize(jsonObject.getString("file_size"));
		}
		if(jsonObject.has("uploaded_date"))
		{
			version.setUploadedDate(jsonObject.getString("uploaded_date"));
		}
		if(jsonObject.has("uploaded_date_format"))
		{
			version.setUploadedDateFormat(jsonObject.getString("uploaded_date_format"));
		}
		if(jsonObject.has("uploaded_date_long"))
		{
			version.setUploadedDateLong(jsonObject.getLong("uploaded_date_long"));	//No I18N
		}
		
		return version;
	}
	
	/**
	 * Parse the JSONObject into Folder object.
	 * 
	 * @param jsonObject JSONObject contains the details of a folder.
	 * 
	 * @return Returns the Folder object.
	 * 
	 * @throws JSONException
	 */
	
	public Folder jsonToFolder(JSONObject jsonObject)throws JSONException
	{
		Folder folder = new Folder();
		
		if(jsonObject.has("id"))
		{
			folder.setId(jsonObject.getLong("id"));	//No I18N
		}
		if(jsonObject.has("name"))
		{
			folder.setName(jsonObject.getString("name"));
		}
		if(jsonObject.has("is_discussion"))
		{
			folder.setIsDicussion(jsonObject.getBoolean("is_discussion"));	//No I18N
		}
		
		if(jsonObject.has("link"))
		{
			JSONObject link = jsonObject.getJSONObject("link");	//No I18N
			
			if(link.has("self"))
			{
				folder.setURL(link.getJSONObject("self").getString("url"));
			}
		}
		
		return folder;
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
	
	public String getResult(String response)throws Exception
	{
		JSONObject jsonObject = new JSONObject(response.trim());
		
		String result = jsonObject.getString("response");
		
		return result;
		
	}
	
	
}