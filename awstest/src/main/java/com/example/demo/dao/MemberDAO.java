package com.example.demo.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private static String namespace = "mapper.member";
	
	public boolean getLoginCheck(MemberVO vo) {
		boolean result = false;
		
		int cnt = sqlSession.selectOne(namespace + ".getLoginCheck", vo);
		
		if(cnt!=0) result = true;
		
		return result;
	}
}
