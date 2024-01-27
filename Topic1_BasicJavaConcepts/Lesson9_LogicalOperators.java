package Topic1_BasicJavaConcepts;

// Logical Operators - оператори за логически операции
// &&, ||, !

public class Lesson9_LogicalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println((a < b) && (a < 15)); // false => 10 < 15
        System.out.println((a < b) || (a < 15)); // true => 10 < 15
        System.out.println(!(a < b));            // false => 10 < 20   
    }
}
