<%--
  Created by IntelliJ IDEA.
  User: zyp
  Date: 2018/8/9
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>

</head>
<body>
<form action="/upload.do" method="post" enctype="multipart/form-data">
    文件名称:<input name="filendName" type="text"><br>
    选择文件：<input name="imgFile" type="file"><br>
    选择文件：<input name="imgFile" type="file"><br>
    选择文件：<input name="imgFile" type="file"><br>
    选择文件：<input name="imgFile" type="file"><br>
    <input type="submit" value="上传"><br>
</form>


</body>
</html>
