package com.practice;

abstract class Calculation{
      int x=10,y=20;
   public  Calculation(int x , int y){
       this.x =x;
      this.y=y;
    }

public abstract void mul();

public void sub(){
       int minus = y-x;
       System.out.println(minus);
}
public void div() {
    int divsion = y / x;
    System.out.println(divsion);
}
}

class multiplication extends Calculation {
      int z;
    multiplication(int x, int y, int z) {
        super(x, y);
       this.z=z;
    }
  public void mul(){
      int multiplication2 = (x*y*z);
    System.out.println(multiplication2);
  }
}
public class Abstraction_Demo{
        public static void main(String[] args){
         Calculation obj1 = new  multiplication(22,30,40);
           //obj1.mul();
            obj1.sub();
        }
}