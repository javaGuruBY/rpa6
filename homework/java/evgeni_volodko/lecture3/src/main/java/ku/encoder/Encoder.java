package ku.encoder;

public class Encoder {

    public static void encode(short code){
        char c = (char) code;
        System.out.printf("%d => '%c'\n", code, c);
    }

    public static void decode(char symbol){
        short code = (short) symbol;
        System.out.printf("'%c' => %d\n", symbol, code);
    }
}
