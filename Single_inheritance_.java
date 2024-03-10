 public class Single_inheritance_
{
    public static void main(String[] args)
    {
        // Repeat the same code is called Redundancy. and there is not need of it.(It is a crime in coding).

        AdvCalc obj = new AdvCalc();
        
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(10, 5);
        int r3 = obj.multi(2, 4);
        int r4 = obj.div(10, 2);

        System.out.println(r1+" "+r2+" "+r3+" "+r4);

    }    
}
