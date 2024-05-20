interface section
{
    public void disp();

}
 abstract class building
 {
    String bname="A-block";
    String incharge="suriya";
    
      abstract public void dispbuilding();
     

 }

public class anonyschool {
    public static void main(String[] args) {
        building t=new building() {
            public void dispbuilding(){
            System.out.println(bname);
            System.out.println(incharge);
            }
        };t.dispbuilding();

        
        
    }
    
}
