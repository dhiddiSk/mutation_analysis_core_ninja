package com.practice;

class HI{
    public static int x =20;
    public static int add(){
        int sum = 10+20;
        return sum;
    }
    public int sub(){
        int sub = 20-10;
        return sub;
    }

}



public class StaticKeyword {

    public static void main(String args[]){

         HI obj1 = new HI();
     System.out.println(" "+ obj1.sub() );
        System.out.println(" "+ HI.add()*HI.x);
    }
}
