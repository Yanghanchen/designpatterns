package Pattern19;

import java.util.Stack;

public class Calculator {
    private Stack<Expression> stack=new Stack<>();

    public Calculator(String expr) {
        Expression arithmeticExpression1, arithmeticExpression2;
        String[] elements = expr.split(" ");
        for (int i = 0; i < elements.length; ++i) {
            switch (elements[i].charAt(0)) {
                case '+':
                    arithmeticExpression1 = stack.pop();
                    arithmeticExpression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(
                            new AdditionExpression(arithmeticExpression1, arithmeticExpression2));
                    break;
                case '-':
                    arithmeticExpression1 = stack.pop();
                    arithmeticExpression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(
                            new ReductionExpression(arithmeticExpression1, arithmeticExpression2));
                    break;
                default:
                    stack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calc(){
        return stack.pop().interpret();
    }

    public static void main(String[] args){
        Calculator calculator=new Calculator("100 + 20 - 5");
        System.out.println(calculator.calc());
    }
}
