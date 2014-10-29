# ZohoProjects Java Client Library

The Java library for integrating with the Zoho Projects API. Use this object-based Java wrapper to easily integrate Zoho Projects modules like portals, projects, milestones, tasklists, events etc. into your application.

## Installation

### Maven users

Add the below dependency to your `pom.xml`:

	<dependency>
	  <groupId>com.zoho.projects</groupId>
	  <artifactId>projects-java</artifactId>
	  <version>1.0</version>
	</dependency>
	

# Documentation

[API Reference](https://www.zoho.com/projects/help/rest-api/zohoprojectsapi.html)

# Usage


In order to access the Zoho Projects APIs, users need to have a valid Zoho account and a valid Auth Token.

## Sign up for a Zoho Account:

- - -

For setting up a Zoho account, access the Zoho Projects [Sign Up](https://www.zoho.com/projects/zp-signup.html) page and enter the requisite details - email address and password.
 
## Generate Auth Token:

- - -
 
To generate the Auth Token, you need to send an authentication request to Zoho Accounts in a prescribed URL format. [Refer here](https://www.zoho.com/projects/help/rest-api/get-tickets-api.html)

## **Java Wrappers - Sample**

## How to access the Zoho Projects APIs through Java wrapper classes?

- - -
 
Below is the sample code for accessing the Projects APIs through Java wrapper classes. Please import these classes:

        import com.zoho.projects.exception.ProjectsException;
	
        import com.zoho.projects.service.ZohoProjects;

        import com.zoho.projects.api.PortalsAPI;
        import com.zoho.projects.api.ProjectsAPI;

        import com.zoho.projects.model.Portal;
        import com.zoho.projects.model.Project;

        import java.util.HashMap;
	
        public class sample
        {
	
		public static void main(String args[])throws Exception
		{
		
Once you're done with importing the requisite classes, you'll have to proceed to create an instance of PortalsAPI.
		
## Create PortalsAPI instance:

- - -

Now there are two ways of creating an instance of PortalsAPI.

1) Pass the AuthToken and create a PortalsAPI instance. 

Sample code:

        		PortalsAPI portalsAPI = new PortalsAPI("{auth_token}");

2) Pass the AuthToken and PortalId to first create an instance of ZohoProjects, and then proceed to get the instance of PortalsAPI. 

Sample code:

			ZohoProjectszohoProjects = new ZohoProjects();
			zohoProjects.initialize("{auth_token}", "{portal_id}");
		 
			PortalsAPIportalsAPI = zohoProjects.getPortalsAPI();
		 
		 
			HashMap queryMap = new HashMap();
		 
			queryMap.put("status", "open");
		 
			try
			{
			
## List all Portals:

- - -
			
If you wish to get the list of all your Zoho Projects portals, you need to call the `getPortals()` method by passing query string parameters in the format below:

				List<Portal> portals = portalsAPI.getPortals();
 
It returns the List of Portal object as a response.

Similarly, if you wish to parse the portal id from the List of Portal objects, you need to send a request in the prescribed format below:

				String portalId = portals.get(0).getId();
			
## List all Projects:

- - -

If you wish to get the list of all projects from the portal, you need to call the `getProjects()` method by passing query string parameters in the format below:

				List<Project> projects = projectsAPI.getProjects(queryMap);
 
It returns the List of Project object as a response.
 
Similarly, if you wish to parse the project id from the List of Portal objects, you need to send a request in the format below:

				String projectId = String.valueOf(projects.get(0).getId());
			
## Get Project details:

- - -

In order to get the details of a project, you need to call the `get()` method by passing a projectId.
 
				Project get = projectsAPI.get(projectId);
			
## Create a new Project:

- - -

To create a new project for the specific portal, you need to call the `create()` method by passing the Project object.

				Project project = new Project();

				project.setName("Test");
				project.setDescription("Test project");

				Project create = projectsAPI.create(project);
			
## Update Project details:

- - - 

To update the project details of a particular portal, you need to first fetch the project info. This can be achieved by calling the `get()` method. You can then proceed to update the name of the project (for example) with the help of a sample code below:

				Project get = projectsAPI.get(projectId);

				get.setName("API");

				Project update = projectsAPI.update(get);
			
## Delete a Project:

- - - 

To delete an existing project of a particular portal, you need to call the `delete()` method and pass the projectid.

				String delete = projectsAPI.delete(projectId);
 
			}
			
## Catch Exceptions:

- - -

If there is any error encountered while calling the Java wrappers of Zoho Projects API, the respective class will throw the ProjectsException. Use the below mentioned code to catch the ProjectsException:

			catch(ProjectsException pe)
			{
				System.out.println("Code : "+ pe.getCode() +" Message : "+ pe.getMessage());
			}
 
        	}
        }
	
For a full set of examples, click [here](../../tree/master/test/com/zoho/projects/test).
