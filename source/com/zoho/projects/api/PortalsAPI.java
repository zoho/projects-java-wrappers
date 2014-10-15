/* $Id$ */

package com	.zoho.projects.api;


import java.util.List;

import com.zoho.projects.util.ZohoHTTPClient;

import com.zoho.projects.parser.PortalParser;

import com.zoho.projects.model.Portal;


/**
 * PortalsAPI is used to get list of portals.
 * 
 * @author ramesh-2099
 *
 */

public class PortalsAPI extends API
{
	
		/**
		 * Construct a new PortalsAPI using user's authTken.
		 * 
		 * @param authToken user's authToken.
		 */
	
		public PortalsAPI(String authToken)
		{
			super(authToken, "");
		}
		
		
		// Parse the JSON response into respective objects.
		
		PortalParser portalParser = new PortalParser();
		
		
		/**
		 * Get list of portals.
		 * 
		 * @return Returns list of Portal object.
		 * 
		 * @throws Exception
		 */
		
		public List<Portal> getPortals()throws Exception
		{
			
			String url = baseURL+"/portals/";	//No I18N
			
			String response = ZohoHTTPClient.get(url, getQueryMap());
			
			return portalParser.getPortals(response);
		}
		
	
}