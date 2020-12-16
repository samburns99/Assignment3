package Main;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class ColourTest {

    @Test
    public void equalColours(Colour a, Colour b){
        Colour colour1 = new Colour("RGB", 230,110,100);
        Colour colour2 = new Colour("RGB",230,110,100);
        assertTrue(Colour.equalColours(colour1,colour2));
    }
    @Test
    public void addColours(Colour a, Colour b){
        Colour colour1 = new Colour("RGB",100,180,15);
        Colour colour2 = new Colour("RGB",80,50,90);
        Colour Colour3 = new Colour("RGB",180,230,105);
        assertTrue(colour1.addColours(colour2));
    }



}