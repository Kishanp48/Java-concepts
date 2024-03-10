public class Type_casting {
    public static void main(String args[])
    {
        // implicit type-casting
            int a1 = 12;
            byte b1= 125;
            
            a1=b1;  // because integer can store values of byte directly
            System.out.println(a1);

        // explicit type-casting
            int a2 = 12;
            byte b2 = 125;

            b2=(byte)a2;    // because byte can't store value of integer directly
            System.out.println(b2);

            float f = 2.5f;

            int i = (int)f; // but it will loose the pointer value(value after point)
            System.out.println(i);
    }
}
// 7