<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:if test="${row != 0}">
 	<script>
  		alert('삭제 성공!')
  		location.href='${cpath}/list'
	</script>
</c:if>

<c:if test="${row == 0}">
	<script>
		alert('삭제 실패!')
		location.href='${cpath}/view/{idx}'
	</script>
</c:if>
</body>
</html>