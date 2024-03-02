package Topic11_Polymorphism.Lesson3_FinalKeyword;

// final keyword
// Може да се използва за променливи, методи и класове
// * Променливи(variables) - не позволява промяна на стойността на променливата
// * Методи(methods) - не позволява override на метода (не може да бъде пренаписван от наследника)
// * Класове(classes) - не позволява да бъде наследяван този клас


public class Lesson3_FinalKeyword {
    public static void main(String[] args) {

        int num = 8;
        num = 9;
        System.out.println(num);

        // Final variable
        // За да направим променливата константна и да не може да се
        // променя използваме final
         // -> final int num1 = 8;
        // num1 = 9; // Cannot assign a value to final num1

        Calculator calculator = new Calculator();
        calculator.add(3, 4);
        calculator.show();

        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        advanceCalculator.add(3, 4);
        advanceCalculator.show();



        
    }
}
