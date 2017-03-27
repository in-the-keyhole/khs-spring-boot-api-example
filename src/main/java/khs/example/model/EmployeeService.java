package khs.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Iterable<Employee> all() {
		return repository.findAll();
	}

	public Employee findEmployee(Long id) {
		return repository.findOne(id);
	}

	public Employee save(Employee employee) {
		
		return repository.save(employee);
	}
	
	public void delete(Employee employee) {
		repository.delete(employee);
	}
	
}
