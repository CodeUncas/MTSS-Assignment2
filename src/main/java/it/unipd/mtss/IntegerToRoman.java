////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            return "Invalid number";
        }
        String numberConverted = "";
        if (number == 1000) {
            numberConverted += "M";
            number -= 1000;
        }
        if (number >= 900) {
            numberConverted += "CM";
            number -= 900;
        }
        if (number >= 500) {
            numberConverted += "D";
            number -= 500;
        }
        if (number >= 400) {
            numberConverted += "CD";
            number -= 400;
        }
        while (number >= 100) {
            numberConverted += "C";
            number -= 100;
        }
        if (number >= 90) {
            numberConverted += "XC";
            number -= 90;
        }
        if (number >= 50) {
            numberConverted += "L";
            number -= 50;
        }
        if (number >= 40) {
            numberConverted += "XL";
            number -= 40;
        }
        while (number >= 10) {
            numberConverted += "X";
            number -= 10;
        }
        if (number == 9) {
            numberConverted += "IX";
            number -= 9;
        }
        if (number >= 5) {
            numberConverted += "V";
            number -= 5;
        }
        if (number == 4) {
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