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
import org.zerock.service.SeattableService;
import org.zerock.domain.SeattableVO;

@Controller
@RequestMapping("/seattable/*")
public class SeattableController{
   private static final Logger logger = LoggerFactory.getLogger(SeattableController.class);
   
   @Inject
   private SeattableService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(SeattableVO table, Model model)throws Exception{
      logger.info("register get .............");
   }
   //DB 등록
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(SeattableVO table, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(table.toString());
      
      service.regist(table);

      rttr.addFlashAttribute("msg","success");
      return "/shopmanage/shop_main";
   }
   //DB 정보 list형식으로 불러오기
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(@RequestParam("posNum") int posNum, Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll(posNum));
   }
   //DB 읽어오기
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("tableNum") int tableNum, Model model) throws Exception{
	   model.addAttribute(service.read(tableNum));
   }
   //DB 삭제
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("tableNum") int tableNum, RedirectAttributes rttr)throws Exception{
	   service.remove(tableNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/seattable/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int tableNum,Model model)throws Exception{
	   model.addAttribute(service.read(tableNum));
   }
   //DB 수정
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(SeattableVO table, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(table);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/seattable/listAll";
   }

}