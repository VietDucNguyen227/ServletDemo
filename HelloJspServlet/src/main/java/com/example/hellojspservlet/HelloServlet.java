package com.example.hellojspservlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
//
//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "si3!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = "sdasd";
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + name + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("do Post HelloServlet");


//        String name = (String)req.getAttribute("name");
//        int age = (int)req.getAttribute("age");
//        String address = (String)req.getAttribute("address");
//        System.out.println(name + "|" + age + "|" + address);

        resp.setContentType("image/jpg");
        ServletOutputStream servletOutputStream = resp.getOutputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\msg5395771189-29200.jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(servletOutputStream);

        int ch = 0;
        while((ch = bufferedInputStream.read()) != 1){
            bufferedOutputStream.write(ch);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }

    public void destroy() {
    }
}