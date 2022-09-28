package poo_java_5.aula_01.util;

// Singleton - só um objeto desse tipo rodando.
public class NumberGenerator {
    private int next;
    private final static NumberGenerator instance = new NumberGenerator();

    private NumberGenerator() {

    }

    public static NumberGenerator getInstance() {
        return instance;
    }

    public int getNext() {
        return next += 1;
    }
}
