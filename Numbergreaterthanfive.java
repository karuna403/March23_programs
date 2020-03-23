import java.util.Scanner;

public class Numbergreatethanfive{
    public static void main(String args[]){
        System.out.println("enter arrary of elements you want to enter:");
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    int a[]=new int[n];
    System.out.print("Enter array Elements:"+"\t");
    for( i=0;i<n; i++){
         a[i]=sc.nextInt();
        System.out.print(a[i]+" ");
        }
        System.out.print("\nelements that are greaterthan 5 are:\t");
        for(i=0;i<n; i++){
         if(a[i]>5){
             System.out.print(a[i]+" ");
         }
        }
    }
    }