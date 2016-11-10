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
import org.zerock.service.CardCompaService;
import org.zerock.domain.CardCompaVO;

@Controller
@RequestMapping("/cardcompa/*")
public class CardCompaController{
   private static final Logger logger = LoggerFactory.getLogger(CardCompaController.class);
   
   @Inject
   private CardCompaService service;
   
   @RequestMapping("/")
   public String home()throws Exception{
      return "mainpage";
   }
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(CardCompaVO cardcompa, Model model)throws Exception{
      logger.info("register get .............");
   }
   //DB Register
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(CardCompaVO cardcompa, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(cardcompa.toString());
      
      service.regist(cardcompa);
      
      rttr.addFlashAttribute("msg","success");
      return "redirect:/cardcompa/listAll";
   }
   
   //DB의 정보를 List 형식으로 보여주기
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	  // List<CardCompaVO> test = service.listAll();
	  //model.addAttribute("list",test);
	   model.addAttribute("list",service.listAll());
   }
   
   //DB의 정보를 읽어오기
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("posNum") int cardCompaNum, Model model) throws Exception{
	   model.addAttribute(service.read(cardCompaNum));
   }
   
   //DB의 정보를 삭제
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("cardCompaNum") int cardCompaNum, RedirectAttributes rttr)throws Exception{
	   service.remove(cardCompaNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/cardcompa/listAll";
   }
   
   //DB 정보 수정 페이지의 조회 화면 보여줌
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int cardCompaNum,Model model)throws Exception{
	   model.addAttribute(service.read(cardCompaNum));
   }
   
   //DB 정보 수정 후 완료 되면 list 화면으로 보여줌
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(CardCompaVO cardcompa, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(cardcompa);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/cardcompa/listAll";
   }
}