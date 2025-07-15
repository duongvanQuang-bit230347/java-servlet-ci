package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Thông tin nhóm:</h2>");
        out.println("<ul>");
        out.println("<li>Duong Van Quang - MSSV: 123</li>");
        out.println("<li>Hoang Anh Tuan - MSSV: 456</li>");
        out.println("<li>Nguyen Phu Trong - MSSV: 789</li>");
        out.println("<li>Pham Minh Quan - MSSV: 789</li>");
        out.println("<li>Le Cong Ton Thang - MSSV: 789</li>");
        out.println("</ul>");
    }
}
