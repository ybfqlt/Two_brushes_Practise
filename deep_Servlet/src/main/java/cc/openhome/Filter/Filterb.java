package cc.openhome.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebFault;
import java.io.IOException;

/**
 * @Classname Filterb
 * @Description TODO
 * @Date 19-12-7 下午10:01
 * @Created by xns
 */
@WebFilter("/b/*")
public class Filterb implements Filter {
    public Filterb(){

    }

    public void destory(){

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        if(req.getSession().getAttribute("b") == null || (boolean) req.getSession().getAttribute("b")!=true){
            servletRequest.setAttribute("mes","无权访问b路径");
            servletRequest.getRequestDispatcher("/error.jsp").forward(servletRequest,servletResponse);
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
    @Override
    public void init(FilterConfig config) throws ServletException{

    }

}
