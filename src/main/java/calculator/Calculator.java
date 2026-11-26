package calculator;

public class Calculator {

	float PI = 3.1f;

	public void doNothing() {
	}

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

		if (exponent >= 0) {
			for (int i = 0; i < exponent; i++) {
				result = result * base;
			}
		} else {
			for (int i = 0; i < -exponent; i++) {
				result = result / base;
			}
		}

		return result;
	}

	public int divide1(int num1, int num2) {
		return num1 / num2;
	}

	public int divide(int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}

		return num1 / num2;
	}
}