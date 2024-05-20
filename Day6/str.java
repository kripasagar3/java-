import java.io.*;
public class str
{
    public static void main(String args[])throws IOException
    {
        int count=0;
        String name="hari";
        String e_mail="kripa";
        String pass="Kripa@123";
        char[] p = pass.toCharArray();
        char[] cp = new char[10];
        //int p[]=pass.toIntarray();
        String name1=new String("hari,nandi");
        String place="salem";
        int len=pass.length();
        //System.out.println(name+name1+place);
        System.out.println(e_mail+"@gmail.com");
        for(int i=0;i<len;i++)
        {
            //System.out.println(p[i]);
    if(len>=10){  
            if(((p[i]>='A')&&(p[i]<='Z'))||
            (p[i]>='a')&&(p[i]<='z')||
            (p[i]>=0)&&(p[i]<=9)||(p[i]=='@'))
            {
                cp[i] = p[i];
                //System.out.println("you password is valid ");
                
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
    System.out.println("you password is valid ");
}
}

