/*Task
 * Consider a  following 
 * calculate the total and average and save in variable accordingly
 * if any of the marking is less than 35, print "Fali"
 * if a average is less than 60, print "Third Div"
 * if a average is less than 70, print "Second Div"
 * if a average is less than 80, print "first Div"
 * if a average is greater than 80, print "Distinction"
 * if a average is negative or over 100, print "Invalid Marking"
 */
public class MarksTask {
    public static void main(String[] args) {
        int Science = 45;
        int MAthematics = 56;
        int Social = 78;
        float average = (Science + MAthematics + Social) / 3.0f;
        System.out.println(average);
        if (Science < 35 || MAthematics < 35 || Social < 35) {
            System.out.println("Fail");
        } else if (average <= 80) {
            System.out.println("Distinction");
        } else if (average <= 70) {
            System.out.println("First Division");
        } else if (average <= 60) {
            System.out.println("Third Division");
        } else {
            System.out.println("Invalid Mark)");
        }
    }
}
