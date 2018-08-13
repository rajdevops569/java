import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        int n=121, m, a = 0,x;
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        if(a == m)
        {
            System.out.println("Given number "+m+" is Palindrome");
        }
        else
        {
            System.out.println("Given number "+m+" is Not Palindrome");
        }
    }
}