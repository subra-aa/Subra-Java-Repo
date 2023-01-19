package com.java.platinum.test;

import com.java.platinum.one.Address;
import com.java.platinum.one.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCode {

    public static void main(String[] args) {
        Address address = new Address();
        Address addressOne = new Address();

        address.setAddressLineOne("2717 Ranch Trl");
        address.setAddressLineTwo("Apt 20");
        address.setCity("Irving");
        address.setState("TX");
        address.setCountry("US");

        addressOne.setAddressLineOne("2718 Royal Ln");
        addressOne.setAddressLineTwo("Apt 2020");
        addressOne.setCity("Irving");
        addressOne.setState("TX");
        addressOne.setCountry("US");

        List<Address> addressList = new ArrayList<>();
        addressList.add(address);
        addressList.add(addressOne);

        Person person = new Person();
        person.setRollNo(1);
        person.setName("Srinath");
        person.setMarks(75.0);
        person.setAddressList(addressList);

        Person personOne = new Person();
        personOne.setRollNo(2);
        personOne.setName("Hari");
        personOne.setMarks(80.0);
        personOne.setAddressList(addressList);

        Person personTwo = new Person();
        personTwo.setRollNo(3);
        personTwo.setName("Abhilash");
        personTwo.setMarks(85.0);
        personTwo.setAddressList(addressList);

        Person personThree = new Person();
        personThree.setRollNo(4);
        personThree.setName("Sai");
        personThree.setMarks(90.0);
        personThree.setAddressList(addressList);

        Person personFour = new Person();
        personFour.setRollNo(5);
        personFour.setName("Sai");
        personFour.setMarks(90.0);
        personFour.setAddressList(addressList);

        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, person);
        personMap.put(2, personOne);
        personMap.put(3, personTwo);
        personMap.put(4, personThree);
        personMap.put(5, personFour);

        for( Integer key : personMap.keySet()) {
            if (key == 4) {
                Person somePerson = personMap.get(key);
                System.out.println(somePerson.getRollNo());
                System.out.println(somePerson.getName());
                System.out.println(somePerson.getMarks());

                somePerson.getAddressList().stream().forEach(innerAddress -> {
                    System.out.println("#######################################");
                    System.out.println(innerAddress.getAddressLineOne());
                    System.out.println(innerAddress.getAddressLineTwo());
                    System.out.println(innerAddress.getCity());
                    System.out.println(innerAddress.getState());
                    System.out.println(innerAddress.getCountry());
                    System.out.println("#######################################");
                });
            }
        }
        //person.setAddressList(addressList);

//        System.out.println(person.getRollNo());
//        System.out.println(person.getName());
//        System.out.println(person.getMarks());
//
////        for( Address innerAddress : person.getAddressList()) {
////            System.out.println(innerAddress.getAddressLineOne());
////            System.out.println(innerAddress.getAddressLineTwo());
////            System.out.println(innerAddress.getCity());
////            System.out.println(innerAddress.getState());
////            System.out.println(innerAddress.getCountry());
////        }
//
//        person.getAddressList().stream().forEach( innerAddress -> {
//            System.out.println("#######################################");
//            System.out.println(innerAddress.getAddressLineOne());
//            System.out.println(innerAddress.getAddressLineTwo());
//            System.out.println(innerAddress.getCity());
//            System.out.println(innerAddress.getState());
//            System.out.println(innerAddress.getCountry());
//            System.out.println("#######################################");
//        });


    }
}
