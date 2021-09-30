package com.mvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HeeloServlet.service");
        System.out.println("req = " + req);
        System.out.println("resp = " + resp);

        String username = req.getParameter("username");
        System.out.println("username = " + username);

        // HTTP Header
        resp.setContentType("text/plain"); // 응답 메시지의 컨텐츠 타입
        resp.setCharacterEncoding("utf-8"); // 문자 인코딩 설정

        // HTTP Body
        resp.getWriter().write("hello " + username); // HTTP 메시지 바디 내용 입력
    }
}
