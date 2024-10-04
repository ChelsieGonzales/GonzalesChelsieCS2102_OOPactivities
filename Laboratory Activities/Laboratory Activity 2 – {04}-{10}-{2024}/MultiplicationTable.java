import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String [] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the size of the multiplication table: ");
        int size = s.nextInt();
        
        int [][] array = new int [size+1][size+1];
        
        
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++){
                array[i][j] = (i * j);
            }
        }
        
        System.out.println("Multiplication Table: ");
        
        for(int i = 1; i <= size ; i++) {
           for(int j = 1; j <=  size ; j++) {
               System.out.printf("%4d", array[i][j]);
           } 
           System.out.println();
        }
        
        s.close();
    }
}
