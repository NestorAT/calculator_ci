package fp.Calculator_ci;

public class Calculator {

    float PI = 3.1f;

    public void doNothing() {}

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public int square(int number) {
        return number * number;
    }

    public float square(float num) {
        return num * num;
    }

    public float exponentia(float base, int exponent) {
        float result = 1;

        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }

        return result;
    }
}