<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%

//1.swicth文を利用して、以下の処理を実現してください。
//  値が1なら「one」、値が2なら「two」、それ以外は「想定外」と幼児する処理

int num = 2;

switch (num){
              case 1:
                out.print("one");
              break;

              case 2:
                out.print("two");
              break;

              default:
                out.print("想定外");
              break;
            }
%>
