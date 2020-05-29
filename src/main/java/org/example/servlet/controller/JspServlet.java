package org.example.servlet.controller;

import org.example.servlet.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class JspServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> users = new ArrayList<User>() {{
            add(new User("Mike", "USA", 19));
            add(new User("Jack", "Germany", 23));
        }};

        req.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/jsp/first.jsp").forward(req, resp);
    }
}
