class privateaccess {
    public static void main (String args[]) 
    {

sample2 s=new sample2();
s.display2("sagar", 22,"Erode");

    }
}
    
class sample
    {
       private String name;
      int age;
      public void display(String name,int age)
      {
         System.out.println(name);
         System.out.println(age);
      }
    }
class sample2 extends sample
{
    
      
       private void display2(String name,int age,String place)
      {
        super.display(name,age);
        this.age=age;
        this.name=name;
        System.out.println("sample2");
         System.out.println(name);
         System.out.println(age);
         System.out.println(place);
        
      }
    }



