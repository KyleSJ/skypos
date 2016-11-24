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
import org.zerock.service.ExtdevService;
import org.zerock.domain.ExtdevVO;

@Controller
@RequestMapping("/extdev/*")
public class ExtdevController{
   private static final Logger logger = LoggerFactory.getLogger(ExtdevController.class);
   
   @Inject
   private ExtdevService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(ExtdevVO extdev, Model model)throws Exception{
      logger.info("register get .............");
   }
   //DB Register
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(ExtdevVO extdev, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(extdev.toString());
      
      service.regist(extdev);
      
      rttr.addFlashAttribute("msg","success");
      return "redirect:/extdev/listAll";
   }
   
   //DB의 정보를 List 형식으로 보여주기
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(Model model)throws Exception{
	   logger.info("show all list...............");
	  // List<ExtdevVO> test = service.listAll();
	  //model.addAttribute("list",test);
	   model.addAttribute("list",service.listAll());
   }
   
   //DB의 정보를 읽어오기
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("devName") String devName, Model model) throws Exception{
	   model.addAttribute(service.read(devName));
   }
   
   //DB의 정보를 삭제
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("devName") String devName, RedirectAttributes rttr)throws Exception{
	   service.remove(devName);
	   
	   rttr.addFlashAttribute("msg","success");
	   
	   return "redirect:/extdev/listAll";
   }
   
   //DB 정보 수정 페이지의 조회 화면 보여줌
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(String devName,Model model)throws Exception{
	   model.addAttribute(service.read(devName));
   }
   
   //DB 정보 수정 후 완료 되면 list 화면으로 보여줌
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(ExtdevVO devName, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(devName);
	   rttr.addFlashAttribute("msg","SUCCESS");
	   
	   return "redirect:/extdev/listAll";
   }
}