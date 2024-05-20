
import java.util.Scanner;

@FunctionalInterface
interface getdat
{
    public void display();
}
public class lambda implements getdat{
    
    public static void main(String args[])
    {
        
        getdat d=()->{ 
        };
        d.display();
    }
//@Override
public void display()
{   Scanner s=new Scanner(System.in);
   
    System.out.println("Enter value x value");
    System.out.println("Enter value y value");
    int x=s.nextInt();
    int y=s.nextInt();
    if((x==0)&& (y==0))
    {
        System.out.println("Enter a  number for addition");
    
    
}
    else{
        System.out.println((x+y));
    }

}
}
    

