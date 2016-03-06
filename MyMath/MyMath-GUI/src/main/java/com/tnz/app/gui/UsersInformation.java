package com.tnz.app.gui;

import com.tnz.app.storage.Information;

import java.util.Scanner;

/**
 * Created by Admin on 2016/03/06.
 */
public class UsersInformation {

    private Information info;

    public UsersInformation(){
        info = new Information();
    }

    public void displayUsers(){

        while(true) {
            info.getUsersDetails();
            System.out.print(" Please select a user: ");
            info.setSelect(new Scanner(System.in).nextInt());

            if(info.getSelect() == 6)
                break;

            System.out.println(info.display() +
                    "\n Press Any Key And Press Enter \n\n");
        }
    }
}
