<%-- 
    Document   : kadai1
    Created on : 2016/11/04, 17:36:46
    Author     : Shion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>データ入力フォーム</title>
    </head>
    <body>
	<form action="./kadai2.jsp" method = "post">
	    <br>名前:<input type = "text" name="txtName"><br>
	    <br>性別 : 男性<input type ="radio" name = "sex" value="男性">　女性<input type ="radio" name ="sex" value ="女性"><br>
	    <br>趣味:<textarea name ="culture"></textarea><br>
	    <br><input type ="submit" name ="送信"><br>
	</form>
    </body>
</html>
