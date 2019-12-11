package com.memory.controller;

import com.memory.dto.Result;
import com.memory.pojo.ViewUser;
import com.memory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname userController
 * @Description TODO
 * @Date 19-11-5 下午10:18
 * @Created by xns
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;


    /**
     * 注册
     * @param viewUser
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView registerUser(ViewUser viewUser) {
        viewUser.setUserType("管理员");
        Boolean judge = userService.registerUser(viewUser);
        if (judge) {
            ModelAndView modelAndView = new ModelAndView("redirect:static/login/login.jsp");
            modelAndView.addObject("mes","注册成功");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("redirect:static/login/sign.jsp");
        modelAndView.addObject("mes","注册失败");
        return modelAndView;
    }


    /**
     * 登录
     * @param request
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView getLogin(HttpServletRequest request,@RequestParam("userName") String userName, @RequestParam("password") String password) {
        Result res = userService.userLogin(userName, password);
        ModelAndView modelAndView = new ModelAndView();
        if(res.getJudge()){
            modelAndView.setViewName("redirect:index.jsp");
            request.getSession().invalidate();
            request.getSession().setAttribute("user",userName);
            request.getSession().setAttribute("login",true);
            request.getSession().setAttribute("type",res.getMes());
        }else{
            modelAndView.setViewName("redirect:static/login/login.jsp");
        }
        modelAndView.addObject(res);
        return modelAndView;
    }
}
