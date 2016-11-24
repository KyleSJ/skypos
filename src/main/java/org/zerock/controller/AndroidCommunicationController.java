package org.zerock.controller;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.service.CalcuChngRecService;
import org.zerock.service.CalcuService;
import org.zerock.service.CardCompaService;
import org.zerock.service.CmplxPayService;
import org.zerock.service.EmployeeService;
import org.zerock.service.ExtdevService;
import org.zerock.service.GoodsCatService;
import org.zerock.service.GoodsService;
import org.zerock.service.MemberService;
import org.zerock.service.OpenService;
import org.zerock.service.OrderGoodsService;
import org.zerock.service.OrderMenuService;
import org.zerock.service.PayService;
import org.zerock.service.SeattableCatService;
import org.zerock.service.SeattableService;
import org.zerock.service.VanService;
import org.zerock.service.PrintService;
import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.CalcuVO;
import org.zerock.domain.CardCompaVO;
import org.zerock.domain.CmplxPayVO;
import org.zerock.domain.EmployeeVO;
import org.zerock.domain.ExtdevVO;
import org.zerock.domain.GoodsCatVO;
import org.zerock.domain.GoodsVO;
import org.zerock.domain.MemberVO;
import org.zerock.domain.OpenVO;
import org.zerock.domain.OrderGoodsVO;
import org.zerock.domain.OrderMenuVO;
import org.zerock.domain.PayVO;
import org.zerock.domain.PrintVO;
import org.zerock.domain.SeattableCatVO;
import org.zerock.domain.SeattableVO;
import org.zerock.domain.VanVO;

import com.google.gson.Gson;

@Controller
@RequestMapping("/android/*")
public class AndroidCommunicationController {
	@Inject
	private EmployeeService empservice;
	@Inject
	private VanService vanservice;
	@Inject
	private MemberService memservice;
	@Inject
	private SeattableService seatservice;
	@Inject
	private CalcuChngRecService calcuchngrecservice;
	@Inject
	private CalcuService calcuservice;
	@Inject
	private CardCompaService cardcompaservice;
	@Inject
	private CmplxPayService cmplxpayservice;
	@Inject
	private ExtdevService extdevservice;
	@Inject
	private GoodsCatService goodscatservice;
	@Inject
	private GoodsService goodsservice;
	@Inject
	private OpenService openservice;
	@Inject
	private OrderGoodsService ordergoodsservice;
	@Inject
	private OrderMenuService ordermenuservice;
	@Inject
	private PayService payservice;
	@Inject
	private PrintService printservice;
	@Inject
	private SeattableCatService seattablecatservice;
	
	@RequestMapping("/send")
	@ResponseBody
	public ArrayList[] androidToServerSend(HttpServletRequest request)throws Exception{
		/*ArrayList<EmployeeVO> list=new ArrayList<EmployeeVO>();
		list=service.Alldata();
		return list;*/
		
		ArrayList<EmployeeVO> emplist=new ArrayList<EmployeeVO>();
		ArrayList<VanVO> vanlist=new ArrayList<VanVO>();
		ArrayList<MemberVO> memlist=new ArrayList<MemberVO>();
		ArrayList<SeattableVO> seatlist=new ArrayList<SeattableVO>();
		ArrayList<CalcuChngRecVO> calcuchngreclist=new ArrayList<CalcuChngRecVO>();
		ArrayList<CalcuVO> calculist = new ArrayList<CalcuVO>();
		ArrayList<CardCompaVO> cardcompalist = new ArrayList<CardCompaVO>();
		ArrayList<CmplxPayVO> cmplxpaylist = new ArrayList<CmplxPayVO>();
		ArrayList<ExtdevVO> extdevlist = new ArrayList<ExtdevVO>();
		ArrayList<GoodsCatVO> goodscatlist = new ArrayList<GoodsCatVO>();
		ArrayList<GoodsVO> goodslist = new ArrayList<GoodsVO>();
		ArrayList<OpenVO> openlist = new ArrayList<OpenVO>();
		ArrayList<OrderGoodsVO> ordergoodslist = new ArrayList<OrderGoodsVO>();
		ArrayList<OrderMenuVO> ordermenulist = new ArrayList<OrderMenuVO>();
		ArrayList<PayVO> paylist = new ArrayList<PayVO>();
		ArrayList<PrintVO> printlist = new ArrayList<PrintVO>();
		ArrayList<SeattableCatVO> seattablecatlist = new ArrayList<SeattableCatVO>();
		
		
		seatlist=(ArrayList<SeattableVO>)seatservice.listAll();
		vanlist=(ArrayList<VanVO>) vanservice.listAll();
		memlist=(ArrayList<MemberVO>) memservice.listAll();
		emplist=empservice.Alldata();
		calcuchngreclist = (ArrayList<CalcuChngRecVO>) calcuchngrecservice.listAll();
		cardcompalist = (ArrayList<CardCompaVO>) cardcompaservice.listAll();
		extdevlist = (ArrayList<ExtdevVO>) extdevservice.listAll();
		goodscatlist = (ArrayList<GoodsCatVO>) goodscatservice.listAll();
		seattablecatlist = (ArrayList<SeattableCatVO>) seattablecatservice.listAll();
		goodslist = (ArrayList<GoodsVO>) goodsservice.listAll();
		openlist = (ArrayList<OpenVO>) openservice.listAll();
		printlist = (ArrayList<PrintVO>) printservice.listAll();
		calculist = (ArrayList<CalcuVO>) calcuservice.listAll();
		ordermenulist = (ArrayList<OrderMenuVO>) ordermenuservice.listAll();
		ordergoodslist = (ArrayList<OrderGoodsVO>) ordergoodsservice.listAll();
		cmplxpaylist = (ArrayList<CmplxPayVO>) cmplxpayservice.listAll();
		paylist = (ArrayList<PayVO>) payservice.listAll();
		
		ArrayList[] strArray={vanlist,calcuchngreclist,cardcompalist,extdevlist,goodscatlist,
				seattablecatlist,memlist,emplist,goodslist,openlist,printlist,calculist,seatlist,
				ordermenulist,ordergoodslist,cmplxpaylist,paylist};

		return strArray;
	}
	
	@RequestMapping("/receive")
	@ResponseBody
	public void andoridToServerreceive(HttpServletRequest request,EmployeeVO vo) throws Exception{
		//System.out.println(request.getParameter("title"));
		// 각 DB의 테이블마다 String으로 받아오게끔 설계해보자
		String a=request.getParameter("title");
		
		Gson gson=new Gson();
		Data[] test=gson.fromJson(a, Data[].class);
		//Data[].class 가 아닌 VO를 바로 받아서 해보자
		//for(int i=0; i<test.length; i++)
		
		System.out.println(test[0].getData1());
		System.out.println(test[0].getData2());
		System.out.println(test[1].getData1());
		System.out.println(test[1].getData2());
		vo.setEmpId(test[0].getData1());
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public EmployeeVO andoridLogin(HttpServletRequest request,EmployeeVO vo) throws Exception{	
		vo.setEmpId(request.getParameter("empId"));
		vo.setPosNum(Integer.parseInt(request.getParameter("posNum")));
		vo.setPwd(request.getParameter("pwd"));

		vo=empservice.login(vo);
		
		return vo;
	}
	
	public class Data{
		private String test1;
		private String test2;
		
		public String getData1() {
			return test1;
		}
		public String getData2(){
			return test2;
		}
	}
}


