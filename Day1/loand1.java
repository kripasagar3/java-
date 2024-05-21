class loand1
{
    public static void main(String args[])
    {
        bank obj=new bank();
        
    }

}
class bankd1
  {
    bank()
    {
    byte age=30;
    boolean job=false;
    boolean securities=true;
    boolean asset=true;
    boolean  dependent=false;
    if((age>=25) && (age<=65))
    {
        System.out.println("your age is eligible ");
        if((securities==true) && (job==true))
          {
            System.out.println("you are eligible for loan");
          }
          else{
            System.out.println("you need more requirements for loan");

          }
    }
    else if(age<25)
    {
        System.out.println("you are eligible for student loan");
    }
    else if((age>65) && (dependent==true))
    {
        System.out.println("you are eligible for pensioners loan");
    }
    else 
    {
        System.out.println("you are not eligible for loan");
    }
    }
  }

