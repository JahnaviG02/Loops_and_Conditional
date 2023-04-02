import java.util.*;
class SLA{
  public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter three number");
   int N1=sc.nextInt();
    int N2=sc.nextInt();
   int N3=sc.nextInt();
int smallest = N1 < N2 ? (N1 < N3 ? N1 : N3) : (N2 < N3 ? N2 : N3);
      int largest = N1 > N2 ? (N1 > N3 ? N1 : N3) : (N2 > N3 ? N2 : N3);
      int average = (N1 + N2 + N3) / 3;
      
      System.out.println("Smallest Number: " + smallest);
      System.out.println("Largest Number: " + largest);
      System.out.println("Average: " + average);
  }
}