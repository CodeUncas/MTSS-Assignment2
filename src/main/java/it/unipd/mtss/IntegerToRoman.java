////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 500) {
            return "Invalid number";
        }
        String numberConverted = "";
        while (number >= 500) {
            numberConverted += "D";
            number -= 500;
        }
        while (number >= 400) {
            numberConverted += "CD";
            number -= 400;
        }
        while (number >= 100) {
            numberConverted += "C";
            number -= 100;
        }
        while (number >= 90) {
            numberConverted += "XC";
            number -= 90;
        }
        while (number >= 50) {
            numberConverted += "L";
            number -= 50;
        }
        while (number >= 40) {
            numberConverted += "XL";
            number -= 40;
        }
        while (number >= 10) {
            numberConverted += "X";
            number -= 10;
        }
        while (number == 9) {
            numberConverted += "IX";
            number -= 9;
        }
        while (number >= 5) {
            numberConverted += "V";
            number -= 5;
        }
        while (number == 4) {
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