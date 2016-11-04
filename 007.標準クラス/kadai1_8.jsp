<%-- 
    Document   : kadai1_8
    Created on : 2016/11/03, 18:32:04
    Author     : Shion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"import="java.util.*,java.text.*,java.io.*" %>
<%

//同じ階層にあるファイルをオープン
File file1 = new File(application.getRealPath("profile.txt"));

//上書きモードでオブジェクト生成
FileWriter file2 = new FileWriter(file1);
//上書き書き込み
file2.write("私は穂積志音です\r\n");
//上書きクローズ
file2.close();

%>