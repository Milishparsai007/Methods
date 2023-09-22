//1. Max of numbers using varargs
//2. Sum of all elements using varargs
//3. Calculate discount using varargs


public class Challenge_03 {

    //1.
    static int max(int ...x)
    {
        int max=0;
        if (x.length==0) {
            max = 0;
        }
        else if(x.length==1) {
            max = x[0];
        }

        else
        {
            max=x[0];
            for (int i=0;i<x.length;i++)
            {
                if (max<x[i])
                {
                    max=x[i];
                }
            }
        }
        return max;
    }

    //2.
    static int sum(int ...x)
    {
        int sum=0;
        if (x.length==0)
            sum=0;
        else if(x.length==1)
            sum=x[0];
        else {
            for (int i = 0; i < x.length; i++) {
                sum = sum + x[i];
            }
        }
        return sum;
    }

    //3.
    // in this we have to calculate the discount provided that the customer has purchased things and we will give price of things
    //as argument to this method.

    static double discount(double ...d)
    {
        double sum=0,disc=0;
        for (int i=0;i<d.length;i++)
        {
            sum+=d[i];
        }
        if (sum<=100)
            disc=sum*0.10;
        else if (sum>100 && sum<500)
            disc=sum*0.25;
        else
            disc=sum*0.3;

        return disc;
    }



    public static void main(String[] args) {
        System.out.println("Max of numbers is : ");
        System.out.println(max(10,2,8,7,50,0,9));
//        System.out.println(max());
//        System.out.println(20);

        System.out.println("SUm of all elements is : ");
        System.out.println(sum(10,20,56,97));
        System.out.println(sum(new int []{1,3,4,5,12,56,76})); //our method also takes array as an argument.

        System.out.println("Discount customer has got : ");
        System.out.println(discount(10,20,30.56,9.87));
    }
}
