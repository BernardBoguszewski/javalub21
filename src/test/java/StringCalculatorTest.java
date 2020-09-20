import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void testShouldReturn0ForNullAndBlank(){
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
        assertEquals(0,result1);
        assertEquals(0,result2);
        assertEquals(0,result3);
    }

    @Test
    void testShouldAddTwoNumbersFromString(){
        //given
        StringCalculator stringCalculator = new StringCalculator();
        String given = "2,3";
        //when
        int result = stringCalculator.add(given);
        //then
        assertEquals(5,result);
    }

}