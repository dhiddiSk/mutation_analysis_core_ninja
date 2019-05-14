package com.practice;

class account{
  private  String abc;
    void setName(String str){
        this.abc = str;
    }
    String getName(){
        return abc;
   }

}

public class GetSet{
          public static void main(String[] args){
              account obj1 =new account();
              obj1.setName("sai");
            String krishna=  obj1.getName();
System.out.println(krishna);
          }
}



















/*class child{
    int x,y;

  /*  public void Just(){
        System.out.println("value "+x);
        System.out.println("value "+y);
    }

    public void setData(int x,int y){
    this.x=x;
   this.y=y;
    }
    public void ShowData(){
        System.out.println("value "+x);
        System.out.println("value "+y);
    }

}


public class Account{
    public static void main(String args[]){
         child obj1 = new child();
        child obj2 = new child();
       // obj1.Just();
         obj1.setData(30,40);
         obj1.ShowData();
         obj2.setData(15,19);
         obj2.ShowData();

    }

}


*/


/*class animal{
     public String Name;
   // private String Name;

    public animal(String kutaa) {

        }
    public void Dog(){
        System.out.println("the name of the animal in hindi is "+animal.getName());
    }

    public void setName(String n){
         this.Name = n;
   }
    public static String getName(){
          return Name;
   }


}

public class Getset {
    public static void main(String args[]){
          animal obj1 = new animal("kutaa");
          obj1.Dog();

    }


}
*/

