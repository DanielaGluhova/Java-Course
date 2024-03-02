package Topic12_InnerClasses.Lesson1_InnerClass;


// Външния клас НЕ МОЖЕ да бъде статичен
public class ClassA {
    int age;

    public void show(){
        System.out.println("Class A in show");
    }

    // Inner class - класа B принадлежи на A
    static class ClassB{
        public void config(){
            System.out.println("Class B in config");
            
        }

    }
    
}
