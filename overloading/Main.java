public class Main{
    public static void main(String args[]){
           System.out.println(average(10,20));
            System.out.println(average(10,20,30));
            System.out.println(average(10.0,20.0));
    }
    static int average(int a,int b){// this is overloading concept and it uses same method name but different argument or no of arguments should be passed is called as overloading
        return (a+b)/2;// it has only 2 types of Arguments so it prints avg of 10 and 20
    }
    static int average(int a,int b,int c){
        return (a+b+c)/3;// it has only 3 types of arguments so it prints avg among 10,20 and 30.
    }
    static double average(double a,double b){
        return (a+b)/2.0;// in this type i passed double data type has an argument so it chooses this method 
    }
}