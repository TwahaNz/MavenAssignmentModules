package com.tnz.app.test;

import org.junit.*;

/**
 * Created by Admin on 2016/03/06.
 */
public class TestPrac {

    private Practice practice;

    public TestPrac(){

        practice = new Practice();
    }

    @Test
    public void testAnswer(){
        Assert.assertEquals(0, practice.getAnswer());
    }

    @Test
    public void testCorrect(){
        Assert.assertEquals(0, practice.getCorrect());
    }

    @Test
    public void testInCorrect(){
        Assert.assertEquals(0, practice.getIncorrect());
    }

    @Test
    public void testNotNull(){
        Assert.assertNotNull(practice);
    }

    @Test
    public void testNotAnswer(){
        Assert.assertNotEquals(10, practice.getAnswer());
    }
}
