<<<<<<< HEAD
package com.practice;
import org.junit.*;
import static org.junit.Assert.*;

public class MessageUtilTest2 {
    private String Message3 = "namastey";
    MessageUtil obj2 = new MessageUtil(Message3);
            @Test
    public void check2(){
                assertEquals(Message3,obj2.salutationMessage());
            }

=======
package com.practice;
import org.junit.*;
import static org.junit.Assert.*;

public class MessageUtilTest2 {
    private String Message3 = "namastey";
    MessageUtil obj2 = new MessageUtil(Message3);
            @Test
    public void check2(){
                assertEquals(Message3,obj2.salutationMessage());
            }

>>>>>>> 82875b54d566553229514e7883b0528a4ec24ecf
}