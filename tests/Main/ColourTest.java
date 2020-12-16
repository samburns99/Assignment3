package Main;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


class ColourTest {

    @Test
    public void equalColours(Colour a, Colour b){
        Colour colour1 = new Colour("RGB", 230,110,100);
        Colour colour2 = new Colour("RGB",230,110,100);
        assertTrue(Colour.equalColours(colour1,colour2));

    }



}