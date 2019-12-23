package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDAO;
import com.example.demo.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public int selectBoardListCnt() throws Exception {
		return boardDAO.selectBoardListCnt();
	}

	@Override
	public ArrayList<BoardVO> getTotalList() {
		ArrayList<BoardVO> list = boardDAO.getTotalList();
		
		return list;
	}

}
