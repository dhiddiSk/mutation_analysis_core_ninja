package com.practice;
import org.junit.*;
public class MethodsOrders {

    @Test
    public void test1(){
        System.out.println("the first test");
    }
    @Test
    public void test2(){
        System.out.println("the second test");
    }

    @BeforeClass
    public static void check3(){
        System.out.println("this executes before the class");
    }
    @Before
    public void before(){
        System.out.println("executes before each test");
    }


   @After
    public void check(){
        System.out.println("this executes after each method");
   }
   @AfterClass
   public static void check2(){
        System.out.println("this executes after the class");
   }

}
