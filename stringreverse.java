import java.util.Scanner;
public class stringreverse{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase = sc.nextInt();
	for(int i=0;i<testcase;i++)
	{
	    String str= sc.next();
	    String str1[] = str.split("[.]");
	    for(int j=str1.length-1;j>=1;j--)
	    {
	        System.out.print(str1[j]+".");
	    }
	    System.out.print(str1[0]);
	}
		}
}
