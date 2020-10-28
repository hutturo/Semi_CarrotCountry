<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String contextPath = request.getContextPath();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://kit.fontawesome.com/76c88d06f7.js" crossorigin="anonymous"></script>
    <style>
    * {
    margin: 0;
    padding: 0;
    border: 0;
    font-size: 100%;
    font: inherit;
    vertical-align: baseline;
    box-sizing: border-box;
}
a {text-decoration: none;}
.navbar_Wrapper {
    background-color: orange;
    height: 50px;
    display: flex;
    justify-content: center;
    align-items: center;
    }
.navbar_sizeWraper_1200px {
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 1200px;
    height: 100%;
    }
.navbar_sizeWraper_1200px div {
    display: flex;
    justify-content: center;
	}
.user_info_display_sectionWrapper {
    margin-left: 50px;
	}
.user_info_display_sectionWrapper div {
    display: flex;
    align-items: center;
	}
.MainLogo_Wrapper {
    display: flex;
    align-items: center;
    }
.MainLogo_Wrapper>div i {font-size: 2rem;}
.menu_bar 				{margin-right: 50px;}
.menu_bar>table tr td a {color: white}
.user_inter_font 		{font-size: 0.7rem;}
.menu_bar table tr td   {padding-left: 10px;}
    </style>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar_Wrapper">
        <div class="navbar_sizeWraper_1200px">
            <div class="user_info_display_sectionWrapper">
                <div><a href=""><i class="fas fa-user"></i></a></div>
                <div><a href="">OOO님</a></div>
            </div>
            <div class=MainLogo_Wrapper>
                <div><a href=""><i class="fas fa-carrot"></i></a></div>
                <div><a href="<%=contextPath%>">당근나라</a></div>
            </div>
            <div class="menu_bar">
                <table>
                    <tr align="center" class="user_inter_icon">
                        <td><a href=""><i class="fas fa-sign-in-alt"></i></a></td>
                        <td><a href=""><i class="far fa-plus-square"></i></a></td>
                        <td><a href=""><i class="fas fa-money-check"></i></a></td>
                    </tr>
                    <tr class="user_inter_font">
                        <td><a href="">로그인</a></td>
                        <td><a href="">회원가입</a></td>
                        <td><a href="">마이페이지</a></td>
                    </tr>
                </table>
            </div>
        </div>
    </nav>
</body>
</html>