package Topic8_ObjectOrientedProgrammingConcepts.Lesson3_ThisKeyword;

// this keyword 
// private in age; е променлива на обекта 
// В метода setAge параметъра int age е локална променлива

// Чрез използването на this избираме променливите на обекта
// а не локаните на метода.





public class Lesson3_Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    // Вариант без използване на this
    public void setAge(int age, Lesson3_Human human) {
        Lesson3_Human human1 = human;
        human1.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
}
