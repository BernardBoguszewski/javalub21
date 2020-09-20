import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator stringCalculator;
    @BeforeEach
    void setup(){
        stringCalculator = new StringCalculator();
    }

    @Test
    void testShouldReturn0ForNullAndBlank() {
        //given
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
        //when
        int result = stringCalculator.add(number);
        //then
        assertEquals(expected, result);
    }
    @Test
    void testShouldAddNumbersSeparatedByCommaOrNewLine(){
        //given
        String given = "3\n4,5";
        //when
        int result = stringCalculator.add(given);
        //then
        assertEquals(12,result);
    }

    @Test
    void testShouldAddNumbersSeparatedByDelimiter(){
        //given
        String given = "//%\n3%5%7";
        String given2 = "//;\n3;4;7";
        String given3 = "//s\n5s7s7";
        //when
        int result = stringCalculator.add(given);
        int result2 = stringCalculator.add(given2);
        int result3 = stringCalculator.add(given3);
        //then
        assertEquals(15,result);
        assertEquals(14,result2);
        assertEquals(19,result3);
    }

    @Test
    void testShouldCheckIfExceptionIsThrownForNegativeNumbers(){
        //given
        String given = "2,3,-4";
        //when
        Executable result = ()-> stringCalculator.add(given);
        //then
        assertThrows(IllegalArgumentException.class, result);
    }

}