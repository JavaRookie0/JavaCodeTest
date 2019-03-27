/**
 * Created by haoxianluo on 2019/3/19.
 */
public class BuzzRule extends Rule {

    @Override
    protected String execute(int number) {
        return "Buzz";
    }

    @Override
    protected boolean verify(int number, Boolean isContains) {

        if (isContains) {
            return (number % 5 == 0 || String.valueOf(number).contains("5"));
        }

        return number % 5 == 0;
    }
}
