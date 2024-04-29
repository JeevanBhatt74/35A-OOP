package week2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        /*
         * System.Out.println
         * "Sout"
         */
        System.out.print("This line breaks ");
        /* system.out.print */
        System.out.print("This will not break");
        System.out.print("This will continue \n");
        /*
         * System.Out.println
         * "%s String , %d integer %f floating, %b boolean"
         */
        System.out.printf("Hello  %s, Good Morning", "World");
        System.out.printf("This a a num %d", 10);
        /* Multi Formate */
        System.out.printf("Both float %f and %b", 10.3f, false);

        Scanner scan = new Scanner(System.in);
        System.out.println("The following takes sentence");
        String stringInput = scan.nextLine();

        System.out.println("The following takes int");
        int intInput = scan.nextInt();

        System.out.println("the following takes boolean");
        Boolean boolInput = scan.nextBoolean();
        scan.close();

    }

}
