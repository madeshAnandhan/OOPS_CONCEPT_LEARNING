package mypackage;

public class colorbox{
    public static void main(String args[]){
        Box blackbox = new Box();
        System.out.println("the volume is"+ blackbox.volume(10,20,30) );
        //defernece object with help of garbage collector 
        //2 types 
       blackbox=null;// 1)st type of derefernce
        Box woodbox = new Box();
        System.out.println(woodbox.volume(5,10,15));
      // 2nd Type of Derefernce
        blackbox=woodbox;
      //  System.out.println(woodbox.volume(10,20,30));
       
        
    }
}

