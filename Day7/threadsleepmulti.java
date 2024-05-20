class threadsleepmulti 
{
    public static void main(String args[])
    {
      sample s=new sample();
      sample1 s1=new sample1();
      s.start();
     // try{ s.join(1000);   }catch (InterruptedException a){}
      s1.setName("for-");
      s1.start();

    }
}
class sample extends Thread
{
 
 public void run()
    {

      
        char n[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i=0;i<n.length;i++)
        {
        System.out.print(n[i]+" ");
        
        try{
        Thread.sleep(1450);
    

        }catch(InterruptedException d){}
    }

}
 
}
class sample1 extends Thread
{  
    public void run()
    {
        String stu []={"Antilope","Bull","Cat","Dog","Elephant","Frog","goat","Horse","Impala","Jaguar","Kangaroo","Lion","Monkey","Neapolitan","Ostrich","Peacock","Quail","Rabbit","Snake","Tiger","Umbrellabird","Vampire-Bat","Wolf","Xerus","Yak","Zebra"};
        for(int i=0;i<stu.length;i++){

        System.out.println(Thread.currentThread().getName()+stu[i]);

        try{
        Thread.sleep(1500);
      
        }catch(InterruptedException d){}
    }
}
}