<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    int number1 = 10;
    final int number2 = 5;
%>
<HTML>
  <head></head>
  <body>
    <%
       out.println(number1 + number2);

       out.println(number1 - number2);

       out.println(number1 * number2);

       out.println(number1 / number2);
    %>
  </body>
</HTML>
