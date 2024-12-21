package StepikJava.ZaurJava.Course2.Lesson8.CallableAndFuture;

import java.util.concurrent.Callable;


public class PartialSum implements Callable<Long> {

    private long from;
    private long to;
    private long localeSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localeSum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " is " + localeSum);
        return localeSum;
    }
}
