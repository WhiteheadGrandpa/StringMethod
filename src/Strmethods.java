import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Strmethods {
    public static void main(String[] args) {

        String var = "Ademola, is,a good,guy";

       String[] vals = var.split(",");
       System.out.println(Arrays.toString(vals));

       for (String  string : vals) {
           System.out.println(string);
        }
    }
}