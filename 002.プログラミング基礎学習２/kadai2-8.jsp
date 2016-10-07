<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%

  String[] camps = {"10","100","soeda","hayashi","-20","118","END"};

  out.print(camps[2]);

  camps[2] = "33";

  out.print(camps[2]);

%>
