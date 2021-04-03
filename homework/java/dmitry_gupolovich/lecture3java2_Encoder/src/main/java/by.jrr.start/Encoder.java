package by.jrr.start;

/**
 * Created by User on 27.03.2021.
 */
public class Encoder {
    private char symbol;
    private int code;

    Encoder(char symbol) {
        this.symbol = symbol;
    }

    Encoder(int code) {
        this.code = code;
    }

    /**
     * Преобразование символ в код и вывод на экран
     */
    public void decode() {
        this.code = (int) this.symbol;
        System.out.printf("'%c' => %d\n", symbol, code);

    }

    /**
     * Преобразование кода в символ
     */
    public void encode() {
        this.symbol = (char) this.code;
        System.out.printf("%d => '%c'\n", code, symbol);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Encoder encoder = (Encoder) o;

        if (symbol != encoder.symbol) return false;
        return code == encoder.code;
    }

    @Override
    public int hashCode() {
        int result = (int) symbol;
        result = 31 * result + code;
        return result;
    }
}
