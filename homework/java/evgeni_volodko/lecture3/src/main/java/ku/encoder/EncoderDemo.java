package ku.encoder;

public class EncoderDemo {

    public static void main(String[] args) {

        short code1 = 65;
        short code2 = 88;
        char symbol1 = 'A';
        char symbol2 = 'X';

        Encoder.encode(code1);
        Encoder.encode(code2);
        Encoder.decode(symbol1);
        Encoder.decode(symbol2);
    }
}
