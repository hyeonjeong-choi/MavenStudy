package com.mvc.test01.Biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.test01.Dao.MemberDao;
import com.mvc.test01.Dto.MemberDto;

@Service
public class MemberBizImpl implements MemberBiz {

	@Autowired
	private MemberDao dao;
	
	@Override
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}

}
