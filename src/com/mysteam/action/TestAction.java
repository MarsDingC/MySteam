package com.mysteam.action;

import com.mysteam.entity.User;
import com.mysteam.service.TestService;
import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

/**
 * Created by MarsDingC on 2018/1/8.
 */
public class TestAction {
    TestService service;
    User loginuser;
    private Map<String, Object> session;
    public TestService getService() {
        return service;
    }

    public void setService(TestService service) {
        this.service = service;
    }

    public User getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(User loginuser) {
        this.loginuser = loginuser;
    }

    public String test(){
        ActionContext ctx = ActionContext.getContext();
        session = ctx.getSession();
        loginuser=service.test(773854587);
        session.put("loginUser", loginuser);
        return "success";
    }

}
