package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStage {

    /**
     * But for multiples of three print Fizz" instead of the
     * number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five
     * print "FizzBuzz "
     */
    @Test
    public void testOne() {
    	StageOne stageOne = new StageOne();
    	assertEquals("1",stageOne.output(1));//can't multiples both 3 and 5
    	assertEquals("Fizz",stageOne.output(3));//can multiples by 3
    	assertEquals("Buzz",stageOne.output(5));//can multiples by 5
    	assertEquals("FizzBuzz",stageOne.output(15));////can multiples of both 3 and 5
    }

    /**
     * #Stage 2 - new requirements
     . A number is Fizz if it is divisible by 3 or if it has a 3 in it
     . A number is Buzz if it is divisible by 5 or if it has a 5 in it
     . A number is FizzBuzz if it satisfy above 2 criterias together
     */
    @Test
    public void testTwo() {
        StageTwo stageTwo = new StageTwo();
        assertEquals("1",stageTwo.output(1));//Not divisible both 3 and 5 , And there are no 3 and 5 in it

        assertEquals("Fizz",stageTwo.output(3));// divisible by 3 or if it has a 3 in it
        assertEquals("Fizz",stageTwo.output(13));// Not divisible by 3 but has a 3 in it
        assertEquals("Fizz",stageTwo.output(27));// divisible by 3 but not has a 3 in it

        assertEquals("Buzz",stageTwo.output(5));// divisible by 5 or if it has a 5 in it
        assertEquals("Buzz",stageTwo.output(10));// divisible by 5 but not has a 5 in it
        assertEquals("Buzz",stageTwo.output(56));// Not divisible by 5 but has a 5 in it

        assertEquals("FizzBuzz",stageTwo.output(15));//divisible both 3 and 5 , And there are 5 in it
        assertEquals("FizzBuzz",stageTwo.output(30));//divisible both 3 and 5 , And there are 3 in it
        assertEquals("FizzBuzz",stageTwo.output(60));//divisible both 3 and 5, but there are no 3 and 5 in it

        assertEquals("FizzBuzz",stageTwo.output(35));//divisible by 5 , And there are 3 and 5 in it

        assertEquals("FizzBuzz",stageTwo.output(51));//divisible by 3 , And there are 5 in it
        assertEquals("FizzBuzz",stageTwo.output(53));//Not divisible both 3 and 5 , but there are 3 and 5 in it
    }

    @Test
    public void testBuzzRule() {
        BuzzRule buzzRule = new BuzzRule();

        assertEquals(false,buzzRule.verify(1, false));
        assertEquals(true,buzzRule.verify(5, false));
        assertEquals(true,buzzRule.verify(10, false));
        assertEquals(true,buzzRule.verify(15, false));

        assertEquals(false,buzzRule.verify(1, true));
        assertEquals(true,buzzRule.verify(5, true));
        assertEquals(true,buzzRule.verify(10, true));
        assertEquals(true,buzzRule.verify(15, true));
        assertEquals(true,buzzRule.verify(56, true));

    }

    @Test
    public void testFizzRule() {
        FizzRule fizzRule = new FizzRule();

        assertEquals(false,fizzRule.verify(1, false));
        assertEquals(true,fizzRule.verify(3, false));
        assertEquals(true,fizzRule.verify(6, false));

        assertEquals(false,fizzRule.verify(1, true));
        assertEquals(true,fizzRule.verify(3, true));
        assertEquals(true,fizzRule.verify(13, true));
        assertEquals(true,fizzRule.verify(27, true));
        assertEquals(true,fizzRule.verify(30, true));

    }

    @Test
    public void testFizzBuzzRule() {
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();

        assertEquals(false,fizzBuzzRule.verify(1, false));
        assertEquals(false,fizzBuzzRule.verify(20, false));
        assertEquals(false,fizzBuzzRule.verify(27, false));
        assertEquals(true,fizzBuzzRule.verify(15, false));
        assertEquals(true,fizzBuzzRule.verify(30, false));

        assertEquals(false,fizzBuzzRule.verify(1, true));
        assertEquals(true,fizzBuzzRule.verify(15, true));//divisible both 3 and 5 , And there are 5 in it
        assertEquals(true,fizzBuzzRule.verify(30, true));//divisible both 3 and 5 , And there are 3 in it
        assertEquals(true,fizzBuzzRule.verify(60, true));//divisible both 3 and 5, but there are no 3 and 5 in it

        assertEquals(true,fizzBuzzRule.verify(35, true));//divisible by 5 , And there are 3 and 5 in it

        assertEquals(true,fizzBuzzRule.verify(51, true));//divisible by 3 , And there are 5 in it
        assertEquals(true,fizzBuzzRule.verify(53, true));//Not divisible both 3 and 5 , but there are 3 and 5 in it

    }

    @Test
    public void testNopRule() {
        NopRule nopRule = new NopRule();

        assertEquals(true,nopRule.verify(1, false));
        assertEquals(true,nopRule.verify(111, true));

    }


}
