# ZohoProjects Java Client Library

The java library for integrating with ZohoProjects.

## Installation

### Maven users

Add the below dependency to your `pom.xml`:

	<dependency>
	  <groupId>com.zoho.projects</groupId>
	  <artifactId>projects-java</artifactId>
	  <version>1.0</version>
	</dependency>
	

# Documentation

[API Documentation](http://cms.zohocorp.com/export/zoho/projects/help/rest-api/portals-api.html)

# Usage


If you want to use all our zoho projects services API you should have a valid Zoho username, password and a valid authtoken.

How to generate your authtoken? [Refer Here](http://cms.zohocorp.com/export/zoho/projects/help/rest-api/get-tickets-api.html) 

If you have a valid authtoken, you are able to access our Zoho projects API wrappers. 

How to access our wrapper classes? Here is a sample example code for accessing Zoho Projects.

You have to import these classes:

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
		
Pass your authToken to create an instance for PortalsAPI.

You have two ways to create an instance for PortalsAPI. Here is the example code,

1) Pass your authToken and create a PortalsAPI instance:

			PortalsAPI portalsAPI = new PortalsAPI("{auth_token}");
			
2) Pass your authToken and portalId to create an instance for ZohoProjects and then get the instance for PortalsAPI:

			ZohoProjects zohoProjects = new ZohoProjects();
			zohoProjects.initialize("{auth_token}", "{portal_id}"); 
			
			PortalsAPI portalsAPI = zohoProjects.getPortalsAPI();
			
			
			HashMap queryMap = new HashMap();
			
			queryMap.put("status", "open");
			
			try
			{
			
## Get the list of portals:

- - -
			
If you want to get all your portals, you need to call the `getPortals()` method. It returns the List of Portal object.

				List<Portal> portals = portalsAPI.getPortals();
			
If you want to parse the portal id from the List of Portal object then you need to write your code as mentioned below:

				String portalId = portals.get(0).getId();
			
## Get the list of projects:

- - -

If you want to get all the projects from the portal, you need to call the `getProjects()` method by passing query string parameters.

				List<Project> projects = projectsAPI.getProjects(queryMap);
			
If you want to parse the project id from the List of Project object then you need to write your code as mentioned below:

				String projectId = String.valueOf(projects.get(0).getId());
			
## Get the details of a project:

- - -

If you want to get the details of project, you need to call the `get()` method by passing projectId.

				Project get = projectsAPI.get(projectId);
			
## Create a new project:

- - -

If you want to create a new project for the portal, you need to call the `create()` method by passing the Project object.

				Project project = new Project();
			
				project.setName("Test");
				project.setDescription("Test project");

				Project create = projectsAPI.create(project);
			
## Update the details of a project:

- - - 

If you want to update the project details of a portal, you need to fetch the project details by calling the `get()` method.

If you want update the name of the project then you need to write your code as mentioned below:

				Project get = projectsAPI.get(projectId);
			
				get.setName("API");

				Project update = projectsAPI.update(get);
			
			
## Delete an existing project:

- - - 

If you want to delete an existing project for the portal, you need to call the `delete()` method by passing projectId.

				String delete = projectsAPI.delete(projectId);
			
			}
			
## Catch the exception:

- - -

When calling Zoho Projects API wrappers if there is any error then the respective class throws the ProjectsException. You need to catch the ProjectsException as mentioned below:
			
			catch(ProjectsException pe)
			{
			    	System.out.println("Code : "+ pe.getCode() +" Message : "+ pe.getMessage());
			}
			
			
		
		}
	
	}
	
See [Here](../../tree/master/test/com/zoho/projects/test) for full examples.
