package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NumberUtil {

    public List<Integer> getFibbonacciNumbers4(int numberOfFibonacciNumbers) {
        return IntStream.rangeClosed(1, numberOfFibonacciNumbers)
                .boxed()
                .map(this::fibonacci)
                .collect(Collectors.toList());

    }

    public int fibonacci(int number) {
        if(number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number-2) + fibonacci(number-1);
    }

    public List<Integer> getFibbonacciNumbers3(int numberOfFibbonacciNumbers, List<Integer> result) {
        if(numberOfFibbonacciNumbers == 0)
            return result;

        if(result.size() < 2) {
            result.add(1);
            return getFibbonacciNumbers3(--numberOfFibbonacciNumbers, result);
        } else {
            int num = result.get(result.size()-2);
            int num2 = result.get(result.size()-1);
            result.add(num+num2);
            return getFibbonacciNumbers3(--numberOfFibbonacciNumbers, result);
        }
    }

    public List<Integer> getFibbonaciNummbers2(int numberOfFibbonacciNumbers) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);
        for(int i=2; i<=numberOfFibbonacciNumbers; i++) {
            int fibonaccuNumber = result.get(i-2) + result.get(i-1);
            result.add(fibonaccuNumber);
        }
        return result;
    }

    public List<Integer> getFibbonaciNummbers(int numberOfFibbonacciNumbers) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<=numberOfFibbonacciNumbers; i++) {
            int fibonaccuNumber;
            if(result.size() < 2) {
                fibonaccuNumber = 1;
            } else {
                fibonaccuNumber = result.get(i-2) + result.get(i-1);
            }
            result.add(fibonaccuNumber);
        }
        return result;
    }

    public boolean isPowerOfTwo(int number) {
        return ((number & -number) == number);
    }

    public Boolean isPalindrome2(Integer number) {
        int originalNumer = 121;
        int palindrome = originalNumer;
        int reverse = 0;

        while(palindrome != 0) {
            int remainder = palindrome % 10;
//            System.out.println("remainder = palindrome % 10 => " + remainder);

            reverse = reverse * 10 + remainder;
//            System.out.println("reverse = reverse * 10 + remainder => " + reverse);

            palindrome = palindrome / 10;
//            System.out.println("palindrome = palindrome / 10 => " + palindrome);
//            System.out.println("****");
        }
        return number == reverse;
    }

    public Boolean isPalindrome(Integer number) {
        return new StringBuilder(Integer.toString(number))
                .reverse()
                .toString()
                .equals(Integer.toString(number));
    }

    /**
     * A prime number (or a prime) is a natural number greater than 1 that has
     * no positive divisors other than 1 and itself
     *
     * There are many algorithm to find prime numbers e.g. instead of dividing till number,
     * division upto square root of number may be enough.

     */
    public Boolean isPrime(Integer value) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(value))
                .allMatch(i -> (value % i) != 0);
    }

    public Boolean isPrime2(Integer value) {
        Double sqrt = Math.sqrt(value);
        Integer sqrtRounded = sqrt.intValue();
        Optional<Integer> result = IntStream.rangeClosed(2, sqrtRounded)
                .boxed()
                .filter(i -> value % i == 0)
                .findFirst();
        return !result.isPresent();
    }

    public Boolean isEven(Integer integer) {
        return integer % 2 == 0;
    }
}
