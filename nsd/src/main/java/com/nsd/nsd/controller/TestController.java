package com.nsd.nsd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	@GetMapping("test01")//localhost:8080/test/test01
	public String testController() {
		return "welcome test controller";
	}
	
	@GetMapping("test/{id}")//localhost:8080/test/test/33
	public String testGetPath(@PathVariable(required = false)int id) {
		return "id : "+id;
	}
	//
	@GetMapping("paramTest")//localhost:8080/test/paramTest?val_ue=hello
	public String paramTestMethod(@RequestParam String val_ue) {
		return "param :" + val_ue;
	}
}
