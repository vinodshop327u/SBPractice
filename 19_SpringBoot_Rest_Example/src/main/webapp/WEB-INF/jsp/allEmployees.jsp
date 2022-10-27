<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
        
  <h1>Employees page</h1>

<ul>
<c:forEach items="${employees}" var="employee">
   <li>${employee}</li>
</c:forEach>
</ul>

</body>
</html>