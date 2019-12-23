<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>AWS 게시판 테스트</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<script>
		if ("${join}" == "true") {
			alert("회원가입 완료");
			location.href = "/";
		}

		if ("${login}" == "false") {
			alert("로그인 실패");
			location.href = "/";
		}
	</script>

	<div class="w3-container">
		<h1>&nbsp;${sessionScope.login_id} / ${sessionScope.lo_id}/ <%=session.getAttribute("login_id") %> / <%=session.getAttribute("lo_id") %></h1>
		<c:choose>
			<c:when test="${!empty sessionScope.login_id}">${sessionScope.login_id}</c:when>
			<c:otherwise>
				<button
					onclick="document.getElementById('id01').style.display='block'"
					class="w3-button w3-green w3-large">로그인</button>
				<button
					onclick="document.getElementById('id02').style.display='block'"
					class="w3-button w3-green w3-large">회원가입</button>
			</c:otherwise>
		</c:choose>

		<!-- 로그인 모달 -->
		<form action="/login" method="post">
			<div id="id01" class="w3-modal">z
				<div class="w3-modal-content w3-card-4 w3-animate-zoom"
					style="max-width: 600px">

					<div class="w3-center">
						<br> <span
							onclick="document.getElementById('id01').style.display='none'"
							class="w3-button w3-xlarge w3-transparent w3-display-topright"
							title="Close Modal">×</span>
					</div>

					<form class="w3-container" action="/action_page.php">
						<div class="w3-section">
							<label><b>Id</b></label> <input
								class="w3-input w3-border w3-margin-bottom" type="text"
								placeholder="Enter Id" name="id" required> <label><b>Password</b></label>
							<input class="w3-input w3-border" type="text"
								placeholder="Enter Password" name="pass" required>
							<button class="w3-button w3-block w3-green w3-section w3-padding"
								type="submit">Login</button>
						</div>
					</form>

					<div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
						<button
							onclick="document.getElementById('id01').style.display='none'"
							type="button" class="w3-button w3-red">Cancel</button>
					</div>

				</div>
			</div>
		</form>
		<!-- 로그인 모달 -->

		<!-- 회원가입 모달 -->
		<form action="/join" method="post">
			<div id="id02" class="w3-modal">
				<div class="w3-modal-content w3-card-4 w3-animate-zoom"
					style="max-width: 600px">

					<div class="w3-center">
						<br> <span
							onclick="document.getElementById('id02').style.display='none'"
							class="w3-button w3-xlarge w3-transparent w3-display-topright"
							title="Close Modal">×</span>
					</div>

					<form class="w3-container" action="/action_page.php">
						<div class="w3-section">
							<label><b>Id</b></label> <input
								class="w3-input w3-border w3-margin-bottom" type="text"
								placeholder="Enter Id" name="id" required> <label><b>Username</b></label>
							<input class="w3-input w3-border w3-margin-bottom" type="text"
								placeholder="Enter Username" name="name" required> <label><b>Password</b></label>
							<input class="w3-input w3-border" type="text"
								placeholder="Enter Password" name="pass" required>
							<button class="w3-button w3-block w3-green w3-section w3-padding"
								type="submit">Join</button>
						</div>
					</form>

					<div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
						<button
							onclick="document.getElementById('id02').style.display='none'"
							type="button" class="w3-button w3-red">Cancel</button>
					</div>

				</div>
			</div>
		</form>
		<!-- 회원가입 모달 -->
	</div>

	<h1>게시판</h1>
	
	<h5>전체 개시글 수 : ${totalCnt}</h5>
	
	<table border=1, style="border-collapse: collapse; text-align: center;">
	<c:forEach var="vo" items="${list}">
	<tr>
		<th>글 번호</th>
		<th>제목</th>
		<th>내용</th>
		<th>날짜</th>
		<th>조회수</th>
	</tr>
	<tr>
		<td>${vo.bid}</td>
		<td>${vo.btitle}</td>
		<td>${vo.bcontent}</td>
		<td>${vo.bdate}</td>
		<td>${vo.bhits}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>