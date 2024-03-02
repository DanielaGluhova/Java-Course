package Topic5_Arrays.Lesson5_ArrayOfObjects;

public class Lesson5_ArrayOfObjects {
    public static void main(String[] args) {

        int nums[] = new int[6];

        nums[0] = 3;
        nums[1] = 7;
        nums[2] = 2;
        nums[3] = 4;

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


        // Създаване на 3 обекта с инициализиране на полетата им

        Lesson5_Student student1 = new Lesson5_Student();

        student1.rollno = 1;
        student1.name = "John";
        student1.marks = 90;

        Lesson5_Student student2 = new Lesson5_Student();

        student2.rollno = 2;
        student2.name = "Mike";
        student2.marks = 80;

        Lesson5_Student student3 = new Lesson5_Student();

        student3.rollno = 3;
        student3.name = "Mary";
        student3.marks = 70;



        // Създаване на масив от Студенти(обекти)

        Lesson5_Student students[] = new Lesson5_Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;


        for(int i=0;i<students.length;i++){
            System.out.println("Rollno: "+students[i].rollno);
            System.out.println("Name: "+students[i].name);
            System.out.println("Marks: "+students[i].marks);
        }

    }
    
}
