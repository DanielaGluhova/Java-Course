package Topic8_ObjectOrientedProgrammingConcepts.Lesson3_ThisKeyword;

public class Lesson3_ThisKeyword {

    public static void main(String[] args) {
        Lesson3_Human human123 = new Lesson3_Human();

        human123.setAge(15, human123);
        human123.setName("Mike");


        System.out.println(human123.getAge());
        System.out.println(human123.getName());
    }
    
}
