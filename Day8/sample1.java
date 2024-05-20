import packjava.carinfo.*;
public class sample1 extends display
{
    String name,model;
    int sales;
    public void displaydetails(String name,String model,int sales_c)
    {
        this.name=name;
        this.model=model;
        this.sales_c=sales_c;
    }
}

class carpak{

    public static void main(String args[])
    {
       sample1 s=new sample1();
       s.displaydetails("bmw", "Z45", 10);
    }
}

