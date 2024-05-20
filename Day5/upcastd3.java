 class upcastd3 {
    public static void main(String args[])
    {
      
      stu1 obj1=new stu2();
      obj1.mor();

    }
}

class stu1
{
    public void mor()
    {
        System.out.println("Enter morning");
    }
}
class stu2 extends stu1
{
    public void mor()
    {
        System.out.println("Enter with late");
    }
    public void eve()
    {
        System.out.println("Enter");
    }
}