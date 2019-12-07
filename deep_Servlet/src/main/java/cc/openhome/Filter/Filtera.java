package cc.openhome.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Classname Filter1
 * @Description TODO
 * @Date 19-12-7 下午10:01
 * @Created by xns
 */
@WebFilter("/a/*")
public class Filtera implements Filter {

    public Filtera(){

    }
    public void destory(){

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        if(req.getSession().getAttribute("a") == null || !(boolean) req.getSession().getAttribute("a")){
            servletRequest.setAttribute("mes","无权访问a路径");
            servletRequest.getRequestDispatcher("/error.jsp").forward(servletRequest,servletResponse);
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException{

    }

}
