<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%

//5.for文を利用して、0から100を全部足す処理を実現してください。

int num1 = 0;

  for (int num2 = 1; num1 < 100; num1++){
                                        out.print((num2 = num2 + num1) + "<br>");
                                      }
%>
