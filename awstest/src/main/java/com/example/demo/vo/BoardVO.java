package com.example.demo.vo;

import lombok.Data;

@Data
public class BoardVO {
	
	private static final long serialVersionUID = 1L;
	
	int rno, bid, bhits;
	String btitle, bcontent, bfile, obfile, bdate;
	
}
