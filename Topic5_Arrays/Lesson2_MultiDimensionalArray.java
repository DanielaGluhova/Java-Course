package Topic5_Arrays;

// Многомерният масив е масив от масиви. ( Multi-dimensional array )

// Многомерните масиви са полезни, когато искате да съхранявате данни в таблична форма,
// като таблица с редове и колони.

// За достъп до елементите на масива, се използват два индекса: 
// един за масива и един за елемента в този масив.

public class Lesson2_MultiDimensionalArray {

    public static void main(String[] args) {

    //int[][] numMultiDimArray = {{1,2,3},{4,5,6},{7,8,9}};
    // празен масив
    int emptyArray[][] = new int[3][4];

        // запълване на масива
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                // рандомно генериране на едноцифрени числа 
                //(ако искаме да включом двуцифрени ще умножим по 100)
                emptyArray[i][j] = (int)(Math.random() * 10);
            }
            
        }

        // извеждане на масива в табличен вид
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(emptyArray[i][j] + " ");
            }
            System.out.println();
        }


        // извеждане на масива в табличен вид без да споменаваме дължината
        for(int n[] : emptyArray) {
            for(int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
    
}


