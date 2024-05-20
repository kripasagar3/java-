class threadprior
{
    public static void main(String args[])
    {

    }
}
class sample1 extends Thread
{
    public void run()
    {   int x=10,y=15; 
        System.out.println("Add"+x+y);
    }
}
class sample2 extends Thread
{
    public void run()
    {   int x=10,y=15; 
        System.out.println("subtraction" +y-x);
    }
}
class sample3 extends Thread
{
    public void run()
    {   int x=10,y=15; 
        System.out.println("modules"+x%y);
    }
}