package Topic8_ObjectOrientedProgrammingConcepts.Lesson5_DefaultVSParametrizedConstructor;

public class Lesson5_DefaultVSParametrizedConstructor {
    public static void main(String[] args) {
        
        Lesson5_Human human = new Lesson5_Human();

        System.out.println(human.getName() + " " + human.getAge());

        Lesson5_Human human2 = new Lesson5_Human(22, "Mike");

        System.out.println(human2.getName() + " " + human2.getAge());

    }
    
}
