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
import org.zerock.service.OrderMenuService;
import org.zerock.domain.OrderMenuVO;

@Controller
@RequestMapping("/ordermenu/*")
public class OrderMenuController{
   private static final Logger logger = LoggerFactory.getLogger(OrderMenuController.class);
   
   @Inject
   private OrderMenuService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(OrderMenuVO ordermenu, Model model)throws Exception{
      logger.info("register get .............");
   }
   //DB 등록
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(OrderMenuVO ordermenu, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(ordermenu.toString());
      
      service.regist(ordermenu);

      rttr.addFlashAttribute("msg","success");
      return "redirect:/ordermenu/listAll";
   }
   //DB 정보 list형식으로 불러오기
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll());
   }
   //DB 읽어오기
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("orderNum") int orderNum, Model model) throws Exception{
	   model.addAttribute(service.read(orderNum));
   }
   //DB 삭제
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("orderNum") int orderNum, RedirectAttributes rttr)throws Exception{
	   service.remove(orderNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/ordermenu/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int orderNum,Model model)throws Exception{
	   model.addAttribute(service.read(orderNum));
   }
   //DB 수정
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(OrderMenuVO ordermenu, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(ordermenu);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/ordermenu/listAll";
   }

}