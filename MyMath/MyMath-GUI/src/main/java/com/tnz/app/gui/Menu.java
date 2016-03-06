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
        return "\n MyMath v1.0 " + " <--> Logged In As: " + username + "\n ===================================== " +
                "\n\n 1. My Details \n 2. PracticeGUI \n 3. Test \n 4. My Information \n 5. Exit";
    }

    public void setSelectedOption(int input) {
        selectedOption = input;
    }

    public void processSelectedOption() {

        if(selectedOption == 1)
            username = details.getUsersInfo();
        if(selectedOption == 2)
            practice.displayTest();
        if(selectedOption == 3)
            test.displayTest();
        if (selectedOption == 4)
            usersInformation.displayUsers();
    }

    public int getSelectedOption() {
        return selectedOption;
    }
}
