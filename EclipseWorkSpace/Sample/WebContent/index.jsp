<%@page import="com.dao.DBConnection"%>
<%@page import="com.pojo.Premium"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
    	List<Premium> premiums = DBConnection.select();
%>

</head>
<body>
<%
/* String selection=request.getParameter("selection");
out.println(selection); */
%>
	<form action="/Sample/InitialController" method="GET">
    Name : <input type="text" name="name"><br>
    Age : <input type="text" name="age"><br>
    Policy : 
    
    <select id="selectBox" name="selectBox">
    	<%
    	for(Premium premium : premiums) { 
    	%>
    		<option value="<%=premium.getPolicy()%>"><%=premium.getPolicy()%></option>
		<% } %>
    </select><br>
    Amount : <input type="text" name="amount"><br>
    Years : <input type="text"  name="year"><br>
    
    <input type="submit" value="Calculate" name="year"><br>
    </form>
    Premium : <%=request.getAttribute("premium")%>
    Yearly Amount to be paid : <%=request.getAttribute("amount")%>
    
    
</body>
</html>

