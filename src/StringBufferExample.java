public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Ademola good guy");
        str.insert(8, "is a ");
        str.delete(6, 11);
        str.reverse();
        System.out.println(str);
    }
}