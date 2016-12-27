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
import org.zerock.service.GoodsCatService;
import org.zerock.domain.GoodsCatVO;

@Controller
@RequestMapping("/goodscat/*")
public class GoodsCatController{
   private static final Logger logger = LoggerFactory.getLogger(GoodsCatController.class);
   
   @Inject
   private GoodsCatService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(GoodsCatVO goodscat, Model model)throws Exception{
      logger.info("register get .............");
   }
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(@RequestParam("posNum") int posNum,GoodsCatVO goodscat, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(goodscat.toString());
      
      service.regist(goodscat);
      
      //return "/member/success";
      rttr.addFlashAttribute("msg","success");
      return "redirect:/shopmanage/shop_main?posNum="+posNum;
   }
   
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(@RequestParam("posNum") int posNum, Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll(posNum));
   }
   
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("goodsCatNum") int goodsCatNum, Model model) throws Exception{
	   model.addAttribute(service.read(goodsCatNum));
   }
   
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("goodsCatNum") int goodsCatNum,@RequestParam("posNum") int posNum, RedirectAttributes rttr)throws Exception{
	   service.remove(goodsCatNum);
	   
	   rttr.addFlashAttribute("msg","removesuccess");
	   
	   return "redirect:/shopmanage/shop_main?posNum="+posNum;
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int goodsCatNum,Model model)throws Exception{
	   model.addAttribute(service.read(goodsCatNum));
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(@RequestParam("posNum")int posNum,GoodsCatVO goodscat, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(goodscat);
	   rttr.addFlashAttribute("msg","modifysuccess");
	   
	   return "redirect:/shopmanage/shop_main?posNum="+posNum;
   }

}