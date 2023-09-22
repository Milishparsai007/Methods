public class MethodOverloading {

    static int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    static float max(float x,float y)
    {
        if (x>y)
            return x;
        else
            return y;
    }

    static int max(int x,int y,int z)
    {
        if (x>y && x>z)
        {
            return x;
        }
        else if (y>x && y>z) {
            return y;
        }
        else
            return z;
    }

    public static void main(String[] args) {
        System.out.println(max(10,15));
        System.out.println(max(10.5f,15.5f));
        System.out.println(max(5,7,1));
    }

}
