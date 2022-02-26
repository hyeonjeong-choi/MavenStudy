package com.mvc.test01.Dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.test01.Dto.BoardDto;

// @Repository : daoImple�� ��¥ Repository ������ ��

@Repository
public class BoardDaoImpl implements BoardDao {

	// dao�� DB�� �����ϰ� ���������ϴ� ������ �����ϴ� �۾�
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardDto> selectList() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		
		try 
		{
			// list ������ ����� �� list�� board-mapper�� selectList�� ����
			list = sqlSession.selectList(NAMESPACE+"selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;	// biz�� �޾� controller�� ���� �Ѱ���
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
