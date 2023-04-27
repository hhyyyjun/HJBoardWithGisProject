<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<div id="headerBox">
	<div id="boardHeader">
		<c:if test="${userId!=null}">
			<div id="menuIcon" onclick="openMenu()"></div>
		</c:if>
		<div id="goMain" onclick="board()">JJun's Board</div>
		<div>&nbsp;/&nbsp;</div>
		<div id="goGis" onclick="goGis()">Gis World</div>
	</div>
	<c:if test="${userId!=null}">
		<ul id="userBox">
			<li onclick="myinfo()">내정보</li>
			<li onclick="logout()">로그아웃</li>
		</ul>
	</c:if>
</div>

<script>

function board(){
	location.href = "/board";
}
function myinfo(){
	location.href="/myInfo";
}
function logout(){
	if(confirm("로그아웃 하시겠습니까?")){
		alert("로그아웃 합니다.");
		location.href = "/logout";
	}else{
		return;
	}
}
function goGis(){
	location.href="/leaflet2";
}
</script>