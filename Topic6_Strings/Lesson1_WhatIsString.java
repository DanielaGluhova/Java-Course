package Topic6_Strings;

// What is String?
// Ако искаме да съхраним в променлива няколко букви, то ще използваме String
// Mark - String от 'М', 'а', 'р', 'к'.
// String-а е масив от символи.

public class Lesson1_WhatIsString {
    public static void main(String[] args) {

        String name = "Leon";

        String name1 = new String("Mark");

        System.out.println("Hello " + name1);
        System.out.println(name1.charAt(1));
        System.out.println(name1.concat(" " + name));
    }
    
}
