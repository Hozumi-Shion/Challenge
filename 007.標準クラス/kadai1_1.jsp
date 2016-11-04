<%-- 
    Document   : kadai1_1
    Created on : 2016/11/02, 16:31:51
    Author     : Shion
--%>

<%@page import="java.util. *" contentType="text/html" pageEncoding="UTF-8"%>

<%
    
Calendar cal = Calendar.getInstance();

cal.set(2016,1,1,0,0,0);

Date calpast = cal.getTime();
out.print(calpast);

%>
