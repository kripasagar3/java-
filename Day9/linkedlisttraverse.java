import java.util.LinkedList;

public class linkedlisttraverse {
    public static void main(String args[])
    {
sample s=new sample();
  s.forprint();
  s.foreachprint();
  s.dispindox();
  s.dispcontains();
    }
}

class sample{
    LinkedList <String>li= new LinkedList<String>();
    sample()
    {
        li.add("prabu");
        li.add("sagar");
        li.add("sugumar");
        li.add("shuvin");
        li.add("kamalesh");
        li.add("bala");  
    }

        public void forprint()
        {
            System.out.println("by for loop------------");
            for(String prin:li)
            {
              System.out.println(prin);
            }
        }
        public void foreachprint()
        {
            System.out.println("by foreach loop---------------");
            li.forEach(pr->System.out.println(pr));
        }
        public void dispindox()
        {
            System.out.println("print index"+li.indexOf("sagar"));
            System.out.println("print index"+li.lastIndexOf("bala"));
            }
            public void dispcontains()
            {
                System.out.println("print index"+li.contains("bala"));
                System.out.println("print index"+li.contains("prabu"));
            }
            public void adddel()
            {
                System.out.println("print index"+li.add("bala"));
                System.out.println("print index"+li.remove(5));
            }

}
