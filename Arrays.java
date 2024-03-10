public class Arrays
{
    
    public static void main(String args[])
    {

        // Single Dimensional Array----------

        int arr[] = new int[5];

        // int arr[] = {10,20,30,40,50};

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }


        System.out.println("\n");



        // Double Dimensional Array----------

        int arrd[][] = new int[5][5];


        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arrd[i][j]=(int) (Math.random() * 10);
            }
        }


        for(int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                System.out.print(arrd[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        
        
        for(int n[] : arrd) //inhance for loop
        {
            for(int m : n)
            {
                System.out.print(m +" ");
            }
            System.out.println();
        }
        
        System.out.println("\n");



        //Jagged Array --------------
        int arrj[][] = new int[5][];

        arrj[0] = new int[3];
        arrj[1] = new int[5];
        arrj[2] = new int[4];
        arrj[3] = new int[6];
        arrj[4] = new int[2];


        for(int i=0;i<arrj.length;i++)
        {
            for (int j=0;j<arrj[i].length;j++)
            {
                arrj[i][j] = (int) (Math.random() * 10);
            }
        }


        for(int x[] : arrj)
        {
            for(int y : x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");


        // Three Dimensional Array------------

        int arrt[][][] = new int[5][5][5];

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                for(int k=0;k<5;k++)
                {
                    arrt[i][j][k]=(int) (Math.random() * 10);
                }
            }
        }


        
        for(int x[][] : arrt) //inhance for loop
        {
            for(int y[] : x)
            {
                for(int z : y)
                {
                    System.out.print(z +" ");
                }
            }
            System.out.println();
        }


    }

}
