<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.example.starter.dto.Article" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% 
List<Article> list = (List<Article>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 사이트 - 게시물 리스트</title>
</head>
<body>
	<h1>게시물 리스트</h1>
	
	<!--  el문법  
	${list} 리스트 안에 있는거 전체 다 표시 
	-->
	<h2>version-1</h2>
	<% for (int i = 0; i < list.size(); i++) {%>
	<%
	Article article = list.get(i);
	%>	
	<section>
		번호 : <%=article.getId()%>, 제목 : <%=article.getTitle() %>, 
		내용 : <%=article.getBody() %>
	</section>
	<hr>
	<% } %>
	
	<!-- el의 장점은 request.getAttribute("article") 할 필요가 없다.  -->	
	<h2>version-2</h2>
	<c:forEach items="${list}" var="article">
		<section>
			번호 : ${aritcle.id}  제목 : ${aritcle.title}
		</section>
		<hr>
	</c:forEach>
	
</body>
</html>