package Topic9_Inheritance.Lesson2_SingleAndMultilevelInheritance;

// Multilevel Inheritance (Няколко нива на наследяване)
// Extra Advanced Calculator наследява както AdvancedCalculator, така и Calculator и 
// може да използва техните методи.
// Advanced Calculator став родител на ExtraAdvancedCalculator
// Calculator e super class(Родител) както на AdvancedCalculator така и на ExtraAdvancedCalculator
public class Lesson2_ExtraAdvancedCalculator extends Lesson2_AdvancedCalculator{
    public int power(int n1, int n2){
        return (int) Math.pow(n1, n2);
    }
}
