class sample implements Runnable
{
  public void Run()
  {
    System.out.println("run method call");
  }
}
public class trd_thread
{
public static void man(String args[])
{
    sample s=new sample();
    Thread t=new Thread(s);
    t.start();
}
}