<%-- 
    Document   : kadai1_4
    Created on : 2016/11/03, 0:28:54
    Author     : Shion
--%>


<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util. *" contentType="text/html" pageEncoding="UTF-8"%>1

<%
 Calendar cal1 = Calendar.getInstance();
 Calendar cal2 = Calendar.getInstance();

cal1.set(2015,1,1,0,0,0);
cal2.set(2015,12,31,23,59,59);

Date date1 = new Date();
Date date2 = new Date();

long time1 = date1.getTime();
long time2 = date2.getTime();


out.print(time2 - time1);

%>