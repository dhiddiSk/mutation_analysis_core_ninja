package com.practiceTest;
import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          int k,count=0,sum=0,temp;
          k=sc.nextInt();
          temp =k;
          while(temp!=0){
             int d = temp%10;
              sum+=d*(int)Math.pow(2,count);
              count++;
              temp/=10;
          }
        System.out.println(sum);
            sc.close();
    }

 }