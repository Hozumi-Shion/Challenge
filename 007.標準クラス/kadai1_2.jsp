<%-- 
    Document   : kadai1_2
    Created on : 2016/11/02, 16:43:31
    Author     : Shion
--%>

<%@page import="java.util. *,java.text.*" contentType="text/html" pageEncoding="UTF-8"%>

<%
    
Date date = new Date();

Calendar cal = Calendar.getInstance();
cal.setTime(date);

SimpleDateFormat sdf = new
	SimpleDateFormat("yyyy年MM月dd日HH時MM分ss秒");

String sdate = sdf.format(date);
out.print(sdate);


%>