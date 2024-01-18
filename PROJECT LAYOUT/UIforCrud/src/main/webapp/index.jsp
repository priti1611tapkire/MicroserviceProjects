<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">


function login()
  {
	alert("Hello Login Page");
	
	var uname=document.getElementById("uname").value;
	var pass=document.getElementById("pass").value;
	alert(uname);
	alert(pass);
	
	var req=new XMLHttpRequest();
//	var url="http://localhost:9001/logincheck/"+uname+"/"+pass+"";//direct consumer
	var url="http://localhost:8093/getconsume/logincheck/"+uname+"/"+pass+"";//zuul through 
	//var url="http://localhost:8093/gethere/log/"+uname+"/"+pass+"";//zuul through
	req.open("GET",url,true); 
	req.send();
	alert("Success");
	req.onreadystatechange=function()
	{
		if(req.readyState==4 && req.status==200)
			{
			
			alert(req.responseText);
			}
	}
  }
	
</script>
Username
<input type="text" name="uname" id="uname"><br><br>
Password
<input type="password" name="pass" id="pass"><br><br>
<input type="button" value="login" onclick="login()"><br><br>
<a href="register">New User</a>

</body>
</html>

