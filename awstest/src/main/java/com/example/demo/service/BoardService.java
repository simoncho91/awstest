package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.vo.BoardVO;

public interface BoardService {
	int selectBoardListCnt() throws Exception;
	ArrayList<BoardVO> getTotalList();
}
