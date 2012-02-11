<%@ page pageEncoding = "Shift_JIS" %>
<%@ page contentType="text/html; charset=Shift_JIS" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<html>
<head>
</head>
<body>
	<h1>■Struts 1.3.10 サンプル</h1>
	<table border="1">
		<th>No</th>
		<th>内容</th>
		<th>リンク</th>
		<tr>
			<td>1</td>
			<td>Hello world</td>
			<td><html:link action="/helloWorld">run</html:link></td>
		</tr>
		<tr>
			<td>2</td>
			<td>JSON Data</td>
			<td><html:link action="/jsonSample">run</html:link></td>
		</tr>
		<tr>
			<td>3</td>
			<td>システム日付取得</td>
			<td><html:link action="/getSystemDate">run</html:link></td>
		</tr>
	</table>
</body>
</html>

