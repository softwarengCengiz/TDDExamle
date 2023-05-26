//STUDENT INFORMATIONS:
//NAME-SURNAME: CENGİZ EMRE ÜNLÜ
//STUDENT NUMBER: B211202402
//SOFTWARE ENGINERRING 2ND CLASS
//HOMEWORK-1
//SWE202 SOFTWARE VERIFICATION AND VALIDATION
//REPOSITORY ADRESS:https://github.com/softwarengCengiz/TDDExample

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 5, 2.5",
            "10, 2.5, 4",
            "12.5, 2.5, 5"
    })
    void testDivision(double dividend, double divisor, double expected) {
        double result = Calculator.divide(dividend, divisor);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testDivisionByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected.");
    }
}

class Calculator {
    static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return dividend / divisor;
    }
}
