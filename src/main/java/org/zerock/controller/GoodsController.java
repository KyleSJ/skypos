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
   //DB 등록
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(@RequestParam("posNum") int posNum,GoodsVO goods, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(goods.toString());
      service.regist(goods);

      rttr.addFlashAttribute("msg","success");
      return "redirect:/shopmanage/shop_main?posNum="+posNum;      
   }
   //DB 정보 list형식으로 불러오기
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(@RequestParam("posNum") int posNum, Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll(posNum));
   }
   //DB 읽어오기
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("goodsNum") int goodsNum,@RequestParam("posNum") int posNum,Model model) throws Exception{
	   model.addAttribute(service.read(goodsNum));
   }
   //DB 삭제
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("goodsNum") int goodsNum, @RequestParam("posNum") int posNum,RedirectAttributes rttr)throws Exception{
	   service.remove(goodsNum);
	   
	   rttr.addFlashAttribute("msg","removesuccess");
	   return "redirect:/shopmanage/shop_main?posNum="+posNum;
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int goodsNum,Model model)throws Exception{
	   model.addAttribute(service.read(goodsNum));
   }
   //DB 수정
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(@RequestParam("posNum") int posNum,GoodsVO goods, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(goods);
	   rttr.addFlashAttribute("msg","modifysuccess");
	   
	   return "redirect:/shopmanage/shop_main?posNum="+posNum;
   }

}