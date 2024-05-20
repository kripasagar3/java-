import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;


class linkedlist {
    public static void main(String[] args) {
        link l=new link();
        l.forprin();
        l.iterat();
        l.listinter();
        l.foreach();
    }
    
}

class link
{  
    LinkedList<String> li =new LinkedList<String>();
  link()
    {
       // Scanner inp=new Scanner(System.in);
        //System.out.println("add for linkedin");
        li.add("kripa");
        li.add("sagar");
        li.add("ram");
        li.add("guru");
        li.add("sam");
        li.add("bala");
        li.add("prabu");
        li.add("sagar");
        li.add("sugumar");
        li.add("shuvin");
        li.add("kamalesh");
        li.add("bala");
    }


    public void forprin()
    { System.out.println("forprin");
        for (String element:li)
    {
          System.out.println(element);
      }
    }

public void iterat()

{
    System.out.println("iterat");
      Iterator it=li.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
}
//public void spliter()
{
    //System.out.println(("spliterator"));
     //Spliterator sp=li.spliterator();
        //splitr.forEachRemaining((n)->System.out.println(n));
    
}
public void listinter()

   {  System.out.println("listner");
    ListIterator ls=li.listIterator();
     while(ls.hasNext())
     {
       System.out.println(ls.next());
    }
}
public void foreach()
{
    System.out.println("foreach");
    li.forEach(prin->System.out.println(prin));

} 
}

