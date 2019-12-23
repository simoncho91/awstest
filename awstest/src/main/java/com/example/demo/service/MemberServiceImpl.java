package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDAO;
import com.example.demo.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDao;
	
	@Override
	public boolean getLoginCheck(MemberVO vo) {
		return this.memberDao.getLoginCheck(vo);
	}
}
