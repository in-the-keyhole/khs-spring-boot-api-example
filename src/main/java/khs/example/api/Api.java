package khs.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping(method = RequestMethod.POST, value = "/employeess", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Employee> createProject(@RequestBody Employee emp) {
		Employee employee = service.save(emp);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employeess", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Employee> updateProject(@RequestBody Employee emp) {
		Employee employee = service.save(emp);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employeess", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Boolean> deleteProject(@RequestBody Employee emp) {
		service.delete(emp);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

}
