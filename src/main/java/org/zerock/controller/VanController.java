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
import org.zerock.service.VanService;
import org.zerock.domain.VanVO;

@Controller
@RequestMapping("/van/*")
public class VanController{
   private static final Logger logger = LoggerFactory.getLogger(VanController.class);
   
   @Inject
   private VanService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(VanVO van, Model model)throws Exception{
      logger.info("register get .............");
   }
   //DB 등록
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(VanVO van, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(van.toString());
      
      service.regist(van);

      rttr.addFlashAttribute("msg","success");
      return "redirect:/van/listAll";
   }
   //DB 정보 list형식으로 불러오기
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll());
   }
   //DB 읽어오기
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("vanNum") int vanNum, Model model) throws Exception{
	   model.addAttribute(service.read(vanNum));
   }
   //DB 삭제
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("vanNum") int vanNum, RedirectAttributes rttr)throws Exception{
	   service.remove(vanNum);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/van/listAll";
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(int vanNum,Model model)throws Exception{
	   model.addAttribute(service.read(vanNum));
   }
   //DB 수정
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(VanVO van, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(van);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/van/listAll";
   }

}