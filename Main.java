import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int i,j,k,s;
        String n="program";
        s = n.length();
        int a=s/2;
        int b=a;
        int c=a;
        for (i=0;i<=s/2;i++)
        {
            for (k=i;k<c;k++)
            System.out.print(" ");
            for (j=a;j<=b;j++)
            {
                System.out.print(n.charAt(j));
            }
            a--;
            b++;
            System.out.println();
        }
        
    }
}
