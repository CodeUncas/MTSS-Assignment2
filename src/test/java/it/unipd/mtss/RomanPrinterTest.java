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
                        "|_____|    \\/    \n"),
                Arguments.of(9, " _____ __   __\n" + //
                        "|_   _|\\ \\ / /\n" + //
                        "  | |   \\ V / \n" + //
                        "  | |    > <  \n" + //
                        " _| |_  / . \\ \n" + //
                        "|_____|/_/ \\_\\\n"),
                Arguments.of(10, "__   __\n" + //
                        "\\ \\ / /\n" + //
                        " \\ V / \n" + //
                        "  > <  \n" + //
                        " / . \\ \n" + //
                        "/_/ \\_\\\n"),
                Arguments.of(20, "__   ____   __\n" + //
                        "\\ \\ / /\\ \\ / /\n" + //
                        " \\ V /  \\ V / \n" + //
                        "  > <    > <  \n" + //
                        " / . \\  / . \\ \n" + //
                        "/_/ \\_\\/_/ \\_\\\n"),
                Arguments.of(40, "__   __ _      \n" + //
                        "\\ \\ / /| |     \n" + //
                        " \\ V / | |     \n" + //
                        "  > <  | |     \n" + //
                        " / . \\ | |____ \n" + //
                        "/_/ \\_\\|______|\n"),
                Arguments.of(50, " _      \n" + //
                        "| |     \n" + //
                        "| |     \n" + //
                        "| |     \n" + //
                        "| |____ \n" + //
                        "|______|\n"),
                Arguments.of(90, "__   __  _____ \n" + //
                        "\\ \\ / / / ____|\n" + //
                        " \\ V / | |     \n" + //
                        "  > <  | |     \n" + //
                        " / . \\ | |____ \n" + //
                        "/_/ \\_\\ \\_____|\n"),
                Arguments.of(100, "  _____ \n" + //
                        " / ____|\n" + //
                        "| |     \n" + //
                        "| |     \n" + //
                        "| |____ \n" + //
                        " \\_____|\n"),
                Arguments.of(400, "  _____  _____  \n" + //
                        " / ____||  __ \\ \n" + //
                        "| |     | |  | |\n" + //
                        "| |     | |  | |\n" + //
                        "| |____ | |__| |\n" + //
                        " \\_____||_____/ \n"),
                Arguments.of(500, " _____  \n" + //
                        "|  __ \\ \n" + //
                        "| |  | |\n" + //
                        "| |  | |\n" + //
                        "| |__| |\n" + //
                        "|_____/ \n"),
                Arguments.of(900, "  _____  __  __ \n" + //
                        " / ____||  \\/  |\n" + //
                        "| |     | \\  / |\n" + //
                        "| |     | |\\/| |\n" + //
                        "| |____ | |  | |\n" + //
                        " \\_____||_|  |_|\n"),
                Arguments.of(1000, " __  __ \n" + //
                        "|  \\/  |\n" + //
                        "| \\  / |\n" + //
                        "| |\\/| |\n" + //
                        "| |  | |\n" + //
                        "|_|  |_|\n"));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    public void testPrint_OnValidNumber(int number, String expectedOutput) {
        Assertions.assertEquals(expectedOutput, RomanPrinter.print(number));
    }

    @ParameterizedTest
    @MethodSource("invalidNumbers")
    public void testPrint_OnInvalidNumber(int number) {
        Assertions.assertEquals("Invalid number", RomanPrinter.print(number));
    }

    private static Stream<Arguments> invalidNumbers() {
        return Stream.of(
                Arguments.of(0),
                Arguments.of(1001),
                Arguments.of(-10));
    }
    //Test in order to get 100% code coverage
    @Test
    public void testConstructor_createIstanceRomanPrinter(){
        RomanPrinter istance = new RomanPrinter();
        Assertions.assertNotNull(istance);
    }

}