import java.util.Scanner;
public class triplet{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int s=sc.nextInt();
            int arr[]=new int[s];
            for(int i=0;i<s;i++)
            {
                arr[i]=sc.nextInt();
            }
            int flag=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    for(int k=k=j+1;k<arr.length;k++)
                    {
                        if(arr[i]*arr[i]+arr[j]*arr[j]==arr[k]*arr[k])
                        {
                            flag=1;
                            break;
                        }
                    }
                }
            }  
                if(flag==1)
                {
                    System.out.println("Yes");
                }
            }
        }
    
    
    