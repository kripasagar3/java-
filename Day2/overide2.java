class demod2{

public void run()
{
    System.out.println("run");
}
public void run(int x,int y)
{
    System.out.println(x+y);
}
public void run(String a)
{
    System.out.println(a);
}

}




class overided2
{
    public static void main(String args[]){
        demod2 obj=new demod2();
        obj.run();


    }
    
}
