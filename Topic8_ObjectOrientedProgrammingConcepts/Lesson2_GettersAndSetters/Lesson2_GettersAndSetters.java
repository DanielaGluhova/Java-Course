package Topic8_ObjectOrientedProgrammingConcepts.Lesson2_GettersAndSetters;

// Getters and Setters
// Когато искаме да вземем стойността на променлива
// използваме метода - get
// Когато искаме да зададем стойност на променлива
// използваме метода - set


public class Lesson2_GettersAndSetters {

    public static void main(String[] args) {

        Lesson2_Human h = new Lesson2_Human();
        h.setAge(15);
        h.setName("Mike");
        System.out.println(h.getAge() + " " + h.getName());
    }
    
}
