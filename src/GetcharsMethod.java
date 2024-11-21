import java.util.Arrays;

public class GetcharsMethod {

    public static void main(String[] args){

        String var = "Information";
        char[] value = new char[10];
        var.getChars(0, 6, value,  1);
        System.out.println(Arrays.toString(value));
    }
}
