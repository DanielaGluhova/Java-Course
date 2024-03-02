package Topic5_Arrays;

// Jagged and 3D Array
// Jagged Array (неравномерен/назъбен масив) - неправилен масив, е масив от масиви,
// чиито масиви-членове могат да бъдат с различни дължини,
// създавайки редове, когато се визуализират като неравномерни.

public class Lesson3_JaggedAnd3DArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][]; // jagged array
        // по индекси на масива се задава дължина на членовете на масива
        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[4];
        

        // запълване на масива
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                // рандомно генериране на едноцифрени числа 
                //(ако искаме да включом двуцифрени ще умножим по 100)
                nums[i][j] = (int)(Math.random() * 10);
            }
            
        }

        // извеждане на масива в табличен вид
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


        // извеждане на масива в табличен вид без да споменаваме дължината
        for(int n[] : nums) {
            for(int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();


        // 3D Array
        // 4 масива с по 2 масива от 10 елемента
        int threeDimensionalArray[][][] = new int[3][2][10];

        for(int i = 0; i<threeDimensionalArray.length; i++){
            for(int j = 0; j<threeDimensionalArray[i].length; j++){
                for(int k = 0; k<threeDimensionalArray[i][j].length; k++){
                    threeDimensionalArray[i][j][k] = (int)(Math.random()*10);
                }
            }
        }

        for(int i = 0; i<threeDimensionalArray.length; i++){
            for(int j = 0; j<threeDimensionalArray[i].length; j++){
                for(int k = 0; k<threeDimensionalArray[i][j].length; k++){
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        for(int n[][]:threeDimensionalArray){
            for(int m[]:n){
                for(int o:m){
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
   


}
