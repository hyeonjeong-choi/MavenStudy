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
	
	// logger를 통해 콘솔창에 메서드가 실행될 때마다 어떤 메서드가 실행되는지 알 수 있도록 함
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
		logger.info("Main Page");
		
		//BoardBiz biz = sqlSession.getMapper(BoardBiz.class);
		
		model.addAttribute("list", biz.selectList());
		
		return "main";
	}
	
}
