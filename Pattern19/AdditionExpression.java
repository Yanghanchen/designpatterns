package Pattern19;

public class AdditionExpression extends OperatorExpression {

    public AdditionExpression(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public int interpret() {
        return e1.interpret()+e2.interpret();
    }
}
