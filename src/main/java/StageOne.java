/**
 * But for multiples of three print Fizz" instead of the
 * number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five
 * print "FizzBuzz "
 * Created by haoxianluo on 2019/3/19.
 */
public class StageOne {

    private Rule rule;

    public StageOne() {
        rule = new FizzBuzzRule();
        Rule buzz = new BuzzRule();
        Rule fizz = new FizzRule();
        Rule nop = new NopRule();

        rule.setSuccessor(buzz);
        buzz.setSuccessor(fizz);
        fizz.setSuccessor(nop);
    }
    public String output(int number) {
        return rule.out(number, false);
    }
}
