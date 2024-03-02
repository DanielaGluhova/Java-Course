package Topic13_Interfaces.Lesson2_MoreOnInterfaces;

// Class - class -> extends
// Interface - interface -> extends
// Class - interface -> implements

public class Lesson2_MoreOnInterfaces {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area+" "+A.age);

        X obj2 = new B();
        obj2.run();

    }
    
}
