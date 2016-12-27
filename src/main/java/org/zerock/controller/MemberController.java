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
import org.zerock.service.MemberService;
import org.zerock.domain.MemberVO;

@Controller
@RequestMapping("/member/*")
public class MemberController{
   private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
   
   @Inject
   private MemberService service;
   
   @RequestMapping("/")
   public String home()throws Exception{
      return "mainpage";
   }
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(MemberVO member, Model model)throws Exception{
      logger.info("register get .............");
   }
   
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(MemberVO member, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(member.toString());
      
      service.regist(member);
      
      //return "/member/success";
      rttr.addFlashAttribute("msg","success");
      return "redirect:/member/listAll";
   }
   
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	  // List<MemberVO> test = service.listAll();
	  //model.addAttribute("list",test);	   
	   model.addAttribute("list",service.listAll());
   }
   
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("posNum") int posNum, Model model) throws Exception{
	   model.addAttribute(service.read(posNum));
   }
   
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("posNum") int posNum, RedirectAttributes rttr)throws Exception{
	   service.remove(posNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/member/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int posNum,Model model)throws Exception{
	   model.addAttribute(service.read(posNum));
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(MemberVO member, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(member);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/member/read?posNum="+member.getPosNum();
   }
}