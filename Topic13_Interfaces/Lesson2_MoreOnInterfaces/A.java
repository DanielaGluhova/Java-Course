package Topic13_Interfaces.Lesson2_MoreOnInterfaces;
// Когато имаме абстрактен клас който съдържа само абстрактни методи
// е по-добре да го заменим с интерфейс
// abstract class A {

//     public abstract void show();
//     public abstract void config();
    
// }

public interface A {

    int age = 18; // по подразбиране final и static
    String area = "UK";

    // По подразбиране методите в интерфейса са public abstract
    void show();
    void config();
}


