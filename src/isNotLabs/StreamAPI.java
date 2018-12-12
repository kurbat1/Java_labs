package isNotLabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        int[] numbers = {-6, -2, 4, 0, -1};

        for (int number : numbers) {
            if (number < 0) System.out.println(number);
        }

        IntStream.of(-2, 5, -7, -19, 32).filter(value -> value < 0).forEach(System.out::println);
    /////////////////////////////////////
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Tom", "Jeff","Jerry");
        names.stream().filter(name -> name.length() >= 4).forEach(System.out::println);
///////////////////////////////////////
        Stream<Pizza> pizzaStream = Stream.of(new Pizza("Pepperoni", 90));
        pizzaStream.flatMap(pizza -> Stream.of(
                String.format("Pizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice()),
                String.format("(HAPPY HOURS DISCOUNT -50%%)%nPizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice() / 2)
        )).forEach(System.out::println);


    }

}
