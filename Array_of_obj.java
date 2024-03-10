class Student
{
    int roll_no;
    String name;
    int age;
}

public class Array_of_obj {
    public static void main(String[] args) {
        
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
        
        //
        Student person[] = new Student[3]; // array of object
        person[0]=s1;
        person[1]=s2;
        person[2]=s3;   
        //


        for(int i=0;i<person.length;i++)
        {
            System.out.println("Roll_no: "+person[i].roll_no);
            System.out.println("Name: "+person[i].name);
            System.out.println("Age: "+person[i].age);
            System.out.println();
        }


    }
}
