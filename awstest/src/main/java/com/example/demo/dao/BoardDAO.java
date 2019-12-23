package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.BoardVO;

@Repository
public class BoardDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private static String namespace = "mapper.board";

	public int selectBoardListCnt() {

		int cnt = sqlSession.selectOne(namespace + ".getTotalCount");
			
		return cnt;
	}
	
	public ArrayList<BoardVO> getTotalList() {
		
		List<BoardVO> list = sqlSession.selectList(namespace + ".getTotalList");

		return (ArrayList<BoardVO>) list;
	}
}
