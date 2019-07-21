package cc.openhome;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Classname Some
 * @Description TODO
 * @Date 19-7-20 上午10:57
 * @Created by xns
 */
@WebServlet("/some.view")
public class Some extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        out.println("Some do one...");
        RequestDispatcher dispatcher = req.getRequestDispatcher("other.view?name=xiaoming");
        dispatcher.include(req,resp);
        out.println("Some do two...");
        out.close();
    }
}
