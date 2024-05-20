import java.util.ArrayList;
import java.util.Iterator;
public class arraylink {
    public static void main(String args[])
    {
        sample s=new sample();
    }

    
}
class sample{
  ArrayList <String> a1=new ArrayList<String>();
  sample()
  {
    a1.add("apple");
    a1.add("mango");
    a1.add("graps");
    a1.add("banana");
    a1.add("orange");
    a1.add("lemon");
    a1.set(0, "papaya");
    long starttime=System.nanoTime();
  for(String element:a1)
{
    //System.out.println(element);
    
}  
long endtime=System.nanoTime();
long time2=endtime-starttime;



Iterator itr= a1.iterator();  
long starttime1 =System.nanoTime();
  while(itr.hasNext()){
System.out.println(itr.next());
  
  }
    long endtime1=System.nanoTime();
    long time1=endtime1-starttime1;

     System.out.println(time1);
     System.out.println(time2);

  }
}




//System.out.println(itr.next());
//System.out.println(a1.set(3, "papaya"));
