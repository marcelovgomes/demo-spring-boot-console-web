package demo.spring.boot.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoSpringBootConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootConsoleApplication.class, args);
		
		/* Step 1 (console application) - show a simple message in the console
		
		   System.out.println("A simple console application using Spring Boot!");
		 */
	}
}

/* Step 2 (web application) - create a microservice to show messages in the browser
 * 
 * Insert the dependency spring-boot-starter-web in POM.XML
 * 
 * <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>
   </dependency>
 * 
 * Create the microservice "MessageBrowse
 */

@RestController
class MessageBrowse {
	@RequestMapping("/hello")
	String hello() {
		return "Java says: Hello!";
	}

	@RequestMapping("/hello/{user}")
	String helloUser(@PathVariable String user) {
		return "Java says: Hello " + user + " !";
	}
}