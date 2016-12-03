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
import org.zerock.service.GoodsService;
import org.zerock.domain.GoodsVO;

@Controller
@RequestMapping("/goods/*")
public class GoodsController{
   private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);
   
   @Inject
   private GoodsService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(GoodsVO goods, Model model)throws Exception{
      logger.info("register get .............");
   }
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(GoodsVO goods, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(goods.toString());
      
      service.regist(goods);
      
      //return "/member/success";
      rttr.addFlashAttribute("msg","success");
      return "redirect:/goods/listAll";
   }
   
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(@RequestParam("posNum") int posNum, Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll(posNum));
   }
   
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("goodsNum") int goodsNum, Model model) throws Exception{
	   model.addAttribute(service.read(goodsNum));
   }
   
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("goodsNum") int goodsNum, RedirectAttributes rttr)throws Exception{
	   service.remove(goodsNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/goods/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int goodsNum,Model model)throws Exception{
	   model.addAttribute(service.read(goodsNum));
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(GoodsVO goods, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(goods);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/goods/listAll";
   }

}