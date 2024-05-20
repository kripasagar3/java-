class arr2d
{
    public static void main(String args[]){
        n2d obj1=new n2d();
        diamond obj=new diamond();

}
}
    class n2d
    { 
        n2d()
        {
    int mrk[][]= {{23,34,56},{55,44,33}};
    for(int i=0;i<mrk.length;i++)
{
    for(int j=0;j<mrk[i].length;j++){
    System.out.print(""+mrk[i][j]+"\n");
    
   // System.out.println(mrk[i]);
    } 

    //System.out.println(mrk[j]);
}
    }
}
class diamond
{
    diamond()
    {
        int n=10;
        for (int i=0;i<n;i++)
        {
            System.out.println("");
            for (int j=0;j<(n-i);j++);
            System.out.print("*");
        }
    }
}