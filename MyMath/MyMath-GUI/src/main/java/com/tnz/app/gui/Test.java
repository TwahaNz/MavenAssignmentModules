package com.tnz.app.gui;

import com.tnz.app.test.MathTest;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by Admin on 2016/03/06.
 */
public class Test {

    MathTest mathTest;

    public Test(){
        mathTest = new MathTest();
    }

    public void displayTest() {

        while(mathTest.getCorrect()+mathTest.getIncorrect() != 10) {
            out.print(mathTest.toString());
            mathTest.getAnswer(new Scanner(in).nextInt());
        }

        out.println(mathTest.displayResults());
    }
}
