class Student
{
    int roll_no;
    String name;
    int age;
}


public class Enhanced_for_loop
{
    public static void main(String[] args) {
        
        
        //Inhanance For loop ---------------
        
        int arr[]={10,20,30,40,50};

        for(int x : arr)
        {
            System.out.println(x);
        }
        
        





        System.out.println();
        
        int arrd[][] = new int[5][5];


        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arrd[i][j]=(int) (Math.random() * 10);
            }
        }


        for(int n[] : arrd)
        {
            for(int m : n)
            {
                System.out.print(m +" ");
            }
            System.out.println();
        }






        System.out.println();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        
        s1.roll_no = 1;
        s1.name = "Kishan";
        s1.age = 19;
        
        s2.roll_no = 2;
        s2.name = "Rahul";
        s2.age = 21;
        
        s3.roll_no = 3;
        s3.name = "Raj";
        s3.age = 25;


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for(Student s : students)
        {
            System.out.println(s.name);
        }

        

    }
}
