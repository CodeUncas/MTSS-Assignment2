////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanPrinter {
    private static final Map<Character, String[]> dictionary = new HashMap<>();
    static {
        dictionary.put(
                'I',
                new String[] {
                        " _____ ",
                        "|_   _|",
                        "  | |  ",
                        "  | |  ",
                        " _| |_ ",
                        "|_____|"
                });
        dictionary.put(
                'V',
                new String[] {
                        "__      __",
                        "\\ \\    / /",
                        " \\ \\  / / ",
                        "  \\ \\/ /  ",
                        "   \\  /   ",
                        "    \\/    ",
                });
        dictionary.put(
                'X',
                new String[] {
                        "__   __",
                        "\\ \\ / /",
                        " \\ V / ",
                        "  > <  ",
                        " / . \\ ",
                        "/_/ \\_\\",
                });
        dictionary.put(
                'L',
                new String[] {
                        " _      ",
                        "| |     ",
                        "| |     ",
                        "| |     ",
                        "| |____ ",
                        "|______|",
                });
        dictionary.put(
                'C',
                new String[] {
                        "  _____ ",
                        " / ____|",
                        "| |     ",
                        "| |     ",
                        "| |____ ",
                        " \\_____|",
                });
        dictionary.put(
                'D',
                new String[] {
                        " _____  ",
                        "|  __ \\ ",
                        "| |  | |",
                        "| |  | |",
                        "| |__| |",
                        "|_____/ ",
                });
        dictionary.put(
                'M',
                new String[] {
                        " __  __ ",
                        "|  \\/  |",
                        "| \\  / |",
                        "| |\\/| |",
                        "| |  | |",
                        "|_|  |_|",
                });
    }

    public static String print(int num) {
        String nConv = IntegerToRoman.convert(num);
        return nConv.equals("Invalid number") ? nConv : printAsciiArt(nConv);
    }

    private static String printAsciiArt(String romanNumber) {

        List<String[]> conversion = new ArrayList<>();
        for (Character c : romanNumber.toCharArray()) {
            conversion.add(dictionary.get(c));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (String[] strings : conversion) {
                stringBuilder.append(strings[i]);
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}