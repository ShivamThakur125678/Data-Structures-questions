import java.util.*;
public class phoneno
{
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> hmap= new HashMap<>();
		System.out.println("Enter input size");
		int n=sc.nextInt();
		String s;
		for(int i=0;i<n;i++)
		{
			s=sc.next();
			int a=sc.nextInt();
			hmap.put(s,a);
		}
		for(int i=0;i<n;i++)
		{
			String s1=sc.next();
			if(hmap.get(s1)!=null)
			{
				System.out.println(s1+" = "+hmap.get(s1));
			}
			else
			{
				System.out.println("Not Found");
			}
		}
	}
}