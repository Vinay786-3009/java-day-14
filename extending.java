//extending thread class
class a extends Thread
{
    public void run()
    {
        System.out.println("hello i'm thread");
    }
}
public class extending
{
    public static void main(String args[])
    {
        a r=new a();
        Thread s=new Thread(r);
        s.start();
        s.run();
    }
}