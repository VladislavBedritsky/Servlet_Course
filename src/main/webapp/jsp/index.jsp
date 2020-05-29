<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index JSP</title>
</head>
<body>

<h1>Pages with examples for:</h1>
<ul>
    <c:forEach var="url" items="${urls}">
        <li>
            <a href="<c:url value='jsp/${url}.jsp' />">${url}</a>
        </li>
    </c:forEach>
</ul>

</body>
</html>