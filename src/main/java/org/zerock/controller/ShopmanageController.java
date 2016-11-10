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


@Controller
@RequestMapping("/shopmanage/*")
public class ShopmanageController{
   private static final Logger logger = LoggerFactory.getLogger(ShopmanageController.class);

   
   @RequestMapping("/")
   public String home()throws Exception{
      return "/shopmanage/main";
   }
}
