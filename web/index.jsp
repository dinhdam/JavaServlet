<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/21/2018
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>BankInterest</title>
  </head>
  <body>
  <form action="/BankInterest" method="post">

    <table>
 <h1>Cash In Bank Interest</h1>
        <tr>

            <td> <label>Loan amount</label></tr></td>
    <td><input name = "loan amount" id ="loan amount" type="text" /></td>
        </tr>
        <tr>
            <td><label>Term </label></tr></td>
  <td><input name ="amount of loan" id ="amount of loan" type ="text"/></td>
        </tr>
        <tr>
            <td>
                <label>Interest Rate</label></tr></td>
  <td><input name = "interest rate"type id="interest rate" type ="text"/></td>
        </tr>
        <tr>
            <td><button type = submit>Interest</button></td>
        </tr>
    </table>
  </form>
  </body>
</html>
