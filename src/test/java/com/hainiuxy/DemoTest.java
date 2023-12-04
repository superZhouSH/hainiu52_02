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
}
