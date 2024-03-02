package Topic11_Polymorphism.Lesson2_DynamicMethodDispatch;

// Dynamic Method Dispatch - изпращане на динамичен метод
// Използваме го за да имплементираме run-time polymorphism

// По време на изпълнение ще се разбере кой метод show() ще се използва
// Тъй като зависи от това какъв обект ще се създаде

public class Lesson2_DynamicMethodDispatch {
    public static void main(String[] args) {
        
        ClassA objA = new ClassA();
        objA.show();
        
        ClassB objB = new ClassB();
        objB.show();

        ClassA objAB = new ClassB();
        objAB.show();
        
        ClassC objC = new ClassC();
        objC.show();

        ClassA objAC = new ClassC();
        objAC.show();

        // Type of parent and object of child
        // Computer laptop = new Laptop();




    }
}
