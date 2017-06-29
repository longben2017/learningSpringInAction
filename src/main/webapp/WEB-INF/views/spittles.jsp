<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
  <h1>Spittle html</h1>
    <title>Spitter</title>
    <link rel="stylesheet" 
          type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
  <c:forEach items="${spittleList}" var="spittle">
  	<div class="spittleView">
      <div class="spittleMessage"><c:out value="${spittle.message}" /></div>
      <div>
        <span class="spittleTime"><c:out value="${spittle.time}" /></span>
      </div>
    </div>
  </c:forEach>
  </body>
</html>