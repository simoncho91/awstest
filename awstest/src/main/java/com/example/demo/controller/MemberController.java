package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.MemberService;
import com.example.demo.vo.MemberVO;

import lombok.NonNull;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login_check(@NonNull MemberVO vo) {
		ModelAndView mv = new ModelAndView();

		boolean result = memberService.getLoginCheck(vo);
		
		mv.addObject("MemberVO", vo);
		mv.addObject("login", result);
		
		mv.setViewName("main");
				
		return mv;
	}
	
}
