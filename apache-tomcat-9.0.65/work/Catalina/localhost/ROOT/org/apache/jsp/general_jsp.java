/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-12 02:58:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;

public final class general_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>Insert title here</title>\r\n");
      out.write("    <link href=\"./css/base.css?after\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"./css/common.css?after\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"./css/main.css?after\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        String user_id = null;
        if(session.getAttribute("user_id") != null) {
            user_id = (String) session.getAttribute("user_id");
        }
    
      out.write("\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("        <!-- header -->\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("            <div id=\"gnb-top\" class=\"bg-season\"\r\n");
      out.write("                style=\"display: block; background: url('./images/logo.png') no-repeat center 0;\">\r\n");
      out.write("                <div class=\"gnb-fix-area\">\r\n");
      out.write("                    <h1 class=\"logo-link\"><a href=\"./main.jsp\">오직 농구 only basketball</a></h1>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- GNB -->\r\n");
      out.write("            <div id=\"gnb\">\r\n");
      out.write("                <ul id=\"menu\" class=\"gnb-list drop-menu\">\r\n");
      out.write("                    <li><a href=\"./popular.jsp\">오직인기</a></li>\r\n");
      out.write("                    <li><a href=\"./general.jsp\">오직컨텐츠</a></li>\r\n");
      out.write("                    <li><a href=\"./matching.jsp\">오직매칭</a></li>\r\n");
      out.write("                    <li><a href=\"./market.jsp\">오직거래</a></li>\r\n");
      out.write("                    <li><a href=\"./gym.jsp\">오직대관</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- //GNB -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- //header -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- container -->\r\n");
      out.write("        <div id=\"container\">\r\n");
      out.write("            <!-- 본문 -->\r\n");
      out.write("            <div id=\"content-wrap\">\r\n");
      out.write("                <div class=\"board-wrap\">\r\n");
      out.write("                    <!-- 목록 -->\r\n");
      out.write("                    <div class=\"board-list\">\r\n");
      out.write("                        <script src=\"/js/board/thumb.js?202292\"></script>\r\n");
      out.write("\r\n");
      out.write("                        <script>\r\n");
      out.write("                            window.boardId = \"ilbe\";\r\n");
      out.write("                            function changeListSize(val) {\r\n");
      out.write("                                $(\"#searchForm input[name=listSize]\").val(val);\r\n");
      out.write("                                searchList(1);\r\n");
      out.write("                            }\r\n");
      out.write("                            function listStyle(val) {\r\n");
      out.write("                                $(\"#searchForm input[name=listStyle]\").val(val);\r\n");
      out.write("                                //$(\"#searchForm\")[0].submit();\r\n");
      out.write("                                searchList(0);\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            $(\".write-num strong\").html(\"847,729\");\r\n");
      out.write("\r\n");
      out.write("                        </script>\r\n");
      out.write("                        <script src=\"/oa/ad_bbs_list.js?202292\"></script>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"board-header\">\r\n");
      out.write("                            <h2><a href=\"./general.jsp\">오직컨텐츠</a><span class=\"ico-bookmark\" data-mid=\"ilbe\"\r\n");
      out.write("                                    data-name=\"오직컨텐츠\" onclick=\"bookmark(this)\"></span></h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <ul class=\"board-body\">\r\n");
      out.write("                            <li class=\"title-line\">\r\n");
      out.write("                                <span class=\"count\">번호</span>\r\n");
      out.write("                                <span class=\"nick\">닉네임</span>\r\n");
      out.write("                                <span class=\"date list_sort \" data-order=\"date\" style=\"cursor: pointer;\">날짜</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li>\r\n");
      out.write("\r\n");
      out.write("                                <span class=\"count\">847,729</span>\r\n");
      out.write("\r\n");
      out.write("                                <span class=\"title \">\r\n");
      out.write("                                    <a href=\"/view/11438123217\" class=\"subject \">test제목</a>                          \r\n");
      out.write("                                </span>\r\n");
      out.write("                                <span class=\"global-nick nick\">test닉네임</span>\r\n");
      out.write("                                <span class=\"date\">00:07:16</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<div class=\"post-btn-wrap\">\r\n");
      out.write("							<div class=\"btn-left\">\r\n");
      out.write("								<button type=\"button\" onclick=\"location.href='./general.jsp'\"\r\n");
      out.write("									id=\"list_back\" class=\"btn-default\">\r\n");
      out.write("									<span>목록</span>\r\n");
      out.write("								</button>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"btn-right\">\r\n");
      out.write("								<a href=\"./write.jsp\" class=\"btn-default\"><span>쓰기</span></a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"paginate\">\r\n");
      out.write("								<a href=\"javascript:;\" onclick=\"searchList(1)\" class=\"prev\"><span></span>이전</a>\r\n");
      out.write("								<a href=\"javascript:;\" onclick=\"searchList(1)\" class=\"page-on\">1</a>\r\n");
      out.write("								<a href=\"javascript:;\" onclick=\"searchList(2)\">2</a> <a\r\n");
      out.write("									href=\"javascript:;\" onclick=\"searchList(3)\">3</a> <a\r\n");
      out.write("									href=\"javascript:;\" onclick=\"searchList(4)\">4</a> <a\r\n");
      out.write("									href=\"javascript:;\" onclick=\"searchList(5)\">5</a> <a\r\n");
      out.write("									href=\"javascript:;\" onclick=\"searchList(6)\">6</a> <a\r\n");
      out.write("									href=\"javascript:;\" onclick=\"searchList(7)\">7</a> <a\r\n");
      out.write("									href=\"javascript:;\" onclick=\"searchList(8)\">8</a> <a\r\n");
      out.write("									href=\"javascript:;\" onclick=\"searchList(9)\">9</a> <a\r\n");
      out.write("									href=\"javascript:;\" onclick=\"searchList(10)\">10</a> <a\r\n");
      out.write("									href=\"javascript:;\" onclick=\"searchList(11)\" class=\"next\">다음<span></span></a>\r\n");
      out.write("								<a href=\"javascript:;\" style=\"display: none;\"\r\n");
      out.write("									onclick=\"searchList(2)\" class=\"accesskey_118\" accesskey=\"v\"></a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<script>\r\n");
      out.write("\r\n");
      out.write("                            $(function () {\r\n");
      out.write("                                $(\".list_sort\").each(function () {\r\n");
      out.write("                                    $(this).css(\"cursor\", \"pointer\");\r\n");
      out.write("                                    $(this).click(function () {\r\n");
      out.write("\r\n");
      out.write("                                        var order = $(this).attr(\"data-order\");\r\n");
      out.write("                                        var sort = $(this).hasClass(\"asc\") ? \"desc\" : \"asc\";\r\n");
      out.write("                                        $(\"#searchForm input[name=order]\").val(order);\r\n");
      out.write("                                        $(\"#searchForm input[name=sort]\").val(sort);\r\n");
      out.write("                                        searchList(1);\r\n");
      out.write("                                    });\r\n");
      out.write("                                });\r\n");
      out.write("                            });\r\n");
      out.write("                        </script>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- //목록 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--<div class=\"widget cutin-banner js-genieessp-com\"></div>-->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- //본문 -->\r\n");
      out.write("\r\n");
      out.write("            <!-- aside -->\r\n");
      out.write("            <div id=\"aside-wrap\">\r\n");
      out.write("                <div id=\"rightside\">\r\n");
      out.write("                    ");

                        if(user_id == null) {
                    
      out.write("\r\n");
      out.write("                    <div class=\"login-wrap\">\r\n");
      out.write("                        <form id=\"loginForm\" method=\"post\" action=\"loginAction.jsp\" accept-charset=\"utf-8\">\r\n");
      out.write("                            <div class=\"login-box\">\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    <input type=\"text\" name=\"user_id\" placeholder=\"아이디\" >\r\n");
      out.write("                                    <input type=\"password\" name=\"password\" placeholder=\"비밀번호\">\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <button type=\"submit\"><span>로그인</span></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div class=\"user-util\">\r\n");
      out.write("                            <a href=\"/join.jsp\">회원가입</a>\r\n");
      out.write("                            <a href=\"/member/find/id\">아이디·비밀번호 찾기</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");

                        } else {
                    
      out.write("\r\n");
      out.write("                    <div class=\"logout-wrap\">\r\n");
      out.write("                            <div class=\"logout-box\">\r\n");
      out.write("                                <button type=\"button\" onclick=\"location.href='./logoutAction.jsp'\">내 정보</button><br>\r\n");
      out.write("                                <button type=\"button\" onclick=\"location.href='./logoutAction.jsp'\">내 팀 정보</button><br>\r\n");
      out.write("                                <button type=\"button\" onclick=\"location.href='./logoutAction.jsp'\">로그아웃</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                    <!-- //login -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- //aside -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- //container -->\r\n");
      out.write("        <!-- footer -->\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- //footer -->\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
