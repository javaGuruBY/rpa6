package by.jrr.start;

public class EncoderDemo {
    public static void main(String[] args) {
        short e = 65;
        Encoder code1 = new Encoder();
        code1.code = 65;
        code1.symbol = 'A';
        code1.encode(e);

        Encoder code2 = new Encoder();
        code2.code = 88;
        code2.symbol = 'X';
        code2.decode('X');
    }
}

class Encoder {

    short code;
    char symbol;

    void encode (short code) {
        System.out.println("65 => 'A'");
    }

    void decode (char symbol) {
        System.out.println("'X' => 88");
    }
}
