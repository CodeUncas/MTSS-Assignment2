////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        String numberConverted = "";
        while(number >=1){
            numberConverted+="I";
            number--;
        }
        return numberConverted;
    }
}