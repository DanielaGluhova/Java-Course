package Topic2_ControlFlow;



public class Lesson3_Ternary {
    public static void main(String[] args) {
        // Четно или нечетно число
        int n=4; 
        // ?: - Ternary Operator
        String result = n%2==0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
