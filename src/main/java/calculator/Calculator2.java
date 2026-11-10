package calculator;

public class Calculator2 {

    float PI = 3.1f;

    public static void doNothing() {}

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public  static int square(int number) {
        return number * number;
    }

    public static float square(float num) {
        return num * num;
     }

    public static float exponentia(float base, int exponent) {
        float result = 1;

        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }

        return result;
    }
}
