package com.tnz.app.storage;

import org.junit.*;

/**
 * Created by Admin on 2016/03/06.
 */
public class TestInfo {

    Information info;

    public TestInfo(){
        info = new Information();
    }

    @Test
    public void testUser(){
        Assert.assertNotEquals("Hendrick", info.selectUser());
    }

    @Test
    public void testSelect(){
        Assert.assertEquals(0, info.getSelect());
    }

    @Test
    public void test(){
        Assert.assertNotNull(info);
    }


}
