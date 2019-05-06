package patterns.behavioral.interpreter.context;

import patterns.behavioral.interpreter.expression.Expression;
import patterns.behavioral.interpreter.expression.MinusExpression;
import patterns.behavioral.interpreter.expression.NumberExpression;
import patterns.behavioral.interpreter.expression.PlusExpression;

public class Context {
    public Expression evaluate(String str) {
        int position = str.length() - 1;
        while (position > 0) {
            if (Character.isDigit(str.charAt(position))) {
                position--;
            } else {
                Expression left = evaluate(str.substring(0, position));
                Expression right = new NumberExpression(Integer.valueOf(str.substring(position + 1, str.length())));
                char operator = str.charAt(position);
                switch (operator) {
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.valueOf(str);
        return new NumberExpression(result);
    }
}
