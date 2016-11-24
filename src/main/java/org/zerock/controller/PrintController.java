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
import org.zerock.service.PrintService;
import org.zerock.domain.PrintVO;

@Controller
@RequestMapping("/print/*")
public class PrintController{
   private static final Logger logger = LoggerFactory.getLogger(PrintController.class);
   
   @Inject
   private PrintService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(PrintVO print, Model model)throws Exception{
      logger.info("register get .............");
   }
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(PrintVO print, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(print.toString());
      
      service.regist(print);
      
      //return "/member/success";
      rttr.addFlashAttribute("msg","success");
      return "redirect:/print/listAll";
   }
   
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll());
   }
   
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("printNum") int printNum, Model model) throws Exception{
	   model.addAttribute(service.read(printNum));
   }
   
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("printNum") int printNum, RedirectAttributes rttr)throws Exception{
	   service.remove(printNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/print/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int printNum,Model model)throws Exception{
	   model.addAttribute(service.read(printNum));
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(PrintVO print, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(print);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/print/listAll";
   }

}