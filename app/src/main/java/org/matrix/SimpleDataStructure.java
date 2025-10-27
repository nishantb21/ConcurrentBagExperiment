package app.src.main.java.org.matrix;

import java.util.Random;

public class SimpleDataStructure {
    int d1;
    int d2;
    private static Random random = new Random();

    public SimpleDataStructure() {
        d1 = random.nextInt(10);
        d2 = random.nextInt(100);
    }

    int getD1() {
        return d1;
    }

    int getD2() {
        return d2;
    }

    public String toString() {
        return String.valueOf(d1) + "/" + String.valueOf(d2);
    }
}
