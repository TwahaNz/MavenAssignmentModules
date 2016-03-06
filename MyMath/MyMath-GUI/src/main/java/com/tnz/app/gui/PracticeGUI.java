package com.tnz.app.gui;

//import com.tnz.app.test.Practice;
//import java.util.Scanner;
//import static java.lang.System.in;
//import static java.lang.System.out;

import com.tnz.app.test.Practice;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created by Admin on 2016/03/06.
 */
public class PracticeGUI {

    private Practice p;

    public PracticeGUI(){
        p = new Practice();
    }

    public void displayTest(){

        while(p.getCorrect()+p.getIncorrect() != 10) {
            out.print(p.toString());
            p.getAnswer(new Scanner(in).nextInt());
        }
        out.print("Press Any Key To Continue");
        new Scanner(in).nextByte();
    }
}
