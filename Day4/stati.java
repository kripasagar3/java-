public class stati

{
    public static void main(String args[])
    {
      vari obj=new vari();
      obj.disp1(35);
      //obj.disp2();
      obj.dis();
    }

}
class vari
{  
    static{
        System.out.println("hi before the class");
    }
    int age=23;
    static String name="abi";

    public void disp1(int age)
    { 
        this.age=age;
        System.out.println("age"+age);
    
    }
    public  static void disp2()

    {      vari obj=new vari();
            System.out.println(obj.age);

        System.out.println("name"+name);
    }
   public void dis()
   {
        System.out.println("age"+age);
    }
    
}  