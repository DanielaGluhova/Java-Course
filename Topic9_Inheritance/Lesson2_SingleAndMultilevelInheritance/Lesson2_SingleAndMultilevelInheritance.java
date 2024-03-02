package Topic9_Inheritance.Lesson2_SingleAndMultilevelInheritance;

public class Lesson2_SingleAndMultilevelInheritance {
    public static void main(String[] args) {
        Lesson2_Calculator calc = new Lesson2_Calculator();

        int result = calc.add(5,6);
        int result2 = calc.sub(5,6);

        System.out.println("Addition: " + result);
        System.out.println("Subtraction: " + result2);

        Lesson2_AdvancedCalculator advCalc = new Lesson2_AdvancedCalculator();

        int advAdd = advCalc.add(5, 7);
        int advSub = advCalc.sub(7, 3);
        int advMult = advCalc.multiply(5, 7);
        int advDiv = advCalc.divide(20, 2);

        System.out.println("Advanced Calculator Add: " + advAdd);
        System.out.println("Advanced Calculator Sub: " + advSub);
        System.out.println("Advanced Calculator Mult: " + advMult);
        System.out.println("Advanced Calculator Div: " + advDiv);


        Lesson2_ExtraAdvancedCalculator extraAdvCalc = new Lesson2_ExtraAdvancedCalculator();

        int extraAdvAdd = extraAdvCalc.add(5, 7);
        int extraAdvSub = extraAdvCalc.sub(7, 3);
        int extraAdvMult = extraAdvCalc.multiply(5, 7);
        int extraAdvDiv = extraAdvCalc.divide(20, 2);
        int extraAdvPow = extraAdvCalc.power(5, 2);

        System.out.println("Extra Advanced Calculator Add: " + extraAdvAdd);
        System.out.println("Extra Advanced Calculator Sub: " + extraAdvSub);
        System.out.println("Extra Advanced Calculator Mult: " + extraAdvMult);
        System.out.println("Extra Advanced Calculator Div: " + extraAdvDiv);
        System.out.println("Extra Advanced Calculator Pow: " + extraAdvPow);
        
    }
    
}
