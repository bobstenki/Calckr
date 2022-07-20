package calculator;

public class Expression_Resoult
{
    int firstOperand;
    int secondOperand;
    String operator;
    TypeOfExpression type;

    public Expression_Resoult(int firstOperand, int secondOperand, String operator, TypeOfExpression type){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
        this.type = type;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Expression_Resoult))
        {
            return false;
        }

        Expression_Resoult expr = (Expression_Resoult) obj;

        return firstOperand == expr.firstOperand &&
                secondOperand == expr.secondOperand &&
                operator.equals(expr.operator) &&
                type.equals(expr.type);
    }
}