import javapack.*;
import javapack.subjk.*;
class sample1 extends car implements acc
{
    String color ="white";
    int seater= 7;
    int maxspeed = 200;
    public void displaydetails()
    {
        super.display();

       System.out.println("car color"+color);
       System.out.println("car seat counr"+seater);
       System.out.println("max speed"+maxspeed);
        System.out.println(so_version);
        System.out.println(so_name);
        System.out.println(sc_size);
        System.out.println(sc_type);
        
    }
    public void sounddisplay()
    {
        System.out.println("hi");
    }
    public void screedisplay()
    {

        System.out.println("hello");

    }

}

class carpak{

    public static void main(String args[]){
       sample1 s=new sample1();
       s.displaydetails();
       s.sounddisplay();
       s.screedisplay();
    }
}


