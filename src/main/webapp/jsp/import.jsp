<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Import JSP</title>
</head>
<body>

<h1>Import.jsp</h1>

<c:url value="title.jsp" var="importUrl">
</c:url>
<c:import url="${importUrl}" />



</body>
</html>