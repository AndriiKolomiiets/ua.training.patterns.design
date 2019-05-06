package patterns.behavioral.interpreter;

import patterns.behavioral.interpreter.context.Context;
import patterns.behavioral.interpreter.expression.Expression;

public class InterpreterApp {
    private static final String MATH_TASK = "124-25+12";

    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate(MATH_TASK);
        System.out.println(MATH_TASK + " = " + expression.interpret());
    }
}
