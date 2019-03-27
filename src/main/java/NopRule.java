/**
 * Created by haoxianluo on 2019/3/19.
 */
public class NopRule extends Rule {
    @Override
    protected String execute(int number) {
        return String.valueOf(number);
    }

    @Override
    protected boolean verify(int number, Boolean isContains) {
        return true;
    }
}