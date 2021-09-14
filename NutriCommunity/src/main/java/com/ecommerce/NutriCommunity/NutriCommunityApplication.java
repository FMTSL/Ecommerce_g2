package com.ecommerce.NutriCommunity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class NutriCommunityApplication {
	
	@GetMapping
	public ModelAndView swaggerUI() {
		return new ModelAndView("redirect:/swagger-ui/");
	}

	public static void main(String[] args) {
		SpringApplication.run(NutriCommunityApplication.class, args);
	}

}
