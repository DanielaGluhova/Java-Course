package Topic8_ObjectOrientedProgrammingConcepts.Lesson5_DefaultVSParametrizedConstructor;

public class Lesson5_Human {
    private int age;
    private String name;

    // Дефолтен конструктор - Default Constructor
    public Lesson5_Human() {
        age = 11;
        name = "John";
    }

    // Ако искаме всеки път когато създаваме обект да имаме опцията да 
    // подадем стойности
    // Параметризиран конструктор - Parametrized Constructor
    public Lesson5_Human(int age, String name) {
        this.age = age;
        this.name = name;
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
