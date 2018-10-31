package Pattern19;

public class NumExpression implements Expression {
    int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
