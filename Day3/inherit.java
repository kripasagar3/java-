import java.lang.*;
class student
{
    String name="ram";
    int age=25;
    String branch= "IT";
    public void display_student()
    {
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("branch"+branch);
    }
}

class teacher extends student
{   
    int salary=30000;

    public void display_teacher()
{   
    super.display_student();
    System.out.println("salary"+salary);

}

}
class admin extends teacher{
  int joining_yr=2020;
  public void display_admin()
  {
    super.display_teacher();
    System.out.println("joining_year"+joining_yr);
  }

}

public class inherit
{
  public static void main(String args[])
  {
    admin obj=new admin();
    obj.display_admin();

  }
}
