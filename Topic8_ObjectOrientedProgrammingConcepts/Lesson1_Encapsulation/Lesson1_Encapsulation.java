package Topic8_ObjectOrientedProgrammingConcepts.Lesson1_Encapsulation;

// Encapsulation - Data Hiding - капсулират се данни така че никой от външния
// свят да не може да ги използва директно.

// Чрез капсулиране на променливи на клас, други класове нямат достъп до тях
// само методите на класа имат.

// ВАЖНО ПРАВИЛО 
// Всеки път когато имаме instance variable трябва да бъде private




public class Lesson1_Encapsulation {
    public static void main(String[] args) {

        Lesson1_Human human = new Lesson1_Human();

        // Грешка при използването на променливите
        // няма как да имаме директен достъп до тях
        // human.age = 11;
        // human.name = "John";

        human.setAge(15);
        human.setName("Mike");

        System.out.println(human.getAge() + " " + human.getName());


    }
    
}
