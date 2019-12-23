package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.BoardService;
import com.example.demo.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public ModelAndView board() throws Exception {
		ModelAndView mv = new ModelAndView();

		// 목록 갯수
		int totalCnt = this.boardService.selectBoardListCnt();
				
		// 목록
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		
		if(totalCnt > 0){
			list = this.boardService.getTotalList();
		}
		
		mv.addObject("totalCnt", totalCnt);
		mv.addObject("list", list);
		
		//mv.setViewName("/view/main"); // 뷰 파일 앞에 /를 붙이는게 문제
		mv.setViewName("main");
				
		return mv;
	}
	
}
