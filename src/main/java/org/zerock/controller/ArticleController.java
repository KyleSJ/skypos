package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.service.EmployeeService;
import org.zerock.service.MemberService;
import org.zerock.service.SeattableService;
import org.zerock.domain.EmployeeVO;
import org.zerock.domain.MemberVO;
import org.zerock.domain.SeattableVO;
import org.zerock.domain.VanVO;
import org.zerock.service.VanService;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Controller
public class ArticleController {
	@Inject
	private EmployeeService empservice;
	@Inject
	private VanService vanservice;
	@Inject
	private MemberService memservice;
	@Inject
	private SeattableService seatservice;
	
	@RequestMapping("/article")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/article/android")
	public void androidTestWithRequest1(HttpServletRequest request){
		System.out.println(request.getParameter("test"));
	}
	
	@RequestMapping("/article/android1")
	@ResponseBody
	public ArrayList[] androidTestWithRequest(HttpServletRequest request)throws Exception{
		/*ArrayList<EmployeeVO> list=new ArrayList<EmployeeVO>();
		list=service.Alldata();
		return list;*/
		
		ArrayList<EmployeeVO> emplist=new ArrayList<EmployeeVO>();
		ArrayList<VanVO> vanlist=new ArrayList<VanVO>();
		ArrayList<MemberVO> memlist=new ArrayList<MemberVO>();
		ArrayList<SeattableVO> seatlist=new ArrayList<SeattableVO>();
		
		seatlist=(ArrayList<SeattableVO>)seatservice.listAll();
		vanlist=(ArrayList<VanVO>) vanservice.listAll();
		memlist=(ArrayList<MemberVO>) memservice.listAll();
		emplist=empservice.Alldata();
		ArrayList[] strArray={vanlist,memlist,emplist,seatlist};

		return strArray;
	}
	
	@RequestMapping("/article/android2")
	@ResponseBody
	public EmployeeVO andoridTestWithRequestAndResponse(HttpServletRequest request,EmployeeVO vo) throws Exception{
		System.out.println(request.getParameter("title"));
		
		String a=request.getParameter("title");
		
		//array=a.split(",");
		//System.out.println(array);
		
		/*Gson gson=new Gson();
		Data[] test=gson.fromJson(a, Data[].class);
		System.out.println(test[0].getData1());
		System.out.println(test[0].getData2());
		System.out.println(test[1].getData1());
		System.out.println(test[1].getData2());
		vo.setEmpId(test[0].getData1());*/
		
		
		System.out.println(request.getParameter("posNum"));
		System.out.println(request.getParameter("empName"));
		System.out.println(request.getParameter("pwd"));
		
		
		vo.setEmpId(request.getParameter("empId"));
		vo.setPosNum(Integer.parseInt(request.getParameter("posNum")));
		vo.setPwd(request.getParameter("pwd"));

		vo=empservice.login(vo);
		
		return vo;
	}
	
	public class Data{
		private String test1;
		private String test2;
		
		public String getData1() {
			return test1;
		}
		public String getData2(){
			return test2;
		}
	}
}


