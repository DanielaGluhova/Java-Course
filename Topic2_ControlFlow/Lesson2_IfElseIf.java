package Topic2_ControlFlow;

// Conditional statements - условни твърдения - if-else-if

public class Lesson2_IfElseIf {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 9;
    
        if(x>y && x>z){
            System.out.println("x is greater than y and z");
    
        }else if(y>z){
            System.out.println("y is greater than x and z");
        }else{
            System.out.println("z is greater than x and y");    
        }
    }

}
