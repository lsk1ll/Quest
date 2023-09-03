package com.javarush.quest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/name-handler")
public class NameServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        session.setAttribute("name", name);
        session.setAttribute("authorized", false);
        if(!name.isEmpty()) {
            session.setAttribute("authorized", true);
        }
        System.out.println(name);
        resp.sendRedirect("/game");
    }
}
