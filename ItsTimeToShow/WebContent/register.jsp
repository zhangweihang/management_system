<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>register</title>
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script>
	function checkName(){
		var name = $('#name').val();
		if(name==""){
			$('#susername').html("用户名不能为空");
			return false;
		}
		else{
			$('#susername').html("");
		}
		
		var url = "reg";
		var param = {"username":name};
		
		$.post(url,param,function(data){
			if(data == "yes"){
				$('#susername').html("此用户已存在");
				return false;
			}else{
				$('#susername').html("");
			}
			
		});
		return true;
	}
	function checkPWD(){
		var pwd = $('#password').val();
		if(pwd==""){
			$('#spassword').html("密码不能为空");
			return false;
		}else{
			$('#spassword').html("");
		}
		return true;
	}
	function check(){
		if(checkName() && checkPWD()){
			return true;
		}
		return false;
	}
	
</script>
</head>
<body>
	<form action="register" method="post" onsubmit="return check()">
		用户名:<input type="text" name="username" id="name" onblur="checkName()" /><span id="susername"></span>
		<br/>
		密&nbsp;&nbsp;&nbsp;码:<input type="password" name="password" id="password" onblur="checkPWD()" /><span id="spassword"></span>
		<br/>
		<input type="submit" value="注册" />
	</form>

</body>
</html>