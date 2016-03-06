package com.tnz.app.gui;

//import com.tnz.app.storage.Information;

import com.tnz.app.storage.Information;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created by Admin on 2016/03/06.
 */
public class Details {

    private Information usersInfo;

    public Details(){
        usersInfo = new Information();
    }

    public String getUsersInfo(){
        usersInfo.getUsersDetails();
        usersInfo.setSelect(new Scanner(in).nextInt());

        if(usersInfo.selectUser() == "Exit")
            return "Guest";

        return usersInfo.selectUser();
    }

}
