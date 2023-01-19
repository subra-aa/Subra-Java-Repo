package com.collectionspractice;

import java.util.Vector;

public class VPractice {
    public static void main(String[] args) {
        Vector v1=new Vector();
        v1.add("Sathvik");
        v1.add(0,"Abhi");
        v1.add("Sai");
        v1.add("Srinath");
        v1.add("Hari");

        Vector v2=new Vector();
        v2.add("s1");
        v2.add("s2");
        v2.add("s3");
        v2.add("s4");
        v2.add("s5");
        v2.add("s6");

        System.out.println(v1);
        //v1.addAll(v2);
        v1.addAll(0,v2);
        System.out.println(v1);
        //v1.remove("Sathvik");
        //v1.removeAll(v2);
        //v1.clear();
        v1.set(1,"20");
        System.out.println(v1);
        System.out.println(v1.get(1));
        //System.out.println(v1.containsAll(v2));
        //System.out.println(v1.contains("Sathvik"));
        //System.out.println(v1.get(3));

       // System.out.println("Size is:"+ v1.size());
        //System.out.println("Capacity is:" +v1.capacity());
    }
}
