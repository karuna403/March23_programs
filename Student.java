public class Student{
    public int Maths;
    public int English;
    public int Science;
    public int Social;
    public String grade;


Student(){}
Student(int maths, int english, int science, int social){
    Maths=maths;
    English=english;
    Science=science;
    Social=social;
}
public String percentage(){
    int TotalMarks=Maths+English+Science+Social;
    
     float per=(float)(TotalMarks*100)/(float)400;
    System.out.println("Student got"+" "+ per+"% of Marks");

    
    if(per>60 && per<100){
        grade="Firstclass";
       
    }   
    
     else if(per>50 && per<59){
         grade="Secondclass";
        
    }
    else if(per>40 && per<49){
        grade="Thirdclass";
        
    }
    
      else{
          grade="Failed";
            
        }
        System.out.println("So, Student got"+" "+grade+"\n");
        return grade;
}
    
public static void main(String[] args){
    Student s1=new Student(100,100,100,90);
Student s2=new Student(60,60,60,50);
    
     Student s3=new Student(30,50,40,50);
      Student s4=new Student(30,30,40,40);
    
    
   s1.percentage();
    
    s2.percentage();
    s3.percentage();
    s4.percentage();
    
}
}
