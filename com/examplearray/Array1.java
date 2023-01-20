package com.examplearray;

import java.util.ArrayList;

public class Array1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(2);
        a.add(3);
        a.add(6);
        a.add(7);
System.out.println(a);
a.add(2,23);
System.out.println(a);
System.out.println(a.size());
}
}