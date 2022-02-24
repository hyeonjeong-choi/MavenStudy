package com.test.maventest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("msg", "Hello World!");	// 데이터
		return "helloWorld"; // 리턴되는 jsp 파일명
	}
	
	@RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
	public String displayMessage(@PathVariable String msg, ModelMap model) {
		model.addAttribute("msg", msg);	// 데이터
		return "helloWorld";	// 리턴 파일명
	}
}

/*
/helloWorld/hello: 내부에서 생성한 메시지 전달
/displayMessage/{메시지}: 외부에서 받은 메시지를 그대로 전달(또는 가공도 할 수 있다)
*/
