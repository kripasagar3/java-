import java.io.*;
class finale{
    public static void main(String args[]){
    demo obj=new demo();

}
}

class demo
{
    DataInputStream inp= new DataInputStream(System.in);
     final int num[]=new int[5];
    //final int num1[]={37,23,45,67,88};
    demo(){
        for(int i=0;i<num.length;i++){
           // for(int j=0;j<num.length;j++){

            //}
            try{
                num[i]=Integer.parseInt(inp.readLine());
                //num[j]=Integer.parseInt(inp.readLine());
        System.out.println("num1="+num[i]);
        }catch(Exception out){}
    }
}}
