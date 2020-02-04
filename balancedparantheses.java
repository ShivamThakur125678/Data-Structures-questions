import java.util.Scanner;
public class balancedparenthesis
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the testcases");
		int t=sc.nextInt();
		for(int a=0;a<t;a++)
		{
			System.out.println("Enter the parenthesis");
			String str=sc.next();
			int count=0;
			char ch[]=str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
			    if(ch[i]=='('&& ch[i+1]==')')
			    count=count+2;
			}
System.out.println(count);
	}
	}
}