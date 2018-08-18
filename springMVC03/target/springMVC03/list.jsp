<%--
  Created by IntelliJ IDEA.
  User: zyp
  Date: 2018/8/7
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=utf-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>列表页</title>
</head>
<body>
<c:forEach items="${friendList}" var="dto" >

    朋友名字：${dto.name}
    密码：${dto.password}<br/>
</c:forEach>

</body>
</html>
