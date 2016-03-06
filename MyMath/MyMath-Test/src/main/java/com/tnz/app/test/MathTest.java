package com.tnz.app.test;

/**
 * Created by Admin on 2016/03/06.
 */
public class MathTest extends Practice {

    private int[] results;

    public MathTest(){
        super();
        results = new int[2];
        results[0] = 0;
        results[1] = 0;
    }

    @Override
    public void getAnswer(int answer){
        if(getAnswer() == answer) {
            setCorrect(1);
            results[0]++;
        }
        else {
            setIncorrect(1);
            results[1]++;
        }
    }

    public int percentage(){
        return ((getCorrect()*100)/10);
    }

    public String displayResults(){
        return "\n Your Results: " + results[0] + "/10 \n" + "Pass Grade: " + percentage();
    }

}
