package Pattern19;

public abstract class OperatorExpression implements Expression{
    protected Expression e1,e2;

    public OperatorExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
}
