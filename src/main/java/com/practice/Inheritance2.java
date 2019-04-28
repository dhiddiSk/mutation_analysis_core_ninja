package com.practice;

class calculation{
   int a ,b;
   calculation(int i, int i1) {
         a = i;
        b = i1;
    }
    public void sum(){
        int res1 = a+b;
       System.out.println("the sum of two numbers is"+res1);
    }
    public void sub(){
       int res2 = b-a;
        System.out.println("the sub of two numbers is"+res2);
    }
    public void mul(){
        int res3 = a*b;
        System.out.println("the mul of two numbers is"+res3);
    }

}
class my_calculation extends calculation{
     int c,d;
    my_calculation(int i, int i1) {
        super(i, i1);
    c=i;
    d= i1;
    }
    public void div(){
      int res4 = c/d;
        System.out.println("the div of two numbers is"+res4);
    }
}

public class Inheritance2 {
    public static void main(String args[]){
      my_calculation obj1 = new my_calculation(20,10);
     obj1.mul();
     obj1.div();
    System.out.println(obj1 instanceof calculation);
    }
}
