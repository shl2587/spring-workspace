<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<c:if test="${row != 0 }">
	<script>
		alert('수정 성공')
		location.href='${cpath}/list'
	</script>
</c:if>
<c:if test="${row == 0 }">
	<script>
		alert('수정 실패')
		history.go(-1)
	</script>
</c:if>

</body>
</html>