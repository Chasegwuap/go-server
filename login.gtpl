<html>
	<head>
	<title></title>
	</head>
	<body>
		<form action="http://127.0.0.1:9090/login" method="post">
			<input type="checkbox" name="interest" value="football">Football
			<input type="checkbox" name="interest" value="basketball">Basketball
			<input type="checkbox" name="interest" value="tennis">Tennis
			Username:<input type="text" name="username">
			Password:<input type="password" name="password">
			<input type="hidden" name="token" value="{{.}}">
			<input type="submit" value="Login">
		</form>
	</body>
</html>