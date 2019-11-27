package com.memory.controller;

import com.memory.dto.Result;
import com.memory.pojo.ViewUser;
import com.memory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

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
     *
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView Registeruser(ViewUser viewUser) {
        viewUser.setUserType("管理员");
        Boolean judge = userService.registerUser(viewUser);
        if (judge == true) {
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
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result getlogin(@RequestParam("userName") String userName,@RequestParam("password") String password) {
        Result res = userService.userLogin(userName, password);
//        if(res.getJudge()==true){
//            request.getSession().setAttribute("user",map.get("userName"));
//            request.getSession().setAttribute("login",true);
////            request.getSession().setAttribute("type",res.getMes());
//        }
        return res;
    }
}
