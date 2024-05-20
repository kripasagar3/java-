public class interfa
{
    public static void main(String args[]){
    a obj=new a();
    obj.tamil();
    obj.English();
    obj. maths();

    }
}

interface marks{
    int tt_pass=45;
    void tamil();
    void English();
    void maths();
}
class a implements marks

{
public void tamil()
{
    System.out.println("ATAll pass "+tt_pass);
}
public void English()
{
    System.out.println("Ae0% -pass");
}
public void maths()
{
    System.out.println("Am0% -pass");
}
}
class b extends a
{
    public void tamil()
    {
        System.out.println("BAll pass"+tt_pass);
    }
    public void maths()
    {
        System.out.println("B50% -pass");
    }
}
