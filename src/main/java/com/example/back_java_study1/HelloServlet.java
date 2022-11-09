package com.example.back_java_study1;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

//1단계 Servlet (프론트 -- 서블릿 -- 백엔드)


//맵핑
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private static final long seriaVersionUID=1L;

    public HelloServlet(){
        super();
    }

//    받고, 보내기, 오류 날 경우 입센션 처리
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {
//        response.setContentType("text/html; charset=utf-8");
//        PrintWriter out = response.getWriter();
//        out.println("<h1>1~10까지 출력</h1>");
//        for (int i=0; i<10; i++) {
//            out.println(i + "<br>");
//        }
//        out.close();
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>form</title></head>");
        out.println("<body>");

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        out.println("name : " + name + "<br>");
        out.println("age : " + age + "<br>");

        out.println("</body>");
        out.println("</html>");
    }
}

