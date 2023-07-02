package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber = 0;
        int a = number % 10;
        number /= 10;
        reversedNumber += (100 * a);
        a = number % 10;
        number /= 10;
        reversedNumber += (10 * a);
        reversedNumber += number;
        number = reversedNumber;
    }
}
