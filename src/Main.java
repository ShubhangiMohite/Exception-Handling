
public class Main
{
    public static int greet()
    {

        try
        {
            int a = 15;
            int b = 0;
            int c = a / b;
            System.out.println("finally block ");
           // return c;
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block ");
        }
       return -1;
    }
    public static void main(String[] args)
    {
//        Main m = new Main();
//        m.greet();
        int k = greet();
        System.out.println(k);

    }
}