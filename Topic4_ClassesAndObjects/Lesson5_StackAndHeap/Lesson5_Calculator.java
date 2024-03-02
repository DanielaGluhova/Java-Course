package Topic4_ClassesAndObjects.Lesson5_StackAndHeap;

public class Lesson5_Calculator {

    // num е instance variable - променлива на екземпляра
    // тоест ние ще може да използваме num в метода add()
    int num = 5;

    public int add(int n1,int n2){
        System.out.println(num);

        // n1 и n2 са локални променливи(local variables) 
        // тоест ние може да използваме n1 и n2 само в метода add()
        return n1+n2;
    }
    
}
