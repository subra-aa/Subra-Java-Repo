package com.java.platinum.test;

import com.java.platinum.one.Person;

public class TestExceptions {

    public static void main(String[] args) {
        try {
            Integer myInt = Integer.parseInt("123");

            System.out.print(myInt);

            Person person = null;
            if (null != person) {
                System.out.print(person.getName());
            }
        } catch(Exception ex) {
            if (ex instanceof NumberFormatException) {
                System.out.println("It is a NFE");
                ex.printStackTrace();
            } else {
                System.out.println("It is not a NFE");
                ex.printStackTrace();
            }
        } finally {
            System.out.println("All Operations are finished, Finally Block is called");
        }
    }
}
