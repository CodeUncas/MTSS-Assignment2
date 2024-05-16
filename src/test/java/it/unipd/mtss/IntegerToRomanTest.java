////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class IntegerToRomanTest {
    private static Stream<Arguments> inputsAndResults() {

        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"),
                Arguments.of(20, "XX"),
                Arguments.of(40, "XL"),
                Arguments.of(50, "L"),
                Arguments.of(90, "XC"),
                Arguments.of(100, "C"),
                Arguments.of(400, "CD"),
                Arguments.of(500, "D"),
                Arguments.of(900, "CM"),
                Arguments.of(1000, "M"));

    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    public void testConvert_FirstThousandNumbers(int number, String expectedResult) {
        Assertions.assertEquals(expectedResult, IntegerToRoman.convert(number));

    }

    @ParameterizedTest
    @MethodSource("invalidNumbers")
    public void testConvert_OnInvalidNumbers(int input) {
        Assertions.assertEquals("Invalid number", IntegerToRoman.convert(input));
    }

    private static Stream<Arguments> invalidNumbers() {
        return Stream.of(
                Arguments.of(0),
                Arguments.of(1001),
                Arguments.of(-10));
    }
    //Test in order to get 100% code coverage
    @Test
    public void testConstructor_createIstanceIntegerToRoman(){
        IntegerToRoman istance = new IntegerToRoman();
        Assertions.assertNotNull(istance);
    }

}
