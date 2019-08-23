/**
 * 2 Java Arithmetic Operators
 * Java arithmatic operators are used to perform addition, subtraction, multiplication, and division. They act as
 * basic mathematical operations.
 */
public class operators {
    public static void main(String[] args) {
        /**/
        System.out.println("incrementing/decrementing a value by one");
        incrementing_decrementing();
        System.out.println("negating an expression and inverting the value of a boolean");
        negating_inverting();
        System.out.println("shift operators");
        shift_operators();
        System.out.println("And operator");
        And();
        System.out.println("OR operator");
        OR();
        System.out.println("Ternory operator");
        Ternory();
    }

    static void incrementing_decrementing() {
        /**
         * 1 Java Unary Operator
         *         The Java unary operators require only one operand. Unary operators are used to perform various
         *         operations i.e.
         *
         *             incrementing/decrementing a value by one
         *             negating an expression
         *             inverting the value of a boolean
         */
        int a = 10;
        System.out.println(a++); // o/p 10
        System.out.println(++a); // o/p 12
        int b = 10;
        System.out.println(b--); // o/p 10
        System.out.println(--b); // o/p 8
    }

    static void negating_inverting() {
        int aa = 10;
        int bb = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~aa);//-11 (minus of total positive value which starts from 0)
        System.out.println(~bb);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }

    static void shift_operators() {
        /**
         * 3 Java Left Shift Operator
         *        The Java left shift operator << is used to shift all of the bits in a value to the left side of a
         *        specified number of times.
         *
         *        The Java right shift operator >> is used to move left operands value to right by the number of bits
         *        specified by the right operand.
         *
         *        Java Shift Operator Example: >> vs >>>
         */
        System.out.println("shift left");
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println(20 << 2);//20*2^2=20*4=80
        System.out.println(15 << 4);//15*2^4=15*16=240
        System.out.println("right shift");
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2
        System.out.println(">> and >>>");
        //For positive number, >> and >>> works same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);
    }

    static void And() {
        /**
         * 4 Java AND Operator Example: Logical && and Bitwise &
         *The logical && operator doesn't check second condition if first condition is false. It checks second condition
         *  only if first one is true.
         *
         *The bitwise & operator always checks both conditions whether first condition is true or false.*/
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a < c);//false && true = false
        System.out.println(a < b & a < c);//false & true = false
    }

    static void OR() {
        /**Java OR Operator Example: Logical || and Bitwise |
         *       The logical || operator doesn't check second condition if first condition is true. It checks second
         *       condition only if first one is false.
         *
         *      The bitwise | operator always checks both conditions whether first condition is true or false.*/
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c);//true || true = true
        System.out.println(a > b | a < c);//true | true = true
        //|| vs |
        System.out.println(a > b || a++ < c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a > b | a++ < c);//true | true = true
        System.out.println(a);//11 because second condition is checked
    }

    static void Ternory() {
        /**
         * Java Ternary Operator
         * Java Ternary operator is used as one liner replacement for if-then-else statement and used a lot in java
         * programming. it is the only conditional operator which takes three operands.
         */
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);
        int d = 10;
        int g = 5;
        int min1 = (d < g) ? d : g;
        System.out.println(min1);
    }
}
