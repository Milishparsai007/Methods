//1. Prime number
//2. GCD of 2 numbers
//3. Find max element in an array

import java.util.Scanner;
public class Challenge_01 {

    //1. Solution

//    static void Prime(int n)
//    {
//        int flag=0;
//        for (int i=2;i<=n/2;i++)
//        {
//            if (n%i==0)
//            {
//                flag++;
//            }
//        }
//        if (flag==0)
//        {
//            System.out.println("Number is Prime");
//        }
//        else
//        {
//            System.out.println("number is not Prime");
//        }
//    }

    //OR

       static boolean isPrime(int n)
       {
           for (int i=2;i<=n/2;i++)
           {
               if(n%i==0)
                   return false;
           }
           return true;
       }

       //2. Solution
       static int GCD(int x,int y)
       {
           int min=1,flag=1;
           if (x<y)
               min=x;
           else
               min=y;

           for (int i=1;i<=min/2;i++)
           {
               if (min%i==0)
                   flag=i;
           }
           System.out.println(flag);
           return flag;
       }

       //3. Solution

       static int arrayMax(int A[])
       {
           int max=A[0];
           for (int i=1;i<A.length;i++)
           {
               if (max<A[i])
                   max=A[i];
           }
           return max;
       }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //1. solution
//        System.out.println("Enter a number : ");
//        int n=sc.nextInt();
//        Prime(n);
        System.out.println(isPrime(91));


        //2. solution GCD
        // GCD is also called as highest common factor.
        //E.g. gcd of 10 adn 15  is '5'. 20 and 30 is '10'
        int gcd=1;
        gcd=GCD(20,30);
        System.out.println("GCD of 20 and 30 is "+gcd);


        //3. Solution
        int A[]={4,2,8,9,20,1};
        System.out.println("Maximum element in array A is : "+arrayMax(A));

    }
}
