import java.io.*;
public class arr{

    public static void main(String args[])
    {
        DataInputStream pra=new DataInputStream(System.in);
        //int age[]={23,43,24,};
        int age[]=new int[3];
        String name[]={"prasanth","harish","prabu"};
        for(int i=0;i<age.length;i++)
        {                    
          try{
          System.out.println("Enter num");
          age[i]=Integer.parseInt(pra.readLine());
        }catch(Exception e){}
    }
        for(int i=0;i<age.length;i++)
        {
        System.out.println("ages"+age[i]+name[i]);
        }
        
    }
    }
