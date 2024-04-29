public class IfElseClass {
    public static void main(String[] args) {
        /* If Statement */
        if (true) {
            System.out.println("True Statement");
        }
        // Patanthesis Takes a boolean exapression
        int num1 = 10, num2 = 20;
        if (num1 == num2) {
            System.out.println("Equal");
        } else if (num1 < num2) {
            System.out.println("Lesser");
        } else {
            System.out.println("Greater");
        }
        /* Note that the else Statement is always optional */
        /* if else if Ladder */
        if (num1 == num2) {
            System.out.println("Equal");
        } else if (num1 > num2) {
            System.out.println("Greater");
        } else if (num1 != num2) {
            System.out.println("Not Equal");
        } else if (num1 > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Default Statement");
        }
        /* When a condition is matched it will skip all the remaining statement */
        /* Neasted if else */
        if (num1 > 0) {
            if (num1 > num2) {
                System.out.println("Positive Greater");
            } else {
                System.out.println("Positive Lesser");
            }
        } else {
            if (num1 > num2) {
                System.out.println("Negetive Greater");
            } else {
                System.out.println("Negative Lesser");
            }
        }
    }
    /*
     * Task
     * Consider a following
     * calculate the total and average and save in variable accordingly
     * if any of the marking is less than 35, print "Fali"
     * if a average is less than 60, print "Third Div"
     * if a average is less than 70, print "Second Div"
     * if a average is less than 80, print "first Div"
     * if a average is greater than 80, print "Distinction"
     * if a average is negative or over 100, print "Invalid Marking"
     */

}
