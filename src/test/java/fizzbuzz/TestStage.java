package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStage {
	
    @Test
    public void testOne() {
    	StageOne stageOne = new StageOne();
    	assertEquals("1",stageOne.output(1));
    	assertEquals("Fizz",stageOne.output(3));
    	assertEquals("Buzz",stageOne.output(5));
    	assertEquals("FizzBuzz",stageOne.output(15));
    }
    
    @Test
    public void testTwo() {
        StageTwo stageTwo = new StageTwo();
        assertEquals("1",stageTwo.output(1));
        assertEquals("Fizz",stageTwo.output(3));
        assertEquals("Buzz",stageTwo.output(5));
        assertEquals("FizzBuzz",stageTwo.output(15));
    }

}
