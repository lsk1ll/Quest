package com.javarush.quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
