public class invoke {
    public static void main(String args[]){
        // this is for box
        Box1 b=new Box1();
        b.length=10;
        b.breadth=20;
        int v=b.volume();// Invoking the methods--->No need to pass the argument into the method because we accesed through the objects that we created  
        System.out.println(v);
        //this is for surface area of the box
        surfaceArea sa=new surfaceArea();
        sa.radius=2;
        double s=sa.Area();
        System.out.println(s);
        
    }
    

}
class Box1{
    int length;
    int breadth;
   int volume(){
        return length*breadth;
    }
}
class surfaceArea{
       int radius;
       double Area(){
        return 2*3.14*radius*radius;
       }
}

