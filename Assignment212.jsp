<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%
    List<Integer> primeList = (List<Integer>) request.getAttribute("primeList");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Prime Numbers</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #333;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2 style="text-align:center;">Prime Numbers Less Than Entered Number</h2>
    <%
        if (primeList == null || primeList.isEmpty()) {
    %>
        <p style="text-align:center;">No prime numbers found.</p>
    <%
        } else {
    %>
        <table>
            <tr>
                <th>Index</th>
                <th>Prime Number</th>
            </tr>
            <%
                for (int i = 0; i < primeList.size(); i++) {
            %>
            <tr>
                <td><%= i + 1 %></td>
                <td><%= primeList.get(i) %></td>
            </tr>
            <%
                }
            %>
        </table>
    <%
        }
    %>
</body>
</html>
