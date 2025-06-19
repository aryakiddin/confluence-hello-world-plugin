package com.myorg.confluence;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World Plugin</title>");
        out.println("<meta name=\"decorator\" content=\"atl.general\"/>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"aui-page-panel\">");
        out.println("<div class=\"aui-page-panel-inner\">");
        out.println("<section class=\"aui-page-panel-content\">");
        out.println("<div class=\"aui-page-header\">");
        out.println("<div class=\"aui-page-header-inner\">");
        out.println("<div class=\"aui-page-header-main\">");
        out.println("<h1>Hello World Plugin</h1>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class=\"aui-group\">");
        out.println("<div class=\"aui-item\">");
        out.println("<form method=\"post\" action=\"/plugins/servlet/hello-world\">");
        out.println("<button type=\"submit\" class=\"aui-button aui-button-primary\">Click Me!</button>");
        out.println("</form>");
        out.println("<div id=\"message-area\" style=\"margin-top: 20px;\"></div>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("</section>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World Plugin</title>");
        out.println("<meta name=\"decorator\" content=\"atl.general\"/>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"aui-page-panel\">");
        out.println("<div class=\"aui-page-panel-inner\">");
        out.println("<section class=\"aui-page-panel-content\">");
        out.println("<div class=\"aui-page-header\">");
        out.println("<div class=\"aui-page-header-inner\">");
        out.println("<div class=\"aui-page-header-main\">");
        out.println("<h1>Hello World Plugin</h1>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class=\"aui-group\">");
        out.println("<div class=\"aui-item\">");
        out.println("<div class=\"aui-message aui-message-success\">");
        out.println("<p class=\"title\"><strong>Hello World!</strong></p>");
        out.println("<p>Button was clicked successfully! Welcome to your first Confluence plugin.</p>");
        out.println("</div>");
        out.println("<form method=\"post\" action=\"/plugins/servlet/hello-world\">");
        out.println("<button type=\"submit\" class=\"aui-button aui-button-primary\">Click Me Again!</button>");
        out.println("</form>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("</section>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}