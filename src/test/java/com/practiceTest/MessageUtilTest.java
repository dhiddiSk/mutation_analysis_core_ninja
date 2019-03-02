package com.practiceTest;
import org.junit.*;

import static org.junit.Assert.assertEquals;
public class MessageUtilTest {
        private String Message2 = "Servus";
    MessageUtil obj = new MessageUtil(Message2);
        @Test
     public void verify(){
            assertEquals(Message2, obj.printMessage());
        }
}