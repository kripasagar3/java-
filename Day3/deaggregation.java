class car
{

    String c_name;
    int c_model;
    log entry1;
    car(String c_name,int c_model,log entry)
    { 
        this.entry1=entry1;
        System.out.println("c_name"+c_name+"c_model"+c_model);
        entry.display_clog();
    }

}
class bike
{
  String b_name;
   int b_model;
   log entry2;

   bike(String b_name,int b_model,log entry2)
   {
    this.entry2=entry2;
     System.out.println("b_name"+b_name+"b_model"+b_model);
     entry2.display_blog();
   }

}
class deaggregation
{
    public static void main(String args[])
    {   
        log obj2=new log(10, 15, "prasanth",15,25,"harish");
        car obj=new car("toyota",232,obj2);
        bike obj1=new bike("honda",33,obj2);

        
    }
}

