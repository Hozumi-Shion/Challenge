<%-- 
    Document   : kadai1_7
    Created on : 2016/11/03, 13:50:36
    Author     : Shion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String bun = "きょUはぴlえlちぴlのくみこみかんすUのがくしゅUをしてlます";
    
    String bun1 = bun.replace("U", "う");
    out.print(bun1.replace("l", "い"));
    
%>
