package com.wql.test;

import log4j.Test;
import jpojo.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


/**
 * Created by sing on 2018/8/3.
 * desc:
 */
public class test extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name=req.getParameter("name");
        User user=new User();
        user.setName(name);
        jpojo.test.test add=new jpojo.test.test();
        try {
            add.Add(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Test t= new Test();
        t.test(name);
        t.test("第一次修改");
        t.test("第二次修改");
        req.setAttribute("name",name);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}
