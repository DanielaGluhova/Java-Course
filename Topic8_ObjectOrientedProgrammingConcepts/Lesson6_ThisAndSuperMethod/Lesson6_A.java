package Topic8_ObjectOrientedProgrammingConcepts.Lesson6_ThisAndSuperMethod;

// Всеки клас има супер клас по дефоулт суперкласа е Object


// Super клас за class B
public class Lesson6_A extends Object{

    public Lesson6_A(){
        super(); // Default method
        System.out.println("Constructor A");
    }

    public Lesson6_A(int n){
        super();
        System.out.println("Constructor A with int");
    }

    
}
