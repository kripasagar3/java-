class threadsleep 
{
     public static void main(String args[])
    {
      
       Asec a1=new Asec();
       a1.start();
       for(int j=1;j<=10;j++)
       {
         for(int i=1;i<=10;i++)
       {
        try{
        System.out.println("student"+i);
        Thread.sleep(100);
        }catch(InterruptedException b){}
    }
}
    }
}



class Asec extends Thread
{

    
      public void run()
            { 
               for(int i=0;i<=100;i=i+10)
               {
               try{
               System.out.println("Total no  of students"+i);
               Thread.sleep(1000);
            }catch (InterruptedException a){}
        }

            }    
    
}
