<%@ page contentType="text/html; charset=utf-8"%>

<nav class="navbar navbar-expand  navbar-white bg-white">
	<div class="dropdown">    <%-- 누르면 나오는 목록 카테고리 --%>
  		<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    		카테고리
  		</button>  
    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
        <a class="dropdown-item" href="#">과자</a>
        <a class="dropdown-item" href="#">음료</a>
        <a class="dropdown-item" href="#">유제품</a>
        <a class="dropdown-item" href="#">육류/생선</a>
        
     </div>
	</div>
    
    <div>
        <img src="image\로고 이미지이름.확장자" class="img-fluid" alt="main_image">
    </div>
    
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="./index.jsp">메뉴바 : 홈페이지</a>
            <a class="navbar-brand" href="./index.jsp">로그인</a>
            <a class="navbar-brand" href="./index.jsp">회원가입</a>
            <a class="navbar-brand" href="./index.jsp">고객센터</a>
		</div>
	</div>
</nav>
