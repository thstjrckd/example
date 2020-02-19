package com.example.demo.VO;

import java.util.Date;

import lombok.Data;


	@Data
	public class Member {

		//필드 선언은 테이블의 컬럼과 일치하도록 구현
		private String memberId;
		private String passwd;
		private String email;
		private String userType;
		private Date regDate;
		private boolean active;
		
	
}
