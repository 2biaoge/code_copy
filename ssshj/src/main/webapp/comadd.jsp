<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

</head>

<body>
<form id="form1" name="form1" method="post" action="/addCom.do">
  <table width="800" border="1" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td colspan="2" bgcolor="#CCCCCC">添加电脑信息</td>
    </tr>
    <tr>
      <td align="right">电脑类型</td>
      <td><label for="comModel"></label>
      <input type="text" name="comModel" id="comModel" /></td>
    </tr>
    <tr>
      <td align="right">生成日期</td>
      <td><input type="text" name="comGendate" id="comGendate" /></td>
    </tr>
    <tr>
      <td align="right">价格</td>
      <td><input type="text" name="comPrice" id="comPrice" /></td>
    </tr>
    <tr>
      <td align="right">描叙</td>
      <td><input type="text" name="comDesc" id="comDesc" /></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="button" id="button" value="添加" /></td>
    </tr>
  </table>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
</form>
</body>
</html>