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

	/**
	 * @description
	 *
	 * @return String
	 *
	 * @method index
	 * @class QueteSpringDemarrageApplication
	 * @version 1.0
	 * @date samedi 12 oct. 2019
	 * @see
	 *
	 **/
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
	@ResponseBody // signifie que l'on va renvoyer la reponse qui est dans le coprs de la methode
	// et non vers une autre page
	public String index() {
		int numberOfDoctors = 5;
		String listeTOTO = "<FONT size='12pt' color='#5a98f7' face='Times New Roman'>" + "<ul>";
		for (int i = 1; i <= numberOfDoctors; i++) {
			listeTOTO += "<li><a href='/doctor/" + i + "'>Doctor " + i + " </a></li>";
		}
		listeTOTO += "</ul>" + "</FONT>";
		return listeTOTO;
	}

	/**
	 * @description
	 *
	 * @return String
	 *
	 * @method doctor1
	 * @class QueteSpringDemarrageApplication
	 * @version 1.0
	 * @date samedi 12 oct. 2019
	 * @see
	 *
	 **/
	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		String doctor1 = "<FONT size='20pt' color='#5a98f7' face='Times New Roman'>" + "William Hartnell"
				+ "<a href='/' title='William Hartnell'> accueil </a>" + "</FONT>";
		return doctor1;
	}

	/**
	 * @description
	 *
	 * @return String
	 *
	 * @method doctor2
	 * @class QueteSpringDemarrageApplication
	 * @version 1.0
	 * @date samedi 12 oct. 2019
	 * @see
	 *
	 **/
	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		String doctor2 = "<FONT size='20pt' color='#5a98f7' face='Times New Roman'>" + "Patrick Troughton"
				+ "<a href='/' title=Patrick Troughton> accueil </a>" + "</FONT>";
		return doctor2;
	}

	/**
	 * @description
	 *
	 * @return String
	 *
	 * @method doctor3
	 * @class QueteSpringDemarrageApplication
	 * @version 1.0
	 * @date samedi 12 oct. 2019
	 * @see
	 *
	 **/
	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		String doctor3 = "<FONT size='20pt' color='#5a98f7' face='Times New Roman'>" + "Jon Pertwee"
				+ "<a href='/' title='Jon Pertwee'> accueil </a>" + "</FONT>";
		return doctor3;
	}

	/**
	 * @description
	 *
	 * @return String
	 *
	 * @method doctor4
	 * @class QueteSpringDemarrageApplication
	 * @version 1.0
	 * @date samedi 12 oct. 2019
	 * @see
	 *
	 **/
	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		String doctor4 = "<FONT size='20pt' color='#5a98f7' face='Times New Roman'>" + "Tom Baker"
				+ "<a href='/' title='Tom Baker'> accueil </a>" + "</FONT>";
		return doctor4;
	}

	/**
	 * @description
	 *
	 * @return String
	 *
	 * @method doctor5
	 * @class QueteSpringDemarrageApplication
	 * @version 1.0
	 * @date samedi 12 oct. 2019
	 * @see
	 *
	 **/
	@RequestMapping("/doctor/5")
	@ResponseBody
	public String doctor5() {
		String doctor5 = "<FONT size='20pt' color='#5a98f7' face='Times New Roman'>" + "Peter Davison"
				+ "<a href='/' title='Peter Davison'> accueil </a>" + "</FONT>";
		return doctor5;
	}

}