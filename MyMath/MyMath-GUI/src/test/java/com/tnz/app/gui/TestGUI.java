package com.tnz.app.gui;

import org.junit.*;

/**
 * Created by Admin on 2016/03/06.
 */
public class TestGUI {

    private Menu menu;

    public TestGUI(){
        menu = new Menu();
    }

    @org.junit.Test
    public void testMenuOption(){
        Assert.assertNotEquals(1, menu.getSelectedOption());
    }

}
