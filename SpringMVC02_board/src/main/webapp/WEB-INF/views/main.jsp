<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>메인페이지</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<style type="text/css">
body
{
	display: flex;
	width: 100%;
}
.outer
{
	margin: 0 auto;
	width: 70%;
}
h1
{
	margin-top: 50px;
}
</style>
</head>
<body>
<div class="outer">
		<h1>게시판 목록</h1>
		<h4>${res.bm_name } 님 안녕하세요</h4>
		<table class="table table-striped" border="1">
			<colgroup>
				<col width="50">
				<col width="100">
				<col width="300">
				<col width="100">
			</colgroup>
			<tr>
				<th>NO</th>
				<th>NAME</th>
				<th>TITLE</th>
				<th>DATE</th>
			</tr>
			<c:forEach items="${list }" var="dto">
				<tr>
					<td>${dto.bd_no }</td>
					<td>${dto.bd_name }</td>
					<td><a href="one.do?bd_no=${dto.bd_no }">${dto.bd_title }</a></td>
					<td>${dto.bd_date }</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="4" align="right">
					<input type="button" value="글쓰기" 
					onclick="location.href='insert.do'">
				</td>
			</tr>
		</table>
</div>
</body>
</html>