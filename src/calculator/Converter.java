package calculator;

public class Converter
{

    /*
     * ������ ����������� ���������� �� ��������  https://www.codeflow.site/ru/article/java-convert-roman-arabic
     * � ������� ���������� ��� ��������� �������
     */
    public static String arabicToRoman(int number) {
        int i = 0;
        RomanNum[] romanNums = RomanNum.values();
        StringBuilder sb = new StringBuilder();
        while ((number > 0) && (i < romanNums.length)){
            RomanNum current = romanNums[i];
            if (current.getValue() <= number) {
                sb.append(current.name());
                number -= current.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}