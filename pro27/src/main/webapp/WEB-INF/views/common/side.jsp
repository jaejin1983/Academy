<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
   request.setCharacterEncoding("UTF-8");
%>  
<!DOCTYPE html>
<html lang="ko">
<head>
	<style>
		.no-underLine {
			text-decoration:none;
		}
	</style>
	<meta charset="UTF-8">
	<title>사이드 메뉴</title>
</head>
	
<body>
	<h1>사이드 메뉴</h1>
	<h1>
		<a href="#" class="no-underline">회원관리</a><br>
		<a href="#" class="no-underline">게시판관리</a><br>
		<a href="#" class="no-underline">상품관리</a><br>
	</h1>
<!-- 
	<h1>
		<a href="${contextPath}/member/listMembers.do" class="no-underline">회원관리</a>
		<a href="${contextPath}/member/listArticles.do" class="no-underline">게시판관리</a>
		<a href="#" class="no-underline">상품관리</a>
	</h1>
 -->
 </body>
</html>