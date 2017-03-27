package khs.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.keyholesoftware.apistats.EnableApiStatistics;
import com.keyholesoftware.publish.swagger.PublishSwagger;


@SpringBootApplication
@PublishSwagger
@EnableApiStatistics
public class EmployeesApp {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApp.class, args);
	}
}