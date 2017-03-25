package khs.example.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author David Pitt
 */
@RepositoryRestResource
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
