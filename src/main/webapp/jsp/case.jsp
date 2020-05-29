<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Case JSP</title>
</head>
<body>
<%
    String hourParam = request.getParameter("degree");
    request.setAttribute("degreeVar", hourParam);
%>

<h1>Case.jsp</h1>

<c:choose>
    <c:when test="${degreeVar < -25}"> It's freezing </c:when>
    <c:when test="${degreeVar < 5}"> It's cold  </c:when>
    <c:when test="${degreeVar < 25}"> It's warm  </c:when>
    <c:when test="${degreeVar >= 25}"> It's roasting  </c:when>
    <c:otherwise> No temperature </c:otherwise>
</c:choose>

</body>
</html>