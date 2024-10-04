import java.util.Scanner;

public class GetArrayMean {
    public static void main (String [] args) {
        
        Scanner s = new Scanner (System.in);
        
        System.out.print("Enter number of elements: ");
        int elements = s.nextInt();
        
        int [] array = new int[elements];
        
        for(int i = 0; i < elements; i++) {
            System.out.print("Enter number: ");
            array[i] = s.nextInt();
        }
        
        double mean = getArrayMean(array);
        System.out.print("Mean of array is: " + String.format("%.2f", mean));
        
        s.close();
    }
    
    public static double getArrayMean(int [] array) {
        int sum = 0;
        
        for(int num : array) {
            sum += num;
        }
        return (double)sum/array.length;
    }
}
