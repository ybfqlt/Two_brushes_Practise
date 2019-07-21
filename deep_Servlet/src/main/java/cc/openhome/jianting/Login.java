package cc.openhome.jianting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Login
 * @Description TODO
 * @Date 19-7-21 下午3:27
 * @Created by xns
 */
@WebServlet("/login.do")
public class Login extends HttpServlet {
    private Map<String,String> users;
    public Login() {
        users = new HashMap<String,String>();
        users.put("caterpillar","123456");
        users.put("momor","98765");
        users.put("hamimi","133579");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");
        System.out.println(name+"    "+passwd);
        String page = "login.jsp";
        if(users.containsKey(name) && users.get(name).equals(passwd)){
            request.getSession().setAttribute("user",name);
            page = "welcome.view";
        }
        response.sendRedirect(page);
    }
}
