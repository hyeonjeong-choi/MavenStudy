<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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
	width: 50%;
}
form
{
	margin-top: 50px;
}
</style>
</head>
<body>
<div class="outer">
	<form action="bdinsert.do" method="post">
		<table class="table table-bordered" border="1">
			<tr>
				<th>NAME</th>
				<td><input class="form-control" type="text" name="bd_name"></td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><input class="form-control" type="text" name="bd_title"></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td><textarea class="form-control" rows="10" cols="60" name="bd_content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<div class="btn-group" role="group" >
						<input class="btn btn-outline-secondary" type="submit" value="완료">
						<input class="btn btn-outline-secondary" type="button" value="취소" onclick="location.href='list.do'">
					</div>				
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>