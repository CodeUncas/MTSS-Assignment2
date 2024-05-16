////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 20) {
            return "Invalid number";
        }
        String numberConverted = "";
        while (number >= 10) {
            numberConverted += "X";
            number -= 10;
        }
        while (number >= 9) {
            numberConverted += "IX";
            number -= 9;
        }
        while (number >= 5) {
            numberConverted += "V";
            number -= 5;
        }
        while (number >= 4) {
            numberConverted += "IV";
            number -= 4;
        }
        while (number >= 1) {
            numberConverted += "I";
            number--;
        }
        return numberConverted;
    }
}