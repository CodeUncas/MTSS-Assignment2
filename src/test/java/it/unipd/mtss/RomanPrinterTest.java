////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;

public class RomanPrinterTest {
    private static Stream<Arguments> inputsAndResults() {

        return Stream.of(
                Arguments.of(1, " _____ \n" + //
                        "|_   _|\n" + //
                        "  | |  \n" + //
                        "  | |  \n" + //
                        " _| |_ \n" + //
                        "|_____|\n"),
                Arguments.of(2, " _____  _____ \n" + //
                        "|_   _||_   _|\n" + //
                        "  | |    | |  \n" + //
                        "  | |    | |  \n" + //
                        " _| |_  _| |_ \n" + //
                        "|_____||_____|\n"),
                Arguments.of(3, " _____  _____  _____ \n" + //
                        "|_   _||_   _||_   _|\n" + //
                        "  | |    | |    | |  \n" + //
                        "  | |    | |    | |  \n" + //
                        " _| |_  _| |_  _| |_ \n" + //
                        "|_____||_____||_____|\n"),
                Arguments.of(4, " _____ __      __\n" + //
                        "|_   _|\\ \\    / /\n" + //
                        "  | |   \\ \\  / / \n" + //
                        "  | |    \\ \\/ /  \n" + //
                        " _| |_    \\  /   \n" + //
                        "|_____|    \\/    \n"));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    public void testPrint_OnNull(int number, String expectedOutput) {
        Assertions.assertEquals(expectedOutput, RomanPrinter.print(number));
    }

}