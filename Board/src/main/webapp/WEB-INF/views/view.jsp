<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div class="view">
	<div class="board_one">
		<div class="title">
			<h3>${dto.title }</h3>
		</div>
		<br>
		<div class="content">
			<h3>게시글 내용</h3>
			<br>
			<div class="content">${dto.content }</div>
		</div>
		<br>
		<div>
			<a href="${cpath }/delete/${dto.idx}"><button>삭제</button></a>
			<a href="${cpath }/modify/${dto.idx}"><button>수정</button></a>					
		</div>
	</div>
</div>


</body>
</html>