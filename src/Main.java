/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Tristan
*****************************************************************************************************
*/


    public class Main {

        // 1. Adds two integers
        public static int add(int num1, int num2) {
            return num1 + num2;
        }

        // 2. Overloaded method that adds four integers (matches addTwo test call)
        public static int add(int num1, int num2, int num3, int num4) {
            return num1 + num2 + num3 + num4;
        }

        // 3. Morning greeting
        public static String morningGreeting(String name) {
            return "早上好, " + name + "!";
        }

        // 4. Afternoon greeting
        public static String afternoonGreeting(String name) {
            return "下午好, " + name + "!";
        }

        // 5. Triple string repetition
        public static String triple(String text) {
            return text + text + text;
        }

        // 6. Returns half of an integer as a double
        public static double half(int number) {
            return (double) number / 2;
        }

        // 7. Rounds positive value to nearest integer
        public static int roundPositiveValueToNearestInteger(double value) {
            return (int) Math.round(value);
        }

        // 8. Rounds negative value to nearest integer
        public static int roundNegativeValueToNearestInteger(double value) {
            return (int) (value - 0.5);
        }

        public static void main(String[] args) {
            // Calling methods, storing in variables, and printing results
            int twoNumberSum = add(5, 7);
            System.out.println(twoNumberSum);

            int fourNumberSum = add(5, 7, 6, 6);
            System.out.println(fourNumberSum);

            String morningMessage = morningGreeting("Toby Fox");
            System.out.println(morningMessage);

            String afternoonMessage = afternoonGreeting("Mac Miller");
            System.out.println(afternoonMessage);

            String tripledString = triple("oohbaby");
            System.out.println(tripledString);

            double halfResult = half(19);
            System.out.println(halfResult);

            int roundedPositive1 = roundPositiveValueToNearestInteger(8.5);
            System.out.println(roundedPositive1);

            int roundedPositive2 = roundPositiveValueToNearestInteger(8.49);
            System.out.println(roundedPositive2);

            int roundedNegative1 = roundNegativeValueToNearestInteger(-8.49);
            System.out.println(roundedNegative1);

            int roundedNegative2 = roundNegativeValueToNearestInteger(-8.5);
            System.out.println(roundedNegative2);
        }
    }