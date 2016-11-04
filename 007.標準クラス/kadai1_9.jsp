<%-- 
    Document   : kadai1_9
    Created on : 2016/11/04, 13:39:03
    Author     : Shion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"import="java.util.*,java.text.*,java.io.*"%>
<%
File file1 = new File(application.getRealPath("profile.txt"));

FileReader file2 = new FileReader(file1);
BufferedReader file3 = new BufferedReader(file2);
out.print(file3.readLine());

%>
