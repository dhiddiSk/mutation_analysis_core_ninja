package com.practice;

class animals{
    public void move(){
        System.out.println("animals can run jump walk crawl swim etc");
    }
}
class dogs extends animals{
    public void move(){
        System.out.println("digs can run and walk");
      super.move();
    }
}

public class Inheritance {
    public static void main(String args[]){
       dogs check = new dogs();
       check.move();

    }
}
