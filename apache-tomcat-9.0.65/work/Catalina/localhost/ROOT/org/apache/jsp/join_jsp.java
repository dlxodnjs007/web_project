/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-12-12 05:05:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>오직농구</title>\r\n");
      out.write("    <link href=\"./css/base.css?after\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"./css/common.css?after\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"./css/main.css?after\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"./css/board.css?after\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"./css/mypage.css?after\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrap\">\r\n");
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
      out.write("\r\n");
      out.write("        <!-- container -->\r\n");
      out.write("        <div id=\"container\">\r\n");
      out.write("            <!-- 본문 -->\r\n");
      out.write("            <div class=\"account-body\" id=\"step_2\">\r\n");
      out.write("                <form id=\"joinForm\" method=\"post\" action=\"joinAction.jsp\">\r\n");
      out.write("                    <div class=\"section\">\r\n");
      out.write("                        <h2 class=\"content-title\">기본 정보</h2>\r\n");
      out.write("                        <dl>\r\n");
      out.write("                            <dt class=\"essential\">아이디</dt>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                            <span class=\"item-value modify-on\">\r\n");
      out.write("                            <input type=\"text\" name=\"user_id\" id=\"user_id\" placeholder=\"닉네임으로 사용됩니다.\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <dl>\r\n");
      out.write("                            <dt class=\"essential\">비밀번호</dt>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                            <span class=\"item-value modify-on\">\r\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"비밀번호를 입력해주세요.\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <dl>\r\n");
      out.write("                            <dt class=\"essential\">이름</dt>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                            <span class=\"item-value modify-on\">\r\n");
      out.write("                            <input type=\"text\" name=\"name\" id=\"name\" placeholder=\"이름을 입력해주세요.\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <dl>\r\n");
      out.write("                            <dt class=\"essential\">이메일</dt>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                            <span class=\"item-value modify-on\">\r\n");
      out.write("                            <input type=\"text\" name=\"email\" id=\"email_address\" placeholder=\"이메일을 입력해주세요.\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <dl>\r\n");
      out.write("                            <dt class=\"essential\">키</dt>\r\n");
      out.write("                            <dd><span class=\"item-value modify-on\">\r\n");
      out.write("                            <input type=\"text\" name=\"height\" id=\"height\" placeholder=\"키를 입력해주세요.\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <dl>\r\n");
      out.write("                            <dt class=\"essential\">선출여부</dt>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                            <span class=\"item-value\">\r\n");
      out.write("                            <input type=\"radio\" name=\"elite_or_not\" value=\"not_elite\">비선출\r\n");
      out.write("                            <input type=\"radio\" name=\"elite_or_not\" value=\"highschool\">고등선출\r\n");
      out.write("                            <input type=\"radio\" name=\"elite_or_not\" value=\"university\">대학선출\r\n");
      out.write("                            <input type=\"radio\" name=\"elite_or_not\" value=\"professional\">프로선출\r\n");
      out.write("                            </span>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        \r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"section second-board\">\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"btn-wrap\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn-orange-big\">\r\n");
      out.write("                            <span>\r\n");
      out.write("                                <em>회원가입</em>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- //본문 -->\r\n");
      out.write("            \r\n");
      out.write("            <!-- aside -->\r\n");
      out.write("            <div id=\"aside-wrap\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- aside 끝 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- //container -->\r\n");
      out.write("\r\n");
      out.write("        <!-- footer -->\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- //footer -->\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
