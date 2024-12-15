// using isAlive method
public class lambda2 {
    public static void main(String args[])
    {
        Runnable r=()->System.out.println("iam from java8 version");
        Thread t=new Thread(r);
   System.out.println(t.isAlive());

    }
}
