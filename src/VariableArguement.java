public class VariableArguement {

//    static void show(int ...x)
//    {
//        for (int a:x) {
//            System.out.print(a+" ");
//        }
//        System.out.println();
//    }

      static void showList(String ...S)
      {
          for (int j=0;j<S.length;j++)
          {
              System.out.println(j+1 +"."+S[j]); //this will print the names and gifve the ibndex also
          }
      }

      static void showList(int start,String ... S)  //this method will print names with an starting index
      {
          for (int i=0;i<S.length;i++)
          {
              System.out.println(start+"."+S[i]);
              start++;
          }
      }


    public static void main(String[] args) {
//          public static void main(String ... args)  this will also run as there are variable arguements.

//        show();
//        show(10,20,30);
//        show(10,20,30,87,323);
//        show(new int[]{1,3,5,7,9,0}); // This is an anonymous array which is created for time being and utilized by method
                                      // and then deleted. We can pass objects to the method as well (array is an example).
        showList("Milish","askhay","Sanchit");
        showList(5,"Milish","askhay","Sanchit");

    }
}
