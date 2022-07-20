package calculator;

public class Exception_Me extends Exception
{
    String msg;

    Exception_Me(String str){
        msg = str;
    }

    public String toString() {
        return ("Exception occurred: " + msg);
    }
}
