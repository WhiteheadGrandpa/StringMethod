import java.util.Random;

public class RandomMethod {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Ademola good guy");
        str.insert(8, "is a ");
        System.out.println(str);

        Random rand = new Random();
        System.out.println(rand.nextInt(10)); // Generates a random number between 0 and 9
    }
}