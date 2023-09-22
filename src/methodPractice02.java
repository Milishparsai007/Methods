public class methodPractice02 {

    /*
         giving object as parameter will change the value of actual object.
         whereas giving arguement as parameter will not affect the value of actual parameters.
         the method
         static void change(int X[],int index,int value)  in this the reference X[] stores the reference of A[] inside main method
         it will point to the reference holded by A[].

    */
    static void change(int X[],int index,int value)
    {
        X[index]=value;
    }

    static void change2(int a)
    {
        ++a;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int A[]={2,5,3,7,50};
        change(A,2,30);
        for (int x:A)
        {
            System.out.print(x+" ");  // value of A[] is changed because object value is changed if it is passed to a method
        }

        int a=10;
        change2(a);
        System.out.println(a);  // in this value of a i.e., actual parameter will not change

        //Note:- we can give same names to actual and formal parameters.
    }
}
