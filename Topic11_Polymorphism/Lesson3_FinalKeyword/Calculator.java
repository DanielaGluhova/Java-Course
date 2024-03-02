package Topic11_Polymorphism.Lesson3_FinalKeyword;

//final class Calculator { - не може да бъде наследяван

public class Calculator {
    final void show(){
        System.out.println("Calculator in show");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}
