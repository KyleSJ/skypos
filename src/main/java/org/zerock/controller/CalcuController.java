package org.zerock.controller;

import java.sql.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.service.CalcuService;
import org.zerock.domain.CalcuVO;

@Controller
@RequestMapping("/calcu/*")
public class CalcuController{
   private static final Logger logger = LoggerFactory.getLogger(CalcuController.class);
   
   @Inject
   private CalcuService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(CalcuVO calcu, Model model)throws Exception{
      logger.info("register get .............");
   }
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(CalcuVO calcu, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(calcu.toString());
      
      service.regist(calcu);
      
      rttr.addFlashAttribute("msg","success");
      return "redirect:/calcu/listAll";
   }
   
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	  // List<CalcuVO> test = service.listAll();
	  //model.addAttribute("list",test);
	   model.addAttribute("list",service.listAll());
   }
   
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("calcuDay") Date calcuDay, Model model) throws Exception{
	   model.addAttribute(service.read(calcuDay));
   }
   
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("calcuDay") Date calcuDay, RedirectAttributes rttr)throws Exception{
	   service.remove(calcuDay);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/calcu/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(Date calcuDay,Model model)throws Exception{
	   model.addAttribute(service.read(calcuDay));
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(CalcuVO calcu, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(calcu);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/calcu/listAll";
   }
}