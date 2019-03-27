/**
 * Created by haoxianluo on 2019/3/19.
 */
public class FizzRule extends Rule {
    @Override
    protected String execute(int number) {
        return "Fizz";
    }

    @Override
    protected boolean verify(int number, Boolean isContains) {

        if (isContains) {
            return (number % 3 == 0 || String.valueOf(number).contains("3"));
        }

        return number % 3 == 0;
    }
}
