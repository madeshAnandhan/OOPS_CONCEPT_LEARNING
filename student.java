public class student {
    public static void main(String args[]){
        student1 s1=new student1();
        s1.name="madesh";
        s1.rollno="21cs084";
        s1.marks[0]=10;
        s1.marks[1]=20;
        s1.marks[2]=30;
        int sum=s1.sum();
        System.out.println(sum);
       //creating another object
        student1 s2=new student1();
        s2.name="bala";
        s2.rollno="21cs067";
        s2.marks[0]=5;
        s2.marks[1]=10;
        s2.marks[2]=11;
        int sum2=s2.sum();
        System.out.println(sum2);
        if(sum>sum2){
            System.out.println("Student 1 is a topper ");
             System.out.println("Student 2 is slow learner");
        }
        else{
           System.out.println("Student 1 is a slow learner");
           System.out.println("student2 is topper");
        }
        //directly passed the arguments in the class when creating a new object and it can be accesed by the same name constructor that will be written in the same class
        student2 s3=new student2(10,20,50);
        s3.name="kali";
        System.out.println(s3.name);
        int sum3=s3.setmarks(10,40,50);// we can also pass arguments with the help of invoking methods 
        System.out.println(sum3);
        student3 s4=new student3(10,30,40);//we pass values directly parameters because of constructor
        System.out.println(s4.marks3);     
        
    }
}
class student1{
    String name;
    String rollno;
    int marks[]=new int[3]; 
    int sum(){
        return marks[0]+marks[1]+marks[2];
    }
 
}
class student2 {
    int marks1,marks2,marks3;
    String name;
    // student2() acts as a constructor because it has the same name of the class student2
    student2(int m1,int m2,int m3){
        marks1=m1;
        marks2=m2;
        marks3=m3;
        System.out.println(marks1 + marks2 +marks3);
   }
   // if you have to update the mark1,2,3 values we can change it using this method because constructor cannot be changed directly 
   int setmarks(int m1,int m2,int m3){
      marks1=m1;
      marks2=m2;
      marks3=m3;
      return marks1+marks2+marks3;
   }
}
class student3{
    int marks1;
    int marks2;
    int marks3;
    //why we use this operator because suppose if we have same instance variable and parameter names are same they it creates confusions we assigning to it like this length=length
    //to avoid this we have to use this operator to access the object instance variables and assign with the parameter values
    student3(int marks1,int marks2,int marks3){
            this.marks1=marks1;
            this.marks2=marks2;
            this.marks3=marks3;
            System.out.println(marks1+marks2+marks3);

    }
}
