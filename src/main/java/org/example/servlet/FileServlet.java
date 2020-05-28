package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.UUID;
import java.util.stream.Collectors;

@MultipartConfig(location = "D:/java/epam/servletApp/files")
public class FileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (Part part : req.getParts()) {
            if (part.getName().equals("authorName")) {
                InputStream inputStream = part.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                String authorName = new BufferedReader(inputStreamReader)
                        .lines()
                        .collect(Collectors.joining("\n"));
                log(authorName);
            } else {
                part.write(UUID.randomUUID().toString() + part.getSubmittedFileName());
            }
        }

        resp.sendRedirect("/app/main");
    }
}
