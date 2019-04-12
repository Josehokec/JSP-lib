<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>

<div style="width:100%;height:50px;text-align:center;background-color:yellow;" >
	<jsp:include page="/WEB-INF/common/banner.jsp"></jsp:include>
</div>
<div style="width:20%;height:500px;text_align:center;background-color:green;float:left;" >
	<jsp:include page="/WEB-INF/common/menu.jsp"></jsp:include>
</div>
<div style="width:80%;heignt:500px;background-color:white;float:left;" >
	<jsp:include page ="/WEB-INF/users/${mainBody}"></jsp:include>
</div>
<div style="width:100%;height:50px;text-align:center;background-color:blue;clear:both;" >
	<jsp:include page="/WEB-INF/common/foot.jsp"></jsp:include>
</div>

</body>
</html>