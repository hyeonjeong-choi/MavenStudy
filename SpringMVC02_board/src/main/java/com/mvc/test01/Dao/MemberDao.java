package com.mvc.test01.Dao;

import com.mvc.test01.Dto.MemberDto;

public interface MemberDao {
	String NAMESPACE = "mymember.";
	
	//�α���
	public MemberDto login(MemberDto dto);
}
