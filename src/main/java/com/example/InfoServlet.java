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
        out.println("<li>Duương Văn Quang - MSSV: 230347</li>");
        out.println("<li>le cong ton thang - MSSV: 456</li>");
        out.println("<li>Lê Văn C - MSSV: 789</li>");
        out.println("<li>Lê Thi D - MSSV: 783</li>");
        out.println("</ul>");
	out.println("<h1 style='color: green;'>Sửa bởi Java Dev 2 - feature-jv2</h1>");
    }
}
