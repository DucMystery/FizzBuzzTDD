import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {

    @Test
    public void testTranslate(){
        int number =3;
        String display ="ba";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        assertEquals(display,fizzBuzzTranslate.translate(number));
    }
    @Test
    public void testTranslate1(){
        int number =13;
        String display ="muoi ba";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        assertEquals(display,fizzBuzzTranslate.translate(number));
    }

    @Test
    public void testTranslate2(){
        int number =39;
        String display ="ba chin";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        assertEquals(display,fizzBuzzTranslate.translate(number));
    }

    @Test
    public void testTranslate3(){
        int number =100;
        String display ="Loi";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        assertEquals(display,fizzBuzzTranslate.translate(number));
    }

}