package calculator;

import java.util.Arrays;
import java.util.List;

public class Expression_Init
{
    /** ���������� ��������� */
    private static final List<String> operators = Arrays.asList("+", "-", "*", "/");
    /** ���������� �������� ����� */
    private static final List<String> allowedArabic = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    /** ���������� ������� ����� */
    private static final List<String> allowedRoman = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

    public static Expression_Resoult parse(String input) throws Exception_Me
    {
        String[] splicedInput = input.split(" ");
        Expression_Resoult expression;

        if (splicedInput.length != 3){
            /* � ��������� ������ ���� ��� �������� � �������� */
            throw new Exception_Me("Invalid expression");
        } else if (!operators.contains(splicedInput[1])) {
            /* ����� ��������� ������ ������ ����������� �������� */
            throw new Exception_Me("Invalid operator");
        } else if ((!allowedArabic.contains(splicedInput[0]) && !allowedRoman.contains(splicedInput[0])) ||
                (!allowedArabic.contains(splicedInput[2]) && !allowedRoman.contains(splicedInput[2]))){
            /* ���� ������ ��� ������ ������� �� ������������� ��������� ���������� �������� */
            throw new Exception_Me("Invalid operand");
        } else if ((allowedArabic.contains(splicedInput[0]) && allowedRoman.contains(splicedInput[2])) ||
                (allowedArabic.contains(splicedInput[2]) && allowedRoman.contains(splicedInput[0]))){
            /* ���� �������� ������� ���� */
            throw new Exception_Me("Operands of different types");
        } else if (allowedArabic.contains(splicedInput[0])){
            /* ���� ��������� �� �������� ���� */
            expression = new Expression_Resoult(allowedArabic.indexOf(splicedInput[0]) + 1,
                    allowedArabic.indexOf(splicedInput[2]) + 1, splicedInput[1], TypeOfExpression.ARABIC);
        } else {
            /* ������ �� ������� */
            expression = new Expression_Resoult(allowedRoman.indexOf(splicedInput[0]) + 1,
                    allowedRoman.indexOf(splicedInput[2]) + 1, splicedInput[1], TypeOfExpression.ROMAN);
        }
        return expression;
    }
}