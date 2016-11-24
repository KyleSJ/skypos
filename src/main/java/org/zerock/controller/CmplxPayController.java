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
import org.zerock.service.CmplxPayService;
import org.zerock.domain.CmplxPayVO;

@Controller
@RequestMapping("/cmplxpay/*")
public class CmplxPayController{
   private static final Logger logger = LoggerFactory.getLogger(CmplxPayController.class);
   
   @Inject
   private CmplxPayService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(CmplxPayVO cmplxpay, Model model)throws Exception{
      logger.info("register get .............");
   }
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(CmplxPayVO cmplxpay, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(cmplxpay.toString());
      
      service.regist(cmplxpay);
      
      //return "/member/success";
      rttr.addFlashAttribute("msg","success");
      return "redirect:/cmplxpay/listAll";
   }
   
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll());
   }
   
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("cmplxPayNum") int cmplxPayNum, Model model) throws Exception{
	   model.addAttribute(service.read(cmplxPayNum));
   }
   
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("cmplxPayNum") int cmplxPayNum, RedirectAttributes rttr)throws Exception{
	   service.remove(cmplxPayNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/cmplxpay/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int cmplxPayNum,Model model)throws Exception{
	   model.addAttribute(service.read(cmplxPayNum));
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(CmplxPayVO cmplxpay, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(cmplxpay);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/cmplxpay/listAll";
   }

}