<%--
  Created by IntelliJ IDEA.
  User: zyp
  Date: 2018/8/9
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><%--格式化数据--%>
<html>
<head>
    <title>添加车辆</title>
</head>
<body>
<c:forEach items="${cars}" var="car"><br>
    ${car.carname},
    <fmt:formatNumber value="${car.price}" pattern="#,###,###.#" minFractionDigits="2" maxFractionDigits="3"></fmt:formatNumber>
    <fmt:formatDate value="${car.carbirth}" pattern="yyyy-MM-dd"></fmt:formatDate>

</c:forEach>
</body>
</html>
