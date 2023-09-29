package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first = (number%10)*100;
        int second = (((number - (first/100)) / 10 ) % 10) * 10 ;
        int third = (number - (second/10 + first/100)) / 100  ;
        System.out.println(first+second+third);
    }
}
