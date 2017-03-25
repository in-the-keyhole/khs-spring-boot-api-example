package khs.example;

import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/api.*"))
                .build();
    }
     
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Employee API Example")
                .description("A implementation of an API Gateway for Keyhole Labs Microservice Reference.")
                .contact(new Contact("Keyhole Software", "keyholesoftware.com", "asktheteam@keyholesoftware.com"))
                .version("2.0")
                .build();
    }
}
