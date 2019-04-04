package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<String> runStageOne() {
        StageOne stageOne = new StageOne();
        List<String> stageOneList = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            stageOneList.add(stageOne.output(i));
        }
        return stageOneList;
    }
    
    public List<String> runStageTwo() {
        StageTwo stageTwo = new StageTwo();
        List<String> stageTwoList;
        stageTwoList = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            stageTwoList.add(stageTwo.output(i));
        }

        return stageTwoList;
    }
    
    public static void main(String[] args) {
    	Main main = new Main();
    	List<String> one = main.runStageOne();
    	List<String> two = main.runStageTwo();

    	System.out.println(one);
    	System.out.println(two);
    }
}
