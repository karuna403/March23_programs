import java.util.Scanner;

public class ModifiedJim {
    public static void main(String args[]) {
        System.out.println("enter no of days he worked:");
        Scanner sc=new Scanner(System.in);
      int no_of_days=sc.nextInt();
      System.out.println("no of days he worked:"+" "+no_of_days);
       
     int salary=0;
      
      if(no_of_days<0|| no_of_days>31 ){
          System.out.println("invalid inputs");
      }
     
      
     else {
        System.out.println("Enter salary:");
      int s=sc.nextInt();
         if(s>10000 || s<0){
         System.out.println("invalid inputs");
     }
     else{
    
    
        if(no_of_days==31){
          salary=s+500;
      System.out.println("Total Salary = "+salary);
      }
      else {
          salary=s;
          System.out.println("Total Salary = "+salary);
      }
      int houserent_p=50;
      int special_p=75;
     float houserent=(float)(salary*houserent_p)/(float)100;
     
     System.out.println("houserent="+" "+houserent);
     float r_s=salary-houserent;
     float s_a=(r_s*(float)special_p)/(float)100;
      System.out.println("Special Allowances="+" "+s_a);
      float r_gross_salary=salary-houserent-s_a;
      System.out.println("Remaining gross salary="+" "+r_gross_salary);
      }
     }     
     }
    }
