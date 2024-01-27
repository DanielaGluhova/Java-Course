package Topic1_BasicJavaConcepts;

// Relational Operators - оператори за сравняване
// <, >, <=, >=, ==, !=


public class Lesson8_RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b); // false => 10 != 20
        System.out.println(a != b); // true => 10 != 20
        System.out.println(a > b);  // false => 10 < 20
        System.out.println(a < b);  // true => 10 < 20
        System.out.println(a >= b); // false => 10 <= 20
        System.out.println(a <= b); // true => 10 <= 20
    }
}
