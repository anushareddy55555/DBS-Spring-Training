<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.List"%>
<%@ page import="com.dbs.entity.Department"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>newemp</title>
    </head>
    <body>
        <h2>Employee Registration</h2>
        <form:form action="saveemp" method="post" modelAttribute="employee">
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
        <br><br>
        <form:label path="department">Department</form:label>
        
        <%
        List<Department> departments=(List<Department>)request.getAttribute("departments");
        %>
        
        <form:select path="department" items="${ departments }" itemLabel="name" itemValue="id"/>
        <input type="submit" value="Register">
        </form:form>
        </body>
 </html>