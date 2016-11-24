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
import org.zerock.service.SeattableCatService;
import org.zerock.domain.SeattableCatVO;

@Controller
@RequestMapping("/seattablecat/*")
public class SeattableCatController{
   private static final Logger logger = LoggerFactory.getLogger(SeattableCatController.class);
   
   @Inject
   private SeattableCatService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(SeattableCatVO tablecat, Model model)throws Exception{
      logger.info("register get .............");
   }
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(SeattableCatVO tablecat, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(tablecat.toString());
      
      service.regist(tablecat);
      
      //return "/member/success";
      rttr.addFlashAttribute("msg","success");
      return "redirect:/seattablecat/listAll";
   }
   
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll());
   }
   
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("tableCatNum") int tableCatNum, Model model) throws Exception{
	   model.addAttribute(service.read(tableCatNum));
   }
   
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("tableCatNum") int tableCatNum, RedirectAttributes rttr)throws Exception{
	   service.remove(tableCatNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/seattablecat/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int tableCatNum,Model model)throws Exception{
	   model.addAttribute(service.read(tableCatNum));
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(SeattableCatVO tablecat, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(tablecat);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/seattablecat/listAll";
   }

}