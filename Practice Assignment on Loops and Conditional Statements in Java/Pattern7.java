import java.util.*;
public class Pattern7 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //int n=5   //to print pattern directly without i/p
        int n=sc.nextInt(); //to print pattern taking i/p from user
        for (int i = n; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
