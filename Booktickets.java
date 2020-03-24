import java.util.Scanner;

public class Booktickets{
    public static void main(String args[]){
        System.out.println("enter arrary of elements you want to enter depending on given limit of persons:");
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int i;
    int age[]=new int[n];
    System.out.print("Enter array Elements depending on the ages:"+"\t"+"\n");
    for( i=0;i<n; i++){
         age[i]=sc.nextInt();
        System.out.print(age[i]+" ");
        }
        if(n>10){
                System.out.println("\nenter only 10 or lessthan 10 people details");
            }
            else{
        for( i=0;i<n; i++){
        if(age[i]>50){
            System.out.println("\n"+age[i]+": "+"allot lower birth");
        }
        else if(age[i]<10) {
            System.out.println("\n"+age[i]+": "+"allot lower birth");
        }
        else{
            System.out.println("\n"+age[i]+": "+"allot higher birth");
        }
        }
        }
        
        
    }
    }