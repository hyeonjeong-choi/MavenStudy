package com.mvc.test01;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.test01.Biz.BoardBiz;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	// logger�� ���� �ܼ�â�� �޼��尡 ����� ������ � �޼��尡 ����Ǵ��� �� �� �ֵ��� ��
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	*/
	
	/*
	 * @Autowired private BoardBiz biz;
	 */
	
	@Autowired 
	private BoardBiz biz;
	
	@RequestMapping("/list.do")
	public String home(Model model) {
		logger.info("MAIN PAGE");
		
		//BoardBiz biz = sqlSession.getMapper(BoardBiz.class);
		
		model.addAttribute("list", biz.selectList());
		
		return "main";
	}
	
	@RequestMapping("/one.do")
	public String one(Model model, int bd_no) {
		// ond.do ����� �� �ܼ�â�� 'SELECT ONE' ���
		logger.info("SELECT ONE");
		
		// biz�� selectOne() �޼ҵ带 ���ؼ� dto ������
		model.addAttribute("dto", biz.selectOne(bd_no));
		
		// selectone.jsp�� ����
		return "selectone";
	}
	
}
