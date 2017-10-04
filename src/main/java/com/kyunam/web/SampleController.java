package com.kyunam.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/guest")
	public void forGuest() {
		log.info("guest");
	}
	@RequestMapping("/manager")
	public void forManager() {
		log.info("manager");
	}
}
