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

<div class="container">
	  <h2>회원가입페이지</h2>
	  
	  <form action="memberJoin" class="was-validated" method="POST">
	    <div class="form-group">
	      <label for="name">name:</label>
	      <input type="text" class="form-control" id="pwd" placeholder="Enter name" name="name" required>
	      <div class="valid-feedback">Valid.</div>
	      <div class="invalid-feedback">Please fill out this field.</div>
	    </div>
	    
	    <div class="form-group">
	      <label for="uname">ID:</label>
	      <input type="text" class="form-control" id="uname" placeholder="Enter id" name="id" required>
	      <div class="valid-feedback">Valid.</div>
	      <div class="invalid-feedback">Please fill out this field.</div>
	    </div>
	    <div class="form-group">
	      <label for="pwd">Password:</label>
	      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pw" required>
	      <div class="valid-feedback">Valid.</div>
	      <div class="invalid-feedback">Please fill out this field.</div>
	    </div>
	    <div class="form-group form-check">
	      
	    </div>
	    
	    <div class="form-group">
	      <label for="phone">Phone:</label>
	      <input type="number" class="form-control" id="email" placeholder="Enter phone" name="phone" required>
	    </div>
	
	    <div class="form-group">
	      <label for="email">Email:</label>
	      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
	    </div>
	    
	    <button type="submit" class="btn btn-primary">가입하기</button>
	  </form>
	</div>

</body>
</html>