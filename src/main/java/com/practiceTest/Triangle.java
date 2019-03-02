package com.practiceTest;
import java.io.IOException;
import java.util.Scanner;

class typeChecker{
    int k,l,m;
    typeChecker(int[] a) {
       k= a[0];
       l= a[1];
       m= a[2];
        }
  public void triangleChecker(){
        if(k==l&&l==m){
            System.out.println("equilateral triangle");
        }
        else{
             if((k!=0&&k!=l&&k!=m)) {
                 System.out.println("scalen triangle");
             }else{
                    System.out.println("isosles triangle"); }
            }}
        }


        public class Triangle {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in).useDelimiter(" ");
            int i;
        int[] a= new int[3];
            for( i=0;i<=2;i++) {
                a[i] = sc.nextInt();
                System.out.println(a[i]+" ");
            }
          typeChecker obj1 = new typeChecker(a);
              obj1.triangleChecker();
    }

}
