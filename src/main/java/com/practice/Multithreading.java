package com.practice;
class add extends Thread{
    public void run(){
        int m = 20;
        for(int j=0;j<=5;j++){
          System.out.println(m += m);
            try{ Thread.sleep(10);}  catch(Exception e){}
        }}}
public class Multithreading{
    public static void main(String[] args){
            Thread t1 = new Thread(()->{
            int p = 20;
            for(int i=0; i<=5;i++){
                System.out.println(p = p*1);
                try{ Thread.sleep(10);}  catch(Exception e){}
            }});
          t1.start();
        add obj2 = new add();
        try{ Thread.sleep(10);}  catch(Exception e){}
          obj2.start();
      }}
