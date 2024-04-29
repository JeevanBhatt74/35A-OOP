public class Variable {
    /*
     * Instance variable needs object to accesed
     * value is not shared
     */
    int instaneVarialbe = 10;

    /*
     * Static variable doesnot need object to access
     * value is shared among ojects
     */
    static int staticVarialbe = 100;

    public static void main(String[] args) {

        /* Primitive Data types */
        /* Alreadu defined in Java */
        byte byteValue = 100;
        /* the following cannot be done */
        /* byteValue=100 */

        short shortValue = 200;
        int intValue = -199;
        long longValue = 100000;
        float floatValue = 2.14f;
        double doubleValue = -90.223;
        char charValue = 'l';
        boolean booleanValue = false;

        /* Non-Primitive Data types */
        /* Not defined in java except String */
        /* Combination of primitive data type */

        String stringValue = "this is a string";
        int[] intArray = new int[5];
        Variable variableObject = new Variable(); /* Object */
        /* use instance variable with Variable object */
        System.out.println(variableObject.instaneVarialbe);

        /* use Static variable with Class itself */
        System.out.println(Variable.staticVarialbe);
        byte defaultByteValue;
        /* Implicit casting, samller data type to larger */
        int newIntValue = 10;

        /* Explicit casting larger data type to smaller */
        double newDoubleValue = 290.99;
        int convertedDoubleValue = (int) newDoubleValue;

    }
}