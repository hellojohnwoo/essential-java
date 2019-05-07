package chap04;

public class GabargeEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;

        a = null;
        b = c;
        c = null;
    }
}
