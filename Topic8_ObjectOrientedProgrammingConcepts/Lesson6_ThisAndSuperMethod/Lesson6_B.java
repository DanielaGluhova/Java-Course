package Topic8_ObjectOrientedProgrammingConcepts.Lesson6_ThisAndSuperMethod;

public class Lesson6_B extends Lesson6_A{

    public Lesson6_B(){
        super();
        System.out.println("Constructor B");
    }

    public Lesson6_B(int n){
        // ще извика параметризирания конструктор на суперкласа
        //super(n);
        // ще извика непараметризирания конструктор на B
        this();
        System.out.println("Constructor B with int");
    }
}
