class threadyeild{
    public static void main(String args[])
    {
       sample s=new sample();
       sample1 s1= new sample1();
        Thread t=new Thread(s);
        Thread t1=new Thread(s1);
        t.start();
        t1.start();
    }

}
class sample extends Thread
{
    public void run()
    { 
        for(int i=0;i<=5;i++){
        System.out.println("num*1+"+i);
        }
    }
}
class sample1 extends Thread{
    public void run()
    {    Thread.yield();
        for(int j=0;j<=100;j+=10)
        {
            System.out.println("num*10+"+j);
        }
    }
}