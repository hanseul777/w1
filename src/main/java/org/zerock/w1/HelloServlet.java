package org.zerock.w1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet") //value값이 경로
public class HelloServlet extends HttpServlet {

    //자바는 객체를 초기화 하기위해 생성자를 이용 여기서는 다름
    private String message;
    private int count;

    public void init() { // 서블릿 객체가 만들어 질 때 만들어 지는게 init : 한 번만 호출(객체는 하나)
        message = "Hello World!";
        count = 0;
        System.out.println("HelloServlet init..."); // 이런걸 로그라고 함.
    }

    // 각각의 쓰레드 마다 호출 -> 하나의 객체를 가지고 쓰레드마다 doGet을 호출하는 것( 지나가는 것)
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ++count;

        String str = count % 2 == 0 ? "짝수" : "홀수";

        response.setContentType("text/html;charset=UTF-8");
        // 저번에 out.write로 직접 줬던 값을 이 메소드로 다 빠져있어서 그걸 사용만 해주면 되는 것.
        // charset = UTF-8을 추가해서 한글이 나오도록 해줌

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + count + "</h1>");
        out.println("<h1>" + str + "</h1>");
        out.println("</body></html>");

        out.close(); // 안넣으면 자동으로 넣기는 하지만 안전하게 넣어줌
    }

    public void destroy() { // 서블릿객체가 없어질 때 만들어지는게 destrooy : 한 번만 호출(객체는 하나)
    }
}