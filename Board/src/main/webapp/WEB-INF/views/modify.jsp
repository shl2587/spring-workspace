<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<fieldset>
	<legend>게시글 수정</legend>
	<form method="POST">
		<p><input type="text" name="title" placeholder="제목 입력" value="${dto.title }"></p> 
		<p>
			<textarea name="content" placeholder="게시글 작성">${dto.content }</textarea>
		</p>
		<input type="submit" value="수정 완료">
	</form>
</fieldset>
</body>
</html>