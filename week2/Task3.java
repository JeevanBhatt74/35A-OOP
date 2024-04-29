import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan1.nextLine();

        System.out.println("Over 18?");
        boolean over18 = scan1.nextBoolean();

        System.out.println("How many sibblings?");
        int number = scan1.nextInt();

        System.out.printf("Hello %s, \n Status %b\n you have sibbling num of %d", name, over18, number);

    }
}
