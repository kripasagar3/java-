import java.io.*;

public class string_pass

{

   public static void main(String args[])

   {

       int count=0;

       String name="hari";

       String e_mail="kripa";

       String pass="Kripa@1234";

       char[] p = pass.toCharArray();

       //int p[]=pass.toIntarray();

       String name1=new String("hari,nandi");

       String place="salme";

       int len=pass.length();

       //System.out.println(name+name1+place);

       System.out.println(e_mail+"@gmail.com");

       for(int i=0;i<len;i++)

       {

           //System.out.println(p[i]);

   if(len>=8){  

           if(((p[i]>='A')&&(p[i]<='Z'))||

           (p[i]>='a')&&(p[i]<='z')|| 

           (p[i]>=0)||(p[i]<=9)||(p[i]=='@'))

           {

               System.out.println("you password is valid ");

           }

           else

           {

               System.out.println("Enter the valid characters");

           }

   }

   else

          {

           System.out.println("your password need more than 8 in length");    

       

       }

   

   }

}
}
