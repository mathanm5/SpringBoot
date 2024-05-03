package org.maddy;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service...");
        //Method 1:
        //res.getWriter().println("Hello World...");// consider the page is paper and you are going to write on that using pen(getWriter( ))..
        //Method 2:
        PrintWriter out = res.getWriter();// getWriter( ) returns the  object of PrintWriter
        // If we want to do some HTML Effect
        res.setContentType("text/html");
        out.println("<h2><b>Hello World!...</b></h2>");


    }
}
