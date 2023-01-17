<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--   <%%> 이 안에 자바 코드 넣어주면 그대로 실행이 됨--%>
<%
    int total = 0;
    for (int i = 1; i<=10; i++) {
        total = total + i;
    }
%>

1부터 10까지의 합 : <%=total %>

<hr>
<form action="">
    <input type="text" name="name">
    <input type="submit" value="확인">
</form>

<%
    String a = request.getParameter("name");
%>

입력 받은 값 : <%=a%>
</body>
</html>