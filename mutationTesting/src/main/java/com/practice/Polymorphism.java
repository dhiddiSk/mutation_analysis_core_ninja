package com.practice;

class Account {
    private int principal_amount = 1000;
    public int updated_principal;
    int deposit, withdrawn;
    public void deposit(int deposit_) {
        this.deposit = deposit;
        int updated_principal = deposit + principal_amount;
        System.out.println("the amount after deposit"+updated_principal);
    }
    public void  withdraw(int withdrawn) {
        this.withdrawn = withdrawn;
        int updated_principal = (principal_amount - withdrawn);
        System.out.println("the balance after withdrawn"+ updated_principal);
    }
    int prin_amount;
    public void setPrincipal_amount(int prin_amount){
             principal_amount=prin_amount;
     }
     public int getPrincipal_amount(){
        return principal_amount ;
     }

}

class savings extends Account{
    public int remaining(){
        return updated_principal;
    }
}
class checking extends Account{
    public void checking(){
        System.out.println("the amount after deposited"+super.updated_principal);

    }

}
class priviliged extends Account{
      @Override
        public void withdraw(int withdrawn) {
            this.withdrawn = withdrawn;

          System.out.println("here it is possible to withdraw more than available amount which is"+super.getPrincipal_amount());

    }
}
public class Polymorphism {
    public static void main(String[] args){
        priviliged objRef1=  new priviliged();
        objRef1.withdraw(20);
        Account objRef2 = objRef1;
          objRef2.withdraw(200);

    }
}
