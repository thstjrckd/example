package com.example.demo.VO;

import java.util.Date;

import lombok.Data;


	@Data
	public class Upload {


		private int uploadNo;
		private String title;
		private String uploader;
		private String content;
		private int readCount;
		private Date regDate;
		private boolean deleted; 
		


	
}
