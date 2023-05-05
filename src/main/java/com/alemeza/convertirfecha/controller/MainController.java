package com.alemeza.convertirfecha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {
	@RequestMapping("/")
	public String bienvenida() {
		return  "index.jsp";
	}	
}
