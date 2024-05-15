////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinterTest {

    @Test
    public void testPrint_OnNull(){
        assertEquals(null,RomanPrinter.print(null));
    }


}