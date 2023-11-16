package com.pluralsight.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Person> people =new ArrayList<>();

        people.add(new Person("Emily", "Johnson", 28));
        people.add(new Person("Nathan" , "Carter", 35));
        people.add(new Person("Mia" , "Rodriguez", 22));
        people.add(new Person("Brandon" , "Anderson", 30));
        people.add(new Person("Olivia" , "Foster",25 ));
        people.add(new Person("Jordan" , "Mitchell", 32));
        people.add(new Person("Sophia" , "Thompson", 27));
        people.add(new Person("Ethan" , "Davis", 29));
        people.add(new Person("Ava" , "Bennett", 23));
        people.add(new Person("Liam" , "Turner", 31));



       System.out.println("Please enter the lastname to be searched: ");
       String lastName = scan.nextLine();
       List<Person> match = people.stream().filter(person -> person.getLastName().equalsIgnoreCase(lastName)).toList();
       match.forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge()));
//
//        Integer maxAge = people.stream().max(Comparator.comparing(person -> person.getAge())).get().getAge();
//        System.out.println(maxAge);
//
//        Integer minAge = people.stream().min(Comparator.comparing(person -> person.getAge())).get().getAge();
//        System.out.println(minAge);

        List<Person> sortedList = people.stream().sorted(Person::compareTo).toList();
        int minAge = sortedList.get(0).getAge();
        int maxAge = sortedList.get(sortedList.size()-1).getAge();
        System.out.println("Minimum Age: " + minAge +"\n"+
                "Maximum Age: "+ maxAge);

        double avgAge = people.stream().collect(Collectors.averagingInt(person -> person.getAge()));

        System.out.println("The average age is: " + avgAge);

    }

}
