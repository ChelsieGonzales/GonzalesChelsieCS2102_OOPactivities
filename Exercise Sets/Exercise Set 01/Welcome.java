class Welcome {
    public static void main(String [] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Welcome to CS 211: Object- Oriented Programming! ");
        
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        
        System.out.println("This course will be fun," + name + "!");
        
        s.close();
    }
}
