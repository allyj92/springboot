package static2.ex;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MathArrayUtills {
    static private int[] values;

    private MathArrayUtills() {
    }

    static public int sum(int[] values){
        int sum = Arrays.stream(values).sum();
        return sum;
    }

    static public OptionalDouble average(int[] values){
        OptionalDouble avg = Arrays.stream(values).average();
        return avg;
    }

    static public OptionalInt min(int[] values){
        OptionalInt min = Arrays.stream(values).min();
        return min;
    }

    static public OptionalInt max(int[] values){
        OptionalInt max = Arrays.stream(values).max();
        return max;
    }






}
