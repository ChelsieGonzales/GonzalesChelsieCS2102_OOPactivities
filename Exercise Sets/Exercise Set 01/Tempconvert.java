import java.util.Scanner;
class Tempconvert {
    public static void main(String args []) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a Celcius value: ");
        double celsius = s.nextDouble();
        
        double fahrenheit = (celsius*9/5) + 32;
        
        System.out.print(String.format("%.2f",celsius) + " Celsius" + " is " + String.format("%.2f", fahrenheit) + " Fahrenheit");
        
        s.close();
    }
}
