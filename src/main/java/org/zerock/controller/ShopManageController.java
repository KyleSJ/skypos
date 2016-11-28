package org.zerock.controller;

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
import org.zerock.domain.EmployeeVO;

@Controller
@RequestMapping("/shopmanage/shop_main")
public class ShopManageController{
   private static final Logger logger = LoggerFactory.getLogger(ShopManageController.class);
   
   EmployeeService service;
   @Inject
   //private MemberService service;
   
   @RequestMapping(value="/shop_main",method=RequestMethod.GET)
   public String shop_main(@RequestParam("posNum") int posNum)throws Exception{
      return "shop_main";
   }
   
   @RequestMapping(value="/employee_manage",method=RequestMethod.GET)
   public void employee_manage(@RequestParam("posNum") int posNum , Model model) throws Exception{
	   model.addAttribute("list",service.listAll(posNum));
   }
   
   
}