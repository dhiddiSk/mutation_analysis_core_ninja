package com.practice;
import java.util.Stack;

public class Stack1 {
    public static void main (String[] args){
System.out.println("pushing and popping out elements in stack");
     Stack st = new Stack();
     Stack1.pushing(st,20);
        System.out.println(st);
     Stack1.poping(st);
    }
    static void pushing(Stack ab, int x){
              ab.push(new Integer(x));

    }
    static void poping(Stack ab){
        ab.pop();
    }



}
