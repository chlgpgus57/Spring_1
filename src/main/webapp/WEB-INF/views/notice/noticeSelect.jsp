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
<c:import url="../layout/nav.jsp" />
	<h1>Notice Select Page</h1>
	<h1>${data}</h1>

	
	
	<form action="noticeUpdate" method="post">
	<div class="container mt-3">
	 <h3 value="${requestScope.noticeDTO.title}">TITLE : ${requestScope.noticeDTO.title}</h3>
	 <h3 value="${requestScope.noticeDTO.writer}">WRITER : ${requestScope.noticeDTO.writer}</h3>
		  <div class="media">
	    <div class="media-body">
	      <textarea class="form-control" rows="37" id="comment" readonly="readonly">${requestScope.noticeDTO.contents}</textarea>
	    </div>
	    </div>
	 	<a  href="./noticeUpdate.notice?num=${requestScope.noticeDTO.num}" class="btn btn-danger">글 수정</a>
	 	<a  href="./noticeDeleteResult.notice?num=${requestScope.noticeDTO.num}" class="btn btn-danger">글 삭제</a>
	     <a href="./noticeList.notice" class="btn btn-primary">글 목록</a>
	     
 	</div>
 	</form>
	
	
</body>
</html>