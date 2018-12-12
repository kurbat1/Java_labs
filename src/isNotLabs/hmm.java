package isNotLabs;

import java.util.function.Consumer;

public class hmm {
    public static void main(String... args) {
//        Consumer<String> printer = string -> System.out.println(string);
//        Consumer<String> printer =  System.out::println; //Другой способ лямбда выражений
        Consumer<String> printer = hmm::println;
        printer.accept("Надо больше спать(");

        System.out.println(getOeration('*').getResult(10, 5));
        System.out.println(getOeration('-').getResult(10, 5));
        System.out.println(getOeration('+').getResult(10, 5));
        System.out.println(getOeration('/').getResult(10, 5));
    }
    private static void println(String text){
        System.out.println(text);
    }



private static Operation getOeration(char symbol) {
        switch (symbol) {
            case '*':
                return (value1, value2) -> value1 * value2;
            case '/':
                return (value1, value2) -> value1 / value2;
            case '+':
                return (value1, value2) -> value1 + value2;
            case '-':
                return (value1, value2) -> value1 - value2;
            default:
                return (value1, value2) -> 0;
        }
}


}
