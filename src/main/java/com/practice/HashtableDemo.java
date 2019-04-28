package com.practice;
import java.util.*;
public class HashtableDemo {
    public static void main(String args[]){
        Hashtable obj1 =  new Hashtable();
        Enumeration names;
        obj1.put("shoes", new Integer(2000));
        obj1.put("spects", new Integer(3000));
        obj1.put("shirt", new Integer(700));
        obj1.put("pant", new Integer(1500));
        names = obj1.keys();
        while(names.hasMoreElements()){
            System.out.println(obj1.size());
        }

    }
}
