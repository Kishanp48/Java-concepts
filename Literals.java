public class Literals {
    public static void main(String args[])
    {
        // Literals

        int num1 = 0b101;   // binary value, syntax: 0b'binary_number'. like 5 = 101 (decimal to binary)
        int num2 = 0x7E;   // binary value, syntax: 0x'hexadecimal_number'. like 126 = 7E (decimal to hexadecimal)

        System.out.println(num1);
        System.out.println(num2);

        int amount = 1_00_00_00_000;     // java supports underscore(_) between numbers to make large numbers read and understand
                                    // works in code only
        int n = 1_000;
        System.out.println(amount);
        System.out.println(n);

        double d1 = 1.2e5;   // it means : 1.2 multiply 10 raised to 10  (1.2*(10)^10)   = 120000
        double d2 = 12E5;   // it means : 12 multiply 10 raised to 10  (1.2*(10)^10)   = 1200000
        double d3 = 12e15;   //(it evaluates answer because of value) ex: 12e15 = 1.2e16 <----
                            // works only in double or decimal
        System.out.println(d1);    
        System.out.println(d2);
        System.out.println(d3);



        char ch = 'a';

        System.out.println(ch);

        ch++;                       //this will work
        System.out.println(ch);

        ch += 1;                    //this will work
        System.out.println(ch);
        
        // ch = ch + 1;             //this will not work
        // System.out.println(ch);
    }
}
// 6