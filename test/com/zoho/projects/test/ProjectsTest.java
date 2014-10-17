/* $Id$ */

package com.zoho.projects.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.zoho.projects.api.BugsAPI;
import com.zoho.projects.api.DocumentsAPI;
import com.zoho.projects.api.EventsAPI;
import com.zoho.projects.api.FoldersAPI;
import com.zoho.projects.api.ForumsAPI;
import com.zoho.projects.api.MilestonesAPI;
import com.zoho.projects.api.PortalsAPI;
import com.zoho.projects.api.ProjectsAPI;
import com.zoho.projects.api.TasklistsAPI;
import com.zoho.projects.api.TasksAPI;
import com.zoho.projects.api.TimesheetsAPI;
import com.zoho.projects.api.UsersAPI;

import com.zoho.projects.exception.ProjectsException;

import com.zoho.projects.model.Activity;
import com.zoho.projects.model.Bug;
import com.zoho.projects.model.Buglog;
import com.zoho.projects.model.Category;
import com.zoho.projects.model.Comment;
import com.zoho.projects.model.Document;
import com.zoho.projects.model.Event;
import com.zoho.projects.model.Folder;
import com.zoho.projects.model.Forum;
import com.zoho.projects.model.Generallog;
import com.zoho.projects.model.Milestone;
import com.zoho.projects.model.Portal;
import com.zoho.projects.model.Project;
import com.zoho.projects.model.Status;
import com.zoho.projects.model.Task;
import com.zoho.projects.model.Tasklist;
import com.zoho.projects.model.Tasklog;
import com.zoho.projects.model.TimelogList;
import com.zoho.projects.model.User;
import com.zoho.projects.model.Customfield;
import com.zoho.projects.model.Defaultfield;

import com.zoho.projects.service.ZohoProjects;

public class ProjectsTest
{
	
