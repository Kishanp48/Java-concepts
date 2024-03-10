class Shop
{
    public String buy_a_pen(int cost)
    {
        if(cost<10) return "you dont have enougn money";

        if(cost>10)
        {
            return "here is your pen and change rs " + (cost-10);
        }

        return "here is your pen";
    }
}

public class Pen_cost
{
    public static void main(String args[])
  
    {
        Shop shopkeeper = new Shop();

        int money =12;

        System.out.println(shopkeeper.buy_a_pen(money));

    }
}
