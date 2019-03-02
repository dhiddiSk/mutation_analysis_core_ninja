package com.practiceTest;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {
    public static void main(String[] args){
        Enumeration months;
        Vector monthname = new Vector();
        monthname.add("jan");
        monthname.add("feb");
        monthname.add("mar");
        monthname.add("apr");
        monthname.add("may");
       months = monthname.elements();
       while(months.hasMoreElements()){
           System.out.println(months.nextElement());
       }
    }


}
