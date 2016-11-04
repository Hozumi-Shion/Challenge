<%-- 
    Document   : kadai1_6
    Created on : 2016/11/03, 13:25:26
    Author     : Shion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String address = "mememobore_mo@softbank.ne.jp";
    
    int henkango = address.indexOf("@");
    out.print(address.substring(henkango));
%>
