package Topic13_Interfaces.Lesson2_MoreOnInterfaces;

public class B implements A, Y{
    public void show(){
        System.out.println("Class B in show");
    }
    public void config(){
        System.out.println("Class B in config");
    }
    public void run(){
        System.out.println("Class B in run");
    }
    
}
