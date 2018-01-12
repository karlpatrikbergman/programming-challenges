package simple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberUtilTest {

    private NumberUtil numberUtil = new NumberUtil();

    @Test
    public void getFibonacciNumbers4() {
        numberUtil.getFibbonacciNumbers4(20).stream()
                .forEach(System.out::println);
    }

    @Test
    public void getFibonacciNumbers3() {
        numberUtil.getFibbonacciNumbers3(20, new ArrayList<>()).stream()
                .forEach(System.out::println);
    }

    @Test
    public void getFibonacciNumbers2() {
        List<Integer> fibonacciNumbers = numberUtil.getFibbonaciNummbers2(20);
        fibonacciNumbers.stream()
                .forEach(System.out::println);
    }

    @Test
    public void getFibonacciNumbers() {
        List<Integer> fibonacciNumbers = numberUtil.getFibbonaciNummbers(20);
        fibonacciNumbers.stream()
                .forEach(System.out::println);
    }

    @Test
    public void isPowerOfTwo() {
        assertTrue(numberUtil.isPowerOfTwo(8));
        assertFalse(numberUtil.isPowerOfTwo(21));
    }

    @Test
    public void isPalindrome2() {
        assertTrue(numberUtil.isPalindrome2(121));
        assertFalse(numberUtil.isPalindrome2(122));
    }

    @Test
    public void isPalindrome() {
        assertTrue(numberUtil.isPalindrome(121));
        assertFalse(numberUtil.isPalindrome(122));
    }

    @Test
    public void isEvenTest() {
        assertTrue(numberUtil.isEven(2));
        assertFalse(numberUtil.isEven(33));
//        IntStream.range(0, 11)
//                .boxed()
//                .filter(numberUtil::isEven)
//                .forEach(System.out::println);
    }

    @Test
    public void isPrime() {
        assertTrue(numberUtil.isPrime(2));
        assertTrue(numberUtil.isPrime(3));
        assertFalse(numberUtil.isPrime(4));
        assertFalse(numberUtil.isPrime(488));

    }
}
