<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import = "java.util.Date"%>


<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script>
	window.open("popup/popup1.jsp", "popup", "width=365, height = 250, left = 0, top=0")
</script>

<title>Welcome</title>
</head>
<body>	<%-- JSP 주석 처리 --%>
    <%@ include file="top_banner.jsp"%>
    <%@ include file="top_menu.jsp"%>
    <%@ include file="body_main.jsp"%>
    <%@ include file="footer.jsp"%>
    
</body>
</html>
