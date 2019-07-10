package com.example.webApp;

import org.springframework.http.HttpMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
	
@RequestMapping("/success")
@ResponseBody
public String success() {

	return "Success";
}

@RequestMapping("/hello")
public String hello(){
	return "hello";
	
}
}
