package isNotLabs;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Predict {
    public static void main(String[] args) {

        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(4));
        System.out.println(isZero.test(0));

        //число в степень
        BinaryOperator<Double> pow = (value1, value2) -> Math.pow(value1, value2);
        System.out.println(pow.apply(2.0, 5.0));

        //  факториал
        Factorial factorial = value -> {
            int result = 1;

            for (int i = 1; i <= value; ++i) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.getResult(6));
    }
}
