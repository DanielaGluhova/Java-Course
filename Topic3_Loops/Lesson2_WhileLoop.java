package Topic3_Loops;

// While loop 

public class Lesson2_WhileLoop {
    public static void main(String[] args) {

        // този цикъл ще изпринтира 5 пъти Hello и за всяко Hello 
        // ще изпринтира 2 пъти Hi
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello "+i);

            int j = 1;
            while (j<=2) {
                System.out.println("Hi "+j);
                j++;
            }
            i++;
        }

        System.out.println("Done "+i);
    }
}
