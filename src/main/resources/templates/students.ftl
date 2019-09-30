<html>
<head></head>
<body>
<table>
<#list students as student>
<tr>
<td>${student.username}</td><td>${student.password}</td>
</tr>
</#list>
</table>

</body>
</html>