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
import org.zerock.service.MemberService;
import org.zerock.domain.MemberVO;

@Controller
@RequestMapping("/shopmanage/*")
public class ShopManageController{
   private static final Logger logger = LoggerFactory.getLogger(ShopManageController.class);
   
   @Inject
   //private MemberService service;
   
   @RequestMapping("/shop_main")
   public String shop_main()throws Exception{
      return "/shopmanage/shop_main";
   }
   
   @RequestMapping("/employee_manage")
   public String employee_manage()throws Exception{
      return "/shopmanage/employee_manage";
   }
}