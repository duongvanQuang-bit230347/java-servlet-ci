package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/hello9")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        out.println("<h1>Hello, World, I am a servlet ssssssss a, 10.06.2025!</h1>");
	

        out.println("<h1>Hello, World, I am a servlet,chú ý nhánh của ---feature ss hello-19.06.2025!</h1>");
	out.println("<h1 style='color: red;'>Hello từ Java Dev tusn 1</h1>");


    }
}
