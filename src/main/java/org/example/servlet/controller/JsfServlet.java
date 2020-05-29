package org.example.servlet.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsfServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String greeting = "Hello JSF";

        req.setAttribute("greeting", greeting);
        getServletContext().getRequestDispatcher("/jsf/index.xhtml").forward(req, resp);
    }
}
