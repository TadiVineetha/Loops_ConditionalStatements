import java.util.*;
public class Triangle6 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //int n=5   //to print pattern directly without i/p
        int n=sc.nextInt(); //to print pattern taking i/p from user
        for(int i=1;i<=n;i+=2)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>0;i-=2)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();            
        }
    }
}