//1. overload method to find area
//2. "                " reverse an int or array
//3. "                " validate name and age


public class Challenge_02 {

    //1.
    static double area(double l,double b)   //area of rectangle
    {
        double area = l*b;
        return area;
    }

    static double area(double radius)       // area of circle
    {
        double area=Math.PI*radius*radius;
        return area;
    }

    static double area(double a,double b,double h)    // area of trapezium
    {
        double area=(a+b)*h/2;
        return area;
    }


    //2.
    static int reverse(int n)
    {
        int rev=0,digit=0;
        while (n>0)
        {
                digit=n%10;
                rev=rev*10+digit;
                n=n/10;

        }
        return rev;
    }

    static void reverse(int A[])
    {
        int rev[]=new int[A.length];
        for (int i=A.length-1,j=0;i>=0;i--,j++)
        {
            rev[j]=A[i];
        }
        for (int x:rev)
        {
            System.out.print(x+" ");
        }
    }

    //3.
    static boolean validate(String name)
    {
        return name.matches("[a-zA-z\\S]+");
    }

    static boolean validate(int age)
    {
        if (age>3 && age<=15)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        System.out.println("Area of rectangle is : "+area(15,2));
        System.out.println("Area of rectangle is : "+area(15.5,2.5));

        System.out.println("Area of circle is : "+area(2));
        System.out.println("Area of circle is : "+area(5.7));

        System.out.println("Area of trapezium is : "+area(15,15,10));
        System.out.println("Area of trapezium is : "+area(15.6547898,15.78,10.3));

        System.out.println("Reverse of a number is : "+reverse(121));
        int A[]={3,4,6,12,78};
        reverse(A);

        String name="Milish";
        System.out.println();
        System.out.println(validate(name));
        int age=61;
        System.out.println(validate(age));

    }
}
