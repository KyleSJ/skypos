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
   
	//shop_main.jsp 불러오기
	@RequestMapping(value="/shop_main",method=RequestMethod.GET)
		public void shop_main( Model model)throws Exception{
	}
	
	//통계버튼 누를 시 statistics.jsp에 json 전달
	@RequestMapping(value="/statistics",method=RequestMethod.GET)
	public String statistic(@RequestParam("posNum") int posNum,Model model)throws Exception{	
		
		ArrayList<CalendarVO> calendar = new ArrayList<CalendarVO>();
		calendar=(ArrayList<CalendarVO>)calcuchngrecservice.CalendarlistAll(posNum);
		
		System.out.println("calendar 사이즈는: " + calendar.size());
		
		for(int i=0; i<calendar.size(); i++){
			calendar.get(i).setTitle("총 매출 "+ calendar.get(i).getTitle() + " 원 ");  
		}
		Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		String test=gson.toJson(calendar);
		System.out.println(test.toString());
		
		model.addAttribute("object",test);
		return "/shopmanage/statistics";
	}
   
}