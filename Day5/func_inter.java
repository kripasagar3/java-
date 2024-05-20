class func_inter
{
    public static void main(String args[])
    {
      six obj=new six();
      obj.ball();
    }
}
@FunctionalInterface
interface hani
{
    public void ball();
}
class six
{
    public void ball()
    {
        System.out.println("sixer");
    }
}