package org.example.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class MainServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("Method init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Method service starts\n");
        super.service(req, resp);
        resp.getWriter().write("Method service exit\n");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        String params = formatParams(req);

        resp.getWriter().write("Method GET\nURI: "+ url + "\nParams:\n" + params + "\n");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        String params = formatParams(req);

        resp.getWriter().write("Method POST\nURI: "+ url + "\nParams:\n" + params + "\n");
    }

    private String formatParams(HttpServletRequest req) {
        return req.getParameterMap()
                .entrySet()
                .stream()
                .map(entry -> {
                    String param = String.join(" and ", entry.getValue());
                    return entry.getKey() + " => " + param;
                })
                .collect(Collectors.joining("\n"));
    }

    @Override
    public void destroy() {
        super.destroy();
        log("Method destroy");
    }


}

