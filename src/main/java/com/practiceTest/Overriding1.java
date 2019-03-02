package com.practiceTest;
class subjects{
    protected void uni(){
        System.out.println("there are many different subjects inn the university");
    }

}
class computerScience extends subjects{
    protected void uni(){
System.out.println("programming is part of computer science in uni");
    }

     public void marks(){
        System.out.println("the marks gaining is not easy at uni");
     }
}
public class Overriding1 {
    public static void main(String args[]){
       subjects obj1 = new  computerScience();
          obj1.uni();

    }
}
