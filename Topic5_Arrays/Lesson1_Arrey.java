package Topic5_Arrays;


// Arrays - масиви
// Защо ние е нужен масив?
// Ако трябва да съхраним числата (5,6,7) в променливи
// int i = 5; int j = 6; int k = 7;
// но вместо да създаваме няколко променливи
// може да ги съхраним в едена (масив). 
// В масива можем да съхраним много числа:
// int[] numbers = {5,6,7};

// Ако не знаем стойностите може да създадем празен масив но може да му зададем ограничение
// int[] numbers = new int[3];

public class Lesson1_Arrey {

    public static void main(String[] args) {
        int[] nums = {3,7,2,4};
        // извежда цифрата 3
        System.out.println(nums[0]);
        // промяна на стойност
        nums[2] = 6;
        System.out.println(nums[2]);

        int[] nums1 = new int[3]; // празен масив с ограничение
        nums1[0] = 5;
        nums1[1] = 6;
        nums1[2] = 7;


        System.out.println(nums1[2]);

        // извеждане на всички стойности на масив
        for(int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }



    }
}
