<%-- 
    Document   : kadai2
    Created on : 2016/11/07, 13:21:54
    Author     : Shion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>データ入手&表示フォーム</title>
    </head>
    <body>
<%
    // 受け取るパラメータの文字コード
    //データ受け取り側(この場合はkadai1.jsp)の入力される文字コードとこちらで受け取る文字コードを合わせないとバグる
    request.setCharacterEncoding("UTF-8");	

    // データの受け取り
    String name = request.getParameter("txtName");
    String sex = request.getParameter("sex");
    String culture = request.getParameter("culture");
    
    //結果出力
    out.println(name);
    out.println(sex);
    out.println(culture);

%>
    </body>
</html>


