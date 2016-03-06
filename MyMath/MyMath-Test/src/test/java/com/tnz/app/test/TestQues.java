package com.tnz.app.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Admin on 2016/03/06.
 */
public class TestQues {
    private MathTest mathTest;

    public TestQues(){

        mathTest = new MathTest();
    }

    @Test
    public void testAnswer(){
        Assert.assertEquals(0, mathTest.getAnswer());
    }

    @Test
    public void testCorrect(){
        Assert.assertEquals(0, mathTest.getCorrect());
    }

    @Test
    public void testInCorrect(){
        Assert.assertEquals(0, mathTest.getIncorrect());
    }

    @Test
    public void testNotNull(){
        Assert.assertNotNull(mathTest);
    }

    @Test
    public void testNotAnswer(){
        Assert.assertNotEquals(10, mathTest.getAnswer());
    }
}
