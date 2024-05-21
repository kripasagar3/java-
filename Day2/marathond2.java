
class marathon
{
    public static void main(String args[]){
   
    price obj3=new price(2,"senior",22,500,"ramesh","chennai",25,95674567899l);
    obj3.disp_admin(2);
    }
}
class user
{
    String name,place;
    int age;
    long m_num;
     public user(String name,String place,int age,long m_num)
    {
       
        this.name=name;
        this.place=place;
        this.age=age;
        this.m_num=m_num;
        System.out.println("name="+name);
        System.out.println("place="+place);
        System.out.println("age="+age);
        System.out.println("m_num="+m_num);
    }
   
}
class admin extends user
{
    String category;
    int b_num,fees;
   
     public admin(String category, int b_num,int fees,String name,String place,int age,long m_num)
    {
        super(name,place,age,m_num);
        this.category=category;
        this.b_num=b_num;
        this.fees=fees;
        System.out.println("category="+category);
        System.out.println("b_num="+b_num);
        System.out.println("fees="+fees);
       
    }
    public void disp_admin()
    {
        System.out.println("please use the refreshment");
    }
    public void disp_admin(int a)
    {
        System.out.println("you assked for "+a+"refreshment");
    }
    public void disp_admin(boolean a)
    {  
        if(a==false)
        {
        System.out.println("ok Thank you!");
        }
    }
}

class price extends admin
{
    int x;
    price(int x,String category, int b_num,int fees,String name,String place,int age,long m_num)
    {
        super(category,b_num,fees,name,place,age,m_num);
        this.x=x;
    if(x==1)
    {
        System.out.println("you got 1st price ");
    }
    else if(x==2)
    {
        System.out.println("you got 2nd price");
       
    }
    else if(x==3)
    {
        System.out.println("you got 3rd price");
       
    }
   
    else
    {
        System.out.println("you got certificate");
    }
    }
   
}
