public class Pattern {
    public static void main(String[] args) {
    int n = 5;
    pattern16(n);
    
}
static void pattern16(int n)
{
    int[] prev = {1}; // start with row 1

    for(int i = 1; i <= n; i++)
    {
    // print spaces
    for (int s = 0 ; s< n-i; s++)
    {
        System.out.print(" ");
    }
    
    // create current row array of size i
    int[] curr = new int[i];
    
    // fill curr using prev
    for(int j=0;j<curr.length;j++)
    {
    if(j == 0 || j==i-1)  
    {
    curr[j]=1;
    }
    else{
    curr[j]=prev[j]+prev[j-1];
    }
    }
    for(int j = 0; j < curr.length; j++)
    {
        System.out.print(curr[j] + " ");
    }
    prev = curr;
    // print each element
    
    // prev = curr for next iteration
    System.out.println();
}
}
static void pattern17(int n)
{
    for(int i =1 ; i<=2*n;i++)
    {
        int c = i > n ? 2*n-i : i;

        for(int s =0 ; s < n - c;s++)
        {
            System.out.print(" ");
        }
        for(int j = c ; j >=1; j--)
        {
            System.out.print(j+"");
        }
        for(int j=2;j<=c;j++)
        {
            System.out.print(j+"");
        }

        System.out.println();
    }
}
static void pattern15(int n)
{
    for(int i = 1;i <=2*n-1 ; i++)
    {
        if(i==1)
        {
            for(int s=0;s<n-i;s++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        else if(i==2*n-1)
        {
            int row = i-n;
            for(int s=0; s<row;s++)
            {
               System.out.print(" ");
            }
            System.out.print("*");
        }
        else{
            if(i<n)
            {
                for(int s = 0 ; s<n-i;s++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int s=0;s<(2*i-n)+2;s++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else{
                int row = i-n;
                //System.out.print(row);
                for(int s = 0 ; s<row;s++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int s=0;s< 2*(n-row)-3;s++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
static void pattern14(int n )
{
    for(int i=1;i<=n;i++)
    {
        int total_co= 2*(n-i)-1;
        if(i==1)
        {
            for(int j=1 ; j<=2*n-1;j++)
            {
                 System.out.print("*");
            }
        }
        else if(i==n)
       {
         for(int s=0;s<i-1;s++)
            {
                System.out.print(" ");
            }
        for(int j=0 ; j<=n-i;j++)
            {
                 System.out.print("*");
            }
       }
       else{
        for(int s=0;s<i-1;s++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        for( int s=1;s <= 2* (n-i) -1 ;s++)
        {
             System.out.print(" ");
        }
        System.out.print("*");
       }

        System.out.println();
    }
}
static void pattern13(int n )
{
    for(int i=1;i<=n;i++)
    {
        if(i==1)
        {
            for(int s=0;s<n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=i;j++)
            {
                 System.out.print("*");
            }
        }
       else if(i==n)
       {
        for(int j=1 ; j<=2*n-1;j++)
            {
                 System.out.print("*");
            }
       }
       else{
        for(int s=0;s<n-i;s++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
        for(int s=0;s<2*i-3;s++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
       }
        System.out.println();
    }
}

static void pattern12(int n )
{
   for(int i = 1; i <= 2*n-1; i++)

{

    if(i <= n)

    {

       for(int space=0;space<i;space++)
        {
            System.out.print(" ");

        }
        for(int j = 1; j<=n-i+1;j++)
        {
            System.out.print("* ");
        }

    }

    else

    {

        int row = i - n;

        for(int space=0;space<n-row;space++)
        {
            System.out.print(" ");

        }
        for(int j = 0; j<=row;j++)
        {
            System.out.print("* ");
        }

    }

    System.out.println();

}
}
static void pattern11(int n )
{
    for(int i=1;i<=n;i++)
    {
        for(int s =0;s<i-1;s++)
        {
            System.out.print(" ");
        }

        for(int j=1;j<=n-i+1;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}

static void pattern2(int n )
{
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i+1;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
static void pattern10(int n )
{
    for(int i=1;i<=n;i++)
    {
        for(int s =0;s<n-i;s++)
        {
            System.out.print(" ");
        }

        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
static void pattern8(int n )
{
    for(int i=1;i<=n;i++)
    {
        for(int s =0;s<=n-i;s++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<2*i-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
static void pattern9(int n )
{
    for(int i=0;i<n;i++)
    {
        for(int s =0;s<i;s++)
        {
            System.out.print(" ");
        }

        int total_co= 2*(n-i)-1;
        for(int j=0;j<total_co;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
static void pattern7(int n )
{
for (int i=1;i<=n;i++)
{
    for (int s = 0;s<i;s++)
    {
        System.out.print(" ");
    }
    for(int j = 0;j<n-i+1;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
}

static void pattern6(int n )
{
    for(int i = 1 ; i<=n ; i++)
    {
        int space = n - i ;
        for(int s = 0 ; s < space ; s++)
        {
            System.out.print(" ");
        }
        for(int j=1 ; j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
