<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <h1>进来了的页面</h1><br/>
    <div id="table"></div>
</body>

	<script type="text/javascript" src="/snh/resource/lib/js/artTemplate.js"></script>
	<script id="TestTable" type="text/html" src="/snh/resource/lib/js/artTemplate.js"></script>
		
	<script type="text/javascript" >
		window.onload = function(){
			var data = {
				value:[{
					id:1,
					name:'2',
					nickname:'3',
					email:'444',
					password:'5555',
					number:'666',
					createTime:new Date(),
					lastLoginTime:new Date(),
					status:1
				},{
					id:2,
					name:'222',
					nickname:'223',
					email:'444222',
					password:'55552222',
					number:'662226',
					createTime:new Date(),
					lastLoginTime:new Date(),
					status:1
				}]
			};
			var html = template('TestTable',data);
			console.log(html);
			document.getElementById("table").innerHTML = html;
		}
		
	</script>	
	
</html>
