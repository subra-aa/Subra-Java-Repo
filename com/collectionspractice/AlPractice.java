package com.collectionspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AlPractice {
    public static void main(String[] args) {
        Integer[] arr=new Integer[] {1,30,75,40};
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
        al1.add(13);
        al1.add(0,5);
        al1.add(20);
        System.out.println(al1);
        System.out.println(al1.size());
        System.out.println(al1.get(2));
        al1.set(0,38);
        System.out.println(al1);
        for(Integer integer:al1){
            System.out.print(integer + " ");
        }
        Collections.synchronizedList(al1);
       // al1.clear();
        //al1.remove(2);
        //al1.removeAll(al1);

    }
}
