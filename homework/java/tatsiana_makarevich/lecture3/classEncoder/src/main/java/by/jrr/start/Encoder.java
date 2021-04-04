package by.jrr.start;

import java.util.Objects;

public class Encoder {

    private short code;
    private char symbol;

    public Encoder() {
    }

    public Encoder(short code) {
        this.code = code;
    }

    public Encoder(char symbol) {
        this.symbol = symbol;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encoder encoder = (Encoder) o;
        return code == encoder.code &&
                symbol == encoder.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, symbol);
    }

    @Override
    public String toString() {
        return "Encoder{" +
                "code=" + code +
                ", symbol=" + symbol +
                '}';
    }
}
