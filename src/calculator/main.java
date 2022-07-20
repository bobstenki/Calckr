package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Main
 {

    public static void main(String[] args)
    {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            String input;
            String output;
            while (!(input = br.readLine().toUpperCase()).equals("ESC"))
            {
                try
                {
                    Expression_Resoult expr = Expression_Init.parse(input);
                    output = Calculator.calc(expr);
                    System.out.println("Результат: " + output);
                    System.out.println("Введите новое выражение или введите \"ESC<CR>\" для завершения программы");
                } catch (Exception_Me e) {
                    System.out.println(e.toString());
                    System.out.println("Пробовать снова");
                }
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}