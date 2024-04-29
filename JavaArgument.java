public class JavaArgument {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Provide args");
            return;
        }
        System.out.println("FirstArgs:" + args[0]);
        System.out.println("SecondArgs:" + args[1]);
        /* Make Sure 2nd args is num */
        int passedValue = Integer.parseInt(args[1]);
    }
}