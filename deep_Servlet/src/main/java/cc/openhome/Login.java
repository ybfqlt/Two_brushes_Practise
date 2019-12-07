package cc.openhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname Index
 * @Description TODO
 * @Date 19-7-20 下午3:04
 * @Created by xns
 */
@WebServlet("/login")
public class Login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().invalidate();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String page = "index.jsp";
        if ((name == null) && (password == null)) {
            request.setAttribute("mes", "用户名，密码错误");
        } else if (name == null) {
            request.setAttribute("mes", "用户名错误");
        }else if(password == null){
            request.setAttribute("mes","密码错误");
        }else if(name.equals("aaa") && password.equals("aaa")){
            request.setAttribute("name",name);
            request.getSession().setAttribute("login",true);
            request.getSession().setAttribute("a",true);
            page = "directory.jsp";
        }else if(name.equals("bbb") && password.equals("bbb")){
            request.setAttribute("name",name);
            request.getSession().setAttribute("login",true);
            request.getSession().setAttribute("b",true);
            page = "directory.jsp";
        }
        request.getRequestDispatcher(page).forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
