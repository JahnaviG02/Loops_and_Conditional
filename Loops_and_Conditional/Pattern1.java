import java.util.*;
class Pattern1 {
    public static void main(String[] args) {
        int N = 5;    
        for (int i = N; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }
      
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}