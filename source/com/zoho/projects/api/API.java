/* $Id$ */

package com.zoho.projects.api;

import java.util.HashMap;


/**
 * API is used to maintain the base URL and makes a query map using user's authToken and filters.
 * 
 * @author ramesh-2099
 *
 */

public class API
{
	
		public static String baseURL = "https://projectsapi.zoho.com/restapi";	//No I18N
		
		//public static String baseURL = "http://mani-1649.csez.zohocorpin.com:9090/restapi"; //No I18N
		
		protected String authToken;
		
		protected String portalId;
		
		
		/**
		 * Construct a new API using user's authToken and portalId.
		 * 
		 * @param authToken user's authToken.
		 * 
		 * @param portalId user's portalId.
		 */
		
		public API(String authToken, String portalId)
		{
			
			this.authToken = authToken;
			
			this.portalId = portalId;
			
		}
		
		
		
		/**
		 * Creates a query map using user's authToken.
		 * 
		 * @return Returns a HashMap.
		 * 
		 * @throws Exception
		 */
		
		public HashMap<String, Object> getQueryMap()throws Exception
		{
				
			HashMap<String, Object> queryMap = new HashMap<String, Object>();
			
			queryMap.put("authtoken", authToken);
			
			return queryMap;
			
		}
		
		
		/**
		 * Creates a query map using user's authToken and filters.
		 * 
		 * @param queryMap This queryMap contains the filters in the form of key-value pair.
		 * 
		 * @return Returns a HashMap.
		 * 
		 * @throws Exception
		 */
		
		public HashMap<String, Object> getQueryMap(HashMap<String, Object> queryMap)throws Exception
		{
			
			if(queryMap == null || queryMap.isEmpty())
			{
				queryMap = new HashMap<String, Object>();
			}
			
			queryMap.put("authtoken", authToken);
			
			return queryMap;
			
		}
		
		
		/**
		 * Get the base URL of the service.
		 * 
		 * @return Returns the base URL.
		 */
		
		public String getBaseURL()
		{
			
			return baseURL+"/portal/"+portalId;
			
		}
	
}