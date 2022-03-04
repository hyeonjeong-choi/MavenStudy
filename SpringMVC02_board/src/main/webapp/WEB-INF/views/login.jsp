<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN PAGE</title>
</head><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<style type="text/css">
body
{
	display: flex;
	width: 100%;
}
.outer
{
	margin: 0 auto;
	width: 30%;
	text-align: center;
}
h1
{
	margin-top: 50px;
}
</style>
<body>
	<div class="outer">
		<h1>로그인</h1>
		<form action="userlogin.do" method="post">
			<input type="hidden" value="login">
			<table class="table table-bordered" border="1">
				<col width="100"><col width="100">
				<tr>
					<th>I D</th>
					<td><input class="form-control" type="text" name="bm_id"></td>
				</tr>  
				<tr>
					<th>P W</th>
					<td><input class="form-control" type="text" name="bm_pw"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input class="btn" type="submit" value="로그인">
						<input class="btn" type="button" value="회원가입" onclick="location.href=''">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>