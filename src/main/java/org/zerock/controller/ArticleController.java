package org.zerock.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ArticleController {
	
	@RequestMapping("/article")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/article/android")
	public void androidTestWithRequest1(HttpServletRequest request){
		System.out.println(request.getParameter("test"));
	}
	
	@RequestMapping("/article/android1")
	public void androidTestWithRequest(HttpServletRequest request){
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("memo"));
	}
	
	@RequestMapping("/article/android2")
	@ResponseBody
	public Map<String, String> andoridTestWithRequestAndResponse(HttpServletRequest request){
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("memo"));
		
		Map<String, String> result = new HashMap<String, String>();
		result.put("data1","메모1");
		result.put("data2","메모 2");
		return result;
		
	}
}
