import java.util.Scanner;
public class Commission {
    public static void main(String args[]) {
        System.out.println("enter input");
        Scanner sc=new Scanner(System.in);
     float sales=sc.nextFloat();
     System.out.println(sales);
     float commission=0;
     if(sales<10000 && sales>0){
         System.out.println("no commission");
         
     }
     else if(sales>10000 && sales<25000){
         commission=(sales*(float)10)/(float)100;
         System.out.println("Commission="+commission);
     }
     else if(sales>25000){
         commission=(float)500+(sales*(float)8)/(float)100;
         System.out.println("Commission="+commission);
     }
     else {
             System.out.println("invalid input");
         
     }
     
     
    }
}