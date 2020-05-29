<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>For JSP</title>
</head>
<body>

<h1>For.jsp</h1>

<ul>
    <c:forTokens items="Madrid,Rome,Berlin,Moscow,London,Turin,Milan" delims="," var="name">
        <li>${name}</li>
    </c:forTokens>
</ul>
</body>
</html>