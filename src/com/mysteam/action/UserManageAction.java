package com.mysteam.action;

import com.mysteam.entity.Game;
import com.mysteam.entity.User;
import com.mysteam.service.UserManageService;
import com.opensymphony.xwork2.ActionContext;

import java.util.ArrayList;
import java.util.Map;

public class UserManageAction {
    ArrayList<Game> ownGameList;
    UserManageService userManageService;

    public UserManageService getUserManageService() {
        return userManageService;
    }

    public void setUserManageService(UserManageService userManageService) {
        this.userManageService = userManageService;
    }

    public ArrayList<Game> getOwnGameList() {
        return ownGameList;
    }

    public void setOwnGameList(ArrayList<Game> ownGameList) {
        this.ownGameList = ownGameList;
    }

    public String go() {
        Map session= ActionContext.getContext().getSession();
        User a = new User();
        a.setUserId(1);
        a.setAccount("zjut");
        a.setPassword("zjut"); session.put("user",a);
        User user = (User) session.get("user");
        if (user == null) {
            return "noLogin";
        } else {
            ownGameList=userManageService.getOwnGameList(user.getUserId());
           // session.put("ownGameList",ownGameList);
            return "go";
        }
    }
}
