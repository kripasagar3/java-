class deaf{

public static void main(String args[])
{
 a obj= new a();
 obj.tamil();
 obj.english();
 obj.maths();
 obj.science();
}
}
class a implements b,c
{
    public void tamil()
    {
       b.super.tamil();
       c.super.tamil();
    }
    public void english()
    {
        System.out.println("a english_marks");
    }
    public void  maths(){
        System.out.println("main maths");
    }
    public void  science(){
        System.out.println("main scienc");
    }


    
}
interface b  
{
  default  public void tamil()
  {
    System.out.println("bt_interface");
  }
    public void science();
}
interface  c 
{
   default public void tamil(){
        System.out.println("ct_interface");
  }
    
  public void maths();
}

