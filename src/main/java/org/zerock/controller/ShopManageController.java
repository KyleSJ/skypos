package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.service.EmployeeService;
import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.CalendarVO;
import org.zerock.domain.PrintVO;
import org.zerock.service.CalcuChngRecService;
import org.zerock.domain.EmployeeVO;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
@Controller
@RequestMapping("/shopmanage/")
public class ShopManageController{

	@Inject
	private CalcuChngRecService calcuchngrecservice;
	
	private static final Logger logger = LoggerFactory.getLogger(ShopManageController.class);
   
	@RequestMapping(value="/shop_main",method=RequestMethod.GET)
	public void shop_main( Model model)throws Exception{
	}
	

	@RequestMapping(value="/statistics",method=RequestMethod.GET)
	public String statistic(@RequestParam("posNum") int posNum,Model model)throws Exception{
		System.out.println("통계페이지로 넘어오는 포스 값 : "+posNum);
		
		ArrayList<CalendarVO> calendar = new ArrayList<CalendarVO>();
		calendar=(ArrayList<CalendarVO>)calcuchngrecservice.CalendarlistAll(posNum);
		
		System.out.println("calendar 사이즈는 : " + calendar.size());
		
		for(int i=0; i<calendar.size(); i++){
			calendar.get(i).setTitle("총 매출 "+ calendar.get(i).getTitle() + " 원 ");  
		}
		Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		String test=gson.toJson(calendar);
		System.out.println(test.toString());
		
		model.addAttribute("object",test);
		/*ArrayList<CalcuChngRecVO> CCRlist = new ArrayList<CalcuChngRecVO>();

		CCRlist=(ArrayList<CalcuChngRecVO>)calcuchngrecservice.listAll();
		System.out.println(CCRlist.toString());
		
		Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		String test=gson.toJson(CCRlist);
		
		CalcuChngRecVO[] CCRobj=gson.fromJson(test, CalcuChngRecVO[].class);
		
		model.addAttribute("object",test);
		
		for(int i=0; i<CCRobj.length; i++){
		model.addAttribute("title", CCRobj);
		model.addAttribute("start", CCRobj[i].getCalcuChngDay());
		System.out.println(CCRobj[i].getMoneySales());
		System.out.println(CCRobj[i].getCalcuChngDay());
		}*/
	   
		return "/shopmanage/statistics";
	}
   
}