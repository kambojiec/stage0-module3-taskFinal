package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a = number % 1000;
        int b = a % 100;
        int c = b % 10;
        int first = (number - a) / 1000;
        int second = a - b;
        int third = b - c;
        System.out.println(first + c + second + third);
    }
}
