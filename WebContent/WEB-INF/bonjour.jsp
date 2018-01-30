<%@ page pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
      
      <c:forEach items="${titres}" var="titre">
    <p> <c:out value="${ titre }" /> !</p>
    
    
</c:forEach>

    </body>
</html>