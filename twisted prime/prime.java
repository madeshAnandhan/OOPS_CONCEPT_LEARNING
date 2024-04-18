import java.util.*;
public class prime{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=reverse(n);
        int count=0,count1=0;

       
        //loop to check whether hte two numbers are same or not
        for(int i=2;i<=n;i++){
            if(n%i==0){
                 count+=1;
            }
        }
        for(int i=2;i<=rev;i++){
            if(rev%i==0){
                count1+=1;
            }
        }
        if(count==1 && count1==1){
            System.out.println("it is an twisted prime number");
        }
        else{
            System.out.println("Not an twisted prime number");
        }

    }
    static int reverse(int n){
        int rev1=0;
        while(n>0){
           rev1=(rev1*10)+(n%10);
           n/=10;
        }return rev1;
    }
}