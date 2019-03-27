package fizzbuzz;

/**
 * Created by haoxianluo on 2019/3/19.
 */
public class FizzBuzzRule extends Rule  {

    @Override
    protected String execute(int number) {
        return "FizzBuzz";
    }

    @Override
    protected boolean verify(int number, Boolean isContains) {

        if (isContains) {
            return ((number % 5 == 0 || String.valueOf(number).contains("5")) && (number % 3 == 0 || String.valueOf(number).contains("3")));
        }

        return number%(3*5) == 0;
    }
}
