<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	#wrap, h2, table {
		margin: auto;
		text-align: center;
	}

</style>
</head>
<body>
	<div id="wrap">
		<h2>회원가입페이지</h2>
		<form action="joinService.jsp" method="post">
			<table>
				<tr>
					<td>ID</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>PW</td>
					<td><input type="password" name="pw"></td>
				</tr>
				<tr>
					<td>NICK</td>
					<td><input type="text" name="nick"></td>
				</tr>
				<tr>
					<td>EMAIL</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>PHONE</td>
					<td><input type="tel" name="phone"></td>
				</tr>
				<tr>
					<td>GENDER</td>
					<td>
						남자<input type="radio" name="gender" value="남자">
						여자<input type="radio" name="gender" value="여자">
					</td>
				</tr>
				<tr>
					<td>AGE</td>
					<td><input type="number" name="age"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="회원가입">
						<input type="reset">
					</td>
				</tr>
				
			</table>
		</form>
	</div>
</body>
</html>