package com.spring.member.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.spring.member.member.vo.MemberVO;

public interface MemberService {
	public List listMembers() throws DataAccessException;
	public int addMember(MemberVO memberVO) throws DataAccessException;
	public int removeMember(String id) throws DataAccessException;
	public int modMember(MemberVO memberVO) throws DataAccessException;
	public MemberVO selectMemberById(String id);
	
	public MemberVO login(MemberVO memberVO) throws Exception;
	
}
