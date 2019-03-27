package fizzbuzz;

/**
 * #Stage 2 - new requirements
 . A number is Fizz if it is divisible by 3 or if it has a 3 in it
 . A number is Buzz if it is divisible by 5 or if it has a 5 in it
 . A number is FizzBuzz if it satisfy above 2 criterias together
 * Created by haoxianluo on 2019/3/19.
 */
public class StageTwo {

    private Rule rule;

    public StageTwo() {
        rule = new FizzBuzzRule();
        Rule buzz = new BuzzRule();
        Rule fizz = new FizzRule();
        Rule nop = new NopRule();

        rule.setSuccessor(buzz);
        buzz.setSuccessor(fizz);
        fizz.setSuccessor(nop);
    }
    public String output(int number) {
        return rule.out(number, true);
    }
}
