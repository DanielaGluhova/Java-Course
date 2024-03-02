package Topic8_ObjectOrientedProgrammingConcepts.Lesson4_Constructor;

public class Lesson4_Human {

    private int age;
    private String name;

    // Constructor - не връща тип и носи името на класа
    // Стойностите се приемат още при създаването на обекта
    public Lesson4_Human() {
        age = 11;
        name = "John";
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
}
