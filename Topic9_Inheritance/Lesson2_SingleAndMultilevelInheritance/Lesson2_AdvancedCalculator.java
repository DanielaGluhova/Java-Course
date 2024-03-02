package Topic9_Inheritance.Lesson2_SingleAndMultilevelInheritance;

// Single Level Inheritance (Една ниво на наследяване)
// Advanced Calculator наследява Calculator и може да използва методите му
// Advanced class става child class (Дете, Sub class(Подклас))
public class Lesson2_AdvancedCalculator extends Lesson2_Calculator{
    
    public int multiply(int n1, int n2){
        return n1*n2;
    }

    public int divide(int n1, int n2){
        return n1/n2;
    }
}
