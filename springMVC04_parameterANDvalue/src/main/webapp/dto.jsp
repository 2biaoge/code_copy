<%--
  Created by IntelliJ IDEA.
  User: zyp
  Date: 2018/8/9
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>DDDDDDDDDDDDDDDDDDTO</title>

</head>
<body>
<h1>DTO详情</h1>
<x:forEach items="${listDto}" var="dto">
   名字： ${dto.dtoname}
   详情: ${dto.dtoinfo}<br/>
</x:forEach>
======================================================================================================<<br>

<x:forEach items="${dtolist}" var="dto">
    名字:${dto.dtoname}           <------->
    详情:${dto.dtoinfo}<br/>
</x:forEach>

<form action="/addd1.do" method="get" >
    汽车名称：<input type="text" name="carname">
    数量：<input type="" name="carcount">
    <input type="submit" value="题">
</form>

</body>
</html>
