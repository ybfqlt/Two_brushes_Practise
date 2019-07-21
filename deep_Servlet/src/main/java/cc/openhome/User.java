package cc.openhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Classname User
 * @Description TODO
 * @Date 19-7-20 下午3:04
 * @Created by xns
 */
@WebListener
@WebServlet("/user.view")
public class User extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       /* response.setContentType("text/html;charset=UTF-8");*/
       /* if(request.getAttribute("user") == null){
            response.sendRedirect("login.html");
        }*/
        HttpSession session = request.getSession();
        if(session.getAttribute("login") == null){
            response.sendRedirect("login.html");
        }
        else {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01" + " Transitional//E'>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet User</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + session.getAttribute("login" ) + "已登录</h1>");
            out.println("<body>");
            out.println("</html>");
            out.close();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        processRequest(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        processRequest(request,response);
    }
}
