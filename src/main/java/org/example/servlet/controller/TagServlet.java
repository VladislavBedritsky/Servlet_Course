package org.example.servlet.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TagServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] tagTypes = new String[] {"for", "if", "case", "import"};

        req.setAttribute("urls", tagTypes);
        getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
    }
}
