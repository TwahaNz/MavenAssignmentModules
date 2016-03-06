package com.tnz.app.storage;

import static  java.lang.System.*;

/**
 * Created by Admin on 2016/03/06.
 */
public class Information {

    private String[] users = {"Twaha", "Peter", "James", "Tom", "Carl", "Kevin", "Exit"};
    private int[] results = {96,84,74,99,56,69};

    private int select;

    public Information(){

        select = 0;
    }

    public void getUsersDetails(){

        int i = 0;

        for (String u : users){
            out.println(" " + i + " " + u);
            i++;
        }

        out.print("\n");
    }

    public void setSelect(int select){
        this.select = select;
    }

    public String selectUser(){
        return users[select];
    }

    public String display() {
        return "\n Username: " + users[select] + "\n Results: " + results[select];
    }

    public int getSelect() {
        return select;
    }
}
