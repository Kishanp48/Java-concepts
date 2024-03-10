class Hello
{

}

public class Try11
{
    public static void main(String[] args) throws ClassNotFoundException {
        
        Class.forName("Hello");
    }
}














// public class Try11 {
//     public static void main(String args[])
//     {
//         int n = 5;
//         String result = "";

//         for(int i=1;i<=n;i++)
//         {
//             if(i%2==0)
//             {
//                 result += (i+1);
//                 System.out.println(result+" E");
//             }
//             else
//             {
//                 result +=(i-1);
//                 System.out.println(result+" o");
//             }
//         }
//         System.out.println(result);
//     }
// }
