package day5;

/*
 * 
 * Type 1: Reference to a static method

		If a Lambda expression is like:

    // If a lambda expression just call a static method of a class 
    (args) -> Class.staticMethod(args)  

Then method reference is like:

    // Shorthand if a lambda expression just call a static method of a class 
    Class::staticMethod  
 * 
 */



// Java Program to Illustrate How One can use
// Static method reference
// To Sort with Custom Comparator
 
// Importing required classes
import java.io.*;
import java.util.*;
 
// Class 1
// Helper class
// Object need to be sorted
class Person {
 
    private String name;
    private Integer age;
 
    // Constructor
    public Person(String name, int age)
    {
        // This keyword refers to current instance itself
        this.name = name;
        this.age = age;
    }
 
    // Getter-setters
    public Integer getAge() { return age; }
    public String getName() { return name; }
}
 
// Class 2
// Main class
public class ReferenceStaticMethod {
 
    // Method 1
    // Static method to compare with name
    public static int compareByName(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }
 
    // Method 2
    // Static method to compare with age
    public static int compareByAge(Person a, Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }
 
    // Method 3
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of user-defined type
        // List of person
        List<Person> personList = new ArrayList<>();
 
        // Adding elements to above List
        // using add() method
        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));
 
        // Using static method reference to
        // sort array by name
        Collections.sort(personList, ReferenceStaticMethod ::compareByName);
 
        // Display message only
        System.out.println("Sort by name :");
 
        // Using streams over above object of Person type
        personList.stream()
            .map(x -> x.getName())
            .forEach(System.out::println);
 
        // Now using static method reference
        // to sort array by age
        Collections.sort(personList, ReferenceStaticMethod ::compareByAge);
 
        // Display message only
        System.out.println("Sort by age :");
 
        // Using streams over above object of Person type
        personList.stream()
            .map(x -> x.getName())
            .forEach(System.out::println);
    }
}