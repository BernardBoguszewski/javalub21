import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void testShouldReturn0ForNullAndBlank() {
        //given
        StringCalculator stringCalculator = new StringCalculator();
        String given = null;
        String given2 = "        ";
        String given3 = "";
        //when
        int result1 = stringCalculator.add(given);
        int result2 = stringCalculator.add(given2);
        int result3 = stringCalculator.add(given3);
        //then
        assertEquals(0, result1);
        assertEquals(0, result2);
        assertEquals(0, result3);
    }

    @Test
    void testShouldAddTwoNumbersFromString() {
        //given
        StringCalculator stringCalculator = new StringCalculator();
        String given = "2,3";
        //when
        int result = stringCalculator.add(given);
        //then
        assertEquals(5, result);
    }

    @ParameterizedTest
    @CsvSource(delimiterString = "|", value = {"2,3|5", "2,3,4|9", "2,3,4,5|14"})
    void testShouldAddAllNumbersSeparatedByComma(String number, int expected) {
        //given
        StringCalculator stringCalculator = new StringCalculator();
        //when
        int result = stringCalculator.add(number);
        //then
        assertEquals(expected, result);
    }
    @Test
    void testShouldAddNumbersSeparatedbyCommaOrNewLine(){
        //given
        StringCalculator stringCalculator = new StringCalculator();
        String given = "3\n4,5";
        //when
        int result = stringCalculator.add(given);
        //then
        assertEquals(12,result);

    }

}