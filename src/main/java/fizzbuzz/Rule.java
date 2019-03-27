package fizzbuzz;

/**
 * Created by haoxianluo on 2019/3/19.
 */
public abstract class Rule {
    private Rule successor;

    public String out(int number, Boolean isContains) {
        return verify (number, isContains) ? execute(number) : successor.out(number, isContains);
    }

    protected abstract String execute(int number);

    protected abstract boolean verify(int number , Boolean isContains);

    public void setSuccessor(Rule successor) {
        this.successor = successor;
    }
}
