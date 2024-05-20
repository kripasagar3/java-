import javapack.car;
public class cardemo extends car
{
    String color ="white";
    int seater= 7;
    int maxspeed = 200;
    cardemo()
    {
        super.display();
        System.out.println(color);
        System.out.println(seater);
        System.out.println(maxspeed);
}
class maincar
{
    public static void main(String arg[]){
cardemo c=new cardemo();

    }
}


}


