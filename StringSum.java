import java.util.Scanner;
public class StringSum{
   public static void main(String[] args){
        int s=0;
        String result="false";
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("given String is: "+a);
    
        for(int i=0;i<a.length(); i++){
            String  k=a.substring(i,i+1);
            int j=Integer.parseInt(k);
            if(j%2!=0){
                s=s+j;
        
            }
             }
System.out.println("sum = "+s);
if(s%2!=0){
    result="odd";
}
else{
    result="even";
}
System.out.println("result = "+result);

}

}
