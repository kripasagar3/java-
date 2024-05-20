class building
{
    int totalrooms=2;
    String incharge="suriya";
    int peoples=4;
    class floorone
    {
        int room1=2;
        String members="ram,sam";
        {
            System.out.println("incharge  "+incharge);
            System.out.println("peoples in building  "+peoples);
        System.out.println("first floor people "+room1);
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


class nonstaticclass
{
    public static void main(String args[])
    {
       building b=new building();
       building.floorone f1=b.new floorone();
       building.floortwo f2=b.new floortwo();
    }
}
