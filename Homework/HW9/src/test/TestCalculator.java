package test;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

import main.Calculator;
import org.junit.rules.ExpectedException;


class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    public void Should_add_two_numbers_and_return_result() {
        for(int i = 0; i <= 100; i++){
            for (int j = 100; j >= 0; j--){
                assertEquals(i + j, calculator.add(i, j));
            }
        }
    }

    @Test
    public void Should_substract_two_numbers_and_return_result() {
        for(int i = 0; i <= 100; i++){
            for (int j = 100; j >= 0; j--){
                assertEquals(j - i, calculator.sub(j, i));
            }
        }
    }

    @Test
    public void Should_multiply_two_numbers_and_return_result() {
        for(int i = 0; i <= 100; i++){
            for (int j = 100; j >= 0; j--){
                assertEquals(i * j, calculator.multiply(i, j));
            }
        }
    }

    @Test
    public void Should_divide_two_numbers_and_return_result() {
        for(int i = 0; i <= 100; i++){
            for (int j = 100; j >= 1; j--){
                assertEquals(((float) i) / ((float) j), calculator.divide(i, j));
            }
        }
    }


    @Test
    public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            for (int i = 1; i <= 100; i++) {
                calculator.divide(i, 0);
            }
        });

        String expectedMessage = "ZeroDivisionError";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}