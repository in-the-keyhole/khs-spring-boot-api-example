package khs.example.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import khs.example.model.Employee;
import khs.example.model.EmployeeService;

@RestController
@RequestMapping("/api")
public class Api {
	

	@Autowired
	EmployeeService service;
	
	
	@ApiOperation("value")
	@RequestMapping(method = RequestMethod.GET, value = "/employees/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Employee> employee(@PathVariable("id") Long id) {
		Employee employee = service.findEmployee(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@ApiOperation("value")
	@RequestMapping(method = RequestMethod.GET, value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Iterable<Employee>> employees() {
		Iterable<Employee> employees = service.all();
		return new ResponseEntity<Iterable<Employee>>(employees, HttpStatus.OK);
	}
	

	
//	@RequestMapping(method = RequestMethod.POST, value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<Resource<Project>> createProject(@RequestBody Project project) {
//		Resource<Project> createdProject = projectsClient.createProject(project);
//		return new ResponseEntity<Resource<Project>>(createdProject, HttpStatus.OK);
//	}
//
//	@RequestMapping(method = RequestMethod.PUT, value = "/projects/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<Resource<Project>> updateProject(@PathVariable("id") Long id, @RequestBody Project project) {
//		Resource<Project> updatedProject = projectsClient.updateProject(id, project);
//		return new ResponseEntity<Resource<Project>>(updatedProject, HttpStatus.OK);
//	}
//
//	@RequestMapping(method = RequestMethod.DELETE, value = "/projects/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<Object> deleteProject(@PathVariable("id") Long id) {
//		projectsClient.deleteProject(id);
//		return new ResponseEntity<Object>(HttpStatus.OK);
//	}
//
//	@RequestMapping(method = RequestMethod.GET, value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<Resources<Project>> projects(HttpServletRequest request) {
//		Resources<Project> projects = projectsClient.getProjects();
//		return new ResponseEntity<Resources<Project>>(projects, HttpStatus.OK);
//	}
//
//	@RequestMapping(method = RequestMethod.GET, value = "/projects/{id}/resources", produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<Resources<ProjectResource>> projectResources(@PathVariable("id") Long id) {
//		Resources<ProjectResource> resources = projectsClient.getProjectResources(id);
//		for (ProjectResource projectResource : resources) {
//			Employee employee = employeeService.findEmployee(projectResource.getEmployeeId());
//			projectResource.setEmployee(employee);
//		}
//		return new ResponseEntity<Resources<ProjectResource>>(resources, HttpStatus.OK);
//	}
//
//	@RequestMapping(method = RequestMethod.POST, value = "/projects/{id}/resources", produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<Resource<ProjectResource>> createProjectResource(@PathVariable("id") Long projectId, @RequestBody ProjectResource resource) {
//		Resource<ProjectResource> createdResource = projectsClient.createProjectResource(projectId, resource);
//		return new ResponseEntity<Resource<ProjectResource>>(createdResource, HttpStatus.OK);
//	}
//
//	@RequestMapping(method = RequestMethod.PUT, value = "/projects/{id}/resources/{resourceId}", produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<Resource<ProjectResource>> updateProjectResource(@PathVariable("id") Long projectId, @PathVariable("resourceId") Long resourceId, @RequestBody ProjectResource resource) {
//		Resource<ProjectResource> updatedResource = projectsClient.updateProjectResource(projectId, resourceId, resource);
//		return new ResponseEntity<Resource<ProjectResource>>(updatedResource, HttpStatus.OK);
//	}
//
//	@RequestMapping(method = RequestMethod.DELETE, value = "/projects/{projectId}/resources/{resourceId}", produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<ProjectResource> deleteProjectResource(@PathVariable("projectId") Long projectId, @PathVariable("resourceId") Long resourceId) {
//		projectsClient.deleteProjectResource(projectId, resourceId);
//		return new ResponseEntity<ProjectResource>(HttpStatus.OK);
//	}
}
