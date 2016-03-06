package com.tnz.app.gui;

import java.util.Scanner;

import static java.lang.System.console;
import static java.lang.System.out;
import static java.lang.System.in;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Menu menu = new Menu();
        out.print(menu.displayMenu() + "\n\n Enter Option: ");
        menu.setSelectedOption(new Scanner(in).nextInt());
        menu.processSelectedOption();
        out.print(menu.displayMenu() + "\n\n Enter Option: ");
    }
}
