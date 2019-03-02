package com.practiceTest;

class Demo{

    public int sum(int i, int i1){
        int k,l,o;
        k=i;l=i1;
        o = k+l;
        return o;
    }

    public int avg(int r1) {
        return r1/2;
    }
}
public class CheckIgnoreCal {
    public static void main(String[] args){
       Demo demo = new Demo();
        int r1=demo.sum(10,20);
        int r2=demo.avg(r1);
    }



}
