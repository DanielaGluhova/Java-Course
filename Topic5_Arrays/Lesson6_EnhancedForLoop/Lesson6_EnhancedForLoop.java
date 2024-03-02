package Topic5_Arrays.Lesson6_EnhancedForLoop;

// ForEach (Enhanced For Loop) 

public class Lesson6_EnhancedForLoop {
    public static void main(String[] args) {

        int nums[] = new int[4];
        nums[0] = 3;
        nums[1] = 7;
        nums[2] = 2;
        nums[3] = 4;

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        // ForEach (Enhanced For Loop)
        for(int n : nums){
            System.out.println(n);
        }

        
        
        Lesson6_Student s1 = new Lesson6_Student();
        Lesson6_Student s2 = new Lesson6_Student();
        Lesson6_Student s3 = new Lesson6_Student();

        s1.rollno = 101;
        s1.name = "John";
        s1.marks = 90;

        s2.rollno = 102;
        s2.name = "Mike";
        s2.marks = 80;

        s3.rollno = 103;
        s3.name = "Mary";
        s3.marks = 70;

        Lesson6_Student[] students = {s1, s2, s3};

        // ForEach (Enhanced For Loop)
        for(Lesson6_Student student : students){
            //System.out.println(student.rollno + " " + student.name + " " + student.marks);

            System.out.println(student.name + " : " + student.marks);
        }


    }
    
}
