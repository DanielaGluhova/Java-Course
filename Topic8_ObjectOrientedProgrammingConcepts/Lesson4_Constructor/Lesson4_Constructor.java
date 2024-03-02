package Topic8_ObjectOrientedProgrammingConcepts.Lesson4_Constructor;

// Constructor
// Constructor - е метод, който се изпълнява само при създаването на обекта

public class Lesson4_Constructor {

    public static void main(String[] args) {
        Lesson4_Human human = new Lesson4_Human();

        System.out.println(human.getAge()); // 0 -> constructor -> default value 11
        System.out.println(human.getName()); // null -> constructor -> default value "John"

        human.setAge(22);
        human.setName("Mike");


        System.out.println(human.getAge()); // 0 -> constructor -> default value 11
        System.out.println(human.getName()); // null -> constructor -> default value "John"

    }
    
}
