package by.jrr.start;

public class EncoderDemo {

    public static void main(String[] args) {
        Encoder.encode((short)43);
        Encoder.decode('+');
        Encoder.encode((short)67);
        Encoder.decode('C');
    }
}
