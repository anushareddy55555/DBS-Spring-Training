<%@ page import="com.dbs.entity.Employee"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>emps</title>
    </head>
    <body>
        <h2>Employees</h2>
        <table border=1>
            <tr>
               <th>ID</th>
               <th>Name</th>
               <th>Department</th>
            </tr>
            <% 
            List<Employee> emps=(List<Employee>)request.getAttribute("emps");
                for(Employee employee:emps) {
             %>
                    <tr>
                        <td><%= employee.getId() %></td>
                        <td><%= employee.getName() %></td>
                        <td><%= employee.getDepartment().getName() %></td>
                    </tr>
                <%
                }
                %>
        </table>
    </body>
</html>