package com.tnz.app.gui;

import com.tnz.app.storage.Information;

/**
 * Created by Admin on 2016/03/06.
 */
public class Details {

    private Information usersInfo;

    public Details(){
        usersInfo = new Information();
    }


    public String getUsersInfo(){
        return usersInfo.getUserDetails();
    }
}
