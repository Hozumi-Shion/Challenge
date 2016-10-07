<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%

//2．swicth文を利用して、以下の処理を実現してください。
//  値が”A”なら「英語」、値が”あ”なら「日本語」、それ以外は何も表示しない処理

    String sentence = "A";

      switch(sentence){
              case "A":
                out.print("英語");
              break;

              case "あ":
                out.print("日本語");
              break;
            }
%>
