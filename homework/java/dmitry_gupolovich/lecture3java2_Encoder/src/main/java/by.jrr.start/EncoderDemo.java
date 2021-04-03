package by.jrr.start;

/**
 * Created by User on 27.03.2021.
 */
public class EncoderDemo {
    public static void main(String[] args) {
        Encoder decoder = new Encoder(65);
        decoder.encode();

        Encoder encoder = new Encoder('X');
        encoder.decode();
    }

}
