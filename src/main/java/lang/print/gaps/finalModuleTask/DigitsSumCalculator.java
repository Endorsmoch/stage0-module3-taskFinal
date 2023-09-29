package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int fourth = number%10;
        number/=10;
        int third = number%10;
        number/=10;
        int second = number%10;
        number/=10;
        int first = number;
        System.out.println(first+second+third+fourth);
    }
}
