<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>If JSP</title>
</head>
<body>
<%
    String hourParam = request.getParameter("hour");
    request.setAttribute("hourVar", hourParam);
%>

<h1>IF.jsp</h1>

<c:if test="${hourVar >= 10 && hourVar < 19}">
    ${hourVar}: is a day
</c:if>

</body>
</html>