		public static void main(String args[])throws Exception 
		{
			
			ZohoProjects zohoProjects = new ZohoProjects();
			zohoProjects.initialize("{auth_token}", "{portal_id}"); //No I18N
			
			PortalsAPI portalsAPI = zohoProjects.getPortalsAPI();
			
			ProjectsAPI projectsAPI = zohoProjects.getProjectsAPI();
			
			MilestonesAPI milestonesAPI = zohoProjects.getMilestonesAPI();
			
			TasklistsAPI tasklistsAPI = zohoProjects.getTasklistsAPI();
			
			TasksAPI tasksAPI = zohoProjects.getTasksAPI();
			
			EventsAPI eventsAPI = zohoProjects.getEventsAPI();
			
			FoldersAPI foldersAPI = zohoProjects.getFoldersAPI();
			
			DocumentsAPI documentsAPI = zohoProjects.getDocumentsAPI();
			
			UsersAPI usersAPI = zohoProjects.getUsersAPI();
			
			BugsAPI bugsAPI = zohoProjects.getBugsAPI();
			
			ForumsAPI forumsAPI = zohoProjects.getForumsAPI();
			
			TimesheetsAPI timesheetsAPI = zohoProjects.getTimesheetsAPI();
			
			
			HashMap<String, Object> queryMap = new HashMap<String, Object>();
			
			queryMap.put("status", "open");	//No I18N
			/*queryMap.put("range", 1);			//No I18N
			
			queryMap.put("flag", "internal");	//No I18N*/
			
			//queryMap.put("owner", "all");	//No I18N
			
			
			long ownerId = 19467566;
			
			//long categoryId = 592950000000015009L;
			
			long categoryId = 15000000000237L;
			
			try
			{
				
				
				List<Portal> portals = portalsAPI.getPortals();
				
				
				
				
				List<Project> projects = projectsAPI.getProjects(null);	//No I18N
				
				String projectId = String.valueOf(projects.get(1).getId());
				
				Project get = projectsAPI.get(projectId);
				
				Project create = projectsAPI.create(get);
				
				Project update = projectsAPI.update(get);
				
				String delete = projectsAPI.delete(projectId);	
				
				
				
				List<User> users = usersAPI.getUsers(projectId);
				
				
				
				List<Activity> activities = projectsAPI.getProjectActivities(projectId, queryMap);
				
				List<Status> getStatus = projectsAPI.getProjectStatuses(projectId, queryMap);
				
				Status addStatus = projectsAPI.addProjectStatus(projectId, getStatus.get(0));
				
				
				
				
				List<Milestone> milestones = milestonesAPI.getMilestones(projectId, null);
				
				String milestoneId = String.valueOf(milestones.get(0).getId());
				
				Milestone getMilestone = milestonesAPI.get(projectId, milestoneId);
				
				getMilestone.setFlag("internal");	//No I18N
				getMilestone.setOwnerId(ownerId);	//No I18N
				getMilestone.setStartDate("05-23-2014");	//No I18N
				getMilestone.setEndDate("05-31-2014");	//No I18N
				
				
				Milestone createMilestone = milestonesAPI.create(projectId, getMilestone);
				
				Milestone updateMilestone = milestonesAPI.update(projectId, getMilestone);
				
				Milestone updateStatus = milestonesAPI.updateStatus(projectId, milestoneId, 1); //No I18N
				
				String deleteMilestone = milestonesAPI.delete(projectId, String.valueOf(get.getId()));
				
				
				
				List<Tasklist> tasklists = tasklistsAPI.getTasklists(projectId, queryMap);
				
				Tasklist tasklist = tasklists.get(0);	//No I18N
				tasklist.setName("Model");	//No I18N
				tasklist.setFlag("internal");	//No I18N
				tasklist.setStatus("active");	//No I18N
				
				Tasklist createTasklist = tasklistsAPI.create(projectId, tasklist);
				
				Tasklist updateTasklist = tasklistsAPI.update(projectId, tasklist);
				
				String deleteTasklist = tasklistsAPI.delete(projectId, String.valueOf(update.getId()));
				
				
				
				
				List<Task> tasks = tasksAPI.getTasks(projectId, queryMap);
				
				String tasklistId = String.valueOf(tasks.get(1).getTasklist().getId());
				
				List<Task> tasklistTasks = tasksAPI.getTasklistTasks(projectId, tasklistId, null);
				
				String taskId = String.valueOf(tasklistTasks.get(0).getId());
				
				Task getTask = tasksAPI.get(projectId, taskId);
				
				Task task = tasks.get(0);
				
				task.setName("complete TasksAPI");	//No I18N
				task.setStartDate("05-14-2014");	//No I18N
				task.setEndDate("05-31-2014");	//No I18N
				
				
				Task createTask = tasksAPI.create(projectId, task);
				
				Task updateTask = tasksAPI.update(projectId, task);
				
				List<Task> getSubtasks = tasksAPI.getSubtasks(projectId, taskId, null); 
				
				Comment addComment = tasksAPI.addComment(projectId, taskId, "Test comment");	//No I18N
				
				List<Comment> getComments = tasksAPI.getComments(projectId, taskId, null);
				
				String deleteComment = tasksAPI.deleteComment(projectId, taskId, Long.toString(getComments.get(0).getId()));
				
				String deleteTask = tasksAPI.delete(projectId, String.valueOf(task.getId()));
				
				
				
				
				List<Event> events = eventsAPI.getEvents(projectId, queryMap);
				
				Event event = events.get(0);
				
				event.setTitle("Wrapper publish");	//No I18N
				event.setHour("2");	//No I18N
				event.setMinutes("30");	//No I18N
				event.setAMPM("pm");	//No I18N
				event.setScheduledOn("05-30-2014");	//No I18N
				
				Event add = eventsAPI.add(projectId, event);
				
				Event updateEvent = eventsAPI.update(projectId, event);
				
				String deleteEvent = eventsAPI.delete(projectId, String.valueOf(update.getId()));
				
				
				
				List<Folder> folders = foldersAPI.getFolders(projectId);
				
				long folderId = folders.get(0).getId();
				
				Folder folder = folders.get(0);
				
				folder.setName("Sample");	//No I18N
				
				Folder addFolder = foldersAPI.addFolder(projectId, folder);
				
				Folder updateFolder = foldersAPI.updateFolder(projectId, folder);
				
				String deleteFolder = foldersAPI.deleteFolder(projectId, String.valueOf(updateFolder.getId()));
				
				
				
				List<Document> documents = documentsAPI.getDocuments(projectId, null);
				
				String documentId = String.valueOf(documents.get(0).getId());
				
				Document getDocument = documentsAPI.get(projectId, documentId, null);
				
				ArrayList<File> uploaddoc = new ArrayList<File>();
				File file = new File("/home/likewise-open/ZOHOCORP/ramesh-2099/build_details.html");
				uploaddoc.add(file);
				uploaddoc.add(file);
				
				getDocument.setFolderId(folderId);	//No I18N
				getDocument.setDescription("File added");	//No I18N
				getDocument.setUploaddoc(uploaddoc);	//No I18N
				
				Document addDocument = documentsAPI.add(projectId, getDocument);
				
				Document updateDocument = documentsAPI.update(projectId, getDocument);
				
				String deleteDocument = documentsAPI.delete(projectId, documentId);
				
				
				
				List<Bug> bugs = bugsAPI.getBugs(projectId, null);	//No I18N
				
				String bugId = String.valueOf(bugs.get(0).getId());
				
				Bug getBug = bugsAPI.get(projectId, bugId);
				
				getBug.setTitle("milestone_id is not added but due_date is added bug request");	//No I18N
				getBug.setDescription("milestone_id parameter is not return in the response.");	//No I18N
				getBug.setDueDate("05-21-2014");	//No I18N
				
				Bug createBug = bugsAPI.create(projectId, getBug);
				
				Bug updateBug = bugsAPI.update(projectId, getBug);
				
				List<Customfield> customfields = bugsAPI.getCustomFields(projectId); 
				
				Defaultfield defaultField = bugsAPI.getDefaultFields(projectId);
				
				String deleteBug = bugsAPI.delete(projectId, bugId);
				
				
				
				
				List<Forum> forums = forumsAPI.getForums(projectId, null);
				
				String forumId = String.valueOf(forums.get(0).getId());
				
				Forum forum = forums.get(0);
				
				ArrayList<File> uploadFile = new ArrayList<File>();
				
				File file1 = new File("/home/likewise-open/ZOHOCORP/ramesh-2099/commit-msg.py");	//No I18N
				uploadFile.add(file1);
				uploadFile.add(file1);
				
				forum.setName("API Discussion");	//No I18N
				forum.setContent("Discuss about projects API wrappers");	//No I18N
				forum.setUploadfile(uploadFile);	//No I18N
				forum.setCategoryId(categoryId);	//No I18N
				
				Forum addForum = forumsAPI.add(projectId, forum);
				
				Forum updateForum = forumsAPI.update(projectId, forum);
				
				String deleteForum = forumsAPI.delete(projectId, String.valueOf(updateForum.getId()));
				
				
				
				
				List<Category> categories = forumsAPI.getCategories(projectId);
				
				Category category = categories.get(0);
				
				category.setName("API");	//No I18N
				
				Category addCategory = forumsAPI.addCategory(projectId, category);
				
				
				List<Comment> comments = forumsAPI.getComments(projectId, forumId, queryMap);
				
				Comment comment = comments.get(0);
				
				comment.setContent("URL changes not added in the document.");	//No I18N
				
				Comment addForumComment = forumsAPI.addComment(projectId, forumId, comment);
				
				
				
				queryMap.put("users_list", "all");	//No I18N
				queryMap.put("view_type", "month");	//No I18N
				queryMap.put("date", "06-17-2014");	//No I18N
				queryMap.put("bill_status", "Billable");	//No I18N
				queryMap.put("component_type", "task");	//No I18N
				
				TimelogList timeLogs = timesheetsAPI.getTimeLogs(projectId, queryMap);
				
				Tasklog tasklog = timeLogs.get(0).getTasklogs().get(0);
				
				tasklog.setDate("05-28-2014");	//No I18N
				
				Tasklog addTasklog = timesheetsAPI.addTasklog(projectId, tasklog);
				
				Tasklog updateTasklog = timesheetsAPI.updateTasklog(projectId, tasklog);
				
				String deleteTasklog = timesheetsAPI.deleteTasklog(projectId, String.valueOf(tasklog.getTaskId()), String.valueOf(tasklog.getId()));
				
				
				Buglog buglog = timeLogs.get(0).getBuglogs().get(0);
				
				buglog.setDate("05-28-2014");	//No I18N
				buglog.setBillStatus("Billable");	//No I18N
				
				Buglog addBuglog = timesheetsAPI.addBuglog(projectId, buglog);
				
				Buglog updateBuglog = timesheetsAPI.updateBuglog(projectId, buglog);
				
				String deleteBuglog = timesheetsAPI.deleteBuglog(projectId, String.valueOf(buglog.getBugId()), String.valueOf(buglog.getId()));
				
				
				
				Generallog generallog = timeLogs.get(0).getGenerallogs().get(0);
				
				generallog.setDate("05-28-2014");	//No I18N
				generallog.setBillStatus("Billable");	//No I18N
				generallog.setName("Complete API files");	//No I18N
				generallog.setHours(1);	//No I18N
				generallog.setNotes("ss");	//No I18N
				
				Generallog addGenerallog = timesheetsAPI.addGenerallog(projectId, generallog);
				
				Generallog updateGenerallog = timesheetsAPI.updateGenerallog(projectId, addGenerallog);
				
				String deleteGenerallog = timesheetsAPI.deleteGenerallog(projectId, String.valueOf(generallog.getId()));
				
				//System.out.println(bugs);
				
			}
			catch (ProjectsException pe) 
			{
				
				//System.out.println("Error Code : "+pe.getCode() + ",  Error Message : "+pe.getMessage());	//No I18N
			}
			
		}
	
}
