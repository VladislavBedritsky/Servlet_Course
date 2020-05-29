<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.servlet.domain.User" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First JSP</title>
</head>
<body>

<h1>Hello, first.jsp</h1>

<% response.getWriter().write("first"); %>
<%= request.getRequestURI() %>
<br>
<%= LocalDateTime.now() %>
<br>
<%
    List<User> users = (List) request.getAttribute("users");
    User firstUser = users.get(0);
    out.print(firstUser);
%>
<table>
<% for (User user : users) { %>
    <tr>
        <td> <%= user.getName() %> </td>
        <td>
            <% if (user.getCountry().equalsIgnoreCase("germany")) { %>
                <b> <%= user.getCountry() %> <b>
            <% } else { %>
                <%= user.getCountry() %>
            <% } %>
         </td>
        <td> <%= user.getAge() %> </td>
    </tr>
<% } %>
</table>

</body>
</html>