public class methodPractice {

    int Max(int x,int y)   //x and y are formal parameters.
    {
        if(x>y)
            return x;
        else {
            return y;
        }

        //if value of formal parameters is changed then it will not affect actual parameters.
    }

    static void Inc(int x)
    {
        System.out.println(++x);
    }


    public static void main(String[] args) {

        int a=10,b=15;   //a,b are actual parameters.
//        int c;
//        c=Max(a,b);
//        System.out.println("Maximum is "+c);

        //if you want to call a non-static method then create an object of class and then call the method.
        methodPractice mp= new methodPractice();
        System.out.println("Maximum is : "+mp.Max(a,b));

        Inc(a);   // here value of a is copied to formal parameter x and the value of x is changed.
        System.out.println(a);  //value of a will be remain as it is until any changes occur in the main method.
    }
}