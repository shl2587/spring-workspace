<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>게시글 목록</h3>
<hr>

<main>
	<div class="table">
		<table>
			<thead>
				<tr>
					<th>제목</th>
					<th>내용</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dto" items="${list }">
					<tr>
						<td>${dto.title }</td>
						<td><a href="${cpath }/view/${dto.idx}">${dto.content }</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
	</div>
	<div class="write_button">
		<a href="${cpath }/add">
			<button>게시글 작성</button>
		</a>
	</div>
</main>


</body>
</html>