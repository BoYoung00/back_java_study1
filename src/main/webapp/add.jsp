<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<%
  int total = 0;
  for (int i = 1; i<=5; i++) {
    total = total + i;
  }
%>

1부터 10까지의 합!! : <%=total %>
<a href="http://localhost:8080/back_java_study1_war_exploded/Hello.jsp">링크</a>
</body>
</html>