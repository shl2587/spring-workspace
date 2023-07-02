<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<fieldset>
	<legend>게시글 작성</legend>
	<form method="POST">
		<p><input type="text" name="title" placeholder="제목 입력" required autofocus></p> 
		<p>
			<textarea type="text" name="content" placeholder="게시글 작성" required></textarea>
		</p>
		<input type="submit" value="작성 완료">
	</form>
</fieldset>

</body>
</html>