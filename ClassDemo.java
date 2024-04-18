public class ClassDemo{
    public static void main(String args[]){
       Box blackBox =new Box();//Box-->class, blackBox-->reference, new-->constructor , Whole syntax --> creation of an object 
        blackBox.length=10;// assign values for reference object 
       System.out.println(blackBox.length);
       //assigning another reference object 
       Box whitebox=new Box();
       whitebox.length=10;
       whitebox.breadth=20;
       whitebox.height=30;
       System.out.println(whitebox.length);
       System.out.println(whitebox.breadth);
       System.out.println(whitebox.height);
      Box greenbox=new Box();
      greenbox.length=10;
      greenbox.breadth=20;
      greenbox.height=30;
      System.out.println(greenbox.length);
      System.out.println(greenbox.height);
      System.out.println(greenbox.breadth);     
 }
}