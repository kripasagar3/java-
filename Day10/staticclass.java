class building
{
    int totalrooms=2;
    String incharge="suriya";
    int peoples=4;
    static class floorone
    {
        int room1=2;
        String members="ram,sam";
        {
            //System.out.println("incharge  "+incharge);  //by using static we cannot access the sub class
            //System.out.println("peoples in building  "+peoples);
        //System.out.println("first floor people "+room1);
        System.out.println("first floor members  "+members);
        
        }

    }
    class floortwo
    {
        int room1=3;
        String members="prabu,prsath";
        {
            System.out.println("incharge  "+incharge);
            System.out.println("peoples in building  "+peoples);
        System.out.println("second floor dpeople  "+room1);
        System.out.println("second floor members  "+members);
        }
        
    }
}


class staticclass
{
    public static void main(String args[])
    {
      
       building.floorone f1=new floorone.building();
       System.out.println(f1.room1);
       building.floortwo f2=b.new floortwo();

       
    }
}
