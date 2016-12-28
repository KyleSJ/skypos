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
import org.zerock.service.EmployeeService;
import org.zerock.domain.EmployeeVO;
import org.zerock.domain.MemberVO;

@Controller
@RequestMapping("/employee/*")
public class EmployeeController{
   private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
   
   @Inject
   private EmployeeService service;
   
   @RequestMapping(value="/register",method = RequestMethod.GET)
   public void registerGET(EmployeeVO employee, Model model)throws Exception{
      logger.info("register get .............");
   }
   //DB 등록
   @RequestMapping(value="/register",method=RequestMethod.POST)
   public String registPOST(EmployeeVO employee, RedirectAttributes rttr)throws Exception{
      logger.info("regist post...............");
      logger.info(employee.toString());
      
      //직원 활성화
      employee.setRetire(1);
      service.regist(employee);
      
      rttr.addFlashAttribute("msg","registersuccess");
      return "redirect:/shopmanage/shop_main?posNum="+employee.getPosNum();
   }
   //DB 정보 list형식으로 불러오기
   @RequestMapping(value="/listAll", method=RequestMethod.GET)
   public void listAll(@RequestParam("posNum") int posNum , Model model)throws Exception{
	   logger.info("show all list...............");
	   model.addAttribute("list",service.listAll(posNum));
   }
   //DB 읽어오기
   @RequestMapping(value="/read", method= RequestMethod.GET)
   public void read(@RequestParam("empId") String empId,@RequestParam("posNum") int posNum, Model model) throws Exception{
	   model.addAttribute(service.read(empId,posNum));
   }
   //DB 삭제
   @RequestMapping(value="/remove", method= RequestMethod.POST)
   public String remove(@RequestParam("empId") String empId,@RequestParam("posNum") int posNum, EmployeeVO employee, RedirectAttributes rttr)throws Exception{
	   service.remove(empId,posNum);
	   
	   rttr.addFlashAttribute("msg","employeeremovesuccess");
	   return "redirect:/shopmanage/shop_main?posNum="+employee.getPosNum();
   }
   
   @RequestMapping(value="/modify", method=RequestMethod.GET)
   public void modifyGET(@RequestParam("empId")String empId,@RequestParam("posNum")int posNum,Model model)throws Exception{
	   model.addAttribute(service.read(empId,posNum));
   }
   //DB 수정
   @RequestMapping(value="/modify", method=RequestMethod.POST)
   public String modifyPOST(EmployeeVO employee, RedirectAttributes rttr) throws Exception{
	   logger.info("mod post................");
	   
	   service.modify(employee);
	   rttr.addFlashAttribute("msg","modifysuccess");
	   
	   return "redirect:/shopmanage/shop_main?posNum="+employee.getPosNum();
   }
   //직원 활성화
   @RequestMapping(value="/restart", method=RequestMethod.POST)
   public String restart(EmployeeVO employee,RedirectAttributes rttr) throws Exception{
	   service.restart(employee);
	   rttr.addFlashAttribute("msg", "ReRegister");
	   return "redirect:/shopmanage/shop_main?posNum="+employee.getPosNum();
   }
}