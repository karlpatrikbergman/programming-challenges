package fizzbuzz;

import java.util.function.Function;
import java.util.stream.IntStream;

class FizzBuzz2 {

    static Function<Integer, String> toStrFunctionFunction = i -> {
        if(i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    };

    public static void main(String args[]) {
        IntStream.range(1,51)
                .boxed()
                .map(toStrFunctionFunction)
                .forEach(System.out::println);

//        IntStream.range(1,51)
//                .mapToObj(i -> {
//                    if(i % 3 == 0 && i % 5 == 0) {
//                        return "FizzBuzz";
//                    } else if (i % 3 == 0) {
//                        return "Fizz";
//                    } else if (i % 5 == 0) {
//                        return "Buzz";
//                    } else {
//                        return Integer.toString(i);
//                    }
//                })
//                .forEach(System.out::println);
    }
}