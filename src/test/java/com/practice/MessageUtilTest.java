<<<<<<< HEAD
package com.practice;
import org.junit.*;

import static org.junit.Assert.assertEquals;
public class MessageUtilTest {
        private String Message2 = "Servus";
    MessageUtil obj = new MessageUtil(Message2);
        @Test
     public void verify(){
            assertEquals(Message2, obj.printMessage());
        }
=======
package com.practice;
import org.junit.*;

import static org.junit.Assert.assertEquals;
public class MessageUtilTest {
        private String Message2 = "Servus";
    MessageUtil obj = new MessageUtil(Message2);
        @Test
     public void verify(){
            assertEquals(Message2, obj.printMessage());
        }
>>>>>>> 82875b54d566553229514e7883b0528a4ec24ecf
}