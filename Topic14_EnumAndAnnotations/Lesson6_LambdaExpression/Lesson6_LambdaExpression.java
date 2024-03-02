package Topic14_EnumAndAnnotations.Lesson6_LambdaExpression;

// Можем да използваме lambda expression само с functional interface

public class Lesson6_LambdaExpression {
    public static void main(String[] args) {

        // A obj = new A(){
        //     // Anonymous inner class
        //     @Override
        //     public void show() {
        //         System.out.println("Class A in new show");
        //     }
        // };
        // obj.show();

        // Lambda expression - съкратихме изписването на по-горния анонимен метод
        // A obj = () -> {
        //     System.out.println("Class A in new show");
        // };
        // obj.show();

        // Lambda expression - ако метода има параметър
        // A obj = a -> {
        //     System.out.println("Class A in new show with " + a);
        // };
        // obj.show(5);

        // Lambda expression - ако има повече от един параметър
        // A obj = (a,b) -> {
        //     System.out.println("Class A in new show with " + a + " and " + b);
        // };
        // obj.show(5, 6);

        // Lambda expression - с метод който връща стойност (return)
        // A obj = (a,b) -> {
        //     return a + b;
        // };
        
        A obj = (a,b) -> a + b;

        System.out.println(obj.show(5, 6));
    }
    
}
