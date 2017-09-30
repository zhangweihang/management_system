<%@page import="java.util.ArrayList"%>
<%@page import="com.ihtc.manage_child.Child"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<style>
	input{
		border:none;
		text-align: center;
		width:100%;
		height:100%;
	}
	.red{
		background-color: red;
	}
	tr{
	height:50px;
	}
</style>

<script>

	function searc() {
		
		var trs = document.getElementsByTagName("tr");
		console.log(trs);
		var str = document.getElementsByClassName("haha1");
		var first = document.getElementsByClassName("first");
		var second = document.getElementsByClassName("second");
		var third = document.getElementsByClassName("third");
		var fourth = document.getElementsByClassName("fourth");
		var fifth = document.getElementsByClassName("fifth");
		var sixth = document.getElementsByClassName("sixth");
		var fs = new Array(first,second,third,fourth,fifth,sixth);
		var arr = new Array();
		for(var i = 0;i<str.length;i++){
			
			if(str[i].value == ""){
				
			}else{
				arr[arr.length] = i;
				
			}
			
		}
		
		for(var i = 0;i<trs.length-3;i++){
			var bool = true;
			
			for(var j = 0;j<arr.length;j++){
				console.log(fs[arr[j]]);
				if(str[arr[j]].value != (fs[arr[j]][i]).value){
					bool = false;
					break;
				}
				
			}
			
			if(arr.length == 0){
				bool = false;
			}
			
			if(bool){
				
				trs[i+2].setAttribute("class","red");
				
			}
			else{
				trs[i+2].setAttribute("class","");
			}
			
		}
		
	}

</script>

</head>
<body>
	
	<table border="1px" cellspacing="0" style="width:1200px;text-align:center;">
	
		<br/>
		<!-- <form action="search" method="get"> -->
			<td><input type="text" placeholder="请输入ID" class="haha1" /></td>
			<td><input type="text" placeholder="请输入名字" class="haha1" /></td>
			<td><input type="text" placeholder="请输入性别" class="haha1" /></td>
			<td><input type="text" placeholder="请输入年龄" class="haha1" /></td>
			<td><input type="text" placeholder="请输入监护人" class="haha1" /></td>
			<td><input type="text" placeholder="请输入电话" class="haha1" /></td>
			<td><button onclick=searc()>你随便输几个,点我查找</button>
		<!-- </form> -->
		<br/>
	
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
			<td>监护人</td>
			<td>电话</td>
			<td>删除</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${myList}" var="l">
			<form action="fup" method="get">
				<tr>
					<td><input type="text" value="${l.id}" name="fid" class="first" /></td>
					<td><input type="text" value="${l.name}" name="fname" class="second" /></td>
					<td><input type="text" value="${l.sex}" name="fsex" class="third" /></td>
					<td><input type="text" value="${l.age}" name="fage" class="fourth" /></td>
					<td><input type="text" value="${l.parent.name}" name="f_name" class="fifth" /></td>
					<td><input type="text" value="${l.parent.tel}" name="ftel" class="sixth" /></td>
					<td><a href="dell?id=${l.id}" onclick="return confirm()">删除</a></td>
					<td><input type="submit" value="修改" /></td>
				</tr>
			</form>
		</c:forEach>
		
		<form action="fadd" method="get">
				<tr>
					<td></td>
					<td><input type="text" placeholder="请填入名字" name="faddname" /></td>
					<td><input type="text" placeholder="请填入性别" name="faddsex" /></td>
					<td><input type="text" placeholder="请填入年龄" name="faddage" /></td>
					<td><input type="text" placeholder="请填入监护人" name="fadd_name" /></td>
					<td><input type="text" placeholder="请填入电话" name="faddtel" /></td>
					<td></td>
					<td><input type="submit" value="添加" /></td>
				</tr>
		</form>
		
	</table>
	
</body>
</html>