<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <c:choose>
    <c:when test="${not empty param.bgColor }"><!-- null == empty -->
    <div id="header" style="background-color : ${param.bgColor}">
    </c:when>
    <c:otherwise>
    <div id="header">
    </c:otherwise>
    </c:choose>
               
            <div class="title">
                <a href="/home">EDM Infomation</a>
            </div>
            <div class="links">
           
            
            <c:choose>
            <c:when test="${empty loginuser }">
            <a href="/account/login">로그인</a>
                <a href="/account/register">회원가입</a>
            </c:when>
            <c:otherwise>
             <a href = "/account/update">
				${ loginuser.memberId }
				</a>님 환영합니다.
                <a href="/account/logout">로그아웃</a>
            </c:otherwise>
            </c:choose>
           
            </div>
        </div>
                
        <div id="menu">
            <div>
                <ul>
                    <li><a href="/board/member-list">사용자관리</a></li>
					<li><a href="/board/send">메일보내기</a></li>
					<li><a href="/board/rlist">자료실</a></li>
					<li><a href="/board/flist">게시판</a></li>
                </ul>
            </div>
		</div>