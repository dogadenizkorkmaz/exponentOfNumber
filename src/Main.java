import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,k, i=1, total=1; //  define integer value

        Scanner doa = new Scanner(System.in); // define scanner

        System.out.print("Enter the Number: "); //get value from user
        n = doa.nextInt();

        System.out.print("Enter the Exponent: ");
        k = doa.nextInt();

        for(i=1; i<=k ; i++) { // conditions and calculation

            total *= n;
        }
        System.out.println("Result: " + total);
    }

}
