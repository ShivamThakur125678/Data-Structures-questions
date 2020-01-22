import java.util.*;
class leader{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int k=0;k<t;k++){
        
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int max;
    max=arr[n-1];
    System.out.println(max);
    for(int j=n-2;j>=0;j--){
        if(max<arr[j]){
            max=arr[j];
            System.out.println(max);
        }
        }