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
import org.zerock.service.PayService;
import org.zerock.domain.PayVO;

@Controller
@RequestMapping("/pay/*")
public class PayController{
   private static final Logger logger = LoggerFactory.getLogger(PayController.class);
   
   @Inject
   private PayService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(PayVO pay, Model model)throws Exception{
      logger.info("register get .............");
   }
   //DB 등록
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(PayVO pay, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(pay.toString());
      
      service.regist(pay);

      rttr.addFlashAttribute("msg","success");
      return "redirect:/pay/listAll";
   }
   //DB 정보 list형식으로 불러오기
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll());
   }
   //DB 읽어오기
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("payNum") int payNum, Model model) throws Exception{
	   model.addAttribute(service.read(payNum));
   }
   //DB 삭제
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("payNum") int payNum, RedirectAttributes rttr)throws Exception{
	   service.remove(payNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/pay/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int payNum,Model model)throws Exception{
	   model.addAttribute(service.read(payNum));
   }
   //DB 수정
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(PayVO pay, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(pay);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/pay/listAll";
   }

}