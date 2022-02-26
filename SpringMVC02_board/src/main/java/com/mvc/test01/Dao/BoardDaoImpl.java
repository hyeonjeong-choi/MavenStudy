package com.mvc.test01.Dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.test01.Dto.BoardDto;

// @Repository : daoImple이 진짜 Repository 역할을 함

@Repository
public class BoardDaoImpl implements BoardDao {

	// dao와 DB가 연결하고 연결해제하는 시점을 관리하는 작업
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardDto> selectList() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		
		try 
		{
			// list 변수를 만들어 이 list를 board-mapper의 selectList와 매핑
			list = sqlSession.selectList(NAMESPACE+"selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;	// biz가 받아 controller로 리턴 넘겨줌
	}

	@Override
	public BoardDto selectOne(int bd_no) {
		BoardDto dto = null;
		
		try 
		{
			dto = sqlSession.selectOne(NAMESPACE+"selectOne", bd_no);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}

	@Override
	public int insert(BoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
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
