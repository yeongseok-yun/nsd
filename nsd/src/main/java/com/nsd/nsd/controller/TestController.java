package com.nsd.nsd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nsd.nsd.dto.ResponseDTO;
import com.nsd.nsd.dto.TestRequestBodyDTO;

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
	
	@GetMapping("paramTest")//localhost:8080/test/paramTest?val_ue=hello
	public String paramTestMethod(@RequestParam String val_ue) {
		return "param :" + val_ue;
	}
	@GetMapping("requestBodyTest")
	public String requestBodyTest(@RequestBody TestRequestBodyDTO param) {
		return "param 1 : " + param.getId() + ", param 2 :" + param.getMessage();
	}
	@GetMapping("testResponseBody")
	public ResponseDTO<String> testResponseBody(){
		List<String> list = new ArrayList<>();
		list.add("responseDTO test method");
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return response;
	}
	
}
