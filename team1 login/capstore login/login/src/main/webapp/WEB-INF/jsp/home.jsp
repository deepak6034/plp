<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}


.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

.topnav-right {
  float: right;
}
</style>
</head>
<body>


  <div class="topnav">
    <a href="#logout">Logout</a>
    <a href="#Sign in">Sign in</a>
  </div>


<div style="padding-centre:25px">
  <h2>Welcome to Admin Page</h2>
  
</div>

        <%
        String userid=(String)session.getAttribute("userid");
        
        //redirect user to login page if not logged in
        if(userid==null){
            response.sendRedirect("login.jsp");
        }
        %>
    
        <p>Welcome <%=email%></p>    
        <a href="logout.jsp">Logout</a>
    

</body>
</html>
