public class TriPattern {
    public static void main(String[] args) {
        int row = 4; 
        int i, j; 
        
        for (i = 1; i <= row; i++) {
           
            for (j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }
        
        
        for (i = row-1; i >= 1; i--) {
            
            for (j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}