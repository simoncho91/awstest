package com.example.demo.dao;

import java.util.ArrayList;

import com.example.demo.vo.BoardVO;

public interface BoardDAOService {
	public int selectBoardListCnt() throws Exception;
	public ArrayList<BoardVO> getTotalList() throws Exception;
}
