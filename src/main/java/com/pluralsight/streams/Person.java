package com.pluralsight.streams;

public class Person implements Comparable {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



//    @Override
//    public int compare(Object o1, Object o2) {
//        Person p1 =(Person) o1;
//        Person p2 =(Person) o2;
//        if(p1.getAge()> p2.getAge()){
//            return -1;
//        } else if (p1.getAge()< p2.getAge()){
//            return 1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Object o) {
        Person p =(Person) o;
        return Integer.compare(this.age, p.age);
    }
}
