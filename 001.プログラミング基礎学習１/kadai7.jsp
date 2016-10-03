<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
String A = request.getParameter("total");  //総計
String B = request.getParameter("number");  //個数
String C = request.getParameter("breed");  //商品種別

//課題7-1
int CC = Integer.parseInt(C);  //文字列 StringC の変数を整数型 intCC に変換

switch(CC){
     case 1:
        out.print("雑貨" + "<br>");
        break;
     case 2:
       out.print("生鮮食品" + "<br>");
       break;
     case 3:
       out.print("その他" + "<br>");
       break;
}

// if文で書いたときの一例
// if(CC == 1){
//  out.print("雑貨");
//  }
//  if(CC == 2){
//  out.print("生鮮食品");
//  }
// if(CC == 3){
//  out.print("その他");
//  }


//課題7-2
int AA = Integer.parseInt(A);  //文字列 StringA の変数を整数型 intAA に変換
int BB = Integer.parseInt(B);  //文字列 StringB の変数を整数型 intBB に変換

out.print(AA / BB + "<br>");


//課題7-3
if(AA >= 3000){
  out.print(AA * 0.04 + "ポイント獲得しました" + "<br>");
}else if(AA >= 5000){
  out.print(AA * 0.05 + "ポイント獲得しました" + "<br>");
}else{
  out.print(0 + "ポイント獲得しました" + "<br>");
}

%>
