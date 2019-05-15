package com.practice;

class Encapsulation {
   private int rollnumber;
   String name;

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
}

    class Encapsulationtwo{
    public static void main(String[] args){
    Encapsulation obj1 = new Encapsulation();
            obj1.setRollnumber(20);
      System.out.println( obj1.getRollnumber());


    }}

