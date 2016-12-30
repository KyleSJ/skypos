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
import com.google.gson.GsonBuilder;



@Controller
@RequestMapping("/android/*")
public class AndroidCommunicationController{
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
		
		/*System.out.println("send 부분  "+ request.getParameter("empId"));
		System.out.println("send 부분  "+ request.getParameter("pwd"));
		System.out.println("send 부분  "+ request.getParameter("posNum"));
		
		String posnum = request.getParameter("posNum");
		String empid = request.getParameter("empId");
		String pwd = request.getParameter("pwd");*/
		
		//posNum에 맞는 DB정보를 주기 위해 client에서 posNum 받아오기
		String stringposNum = request.getParameter("posNum");
		System.out.println("send 맵핑에서의 포스넘은 = "+stringposNum.toString());
		int posNum = Integer.parseInt(stringposNum);
		
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
		
		seatlist=(ArrayList<SeattableVO>) seatservice.sendlistAll(posNum);		
		vanlist=(ArrayList<VanVO>) vanservice.sendlistAll(posNum);		
		memlist=(ArrayList<MemberVO>) memservice.sendlistAll(posNum);		
		emplist=(ArrayList<EmployeeVO>) empservice.sendlistAll(posNum);
		calcuchngreclist = (ArrayList<CalcuChngRecVO>) calcuchngrecservice.sendlistAll(posNum);
		cardcompalist = (ArrayList<CardCompaVO>) cardcompaservice.sendlistAll(posNum);
		extdevlist = (ArrayList<ExtdevVO>) extdevservice.sendlistAll(posNum);
		goodscatlist = (ArrayList<GoodsCatVO>) goodscatservice.sendlistAll(posNum);
		seattablecatlist = (ArrayList<SeattableCatVO>) seattablecatservice.sendlistAll(posNum);
		goodslist =  (ArrayList<GoodsVO>) goodsservice.sendlistAll(posNum);
		openlist = (ArrayList<OpenVO>) openservice.sendlistAll(posNum);
		printlist = (ArrayList<PrintVO>) printservice.sendlistAll(posNum);
		calculist = (ArrayList<CalcuVO>) calcuservice.sendlistAll(posNum);
		ordermenulist = (ArrayList<OrderMenuVO>) ordermenuservice.sendlistAll(posNum);
		ordergoodslist = (ArrayList<OrderGoodsVO>) ordergoodsservice.sendlistAll(posNum);
		cmplxpaylist = (ArrayList<CmplxPayVO>) cmplxpayservice.sendlistAll(posNum);
		paylist = (ArrayList<PayVO>) payservice.sendlistAll(posNum);
		
		
		ArrayList[] strArray={vanlist,calcuchngreclist,cardcompalist,extdevlist,goodscatlist,
				seattablecatlist,memlist,emplist,goodslist,openlist,printlist,calculist,seatlist,
				ordermenulist,ordergoodslist,cmplxpaylist,paylist};
		return strArray;
	}
	
	@RequestMapping("/receive")
	@ResponseBody
	public void andoridToServerreceive(HttpServletRequest request,EmployeeVO empvo, CalcuChngRecVO calcuchngrecvo, 
			CalcuVO calcuvo, CardCompaVO cardcompavo, CmplxPayVO cmplxpayvo,ExtdevVO extdevvo, GoodsCatVO goodscatvo, 
			GoodsVO goodsvo, MemberVO membervo, OpenVO openvo, OrderGoodsVO ordergoodsvo,OrderMenuVO ordermenuvo, 
			PayVO payvo, PrintVO printvo, SeattableCatVO seattablecatvo,SeattableVO seattablevo, VanVO vanvo) throws Exception{
		
		String van=request.getParameter("van");
		String calcuchngrec=request.getParameter("calcu_chng_rec");
		String cardcompa=request.getParameter("card_compa");
		String extdev=request.getParameter("ext_dev");
		String goodscat=request.getParameter("goods_cat");
		String tablecat=request.getParameter("table_cat");
		String bizclnt=request.getParameter("biz_clnt");
		String emp=request.getParameter("emp");
		String goods=request.getParameter("goods");
		String open=request.getParameter("open");
		String print=request.getParameter("print");
		String calcu=request.getParameter("calcu");
		String seattable=request.getParameter("seattable");
		String ordermenu=request.getParameter("ordermenu");
		String ordergoods=request.getParameter("order_goods");
		String cmplxpay=request.getParameter("cmplx_pay");
		String pay=request.getParameter("pay");				
		//posNum Attribute get
		String StringposNum=request.getParameter("posNum");
		int posNum=Integer.parseInt(StringposNum);		
		
		Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		
		VanVO[] Vobj=gson.fromJson(van, VanVO[].class);
		CalcuChngRecVO[] CCRobj=gson.fromJson(calcuchngrec, CalcuChngRecVO[].class);		
		CardCompaVO[] CCobj=gson.fromJson(cardcompa, CardCompaVO[].class);
		ExtdevVO[] EDobj=gson.fromJson(extdev, ExtdevVO[].class);
		GoodsCatVO[] GCobj=gson.fromJson(goodscat, GoodsCatVO[].class);
		SeattableCatVO[] STCobj=gson.fromJson(tablecat, SeattableCatVO[].class);
		MemberVO[] Mobj=gson.fromJson(bizclnt, MemberVO[].class);
		EmployeeVO[] Eobj=gson.fromJson(emp, EmployeeVO[].class);
		GoodsVO[] Gobj=gson.fromJson(goods, GoodsVO[].class);
		OpenVO[] Oobj=gson.fromJson(open, OpenVO[].class);
		PrintVO[] Printobj=gson.fromJson(print, PrintVO[].class);
		CalcuVO[] Cobj=gson.fromJson(calcu, CalcuVO[].class);
		SeattableVO[] STobj=gson.fromJson(seattable, SeattableVO[].class);
		OrderMenuVO[] OMobj=gson.fromJson(ordermenu, OrderMenuVO[].class);
		OrderGoodsVO[] OGobj=gson.fromJson(ordergoods, OrderGoodsVO[].class);
		CmplxPayVO[] CPobj=gson.fromJson(cmplxpay, CmplxPayVO[].class);
		PayVO[] Payobj=gson.fromJson(pay, PayVO[].class);
		
		for(int i=0;i<Vobj.length; i++){
			vanvo=Vobj[i];
			vanservice.UpdateInsert(vanvo);
		}
		for(int i=0;i<CCRobj.length; i++){
			//클라에서 받은 posNum set
			CCRobj[i].setPosNum(posNum);
			
			calcuchngrecvo=CCRobj[i];
			//String to Timestamp
			calcuchngrecvo.setClonecalcuChngTime(CCRobj[i].getClonecalcuChngTime());
			calcuchngrecvo.setClonebakTime(CCRobj[i].getClonebakTime());
			
			calcuchngrecservice.UpdateInsert(calcuchngrecvo);
		}
		for(int i=0;i<CCobj.length; i++){
			cardcompavo=CCobj[i];
			cardcompaservice.UpdateInsert(cardcompavo);
		}
		for(int i=0;i<EDobj.length ; i++){
			//클라에서 받은 posNum set
			EDobj[i].setPosNum(posNum);
			
			extdevvo=EDobj[i];
			extdevservice.UpdateInsert(extdevvo);
		}
		for(int i=0;i<GCobj.length; i++){
			//클라에서 받은 posNum set
			GCobj[i].setPosNum(posNum);
			
			goodscatvo=GCobj[i];
			goodscatservice.UpdateInsert(goodscatvo);
		}
		for(int i=0;i<STCobj.length; i++){
			//클라에서 받은 posNum set
			STCobj[i].setPosNum(posNum);
			
			seattablecatvo=STCobj[i];
			seattablecatservice.UpdateInsert(seattablecatvo);
		}
		for(int i=0;i<Mobj.length; i++){
			//클라에서 받은 posNum set
			Mobj[i].setPosNum(posNum);
			
			membervo=Mobj[i];
			memservice.UpdateInsert(membervo);
		}
		for(int i=0;i<Eobj.length; i++){
			//클라에서 받은 posNum set
			Eobj[i].setPosNum(posNum);
			
			empvo=Eobj[i];
			empservice.UpdateInsert(empvo);
		}
		for(int i=0;i<Gobj.length; i++){
			//클라에서 받은 posNum set
			Gobj[i].setPosNum(posNum);
			
			goodsvo=Gobj[i];
			goodsservice.UpdateInsert(goodsvo);
		}
		for(int i=0;i<Oobj.length; i++){
			//클라에서 받은 posNum set
			Oobj[i].setPosNum(posNum);
			
			openvo=Oobj[i];
			openservice.UpdateInsert(openvo);
		}
		for(int i=0;i<Printobj.length; i++){
			//클라에서 받은 posNum set
			Printobj[i].setPosNum(posNum);
			
			printvo=Printobj[i];
			printservice.UpdateInsert(printvo);
		}
		for(int i=0;i<Cobj.length; i++){
			//클라에서 받은 posNum set
			Cobj[i].setPosNum(posNum);
			
			calcuvo=Cobj[i];
			calcuservice.UpdateInsert(calcuvo);
		}
		for(int i=0;i<STobj.length; i++){
			//클라에서 받은 posNum set
			STobj[i].setPosNum(posNum);
			
			seattablevo=STobj[i];
			seatservice.UpdateInsert(seattablevo);
		}
		for(int i=0;i<OMobj.length; i++){
			//클라에서 받은 posNum set
			OMobj[i].setPosNum(posNum);
			
			ordermenuvo=OMobj[i];
			//String to Timestamp
			ordermenuvo.setCloneorderTime(OMobj[i].getCloneorderTime());
			ordermenuservice.UpdateInsert(ordermenuvo);
		}
		for(int i=0;i<OGobj.length; i++){
			//클라에서 받은 posNum set
			OGobj[i].setPosNum(posNum);
			
			ordergoodsvo=OGobj[i];
			ordergoodsservice.UpdateInsert(ordergoodsvo);
		}
		for(int i=0;i<CPobj.length; i++){
			//클라에서 받은 posNum set
			CPobj[i].setPosNum(posNum);
			
			cmplxpayvo=CPobj[i];
			//String to Timestamp
			cmplxpayvo.setClonepayTime(CPobj[i].getClonepayTime());
			cmplxpayservice.UpdateInsert(cmplxpayvo);
		}
		for(int i=0; i<Payobj.length; i++){
			//클라에서 받은 posNum set
			Payobj[i].setPosNum(posNum);
			
			payvo=Payobj[i];
			payservice.UpdateInsert(payvo);
		}
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public EmployeeVO andoridLogin(HttpServletRequest request,EmployeeVO vo,MemberVO memvo) throws Exception{	
		vo.setEmpId(request.getParameter("empId"));
		vo.setPosNum(Integer.parseInt(request.getParameter("posNum")));
		vo.setPwd(request.getParameter("pwd"));
		
		System.out.println(request.getParameter("empId"));
		System.out.println(request.getParameter("pwd"));
		System.out.println(request.getParameter("posNum"));
		
		memvo.setIP(request.getParameter("IP"));
		vo=empservice.login(vo);
		
		return vo;		
	}
}


