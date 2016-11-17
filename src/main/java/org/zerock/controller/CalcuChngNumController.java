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
import org.zerock.service.CalcuChngNumService;
import org.zerock.domain.CalcuChngNumVO;

@Controller
@RequestMapping("/calcuchngnum/*")
public class CalcuChngNumController{
   private static final Logger logger = LoggerFactory.getLogger(CalcuChngNumController.class);
   
   @Inject
   private CalcuChngNumService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(CalcuChngNumVO calcuChngNum, Model model)throws Exception{
      logger.info("register get .............");
   }
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(CalcuChngNumVO calcuChngNum, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(calcuChngNum.toString());
      
      service.regist(calcuChngNum);
      
      //return "/member/success";
      rttr.addFlashAttribute("msg","success");
      return "redirect:/calcuchngnum/listAll";
   }
   
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	  // List<CalcuChngNumVO> test = service.listAll();
	  //model.addAttribute("list",test);
	   model.addAttribute("list",service.listAll());
   }
   
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("calcuChngNum") int calcuChngNum, Model model) throws Exception{
	   model.addAttribute(service.read(calcuChngNum));
   }
   
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("calcuChngNum") int calcuChngNum, RedirectAttributes rttr)throws Exception{
	   service.remove(calcuChngNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/calcuchngnum/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int calcuChngNum,Model model)throws Exception{
	   model.addAttribute(service.read(calcuChngNum));
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(CalcuChngNumVO calcuChngNum, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(calcuChngNum);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/calcuchngnum/listAll";
   }
}