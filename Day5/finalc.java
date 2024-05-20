class finalc
{
    public static void main(String args[]){
    a obj1=new b();
    obj1.tamil();
    obj1.english();
    }
}

 class a
{
public void tamil()
{
    System.out.println("All pass");
}
public void english()
{
    System.out.println("50% pass");
}
}
class b extends a
{
    public void tamil()
    {
        System.out.println("90% pass");
    }
    public void maths()
    {
        System.out.println("40% pass");
    }
}