package com.tnz.app.gui;

/**
 * Created by Admin on 2016/03/06.
 */
public class Menu {

    private int selectedOption;
    private String username;

    private Details details;
    private PracticeGUI practice;
    private Test test;
    private UsersInformation usersInformation;

    public Menu(){

        selectedOption =  0;
        username = "Guest";

        details = new Details();
        practice = new PracticeGUI();
        test = new Test();
        usersInformation = new UsersInformation();
    }

    public String displayMenu() {
        return "\n MyMath v1.0 \n ===================================== " + username +
                "\n\n 1. My Details \n 2. PracticeGUI \n 3. Test \n 4. My Information 5. Exit";
    }

    public void setSelectedOption(int input) {
        selectedOption = input;
    }

    public void processSelectedOption() {
        if(selectedOption == 1) {
            username = details.getUsersInfo();
        }
        else
            if(selectedOption == 2){
                practice.displayTest();
            }

    }

}
