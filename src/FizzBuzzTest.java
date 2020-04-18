import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test

    public void testFizzBuzz(){
        int number =-1;
        String display = "Loi";

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(display,fizzBuzz.checkNumber(number));
    }

    @Test

    public void testFizzBuzz1(){
        int number =3;
        String display = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(display,fizzBuzz.checkNumber(number));
    }

    @Test

    public void testFizzBuzz2(){
        int number =5;
        String display = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(display,fizzBuzz.checkNumber(number));
    }

    @Test

    public void testFizzBuzz3(){
        int number =15;
        String display = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(display,fizzBuzz.checkNumber(number));
    }
    @Test

    public void testFizzBuzz4(){
        int number =4;
        String display = "4";

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(display,fizzBuzz.checkNumber(number));
    }

    @Test

    public void testFizzBuzz5(){
        int number =13;
        String display = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(display,fizzBuzz.checkNumber(number));
    }

    @Test

    public void testFizzBuzz6(){
        int number =56;
        String display = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(display,fizzBuzz.checkNumber(number));
    }

}