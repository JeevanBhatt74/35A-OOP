public class OperatorClass {
    public static void main(String[] args) {

        /* Arthematic Operators */
        int num1 = 10, num2 = 20;
        int sum = num1 + num2; /* Here + is a arthematic operator used for addition */
        System.out.println("num1 + num2 is " + sum);
        System.out.println("num1 - num2 is " + sum);
        System.out.println("num1 x num2 is " + sum);
        System.out.println("num1 / num2 is " + sum);
        System.out.println("num1 modulo num2 is " + (num1 % num2));

        /* Assingment Oprator */
        int aNum1;
        aNum1 = 200;// here = is used to assign the value
        System.out.println(aNum1);
        System.out.println("aNum1 += can be " + (aNum1 += 2));
        /* aNum1+=2 is equivalent to aNum1=aNum1+2 */
        System.out.println("aNum1 -= can be " + (aNum1 -= 2));
        System.out.println("aNum1 *= can be " + (aNum1 *= 2));
        System.out.println("aNum1 /= can be " + (aNum1 /= 2));
        System.out.println("aNum1 %= can be " + (aNum1 %= 2));

        /* Relational Operators */
        int rnum1 = 20, rnum2 = 21;
        boolean rExpression = rnum1 == rnum2;
        System.out.println("Is rnum1 equals to rnum2" + rExpression);
        System.out.println("Is rnum1 greater to rnum2" + (rnum1 > rnum2));
        System.out.println("Is rnum1 lesser to rnum2" + (rnum1 <= rnum2));
        System.out.println("Is rnum1 not equals to rnum2" + (rnum1 != rnum2));

        /* Logical operators */
        boolean rOperator1 = false, rOperator2 = true;
        System.out.println("rOperator1 && rOperator2 : " + (rOperator1 && rOperator2));
        System.out.println("Or using ||  " + (rOperator1 || rOperator2));
        System.out.println("Not using! : " + (!rOperator1));

        /* Unary Operator */
        int uNum1 = 10;
        uNum1++; // Equivalent to uNum1 = uNum1 + 1 and changes value from next Line;
        ++uNum1; // Equivalent to uNum1 = uNum1 + 1 and changes the value in this line
        System.out.println("Unary for ++" + uNum1);
        System.out.println("Unary for operand--" + uNum1--);
        System.out.println("Unary for --Operand" + --uNum1);

        /* Ternary Operator */
        /*
         * For example
         * String output:;
         * int a= 10;
         * int b=20;
         * if (a>b){
         * output = "True Statement";
         * }else{
         * output = "False Statement";
         * }
         */
        /* We can use ternary for this */
        int a = 10, b = 20;
        String output = a > b ? "True Statement" : "false Statement";
        /*
         * Here Ternary takes expression? true statement : False Statement
         * if the expression is true it takes the statement after the "?"
         * if the expression is false it takes the statement after the ":"
         */
        int outputNumb = a < b ? 100 : 200;
        System.out.println(output);
        System.out.println(outputNumb);

        /*
         * Task 1
         * Write a program to print wheather a variable is greater than 18
         */
        int Number = 20;
        String check = Number > 18 ? "True Statement" : "false Statement";
        System.out.println(check);

        /*
         * Task 2
         * Write a program to print simple internest form variables
         * make 3 variables for amount, time and rate and save the calculation into a
         * variable
         * Formula:
         * si =amount * time * rate/100;
         */
        int amount = 100;
        float time = 2.0f;
        int rate = 10;
        System.out.println("The simple internest form variables" + amount * time * rate / 100);

        /*
         * Task 3
         * Write a program to print the area and perimeter of rectangle
         * a = l * b
         * p = 2 (l + b)
         */
        int length = 10;
        int breadth = 20;
        System.out.println("the area of rectangle is " + (length * breadth));
        System.out.println("the perimeter of rectangle is " + 2 * (length + breadth));

        /*
         * Task 4
         * Complete the task 1 using ternary operators
         */
        int z = 10;
        String checks = z >= 18 ? "True" : "False";
        System.out.println(checks);

    }
}
