<%-- 
    Document   : kadai1_3
    Created on : 2016/11/02, 17:00:05
    Author     : Shion
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util. *" contentType="text/html" pageEncoding="UTF-8"%>

<%
 Calendar cal = Calendar.getInstance();

cal.set(2016,11,4,10,0,0);

Date date = new Date();

SimpleDateFormat sdf = new
	SimpleDateFormat("yyyy年MM月dd日HH時MM分ss秒");

String sdate = sdf.format(date);
out.print(sdate);


%>
