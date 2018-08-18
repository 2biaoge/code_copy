<%--
  Created by IntelliJ IDEA.
  User: zyp
  Date: 2018/8/9
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Che</title>
</head>
<body>
${car.dtoname}
${car.dtoinfo}


<form action="/updateCar.do" method="get">
    汽车名称:<input type="text" name="carname"><br>
    购买数量:<input type="text" name="carnum"><br>
    汽车编号:<input type="checkbox" name="cid" value="1222">1<br>
    汽车编号:<input type="checkbox" name="cid" value="2">2<br>
    汽车编号:<input type="checkbox" name="cid" value="3">3<br>
    汽车编号:<input type="checkbox" name="cid" value="4">4<br>
    生产日期:<input type="text" name="carbirth">
    汽车类型：<input type="text" name="carType.typename">
    <input type="submit">
</form>

</body>
</html>
