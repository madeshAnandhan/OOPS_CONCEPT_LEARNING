package mypackage;

public class Box {
    public int length;
    public int breadth;
    public int height;
    public int  volume(int length,int breadth,int height){//created invoking methods and used this operator for instance variable
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        return this.length*this.breadth*this.height;
    }
    /* void finalize()
     { this is used for perform the immediate tasks before the garbage collector deallocates or deletes the memory  
       this method is not suitable for closing the application because it takes some time to check the garbage values frequently but when 
       when you write closing functions with this it did not close properly
     }
   */
  
    
}
