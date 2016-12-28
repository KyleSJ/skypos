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
   //DB 등록
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(CalcuVO calcu, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(calcu.toString());
      
      service.regist(calcu);
      
      rttr.addFlashAttribute("msg","success");
      return "redirect:/calcu/listAll";
   }
   //DB 정보를 list형식으로 보여주기
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll());
   }
   //DB 정보 불러오기
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("calcuDay") Date calcuDay, Model model) throws Exception{
	   model.addAttribute(service.read(calcuDay));
   }
   //DB 삭제
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
   //DB 수정
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(CalcuVO calcu, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(calcu);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/calcu/listAll";
   }
}