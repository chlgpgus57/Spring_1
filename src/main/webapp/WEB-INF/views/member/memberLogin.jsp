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
	<div id="di">
 	 <h2>LOGIN</h2>
 	</div>

  <form action="memberLogin" method="GET">
    <div class="form-group">
      <label for="email">ID:</label>
      <input type="text" checked="checked" class="form-control" id="id" placeholder="Enter ID" name="id" value="">
    </div>

    <div class="form-group">
      <label for="pwd">PW:</label>
      <input type="password" class="form-control" id="pw" placeholder="Enter PW" name="pw">
    </div>

    <div class="checkbox">
      <label><input type="checkbox" value="check" name="remember"> Remember me</label>
    </div>

    <button type="submit" class="btn btn-default">LOGIN</button>

  </form>
</div>
	
</body>
</html>