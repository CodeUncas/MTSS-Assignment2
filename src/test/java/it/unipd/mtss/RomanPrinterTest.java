////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class RomanPrinterTest {

    @Test
    public void testPrint_OnNull() {
        Assertions.assertEquals(null, RomanPrinter.print(0));
    }

}