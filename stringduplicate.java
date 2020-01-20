import java.util.*;
class stringduplicate{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
        System.out.println("Enter the string");
        String str=sc.next();
        String s="";
        if(str.charAt(0)!=str.charAt(1))
        {
            s=s+str.charAt(0);
        }
        for(int i=1;i<str.length()-1;i++)
        {
            if(str.charAt(i)!=str.charAt(i-1) && str.charAt(i)!=str.charAt(i+1))
            {
                s=s+str.charAt(i);
            }
        }
        System.out.println(s);
    }
    }
}