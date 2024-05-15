////////////////////////////////////////////////////////////////////
// ELIA BERGAMIN 2068230
// UNCAS PERUZZI 2068239
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class IntegerToRomanTest {
    @Test
    public void testConvert_OnNull() {
        Assertions.assertEquals(null, IntegerToRoman.convert(0));
    }

}
