package com.wildcodeschool.queteSpringDemarrage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class QueteSpringDemarrageApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueteSpringDemarrageApplication.class, args);
	}

//	@RequestMapping("/")
//	@ResponseBody
//	public String index() {
////		return "Greetings from Spring Boot!";
//		return "Greetings from <a href='https://spring.io/projects/spring-boot'>Spring Boot!</a>";
//	}
//	William Hartnell	
//	Patrick Troughton	
//	Jon Pertwee
//	Tom Baker
//	Peter Davison

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String listeDoctors = "<ul>" + "<li><a href=\"/doctor/1\">Doctor 1 </a></li>"
				+ "<li><a href=\"/doctor/2\">Doctor 2 </a></li>" + "<li><a href=\"/doctor/3\">Doctor 3 </a></li>"
				+ "<li><a href=\"/doctor/4\">Doctor 4 </a></li>" + "</ul>";
		return listeDoctors;
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
//		String doctor1 = "William Hartnell" + "</br><a href=\"/\" title=\"William Hartnell\">accueil</a>";
		String doctor1 = "William Hartnell" + "<a href=\"/\" title=\"William Hartnell\"> accueil </a>";
		return doctor1;
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
//		String doctor2 = "Patrick Troughton" + "</br><a href=\"/\">accueil</a>";
		String doctor2 = "Patrick Troughton" + "<a href=\"/\" title=Patrick Troughton> accueil </a>";
		return doctor2;
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		String doctor3 = "Jon Pertwee" + "<a href=\"/\" title=\"Jon Pertwee\"> accueil </a>";
		return doctor3;
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		String doctor4 = "Tom Baker" + "<a href=\"/\" title=\"Tom Baker\"> accueil </a>";
		return doctor4;
	}

	@RequestMapping("/doctor/5")
	@ResponseBody
	public String doctor5() {
		String doctor5 = "Peter Davison" + "<a href=\"/\" title=\"Peter Davison\"> accueil </a>";
		return doctor5;
	}

}