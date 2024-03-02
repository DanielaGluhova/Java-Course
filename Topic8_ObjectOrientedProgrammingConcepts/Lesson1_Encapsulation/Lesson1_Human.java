package Topic8_ObjectOrientedProgrammingConcepts.Lesson1_Encapsulation;

public class Lesson1_Human {
    // Private променлива може да бъде достъпена само от собствения си клас
    // ВАЖНО ПРАВИЛО 
    // Всеки път когато имаме instance variable трябва да бъде private
    private int age = 11;
    private String name = "John";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }


    
}
