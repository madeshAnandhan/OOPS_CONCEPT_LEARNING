public class box {
   private int length,breadth,height;
    
   public void updateDimension(int a,int b,int c){
        length=a;
        breadth=b;
        height=c;
       System.out.println(length);
       System.out.println(breadth);
       System.out.println(height);
    }
  public  boolean isEqual(box b){//method used to check whether the arguments odf objects b1 and b2 are same 
        if(length==b.length && breadth==b.breadth && height==b.height){
             return true;
        }
        return false;
    }
}
