// Demo.java — A quick tour of core Java features
// Run with:  javac Demo.java  &&  java Demo

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        System.out.println("=== Java Demo ===\n");

        // 1. Variables & types
        String name = "World";
        int year = 2026;
        double pi = 3.14159;
        boolean learning = true;
        System.out.println("1. Hello, " + name + "! Year: " + year);
        System.out.println("   pi = " + pi + ", learning Java = " + learning + "\n");

        // 2. Control flow: if / else
        System.out.println("2. Even numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // 3. Methods
        System.out.println("3. add(3, 4) = " + add(3, 4));
        System.out.println("   factorial(5) = " + factorial(5) + "\n");

        // 4. Collections (a growable list)
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println("4. Fruits in the basket:");
        for (String fruit : fruits) {
            System.out.println("   - " + fruit);
        }
        System.out.println();

        // 5. Objects: creating and using a class
        Dog rex = new Dog("Rex", 3);
        System.out.println("5. " + rex.describe());
        System.out.println("   " + rex.speak());
    }

    // A simple method that returns a value
    static int add(int a, int b) {
        return a + b;
    }

    // A recursive method
    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}

// A small class to demonstrate objects, fields, and methods
class Dog {
    private final String name;
    private final int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String describe() {
        return name + " is " + age + " year(s) old.";
    }

    String speak() {
        return name + " says: Woof!";
    }
}
