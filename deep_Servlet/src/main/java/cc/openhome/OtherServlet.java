package cc.openhome;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Classname OtherServlet
 * @Description TODO
 * @Date 19-7-20 上午10:58
 * @Created by xns
 */
@WebServlet("/other.view")
public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        out.println(name+" ");
        out.println("Other do one");
    }
}
