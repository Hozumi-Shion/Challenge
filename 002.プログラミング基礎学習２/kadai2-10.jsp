<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
//クエリストリングで入力する変数の指定とint型への変換
  String sentence = request.getParameter("original");
  int num = Integer.parseInt(sentence);

  out.print("元の値:" + num + "<br>");

//配列の指定(1ケタの素数)
  int numbers[] = {2,3,5,7};

//一桁の素因数を配列でそれぞれぶっこんで各素数をループさせて計算、表示させる処理

//num % 2 の余りが0の時(true)にループさせて余りが出た時（false)に次の処理に移行する
  if(num % 2 == 0){
                  while(num >= 2){
                          out.print("一桁の素因数：" + numbers[0] + "と");
                          break;
                         }
                  }


//num % 3 の余りが0の時(true)にループさせて余りが出た時（false)に次の処理に移行する

  if(num % 3 == 0){
                  while(num >= 3){
                          out.print("一桁の素因数：" + numbers[1] + "と");
                          break;
                         }
                  }

//num % 5 の余りが0の時(true)にループさせて余りが出た時（false)に次の処理に移行する

  if(num % 5 == 0){
                  while(num >= 5){
                          out.print("一桁の素因数：" + numbers[2] + "と");
                          break;
                         }
                  }


//num % 7 の余りが0の時(true)にループさせて余りが出た時（false)に次の処理に移行する

  if(num % 7 == 0){
                  while(num >= 7){
                          out.print("一桁の素因数：" + numbers[3] + "と");
                          break;
                         }
                  }


//10以上は2桁以上の素因数が含まれているからその他と表記
  if(num > 10){
               out.print("その他の素因数");
              }


//1は素因数分解できないからそのまま降りてきた数値を表示して素因数分解できませんとも表示
  if(num == 1){
               out.print(num + "は素因数分解できません");
              }

%>
