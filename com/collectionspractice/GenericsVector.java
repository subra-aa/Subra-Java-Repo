package com.collectionspractice;

import java.util.Vector;

public class GenericsVector {
    public static void main(String[] args) {
        Object[] arr=new Object[]{1,2,3,4,5};
        Vector<Integer> v1=new Vector<>();
        v1.add(13);
        v1.add(25);
        v1.add(null);
        v1.add(36);
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());

    }
}
