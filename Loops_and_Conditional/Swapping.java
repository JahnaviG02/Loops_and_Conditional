import java.util.*;
class Swapping{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter n1 value");
     int n1=sc.nextInt();
      System.out.println("enter n2 value");
      int n2=sc.nextInt();
     int svc;
     System.out.println("Before swapping"+"  "+n1 +"  "+n2);

      svc=n1;
      n1=n2;
      n2=svc;

     System.out.println("After swapping"+"   "+n1 +"  "+n2);

   }
}
     