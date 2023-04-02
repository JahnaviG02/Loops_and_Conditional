import java.util.Scanner;
public class Prime {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = input.nextInt();
        boolean isPrime = true;

        if (N <= 1)
         {
            isPrime = false;
        }

        else 
           {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;  
            }      
       }
        }
        if (isPrime)
         {
            System.out.println(N+ " is a prime number.");
        } 
        else 
         {
            System.out.println(N+ " is not a prime number.");
        }
    }
}