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
@WebServlet("/index.do")
public class Index extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                String name = cookie.getName();
                System.out.println(name);
                String value = cookie.getValue();
                System.out.println(value);
                if("user".equals(name) && "caterpillar".equals(value)){
                    request.setAttribute(name,value);
                    request.getRequestDispatcher("/user.view").forward(request,response);
                    return ;
                }
            }
        }
        response.sendRedirect("login.html");
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
