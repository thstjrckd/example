<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- tag사용을 위한 tag library -->

<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8" />
	<title>자료 목록</title>
	<link rel="Stylesheet" href="/resources/styles/style.css" />
	<link rel="Stylesheet" href="/resources/styles/default.css" />
	<style> a {text-decoration : none}</style>
</head>
<body>
				
	<div id="pageContainer">			
	<jsp:include page="/WEB-INF/views/modules/header.jsp" />
	
	 <div class="container">
	 
 
    	<h2>게시글 목록</h2>
    	<table class="board_list">
	        <colgroup>
	            <col width="15%"/>
	            <col width="*"/>
	            <col width="15%"/>
	            <col width="20%"/>
	        </colgroup>
	        <thead>
	            <tr>
	                <th scope="col">글번호</th>
	                <th scope="col">제목</th>
	                <th scope="col">조회수</th>
	                <th scope="col">작성일</th>
	            </tr>
	        </thead>
	        <tbody>
	        	<c:forEach var="board" items="${ boards }">
	        	<tr>
	        		<td>${ board.boardIdx }</td>
	        		<td class="title"><a href="/fboard/detail?boardIdx=${ board.boardIdx }">${ board.title }</a>
	        		</td>
	        		<td>${ board.hitCount }</td>
	        		<td>${ board.createdDatetime }</td>
	        	</tr>
	        	</c:forEach>
	        </tbody>			
	    </table>
	    <a href="/board/fwrite" class="btn">글 쓰기</a>
    </div>
	</div>

</body>
</html>











