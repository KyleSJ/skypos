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
import org.zerock.service.OrderGoodsService;
import org.zerock.domain.OrderGoodsVO;

@Controller
@RequestMapping("/ordergoods/*")
public class OrderGoodsController{
   private static final Logger logger = LoggerFactory.getLogger(OrderGoodsController.class);
   
   @Inject
   private OrderGoodsService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(OrderGoodsVO orderGoods, Model model)throws Exception{
      logger.info("register get .............");
   }
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(OrderGoodsVO orderGoods, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(orderGoods.toString());
      
      service.regist(orderGoods);
      
      //return "/member/success";
      rttr.addFlashAttribute("msg","success");
      return "redirect:/ordergoods/listAll";
   }
   
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll());
   }
   
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("orderGoodsNum") int orderGoodsNum, Model model) throws Exception{
	   model.addAttribute(service.read(orderGoodsNum));
   }
   
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("orderGoodsNum") int orderGoodsNum, RedirectAttributes rttr)throws Exception{
	   service.remove(orderGoodsNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/ordergoods/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int orderGoodsNum,Model model)throws Exception{
	   model.addAttribute(service.read(orderGoodsNum));
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(OrderGoodsVO orderGoods, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(orderGoods);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/ordergoods/listAll";
   }

}