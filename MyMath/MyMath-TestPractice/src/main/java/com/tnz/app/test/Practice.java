package com.tnz.app.test;

import java.util.Random;

/**
 * Created by Admin on 2016/03/06.
 */
public class Practice {

    private int answer;
    private int num1;
    private int num2;
    private int correct;
    private int incorrect;
    private int total;

    private int level;

    private Random rand;

    public Practice() {

        num1 = 0;
        num2 = 0;
        correct = 0;
        incorrect = 0;
        total = 10;
        answer = 0;
        level = 0;

        rand = new Random();
    }

    public void generateNumbers()
    {
        level = rand.nextInt(4);

        if (level > 1){

            num1 = rand.nextInt(12);
            num2 = rand.nextInt(12);

            if (level == 2)
                answer = num1*num2;
            else
                answer = num1/num2;
        }
        else {

            num1 = rand.nextInt(699);
            num2 = rand.nextInt(599);

            if (level == 0)
                answer = num1+num2;
            else
                answer = num1-num2;
        }
    }

    public void getAnswer(int answer){

        if(this.answer == answer)
            correct++;
        else
            incorrect++;
    }

    public int getAnswer(){
        return answer;
    }

    public int getIncorrect() {
        return incorrect;
    }

    public int getCorrect() {
        return correct;
    }

    public void setIncorrect(int incorrect) {
        this.incorrect += incorrect;
    }

    public void setCorrect(int correct) {
        this.correct += correct;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getQuestion()
    {
        generateNumbers();
        String[] symbol = {"+","-","*","/"};
        return "\n " + num1 + " " + symbol[level] + " " + num2 + " = ";
    }

    public String toString(){
        return "\n Total: " + total + "\tCorrect: " + correct + "\tIncorrect: " + incorrect +
                "\tQuestions Left: " + (total-(correct+incorrect)) +
                 "\n ============================================================== \n" + getQuestion();
    }
}
