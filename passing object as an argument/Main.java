public class Main{// passing objects has an arguments
    public static void main(String args[]){
        box b1=new box();
         b1.updateDimension(10,20,30);
        box b2=new box();
         b2.updateDimension(10,20,30);
         System.out.println(b1.isEqual(b2));// in this method creation we are passing b2 object has an argument of b1 to check both are same arguments
}
}