<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    int num1 = 1;
%>
<HTML>
  <head></head>
  <body>
    <%
      if(num1 == 1){
        out.print("1です！");
      }
      if(num1 == 2){
        out.print("プログラミングキャンプ！");
      }else{
        out.print("その他です！");
      }
    %>
  </body>
</HTML>
