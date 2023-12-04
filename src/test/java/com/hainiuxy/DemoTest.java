package com.hainiuxy;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void test() {
        Demo demo = new Demo();
        String result = demo.SayHello("git");
        Assert.assertEquals("hello git",result);
    }
    @Test
    public void test2() {
        Demo demo = new Demo();
        demo.start();
    }
    @Test
    public void test3() {
        Demo demo = new Demo();
        Boolean b =demo.login("user1","123456");
        Assert.assertEquals(true,b);
    }
}
