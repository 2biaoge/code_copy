<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

</head>

<body>
<form id="form1" name="form1" method="post" action="/delCom.do">
  <table width="800" border="1" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td colspan="5" bgcolor="#FF0000">电脑列表</td>
    </tr>
    <tr>
      <td><input type="submit" name="button" id="button" value="删除" /></td>
      <td>电脑名称</td>
      <td>生成日期</td>
      <td>价格</td>
      <td>详情</td>
    </tr>
    <c:forEach items="${comList}" var="dto">
    <tr>
      <td><input type="checkbox" name="ids" id="checkbox" value="${dto.comId}"/>
      <label for="checkbox"></label></td>
      <td>&nbsp;${dto.comModel}</td>
      <td>&nbsp;${dto.comGendate}</td>
      <td>&nbsp;${dto.comPrice}</td>
      <!-- 根据主键找对应这条的详细记录 -->
      <td><a href="/detailCom.do?id=${dto.comId}">详情</a></td>
    </tr>
    </c:forEach>

    <tr>
      <td><a href="/listCom.do?page=0">首页</a> </td>
      <td><a href="/listCom.do?page=${currentPage-1}">上一页</a></td>
      <td><a href="/listCom.do?page=${currentPage+1}">下一页</a></td>
      <td><a href="/listCom.do?page=${maxPage}">尾页</a></td>
      <td>总页数</td>
    </tr>
  </table>
</form>
</body>
</html>