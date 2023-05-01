import java.util.Scanner;
class arithmetic{
    public static void main(String[] args){
        int a, b, result, ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value for a and b: ");
        a = s.nextInt();
        b = s.nextInt();

        System.out.println("\n1. Addition\t\t 2. Subtraction\t\t 3. Multiplication\t\t 4. Division");
        System.out.println("\nEnter your choice: ");
        ch = s.nextInt();

        switch(ch){
            case 1: result = (a + b);
                    System.out.println("Addition is: " + result);
            break;

            case 2: result = (a - b);
                    System.out.println("Subtraction is: " + result);
            break;

            case 3: result = (a * b);
                    System.out.println("Multiplication is: " + result);
            break;

            case 4: result = (a / b);
                    System.out.println("Division is: " + result);
            break;

            default: System.out.println("\nInvalid Choice!");
        }
    }
}