

public class Method {
    public static void main(String args[]){
        int sum=add(10,20,30);
        print();
        System.out.println("Sum of the numbers :"+sum);
        print();
    }

static int add(int a,int b,int c){
    return a+b+c;
}
static void print(){
    System.out.println("------------------------------------------");
}
}

