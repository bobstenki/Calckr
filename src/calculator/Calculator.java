package calculator;

public class Calculator
{

    public static String calc(Expression_Resoult expression) throws Exception_Me
    {
        int res;
        res = switch (expression.operator)
                {
                    case "+" -> expression.firstOperand + expression.secondOperand;
                    case "-" -> expression.firstOperand - expression.secondOperand;
                    case "*" -> expression.firstOperand * expression.secondOperand;
                    case "/" -> (int) (expression.firstOperand / expression.secondOperand);
                    default -> 0;
                };
        /* ���� ��������� �������� ��������� �������, �� ���������� ��������� */
        if (expression.type == TypeOfExpression.ARABIC) {
            return Integer.toString(res);
        } else if (res <= 0) {
            /* ���� �� ��������, �� ��������� ����� ���� ������ ������������� */
            throw new Exception_Me("Result less or equal 0. The Romans did not use 0 and negative numbers.");
        } else {
            /* ������������ ��������� � ������� ����� � ���������� */
            return Converter.arabicToRoman(res);
        }
    }
}