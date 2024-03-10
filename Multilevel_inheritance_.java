public class Multilevel_inheritance_ extends VeryAdvCalc
{
    public static void main(String[] args)
    {

        VeryAdvCalc obj = new VeryAdvCalc();
        
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(10, 5);
        int r3 = obj.multi(2, 4);
        int r4 = obj.div(10, 2);
        double r5 = obj.power(2, 3);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);

    }         
}
