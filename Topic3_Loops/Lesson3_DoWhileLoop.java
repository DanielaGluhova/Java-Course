package Topic3_Loops;

// Do while loop - тялото на цикъла се изпълнява поне веднъж
// дори услофието да е false

public class Lesson3_DoWhileLoop {
    public static void main(String[] args) {

        int i = 6;
        // i = 1;
        do {
            System.out.println("Hello "+i);
            i++;
        } while (i <= 5);

        System.out.println("Done "+i);
    }
}
