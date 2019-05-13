package chap04.exercise;

class StaticSample {
    int x;
    static int y;
    static int f() {
        return y;
    }
}

public class prob12UsingStatic {
    public static void main(String[] args) {
        // StaticSample.x = 11;     (X)
        StaticSample.y  = 22;

        int temp        = StaticSample.f();
        StaticSample ss = new StaticSample();
        // temp            = a.y;
    }
}
