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
                Arguments.of(0, "Invalid number"),
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"));

    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    public void testConvert_FirstThreeNumbers(int number, String expectedResult) {
        Assertions.assertEquals(expectedResult, IntegerToRoman.convert(number));

    }

}
