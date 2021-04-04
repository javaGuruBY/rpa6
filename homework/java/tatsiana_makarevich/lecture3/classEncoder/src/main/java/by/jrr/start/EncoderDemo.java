package by.jrr.start;

public class EncoderDemo {

    public void encode(short code) {
        char symbol = (char) code;
        System.out.println(code + " => " + symbol);
    }

    public void decode(char symbol) {
        short code = (short) symbol;
        System.out.println(symbol + " => " + code);
    }

    public static void main(String[] args) {
        Encoder encoder = new Encoder('D');
        encoder.setCode((short) 56);

        EncoderDemo encoderDemo = new EncoderDemo();
        encoderDemo.encode(encoder.getCode());
        encoderDemo.decode(encoder.getSymbol());
    }
}
