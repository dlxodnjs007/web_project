<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="game.AwayApplyDAO" %>
<%@ page import="game.AwayApply" %>
<%@ page import="game.HomeWantAwayDAO" %>
<%@ page import="game.HomeWantAway" %>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.util.ArrayList"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>오직농구</title>
	<link href="./css/base.css?after" rel="stylesheet">
    <link href="./css/common.css?after" rel="stylesheet">
    <link href="./css/main.css?after" rel="stylesheet">
    <link href="./css/mypage.css?after" rel="stylesheet">
    <script>
        function goPopupShowGame(game_id){
            var pop = window.open("/showGameNotApproved.jsp?id=" + game_id,"pop","width=600,height=670, scrollbars=yes, resizable=yes, left=200, top=200");
        }
        function goPopupShowGameApproved(game_id){
            var pop = window.open("/showGameApproved.jsp?id=" + game_id,"pop","width=600,height=670, scrollbars=yes, resizable=yes, left=200, top=200");
        }
    </script>
</head>
<body>
    <%
        String user_id = null;
        if(session.getAttribute("user_id") != null) {
            user_id = (String) session.getAttribute("user_id");
        }
    %>
	<div id="wrap">
        <!-- header -->
        <div id="header">
            <div id="gnb-top" class="bg-season"
                style="display: block; background: url('./images/logo.png') no-repeat center 0;">
                <div class="gnb-fix-area">
                    <h1 class="logo-link"><a href="./main.jsp">오직 농구 only basketball</a></h1>
                </div>
            </div>
            <!-- GNB -->
            <div id="gnb">
                <ul id="menu" class="gnb-list drop-menu">
                    <li><a href="./popular.jsp">오직인기</a></li>
                    <li><a href="./general.jsp">오직컨텐츠</a></li>
                    <li><a href="./matching.jsp">오직매칭</a></li>
                    <li><a href="./market.jsp">오직거래</a></li>
                    <li><a href="./gym.jsp">오직대관</a></li>
                </ul>
            </div>
            <!-- //GNB -->
        </div>
        <!-- //header -->
        <!-- container -->
        <div id="container">
            <!-- 본문 -->
            <div id="content-wrap">
                <div id="type-of-game">
                    내가 어웨이팀
                </div>
                <div class="away-approve">
                    <hr>
                    승인 대기중
                    <%
                        AwayApplyDAO awayApplyDAO = new AwayApplyDAO();
                        ArrayList<AwayApply> listAA = awayApplyDAO.getGamesByUserId(user_id);
                        ArrayList<HomeWantAway> listHWA = new ArrayList<HomeWantAway>();
                        ArrayList<AwayApply> notAcceptListAA = new ArrayList<AwayApply>();
                        
                        for(int i = 0; i < listAA.size(); i++) {
                                ArrayList<AwayApply> listAAGameId = awayApplyDAO.getAwayGamesByGameId(listAA.get(i).getGame_id_no());

                                int check = 0;
                                for(int k = 0; k < listAAGameId.size(); k++) {
                                    if(listAAGameId.get(k).getAccept_status() == 1) {
                                        check = 1;
                                        break;
                                    }
                                }

                                if(check == 0) {
                                    listHWA.add(awayApplyDAO.getHomeGameById(listAA.get(i).getGame_id_no()));
                                }
                                if(check == 0) {
                                    notAcceptListAA.add(awayApplyDAO.getAwayApplyById(listAA.get(i).getGame_id_no()));
                                }
                        }

                        if(notAcceptListAA.isEmpty() && listHWA.isEmpty()) {
                    %>
                    <div id="no-game">
                    승인 대기 중인 경기가 없습니다.
                    </div>
                    <%
                        } else {
                            for(int j = 0; j < listHWA.size(); j++) {
                    %>
                    <div class="game-exist">
                        <button type="button" class="game-exist-btn" value="<%=listHWA.get(j).getId()%>" onclick="goPopupShowGame(this.value)">
                            <%=listHWA.get(j).getRoadAddrPart1()%>
                            |&nbsp<%=listHWA.get(j).getDate().substring(0,9)%>
                            |&nbsp<%=listHWA.get(j).getDate().substring(11,12)%>시
                            <%=listHWA.get(j).getDate().substring(14,15)%>분
                        </button>
                    </div>
                    <%
                            }}
                    %>
                </div> 
                <div class="away-approve">
                    <hr>
                    승인 완료
                    <%
                        ArrayList<AwayApply> acceptedlistAA = awayApplyDAO.getAcceptedGamesByUserId(user_id);
                        if(acceptedlistAA.isEmpty()) {
                    %>
                    <div id="no-game">
                    승인 완료된 경기가 없습니다.
                    </div>
                    <%
                        } else {
                            
                            for(int i = 0; i < acceptedlistAA.size(); i++) {
                                ArrayList<HomeWantAway> acceptedlistHWA = awayApplyDAO.getGamesByGameId(acceptedlistAA.get(i).getGame_id_no());
                                for(int j = 0; j < acceptedlistHWA.size(); j++) {
                                
                    %>
                    <div class="game-exist">
                        <button type="button" class="game-exist-btn" value="<%=acceptedlistHWA.get(j).getId()%>" onclick="goPopupShowGameApproved(this.value)">
                            <%=acceptedlistHWA.get(j).getRoadAddrPart1()%>
                            |&nbsp<%=acceptedlistHWA.get(j).getDate().substring(0,9)%>
                            |&nbsp<%=acceptedlistHWA.get(j).getDate().substring(11,12)%>시
                            <%=acceptedlistHWA.get(j).getDate().substring(14,15)%>분
                        </button>
                    </div>
                    <%
                            }}}
                    %>
                </div>
                <div id="matching_btn">
                    <button type="button" onclick="location.href='./awayWantHome.jsp'">게임 신청하기</button>
                </div>
            </div>
            <!-- //본문 -->
            
            <!-- aside -->
            <div id="aside-wrap">
                <div id="rightside">
                    <%
                        if(user_id == null) {
                    %>
                    <div class="login-wrap">
                        <form id="loginForm" method="post" action="loginAction.jsp" accept-charset="utf-8">
                            <div class="login-box">
                                <span>
                                    <input type="text" name="user_id" placeholder="아이디" >
                                    <input type="password" name="password" placeholder="비밀번호">
                                </span>
                                <button type="submit"><span>로그인</span></button>
                            </div>
                        </form>
                        <div class="user-util">
                            <a href="/join.jsp">회원가입</a>
                            <a href="/member/find/id">아이디·비밀번호 찾기</a>
                        </div>
                    </div>
                    <%
                        } else {
                    %>
                    <div class="logout-wrap">
                            <div class="logout-box">
                                <button type="button" onclick="location.href='./logoutAction.jsp'">내 정보</button><br>
                                <button type="button" onclick="location.href='./logoutAction.jsp'">내 팀 정보</button><br>
                                <button type="button" onclick="location.href='./logoutAction.jsp'">로그아웃</button>
                            </div>
                    </div>
                    <%
                        }
                    %>
                    <!-- //login -->
                </div>
            </div>
            <!-- aside 끝 -->
        </div>
        <!-- //container -->

        <!-- footer -->
        <div id="footer">
        </div>
        <!-- //footer -->
    </div>
</body>
</html>