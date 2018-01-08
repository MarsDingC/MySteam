package com.mysteam.action;

import com.mysteam.entity.User;
import com.mysteam.service.TestService;

/**
 * Created by MarsDingC on 2018/1/8.
 */
public class TestAction {
    TestService service;
    User loginuser;

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
        loginuser=service.test(773854587);
        return "success";
    }

}
