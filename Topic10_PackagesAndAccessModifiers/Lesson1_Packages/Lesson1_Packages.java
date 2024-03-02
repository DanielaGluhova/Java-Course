package Topic10_PackagesAndAccessModifiers.Lesson1_Packages;

import Topic10_PackagesAndAccessModifiers.Lesson1_Packages.tools.AdvancedCalculator;
import Topic10_PackagesAndAccessModifiers.Lesson1_Packages.tools.Calculator;

// Packages
// Java пакета се състои от класове, интерфейси и под-пакети които са подобни.
// В Java разделяме пакетите на два типа: 
// * Вградените пакети (пакети от Java API)
// * Дефинираните от потребителя пакети.


public class Lesson1_Packages {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(3, 4));
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println(advancedCalculator.add(3, 4));
    }
    
}
