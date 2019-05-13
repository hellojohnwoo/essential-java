package chap04.exercise;

public class prob11StaticTest {
    static int a;

    static int getA() {
        return a;
    }

    int b;

    int getB() {
        return b;
    }

    int f() {
        return getA();
    }
    // static int g() {return getB();} (X)
}