<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
        <p>Bonjour à vous !</p>
    </body>
    
   	 <p>
    	<%
    	String variable = (String) request.getAttribute("variable");
    	out.println(variable);
    	%>
   	 </p>
</html>