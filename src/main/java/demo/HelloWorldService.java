package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

	@RequestMapping("/hello")
	String hello(
			@RequestParam(value = "name", defaultValue = "Mundo") 
			String name) {
		return "Hola " + name;
	}

}
