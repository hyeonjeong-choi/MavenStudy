package com.mvc.test01;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.test01.Biz.BoardBiz;
import com.mvc.test01.Dto.BoardDto;

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
	
	// 게시판 목록 출력
	@RequestMapping("/list.do")
	public String home(Model model) {
		logger.info("MAIN PAGE");
		
		//BoardBiz biz = sqlSession.getMapper(BoardBiz.class);
		
		model.addAttribute("list", biz.selectList());
		
		return "main";
	}
	
	// 게시글 상세 페이지
	@RequestMapping("/one.do")
	public String one(Model model, int bd_no) {
		// ond.do 실행될 때 콘솔창에 'SELECT ONE' 출력
		logger.info("SELECT ONE");
		
		// biz의 selectOne() 메소드를 통해서 dto 가져옴
		model.addAttribute("dto", biz.selectOne(bd_no));
		
		// selectone.jsp로 리턴
		return "selectone";
	}
	
	// 게시글 쓰기 페이지
	@RequestMapping("/insert.do")
	public String insert() {
		logger.info("INSERT PAGE");
		return "insert";
	}
	
	// 게시글 insert
	@RequestMapping("/bdinsert.do")
	public String insertBoard(BoardDto dto) {
		logger.info("INSERT");
		
		int res = biz.insert(dto);
		
		if(res>0) {
			return "redirect:list.do";
		} else {
			return "redirect:insert.do";
		}
	}
}
