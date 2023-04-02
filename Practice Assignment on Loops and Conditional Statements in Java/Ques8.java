import java.util.*;
class Ques8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a,b,c values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        float large=a;
        if(b>large)
        {
            large=b;
        }
        if(c>large)
        {
            large=c;
        }
        int small=a;
        if(b<a)
        {
            small=b;
        }
        if(c<a)
        {
            small=c;
        }
        System.out.println("smallest="+small);
        System.out.println("Largest="+large);
        System.out.println("Average="+avg);
    }
}