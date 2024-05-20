class sample implements Runnable 
{
  //Thread t1=new Thread(this);
  public void run()
  {
    
    System.out.println("run method call");
  }
}
public class trdthread
{
public static void main(String args[])
{
    //sample s=new sample();
    //Thread t1=new Thread(s);
    Thread t1=new Thread(new sample()).start();
    //t1.start();
    t1.setName("welcome");
    System.out.println(t1.getName());

    
}
}
