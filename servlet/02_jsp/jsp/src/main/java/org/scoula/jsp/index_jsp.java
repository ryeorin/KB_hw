package org.scoula.jsp;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
        implements org.apache.jasper.runtime.JspSourceDependent,
        org.apache.jasper.runtime.JspSourceImports {

    public void _jspInit() {}
    public void _jspDestroy() {}

    public void _jspService(final javax.servlet.http.HttpServletRequest request,
                            final javax.servlet.http.HttpServletResponse response)
            throws java.io.IOException, javax.servlet.ServletException {

        if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
            final String _jspx_method = request.getMethod();
            if ("OPTIONS".equals(_jspx_method)) {
                response.setHeader("Allow", "GET, HEAD, POST, OPTIONS");
                return;
            }
            if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
                response.setHeader("Allow", "GET, HEAD, POST, OPTIONS");
                response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED,
                        "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
                return;
            }
        }

        javax.servlet.jsp.PageContext pageContext = null;
        javax.servlet.jsp.JspWriter out = null;

        try {
            response.setContentType("text/html; charset=UTF-8");
            pageContext = _jspxFactory.getPageContext(this, request, response, null, true, 8192, true);
            out = pageContext.getOut();
            out.write("<!DOCTYPE html>\n");
            out.write("<html>\n");
            out.write("<head><title>JSP - Hello World</title></head>\n");
            out.write("<body>\n");
            out.write("<h1>");
            out.print("Hello World!");
            out.write("</h1>\n");
            out.write("<br/>\n");
            out.write("<a href=\"hello-servlet\">Hello Servlet</a>\n");
            out.write("</body>\n</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
