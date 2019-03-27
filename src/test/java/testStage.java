import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class testStage {
	
    @Test
    public void testOne() {
    	Main main = new Main();
    	assertNotNull(main.runStageOne());
    	assertEquals("Buzz",main.runStageOne().get(99));
    }
    
    @Test
    public void testTwo() {
    	Main main = new Main();
    	assertNotNull(main.runStageTwo());
    	assertEquals("Buzz",main.runStageTwo().get(99));
    }

}
