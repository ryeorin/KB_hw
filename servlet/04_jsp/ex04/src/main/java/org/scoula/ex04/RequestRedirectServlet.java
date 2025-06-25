package org.scoula.ex04;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;


@WebServlet("/request_redirect")
public class RequestRedirectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//속성 설정
        req.setAttribute("username", "홍길동");
        req.setAttribute("useraddress", "서울");
//redirect
        resp.sendRedirect("response_redirect");
    }
}