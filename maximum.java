import java.util.*;
class maximum{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
                arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);     
            {
                 System.out.println("first largest is" +arr[n-1]);
                System.out.println("second largest is" +arr[n-2]);
            }
    }
}