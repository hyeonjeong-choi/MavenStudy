package com.mvc.test01.Biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.test01.Dao.BoardDao;
import com.mvc.test01.Dto.BoardDto;

// @Service : 이 bizImpl이 진짜 Service의 역할을 함

@Service
public class BoardBizImpl implements BoardBiz {
	
	@Autowired
	private BoardDao dao;
	

	@Override
	public List<BoardDto> selectList() {
		return dao.selectList();
	}

	@Override
	public BoardDto selectOne(int bd_no) {
		return dao.selectOne(bd_no);
	}

	@Override
	public int insert(BoardDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(BoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int bd_no) {
		// TODO Auto-generated method stub
		return 0;
	}

}
