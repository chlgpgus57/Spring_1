<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap.jsp"/>

</head>
<body>
<c:import url="../layout/nav.jsp"/>

	<h1 style="text-align: center;">Notice List Page</h1>
<!-- 	<img alt="" src="../resources/images/img01.jpg"> -->
	
<div class="container">
  <div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>#</th>
        <th>TITLE</th>
        <th>WRITER</th>
        <th>DATE</th>
        <th>HIT</th>
      </tr>
    </thead>
    <tbody>
	 	<c:forEach items="${requestScope.list}" var="noticeDTO">
		<tr>
			<td>${pageScope.noticeDTO.num}</td>
			<td><a href="noticeSelect?num=${pageScope.noticeDTO.num}">${pageScope.noticeDTO.title}</a></td>
			<td>${pageScope.noticeDTO.writer}</td>
			<td>${pageScope.noticeDTO.contents}</td>
			<td>${pageScope.noticeDTO.reg_date}</td>
			<td>${pageScope.noticeDTO.hit}</td>
		</tr>
	</c:forEach>

     
    </tbody>
  </table>
  
  
  <%-- 	<!-- session member, memberDTO 꺼내와서 null이 아니면 글쓰기버튼이 보이도록.-->
  	<c:if test="${not empty sessionScope.member}">
  		<a class="btn btn-primary" href="noticeWrite">글쓰기</a>
  	</c:if> --%>

  	<a class="btn btn-primary" href="noticeWrite">글쓰기</a>

  	
  </div>
</div>
	
</body>
</html>
